package com.nado.userMonitorMicroservice;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.nado.douyuConnectorMicroservice.util.CommonUtil;
import com.nado.userMonitorMicroservice.entity.ExtractedUserInfo;
import com.nado.userMonitorMicroservice.enums.UserActivityRelatedMessageTypes;
import com.nado.userMonitorMicroservice.repository.ActiveUserRepository;
import com.nado.userMonitorMicroservice.repository.UserRepository;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

@SpringBootApplication
public class Customer1MicroserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(Customer1MicroserviceApplication.class, args);
	}
	@Component
	public class MyRunner implements CommandLineRunner {
		@Override
		public void run(String... args) throws Exception {
			
		}
	}
	@Autowired
	ActiveUserRepository activeUserRepository;
	@Autowired
	UserRepository userRepository;
	@Bean
	public Channel channel() throws Exception{
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();
		channel.basicQos(1);
		for (UserActivityRelatedMessageTypes type : UserActivityRelatedMessageTypes.values()) {
			String queue = channel.queueDeclare().getQueue();
			channel.queueBind(queue, "douyu-cooked-messages", type.name());
			Consumer consumer = new DefaultConsumer(channel) {
				@Override
				public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
						byte[] body) {
					String message = "";
					try {
						message = new String(body, "UTF-8");
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						LocalDateTime now = LocalDateTime.now();
						ExtractedUserInfo extractedUserInfo = type.extractUserInfo(message);
						activeUserRepository.addUser(extractedUserInfo.getUid(), now);
						userRepository.save(extractedUserInfo.getUid(), extractedUserInfo.getNn());
					} finally {
						try {
							channel.basicAck(envelope.getDeliveryTag(), false);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			};
			channel.basicConsume(queue, false, consumer);
		}
		return channel;
	}
}
