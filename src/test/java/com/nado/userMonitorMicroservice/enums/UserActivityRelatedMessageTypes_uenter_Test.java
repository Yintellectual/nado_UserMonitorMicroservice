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
public class UserActivityRelatedMessageTypes_uenter_Test {

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
		String sample =  "/timestamp@=1513937496683/messageId@=21612/type@=uenter/rid@=2020877/uid@=15413663/nn@=绯红月/level@=19/ic@=avatar@Sdefault@S06/rni@=0/el@=/sahf@=0/wgei@=0/";
		ExtractedUserInfo userInfo = uenter.extractUserInfo(sample);
		assertTrue("15413663".equals(userInfo.getUid()));
		assertTrue("绯红月".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_2() {
		String sample = "/timestamp@=1513937487601/messageId@=21608/type@=uenter/rid@=2020877/uid@=176999447/nn@=一個海峽之外/level@=15/ic@=avanew@Sface@S201711@S14@S00@S9fdbfd736067d71f7d0f649ffdcc7559/nl@=7/rni@=0/el@=/sahf@=0/wgei@=0/";
		ExtractedUserInfo userInfo = uenter.extractUserInfo(sample);
		assertTrue("176999447".equals(userInfo.getUid()));
		assertTrue("一個海峽之外".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_3() {
		String sample ="/timestamp@=1513937483031/messageId@=21606/type@=uenter/rid@=2020877/uid@=143579853/nn@=随豆而行/level@=15/ic@=avatar@Sdefault@S04/rni@=0/el@=/sahf@=0/wgei@=0/";
		ExtractedUserInfo userInfo = uenter.extractUserInfo(sample);
		assertTrue("143579853".equals(userInfo.getUid()));
		assertTrue("随豆而行".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_4() {
		String sample = "/timestamp@=1513937480029/messageId@=21594/type@=uenter/rid@=2020877/uid@=110884124/nn@=黑猫不会喵/level@=18/ic@=avanew@Sface@S201707@S11@S23@Sd5792b431abf583eed8c1937f17d3b20/rni@=0/el@=eid@AA=1500000171@ASetp@AA=2@ASsc@AA=1@ASef@AA=0@AS@Seid@AA=1500000172@ASetp@AA=1@ASsc@AA=1@ASef@AA=0@AS@Seid@AA=1500000173@ASetp@AA=5@ASsc@AA=1@ASef@AA=0@AS@S/sahf@=0/wgei@=0/";
		ExtractedUserInfo userInfo = uenter.extractUserInfo(sample);
		assertTrue("110884124".equals(userInfo.getUid()));
		assertTrue("黑猫不会喵".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_5() {
		String sample = "/timestamp@=1513937452465/messageId@=21516/type@=uenter/rid@=2020877/uid@=30216817/nn@=俩年ZZZz/level@=19/ic@=avatar@S030@S21@S68@S17_avatar/rni@=0/el@=eid@AA=1500000113@ASetp@AA=1@ASsc@AA=1@ASef@AA=0@AS@S/sahf@=0/wgei@=0/";
		ExtractedUserInfo userInfo = uenter.extractUserInfo(sample);
		assertTrue("30216817".equals(userInfo.getUid()));
		assertTrue("俩年ZZZz".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_6() {
		String sample = "/timestamp@=1513937475030/messageId@=21586/type@=uenter/rid@=2020877/uid@=111669055/nn@=豆国非酋弗fu洛洛/level@=24/ic@=avanew@Sface@S201712@S22@S01@S25d6fbf875380679afa01e7595e0866f/nl@=7/rni@=0/el@=/sahf@=0/wgei@=0/";
		ExtractedUserInfo userInfo = uenter.extractUserInfo(sample);
		assertTrue("111669055".equals(userInfo.getUid()));
		assertTrue("豆国非酋弗fu洛洛".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_7() {
		String sample ="/timestamp@=1513937474036/messageId@=21578/type@=uenter/rid@=2020877/uid@=33934234/nn@=丿Da1丶/level@=36/dlv@=3/dc@=13/bdlv@=3/ic@=avanew@Sface@S201711@S11@S23@Sfb4842ad12231f50af9bfb1093c3505a/nl@=1/rni@=0/el@=/sahf@=0/wgei@=0/";
		ExtractedUserInfo userInfo = uenter.extractUserInfo(sample);
		assertTrue("33934234".equals(userInfo.getUid()));
		assertTrue("丿Da1丶".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_8() {
		String sample = "/timestamp@=1513937470031/messageId@=21554/type@=uenter/rid@=2020877/uid@=54059537/nn@=豆子的松烟入墨i/level@=16/ic@=avanew@Sface@S201712@S10@S21@Sc1e4a054292aeb44dbf5747c691bf52a/nl@=7/rni@=0/el@=/sahf@=0/wgei@=0/";
		ExtractedUserInfo userInfo = uenter.extractUserInfo(sample);
		assertTrue("54059537".equals(userInfo.getUid()));
		assertTrue("豆子的松烟入墨i".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_9() {
		String sample =  "/timestamp@=1513937462031/messageId@=21547/type@=uenter/rid@=2020877/uid@=163084588/nn@=孤傲1231/level@=19/ic@=avanew@Sface@S201709@S07@S10@S53459d102e49caaf014e0d4e9b24a6b1/nl@=7/rni@=0/el@=/sahf@=0/wgei@=0/";
		ExtractedUserInfo userInfo = uenter.extractUserInfo(sample);
		assertTrue("163084588".equals(userInfo.getUid()));
		assertTrue("孤傲1231".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_10() {
		String sample = "/timestamp@=1513937454512/messageId@=21517/type@=uenter/rid@=2020877/uid@=136205801/nn@=豆子的柠檬茶/level@=40/rg@=4/dlv@=3/dc@=1/bdlv@=3/ic@=avanew@Sface@S201712@S21@S10@Scb1c623bc9c5abc2d2cf99a1bf43d705/nl@=3/rni@=0/el@=/sahf@=0/wgei@=0/";
		ExtractedUserInfo userInfo = uenter.extractUserInfo(sample);
		assertTrue("136205801".equals(userInfo.getUid()));
		assertTrue("豆子的柠檬茶".equals(userInfo.getNn()));
	}
}
