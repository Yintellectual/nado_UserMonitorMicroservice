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
public class UserActivityRelatedMessageTypes_dgb_Test {

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
	public void correctlyExtractFromMessage_dgb_1() {
		String sample = "/timestamp@=1513937482032/messageId@=21605/type@=dgb/rid@=2020877/gfid@=192/gs@=2/uid@=110884124/nn@=黑猫不会喵/ic@=avanew@Sface@S201707@S11@S23@Sd5792b431abf583eed8c1937f17d3b20/eid@=0/level@=18/dw@=91833500/hits@=10/ct@=0/el@=eid@AA=1500000171@ASetp@AA=2@ASsc@AA=1@ASef@AA=0@AS@Seid@AA=1500000172@ASetp@AA=1@ASsc@AA=1@ASef@AA=0@AS@Seid@AA=1500000173@ASetp@AA=5@ASsc@AA=1@ASef@AA=0@AS@S/cm@=0/bnn@=豆霸霸/bl@=4/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/sahf@=0/fc@=0/";
		ExtractedUserInfo userInfo = dgb.extractUserInfo(sample);
		assertTrue("110884124".equals(userInfo.getUid()));
		assertTrue("黑猫不会喵".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_dgb_2() {
		String sample = "/timestamp@=1513937476030/messageId@=21591/type@=dgb/rid@=2020877/gfid@=824/gs@=2/uid@=54059537/nn@=豆子的松烟入墨i/ic@=avanew@Sface@S201712@S10@S21@Sc1e4a054292aeb44dbf5747c691bf52a/eid@=0/level@=16/dw@=91833500/hits@=35/nl@=7/ct@=0/el@=/cm@=0/bnn@=豆霸霸/bl@=10/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/sahf@=0/fc@=0/";
		ExtractedUserInfo userInfo = dgb.extractUserInfo(sample);
		assertTrue("54059537".equals(userInfo.getUid()));
		assertTrue("豆子的松烟入墨i".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_dgb_3() {
		String sample = "/timestamp@=1513937463030/messageId@=21549/type@=dgb/rid@=2020877/gfid@=193/gs@=3/uid@=131293981/nn@=说得好得很/ic@=avanew@Sface@S201704@S08@S21@Sd49dcaceef8d429149a3610b7020cff5/eid@=0/level@=12/dw@=91833500/ct@=0/el@=/cm@=0/bnn@=豆霸霸/bl@=7/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/sahf@=0/fc@=0/";
		ExtractedUserInfo userInfo = dgb.extractUserInfo(sample);
		assertTrue("131293981".equals(userInfo.getUid()));
		assertTrue("说得好得很".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_dgb_4() {
		String sample = "/timestamp@=1513937461034/messageId@=21546/type@=dgb/rid@=2020877/gfid@=824/gs@=2/uid@=163084588/nn@=孤傲1231/ic@=avanew@Sface@S201709@S07@S10@S53459d102e49caaf014e0d4e9b24a6b1/eid@=0/level@=19/dw@=91833500/hits@=4/nl@=7/ct@=0/el@=/cm@=0/bnn@=豆霸霸/bl@=7/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/sahf@=0/fc@=0/";
		ExtractedUserInfo userInfo = dgb.extractUserInfo(sample);
		assertTrue("163084588".equals(userInfo.getUid()));
		assertTrue("孤傲1231".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_dgb_5() {
		String sample = "/timestamp@=1513937402036/messageId@=21494/type@=dgb/rid@=2020877/gfid@=824/gs@=2/uid@=19562304/nn@=无名氏族人/ic@=avanew@Sface@S201704@S10@S16@S5c89441ccc34439751fe4007907b84ae/eid@=0/level@=19/dw@=91833500/hits@=10/ct@=0/el@=/cm@=0/bnn@=汽车人/bl@=8/brid@=339610/hc@=57fba34fb5be23e74f94e586b658900d/sahf@=0/fc@=0/";
		ExtractedUserInfo userInfo = dgb.extractUserInfo(sample);
		assertTrue("19562304".equals(userInfo.getUid()));
		assertTrue("无名氏族人".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_dgb_6() {
		String sample = "/timestamp@=1513937401022/messageId@=21493/type@=dgb/rid@=2020877/gfid@=824/gs@=2/uid@=42157704/nn@=哈哈镜丶Ve/ic@=avatar@Sface@S201604@S27@S65d716d98e3145d3f4bd9671580f0a1f/eid@=0/level@=17/dw@=91833500/hits@=30/ct@=0/el@=/cm@=0/bnn@=豆霸霸/bl@=9/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/sahf@=0/fc@=0/";
		ExtractedUserInfo userInfo = dgb.extractUserInfo(sample);
		assertTrue("42157704".equals(userInfo.getUid()));
		assertTrue("哈哈镜丶Ve".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_dgb_7() {
		String sample = "/timestamp@=1513915574035/messageId@=28/type@=dgb/rid@=2020877/gfid@=824/gs@=2/uid@=160820776/nn@=豆生南国冬发几枝/ic@=avanew@Sface@S201711@S21@S13@Sb019d664a627f0c08d94ec87d6e96345/eid@=0/level@=14/dw@=91833500/hits@=22/ct@=0/el@=/cm@=0/bnn@=豆霸霸/bl@=9/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/sahf@=0/fc@=0/";
		ExtractedUserInfo userInfo = dgb.extractUserInfo(sample);
		assertTrue("160820776".equals(userInfo.getUid()));
		assertTrue("豆生南国冬发几枝".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_dgb_8() {
		String sample = "/timestamp@=1513915515020/messageId@=153/type@=dgb/rid@=2020877/gfid@=824/gs@=2/uid@=70031858/nn@=点亮他山/ic@=avanew@Sface@S201707@S07@S19@S2e337752cce9cf099b3aa53d816e2f30/eid@=0/level@=24/dw@=91833500/ct@=0/el@=/cm@=0/bnn@=/bl@=0/brid@=0/hc@=/sahf@=0/fc@=0/";
		ExtractedUserInfo userInfo = dgb.extractUserInfo(sample);
		assertTrue("70031858".equals(userInfo.getUid()));
		assertTrue("点亮他山".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_dgb_9() {
		String sample = "/timestamp@=1513915478181/messageId@=130/type@=dgb/rid@=2020877/gfid@=824/gs@=2/uid@=19462359/nn@=吖丶晨晨/ic@=avatar@S019@S46@S23@S59_avatar/eid@=0/level@=15/dw@=91833500/ct@=0/el@=/cm@=0/bnn@=豆霸霸/bl@=3/brid@=2020877/hc@=fe329c65ab6c55c8c8f38e12bb502a41/sahf@=0/fc@=0/";
		ExtractedUserInfo userInfo = dgb.extractUserInfo(sample);
		assertTrue("19462359".equals(userInfo.getUid()));
		assertTrue("吖丶晨晨".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_dgb_10() {
		String sample = "/timestamp@=1513915453040/messageId@=119/type@=dgb/rid@=2020877/gfid@=824/gs@=2/uid@=16560942/nn@=asw5555/ic@=avanew@Sface@S201710@S25@S03@S627c5ed921a40eb6ce17bde15465c276/eid@=0/level@=20/dw@=91833500/hits@=5/ct@=0/el@=/cm@=0/bnn@=阿冷灬/bl@=5/brid@=2371789/hc@=fbde69e39c1fccdce0e937f62fd14262/sahf@=0/fc@=0/";
		ExtractedUserInfo userInfo = dgb.extractUserInfo(sample);
		assertTrue("16560942".equals(userInfo.getUid()));
		assertTrue("asw5555".equals(userInfo.getNn()));
	}
}
