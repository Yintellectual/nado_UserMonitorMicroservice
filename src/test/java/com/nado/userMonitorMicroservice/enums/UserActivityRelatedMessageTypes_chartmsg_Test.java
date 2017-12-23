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
public class UserActivityRelatedMessageTypes_chartmsg_Test {

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
		String sample = "/timestamp@=1513937484028/messageId@=21607/type@=chatmsg/rid@=2020877/ct@=2/uid@=30216817/nn@=俩年ZZZz/txt@=明天是和发姐户外吗[emot:dy124]/cid@=65aef71cbd0349935803000000000000/ic@=avatar@S030@S21@S68@S17_avatar/level@=19/sahf@=0/col@=6/bnn@=豆霸霸/bl@=13/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/ifs@=1/el@=eid@AA=1500000113@ASetp@AA=1@ASsc@AA=1@ASef@AA=0@AS@S/";
		ExtractedUserInfo userInfo = chatmsg.extractUserInfo(sample);
		assertTrue("30216817".equals(userInfo.getUid()));
		assertTrue("俩年ZZZz".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_2() {
		String sample = "/timestamp@=1513937476030/messageId@=21592/type@=chatmsg/rid@=2020877/ct@=1/uid@=64095737/nn@=哒嘟嘟哒嘟嘟嘟嘟/txt@=嚯，明天户外/cid@=65aef71cbd0349935703000000000000/ic@=avanew@Sface@S201711@S12@S22@S73e5afcc7489654d9cdb12968f771c37/level@=28/sahf@=0/bnn@=蛇蛇蛇/bl@=2/brid@=85981/hc@=94c4d05a3e46a7173f893497a64475e0/el@=eid@AA=1500000113@ASetp@AA=1@ASsc@AA=1@ASef@AA=0@AS@S/";
		ExtractedUserInfo userInfo = chatmsg.extractUserInfo(sample);
		assertTrue("64095737".equals(userInfo.getUid()));
		assertTrue("哒嘟嘟哒嘟嘟嘟嘟".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_3() {
		String sample = "/timestamp@=1513937455288/messageId@=21518/type@=chatmsg/rid@=2020877/ct@=2/uid@=68371410/nn@=小手摸大头/txt@=上海的去狙击一下/cid@=65aef71cbd0349935603000000000000/ic@=avanew@Sface@S201712@S20@S22@S63ea1fb4c0edb5c25561ac629700537d/level@=34/sahf@=0/nl@=3/nc@=1/bnn@=豆霸霸/bl@=16/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/el@=/";
		ExtractedUserInfo userInfo = chatmsg.extractUserInfo(sample);
		assertTrue("68371410".equals(userInfo.getUid()));
		assertTrue("小手摸大头".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_4() {
		String sample = "/timestamp@=1513937281035/messageId@=21246/type@=chatmsg/rid@=2020877/uid@=15556439/nn@=yeSu877/txt@=豆/cid@=65aef71cbd0349934003000000000000/ic@=avanew@Sface@S201711@S11@S23@S50e0ceb04ecd6a1ea1f687664967590d/level@=22/sahf@=0/nl@=7/col@=6/bnn@=豆霸霸/bl@=13/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/ifs@=1/el@=/";
		ExtractedUserInfo userInfo = chatmsg.extractUserInfo(sample);
		assertTrue("15556439".equals(userInfo.getUid()));
		assertTrue("yeSu877".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_5() {
		String sample = "/timestamp@=1513937439607/messageId@=21507/type@=chatmsg/rid@=2020877/ct@=14/uid@=49105159/nn@=1233g2016/txt@=哇，户外/cid@=65aef71cbd0349935303000000000000/ic@=avatar@Sdefault@S04/level@=18/sahf@=0/bnn@=/bl@=0/brid@=0/hc@=/el@=/";
		ExtractedUserInfo userInfo = chatmsg.extractUserInfo(sample);
		assertTrue("49105159".equals(userInfo.getUid()));
		assertTrue("1233g2016".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_6() {
		String sample = "/timestamp@=1513937279387/messageId@=21242/type@=chatmsg/rid@=2020877/ct@=2/uid@=155554426/nn@=给大头来一杯卡布奇诺/txt@=[emot:dy103]/cid@=65aef71cbd0349933f03000000000000/ic@=avanew@Sface@S201710@S23@S09@S0f5ce4337e9f8981af8b906666200e71/level@=20/sahf@=0/nl@=7/col@=6/bnn@=豆霸霸/bl@=13/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/ifs@=1/el@=/";
		ExtractedUserInfo userInfo = chatmsg.extractUserInfo(sample);
		assertTrue("155554426".equals(userInfo.getUid()));
		assertTrue("给大头来一杯卡布奇诺".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_7() {
		String sample = "/timestamp@=1513937389026/messageId@=21457/type@=chatmsg/rid@=2020877/ct@=14/uid@=144393163/nn@=加油豆子你是最胖的/txt@=豆儿这两天都播不了，好像是要去上海拍斗鱼的年度挂历<66>/cid@=65aef71cbd0349935003000000000000/ic@=avanew@Sface@S201710@S15@S10@S5469f902a04647ed28162f7a19bacf9d/level@=30/sahf@=0/nl@=7/bnn@=豆霸霸/bl@=17/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/el@=eid@AA=1500000113@ASetp@AA=1@ASsc@AA=1@ASef@AA=0@AS@S/";
		ExtractedUserInfo userInfo = chatmsg.extractUserInfo(sample);
		assertTrue("144393163".equals(userInfo.getUid()));
		assertTrue("加油豆子你是最胖的".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_8() {
		String sample = "/timestamp@=1513937344033/messageId@=21403/type@=chatmsg/rid@=2020877/ct@=1/uid@=4637018/nn@=七夜七夜Midnight/txt@=又不播/cid@=65aef71cbd0349934803000000000000/ic@=avatar@Sdefault@S10/level@=10/sahf@=0/bnn@=豆霸霸/bl@=4/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/el@=/";
		ExtractedUserInfo userInfo = chatmsg.extractUserInfo(sample);
		assertTrue("4637018".equals(userInfo.getUid()));
		assertTrue("七夜七夜Midnight".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_9() {
		String sample = "/timestamp@=1513936877172/messageId@=20410/type@=chatmsg/rid@=2020877/ct@=2/uid@=25129006/nn@=豆国买买提/txt@=嗷呜她禁言我/cid@=65aef71cbd034993fc02000000000000/ic@=avanew@Sface@S201712@S07@S15@S46afe184548e2a6ce5eb09d14562419f/level@=19/sahf@=0/col@=3/bnn@=豆霸霸/bl@=11/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/ifs@=1/el@=/";
		ExtractedUserInfo userInfo = chatmsg.extractUserInfo(sample);
		assertTrue("25129006".equals(userInfo.getUid()));
		assertTrue("豆国买买提".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_10() {
		String sample =  "/timestamp@=1513937272036/messageId@=21227/type@=chatmsg/rid@=2020877/ct@=2/uid@=71042005/nn@=天黑de巧克力最甜/txt@=。我要/cid@=65aef71cbd0349933b03000000000000/ic@=avanew@Sface@S201710@S24@S00@S5c0cd8b0ab36610b4651adbd8e476783/level@=24/sahf@=0/col@=6/bnn@=豆霸霸/bl@=13/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/ifs@=1/el@=eid@AA=1500000113@ASetp@AA=1@ASsc@AA=1@ASef@AA=0@AS@S/";
		ExtractedUserInfo userInfo = chatmsg.extractUserInfo(sample);
		assertTrue("71042005".equals(userInfo.getUid()));
		assertTrue("天黑de巧克力最甜".equals(userInfo.getNn()));
	}
}
