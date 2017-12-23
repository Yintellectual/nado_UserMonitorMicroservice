package com.nado.userMonitorMicroservice.enums;

import static com.nado.userMonitorMicroservice.enums.UserActivityRelatedMessageTypes.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nado.userMonitorMicroservice.entity.ExtractedUserInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserActivityRelatedMessageTypes_onlinegift_Test {

	@Before
	public void before() throws InterruptedException {

	}

	@After
	public void after() throws InterruptedException {

	}

	@Test
	public void alwaysPassTest() {
		assertTrue(true);
	}

	@Test
	public void correctlyExtractFromMessage_1() {
		String sample = "/timestamp@=1513928000642/messageId@=11680/type@=onlinegift/rid@=2020877/gid@=0/uid@=53020866/sil@=277/nn@=豆子赐名的碧瑶你真非/level@=51/ur@=1/if@=6/btype@=6/ct@=0/";
		ExtractedUserInfo userInfo = onlinegift.extractUserInfo(sample);
		assertTrue("53020866".equals(userInfo.getUid()));
		assertTrue("豆子赐名的碧瑶你真非".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_2() {
		String sample = "/timestamp@=1513908747289/messageId@=10510/type@=onlinegift/rid@=2020877/gid@=0/uid@=5504140/sil@=267/nn@=东方彧头/level@=30/ur@=1/if@=6/btype@=6/ct@=0/";
		ExtractedUserInfo userInfo = onlinegift.extractUserInfo(sample);
		assertTrue("5504140".equals(userInfo.getUid()));
		assertTrue("东方彧头".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_3() {
		String sample = "/timestamp@=1513873221030/messageId@=81780/type@=onlinegift/rid@=2020877/gid@=0/uid@=1283036/sil@=227/nn@=梦旅人ME/level@=31/ur@=1/if@=6/btype@=6/ct@=0/";
		ExtractedUserInfo userInfo = onlinegift.extractUserInfo(sample);
		assertTrue("1283036".equals(userInfo.getUid()));
		assertTrue("梦旅人ME".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_4() {
		String sample = "/timestamp@=1513872608034/messageId@=77760/type@=onlinegift/rid@=2020877/gid@=0/uid@=11816547/sil@=150/nn@=丶小時候/level@=32/ur@=1/if@=6/btype@=6/ct@=0/";
		ExtractedUserInfo userInfo = onlinegift.extractUserInfo(sample);
		assertTrue("11816547".equals(userInfo.getUid()));
		assertTrue("丶小時候".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_5() {
		String sample = "/timestamp@=1513871980036/messageId@=69756/type@=onlinegift/rid@=2020877/gid@=0/uid@=177496247/sil@=217/nn@=亙古長夜/level@=12/ur@=1/if@=6/btype@=6/ct@=0/";
		ExtractedUserInfo userInfo = onlinegift.extractUserInfo(sample);
		assertTrue("177496247".equals(userInfo.getUid()));
		assertTrue("亙古長夜".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_6() {
		String sample = "/timestamp@=1513859984225/messageId@=17752/type@=onlinegift/rid@=2020877/gid@=0/uid@=143492009/sil@=204/nn@=竹轮/level@=45/ur@=1/if@=6/btype@=6/ct@=0/";
		ExtractedUserInfo userInfo = onlinegift.extractUserInfo(sample);
		assertTrue("143492009".equals(userInfo.getUid()));
		assertTrue("竹轮".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_7() {
		String sample = "/timestamp@=1513857473045/messageId@=12257/type@=onlinegift/rid@=2020877/gid@=0/uid@=13505550/sil@=376/nn@=稀饭浪子/level@=26/ur@=2/if@=2/btype@=2/ct@=0/";
		ExtractedUserInfo userInfo = onlinegift.extractUserInfo(sample);
		assertTrue("13505550".equals(userInfo.getUid()));
		assertTrue("稀饭浪子".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_8() {
		String sample =  "/timestamp@=1513856112097/messageId@=9899/type@=onlinegift/rid@=2020877/gid@=0/uid@=33934234/sil@=151/nn@=丿Da1丶/level@=36/ur@=1/if@=6/btype@=6/ct@=0/";
		ExtractedUserInfo userInfo = onlinegift.extractUserInfo(sample);
		assertTrue("33934234".equals(userInfo.getUid()));
		assertTrue("丿Da1丶".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_9() {
		String sample =  "/timestamp@=1513854879044/messageId@=7637/type@=onlinegift/rid@=2020877/gid@=0/uid@=11954038/sil@=223/nn@=红尘一梦遇见豆/level@=30/ur@=1/if@=6/btype@=6/ct@=0/";
		ExtractedUserInfo userInfo = onlinegift.extractUserInfo(sample);
		assertTrue("11954038".equals(userInfo.getUid()));
		assertTrue("红尘一梦遇见豆".equals(userInfo.getNn()));
	}
}
