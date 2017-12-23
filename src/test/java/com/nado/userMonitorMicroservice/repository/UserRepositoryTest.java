package com.nado.userMonitorMicroservice.repository;

import static com.nado.userMonitorMicroservice.enums.UserActivityRelatedMessageTypes.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nado.userMonitorMicroservice.entity.ExtractedUserInfo;
import com.nado.userMonitorMicroservice.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;
	@Before
	public void before() throws InterruptedException {
		userRepository.save("1", "user1");
		userRepository.save("2", "user2");
	}

	@After
	public void after() throws InterruptedException {
		userRepository.delete("1");
		userRepository.delete("2");
	}

	@Test
	public void alwaysPassTest() {
		assertTrue(true);
	}

	@Test
	public void get_user1_from_nn_uid_1() {
		assertTrue("user1".equals(userRepository.getNn("1")));
	}
	@Test
	public void get_uid_1_from_nn_user1() {
		assertTrue("1".equals(userRepository.getUid("user1")));
	}
	@Test
	public void rename_user1_to_1user() {
		userRepository.save("1", "1user");
		assertTrue("1user".equals(userRepository.getNn("1")));
		assertTrue("1".equals(userRepository.getUid("user1")));
	}
	
}
