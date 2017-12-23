package com.nado.userMonitorMicroservice.repository;

import static com.nado.userMonitorMicroservice.enums.UserActivityRelatedMessageTypes.*;
import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nado.userMonitorMicroservice.entity.ExtractedUserInfo;
import com.nado.userMonitorMicroservice.repository.ActiveUserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActiveUserRepositoryTest {

	@Autowired
	ActiveUserRepository activeUserRepository;
	@Before
	public void before() throws InterruptedException {
		IntStream.rangeClosed(1, 5).forEach(i->{
			activeUserRepository.addUser(""+i, "2017-12-20","","");
		});
		IntStream.rangeClosed(3, 6).forEach(i->{
			activeUserRepository.addUser(""+i, "2017-12-21","","");
		});
	}

	@After
	public void after() throws InterruptedException {
		activeUserRepository.deleteDate("2017-12-20");
		activeUserRepository.deleteDate("2017-12-21");
	}

	@Test
	public void alwaysPassTest() {
		assertTrue(true);
	}
	@Test
	public void day20Has1() {
		assertTrue(activeUserRepository.isActive("1", "2017-12-20"));
	}
	@Test
	public void day21HasNot1() {
		assertTrue(!activeUserRepository.isActive("1", "2017-12-21"));
	}
	@Test
	public void day20Has3() {
		assertTrue(activeUserRepository.isActive("3", "2017-12-20"));
	}
	@Test
	public void day21Has3() {
		assertTrue(activeUserRepository.isActive("3", "2017-12-21"));
	}
	@Test
	public void day20HasNot6() {
		assertTrue(!activeUserRepository.isActive("6", "2017-12-20"));
	}
	@Test
	public void day21Has6() {
		assertTrue(activeUserRepository.isActive("6", "2017-12-21"));
	}
}
