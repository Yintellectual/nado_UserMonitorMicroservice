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
public class UserActivityRelatedMessageTypes_blab_Test {

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
		String sample =  "/timestamp@=1513935543027/messageId@=18874/type@=blab/uid@=59057615/nn@=七斤大头oaoa/lbl@=9/bl@=10/ba@=1/bnn@=豆霸霸/rid@=2020877/";
		ExtractedUserInfo userInfo = blab.extractUserInfo(sample);
		assertTrue("59057615".equals(userInfo.getUid()));
		assertTrue("七斤大头oaoa".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_2() {
		String sample ="/timestamp@=1513934943033/messageId@=18068/type@=blab/uid@=41140640/nn@=我不是大脑阔好不好/lbl@=7/bl@=8/ba@=1/bnn@=豆霸霸/rid@=2020877/";
		ExtractedUserInfo userInfo = blab.extractUserInfo(sample);
		assertTrue("41140640".equals(userInfo.getUid()));
		assertTrue("我不是大脑阔好不好".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_3() {
		String sample = "/timestamp@=1513933909029/messageId@=16730/type@=blab/uid@=69965994/nn@=AAAAAALhhh/lbl@=9/bl@=10/ba@=1/bnn@=豆霸霸/rid@=2020877/";
		ExtractedUserInfo userInfo = blab.extractUserInfo(sample);
		assertTrue("69965994".equals(userInfo.getUid()));
		assertTrue("AAAAAALhhh".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_4() {
		String sample = "/timestamp@=1513932833035/messageId@=15888/type@=blab/uid@=14343561/nn@=柚年/lbl@=2/bl@=3/ba@=1/bnn@=豆霸霸/rid@=2020877/";
		ExtractedUserInfo userInfo = blab.extractUserInfo(sample);
		assertTrue("14343561".equals(userInfo.getUid()));
		assertTrue("柚年".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_5() {
		String sample =  "/timestamp@=1513932237031/messageId@=15363/type@=blab/uid@=144022973/nn@=账号绑不上银行卡/lbl@=6/bl@=7/ba@=1/bnn@=豆霸霸/rid@=2020877/";
		ExtractedUserInfo userInfo = blab.extractUserInfo(sample);
		assertTrue("144022973".equals(userInfo.getUid()));
		assertTrue("账号绑不上银行卡".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_6() {
		String sample =  "/timestamp@=1513932039035/messageId@=15169/type@=blab/uid@=23900841/nn@=辜负了誰/lbl@=0/bl@=2/ba@=1/bnn@=豆霸霸/rid@=2020877/";
		ExtractedUserInfo userInfo = blab.extractUserInfo(sample);
		assertTrue("23900841".equals(userInfo.getUid()));
		assertTrue("辜负了誰".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_7() {
		String sample =  "/timestamp@=1513927382045/messageId@=11101/type@=blab/uid@=3559637/nn@=胡桃沢梅/lbl@=5/bl@=6/ba@=1/bnn@=豆霸霸/rid@=2020877/";
		ExtractedUserInfo userInfo = blab.extractUserInfo(sample);
		assertTrue("3559637".equals(userInfo.getUid()));
		assertTrue("胡桃沢梅".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_8() {
		String sample =  "/timestamp@=1513928901030/messageId@=12196/type@=blab/uid@=1401216/nn@=1445880854/lbl@=4/bl@=5/ba@=1/bnn@=豆霸霸/rid@=2020877/";
		ExtractedUserInfo userInfo = blab.extractUserInfo(sample);
		assertTrue("1401216".equals(userInfo.getUid()));
		assertTrue("1445880854".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_9() {
		String sample =  "/timestamp@=1513927898044/messageId@=11582/type@=blab/uid@=2539367/nn@=aadealqq11a/lbl@=0/bl@=4/ba@=1/bnn@=豆霸霸/rid@=2020877/";
		ExtractedUserInfo userInfo = blab.extractUserInfo(sample);
		assertTrue("2539367".equals(userInfo.getUid()));
		assertTrue("aadealqq11a".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_10() {
		String sample =  "/timestamp@=1513927533044/messageId@=11210/type@=blab/uid@=36531727/nn@=小缘的家庭教师/lbl@=2/bl@=3/ba@=1/bnn@=豆霸霸/rid@=2020877/";
		ExtractedUserInfo userInfo = blab.extractUserInfo(sample);
		assertTrue("36531727".equals(userInfo.getUid()));
		assertTrue("小缘的家庭教师".equals(userInfo.getNn()));
	}
}
