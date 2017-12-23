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
public class UserActivityRelatedMessageTypes_gpbc_Test {

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
		String sample = "/timestamp@=1513875012036/messageId@=88809/type@=gpbc/cnt@=3/sid@=536351/did@=74030562/rpt@=0/snk@=隔壁村八大爷/dnk@=阿冷雨中人人/pnm@=赞/rid@=2020877/";
		ExtractedUserInfo userInfo = gpbc.extractUserInfo(sample);
		assertTrue("74030562".equals(userInfo.getUid()));
		assertTrue("阿冷雨中人人".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_2() {
		String sample = "/timestamp@=1513875011034/messageId@=88801/type@=gpbc/cnt@=1/sid@=536351/did@=9853292/rpt@=0/snk@=隔壁村八大爷/dnk@=TinyTank丶/pnm@=稳/rid@=2020877/";
		ExtractedUserInfo userInfo = gpbc.extractUserInfo(sample);
		assertTrue("9853292".equals(userInfo.getUid()));
		assertTrue("TinyTank丶".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_3() {
		String sample ="/timestamp@=1513875007035/messageId@=88787/type@=gpbc/cnt@=1/sid@=536351/did@=23017482/rpt@=0/snk@=隔壁村八大爷/dnk@=一只小莫咕/pnm@=赞/rid@=2020877/";
		ExtractedUserInfo userInfo = gpbc.extractUserInfo(sample);
		assertTrue("23017482".equals(userInfo.getUid()));
		assertTrue("一只小莫咕".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_4() {
		String sample = "/timestamp@=1513874999035/messageId@=88753/type@=gpbc/cnt@=1/sid@=536351/did@=60085970/rpt@=0/snk@=隔壁村八大爷/dnk@=垨戸榊/pnm@=赞/rid@=2020877/";
		ExtractedUserInfo userInfo = gpbc.extractUserInfo(sample);
		assertTrue("60085970".equals(userInfo.getUid()));
		assertTrue("垨戸榊".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_5() {
		String sample =   "/timestamp@=1513874984036/messageId@=88711/type@=gpbc/cnt@=1/sid@=536351/did@=143676697/rpt@=0/snk@=隔壁村八大爷/dnk@=依命惊人/pnm@=稳/rid@=2020877/";
		ExtractedUserInfo userInfo = gpbc.extractUserInfo(sample);
		assertTrue("143676697".equals(userInfo.getUid()));
		assertTrue("依命惊人".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_6() {
		String sample = "/timestamp@=1513874984036/messageId@=88712/type@=gpbc/cnt@=2/sid@=536351/did@=988472/rpt@=0/snk@=隔壁村八大爷/dnk@=信吉哇奶/pnm@=赞/rid@=2020877/";
		ExtractedUserInfo userInfo = gpbc.extractUserInfo(sample);
		assertTrue("988472".equals(userInfo.getUid()));
		assertTrue("信吉哇奶".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_7() {
		String sample = "/timestamp@=1513874983034/messageId@=88710/type@=gpbc/cnt@=2/sid@=536351/did@=75351208/rpt@=0/snk@=隔壁村八大爷/dnk@=NEvermore456dy/pnm@=赞/rid@=2020877/";
		ExtractedUserInfo userInfo = gpbc.extractUserInfo(sample);
		assertTrue("75351208".equals(userInfo.getUid()));
		assertTrue("NEvermore456dy".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_8() {
		String sample = "/timestamp@=1513874982034/messageId@=88707/type@=gpbc/cnt@=3/sid@=536351/did@=161933755/rpt@=0/snk@=隔壁村八大爷/dnk@=柠檬味软妹酥/pnm@=稳/rid@=2020877/";
		ExtractedUserInfo userInfo = gpbc.extractUserInfo(sample);
		assertTrue("161933755".equals(userInfo.getUid()));
		assertTrue("柠檬味软妹酥".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_9() {
		String sample ="/timestamp@=1513874974034/messageId@=88657/type@=gpbc/cnt@=3/sid@=536351/did@=1386479/rpt@=0/snk@=隔壁村八大爷/dnk@=MC祥/pnm@=稳/rid@=2020877/";
		ExtractedUserInfo userInfo = gpbc.extractUserInfo(sample);
		assertTrue("1386479".equals(userInfo.getUid()));
		assertTrue("MC祥".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_10() {
		String sample ="/timestamp@=1513874973035/messageId@=88641/type@=gpbc/cnt@=3/sid@=536351/did@=21049118/rpt@=0/snk@=隔壁村八大爷/dnk@=Maninthemirror丿/pnm@=稳/rid@=2020877/";
		ExtractedUserInfo userInfo = gpbc.extractUserInfo(sample);
		assertTrue("21049118".equals(userInfo.getUid()));
		assertTrue("Maninthemirror丿".equals(userInfo.getNn()));
	}
}
