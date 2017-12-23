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
public class UserActivityRelatedMessageTypes_upgrade_Test {

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
		String sample = "/timestamp@=1513936512030/messageId@=19931/type@=upgrade/uid@=95826056/rid@=2020877/gid@=0/nn@=东东外你不懂/level@=16/ic@=avanew@Sface@S201612@S25@S07@Scbfb287467e897258bbd986cbeadc6f0/sahf@=0/";
		ExtractedUserInfo userInfo = upgrade.extractUserInfo(sample);
		assertTrue("95826056".equals(userInfo.getUid()));
		assertTrue("东东外你不懂".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_2() {
		String sample = "/timestamp@=1513936400029/messageId@=19839/type@=upgrade/uid@=155077109/rid@=2020877/gid@=0/nn@=我真的有点慌啊/level@=21/ic@=avanew@Sface@S201710@S30@S00@S0dc46239d8aa8d3a1f0237a9fd0b74da/sahf@=0/";
		ExtractedUserInfo userInfo = upgrade.extractUserInfo(sample);
		assertTrue("155077109".equals(userInfo.getUid()));
		assertTrue("我真的有点慌啊".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_3() {
		String sample =  "/timestamp@=1513934817035/messageId@=17930/type@=upgrade/uid@=147935973/rid@=2020877/gid@=0/nn@=qaz幻梦之殇/level@=7/ic@=avanew@Sface@S201709@S12@S23@S0b800e59d3bd67f8fc9f840ab204e4b2/sahf@=0/";

		ExtractedUserInfo userInfo = upgrade.extractUserInfo(sample);
		assertTrue("147935973".equals(userInfo.getUid()));
		assertTrue("qaz幻梦之殇".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_4() {
		String sample =   "/timestamp@=1513934204031/messageId@=17197/type@=upgrade/uid@=137780096/rid@=2020877/gid@=0/nn@=昔我往矣iii/level@=11/ic@=avanew@Sface@S201705@S02@S10@S84812e64597067e22ea05e192678137a/sahf@=0/";

		ExtractedUserInfo userInfo = upgrade.extractUserInfo(sample);
		assertTrue("137780096".equals(userInfo.getUid()));
		assertTrue("昔我往矣iii".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_5() {
		String sample =   "/timestamp@=1513933061028/messageId@=16059/type@=upgrade/uid@=61031954/rid@=2020877/gid@=0/nn@=伴花雨/level@=13/ic@=avatar@Sface@S201607@S28@Sd58b98ce66329af8390434216148782f/sahf@=0/";
				
		ExtractedUserInfo userInfo = upgrade.extractUserInfo(sample);
		assertTrue("61031954".equals(userInfo.getUid()));
		assertTrue("伴花雨".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_6() {
		String sample =  "/timestamp@=1513930474031/messageId@=13572/type@=upgrade/uid@=628636/rid@=2020877/gid@=0/nn@=阿联酋彭于晏/level@=22/ic@=avatar@S000@S62@S86@S36_avatar/sahf@=0/";

		ExtractedUserInfo userInfo = upgrade.extractUserInfo(sample);
		assertTrue("628636".equals(userInfo.getUid()));
		assertTrue("阿联酋彭于晏".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_7() {
		String sample =  "/timestamp@=1513927664039/messageId@=11395/type@=upgrade/uid@=146724412/rid@=2020877/gid@=0/nn@=LZ萌/level@=7/ic@=avanew@Sface@S201706@S29@S20@S7667dfefdbabb1ed94592846e61a73c7/sahf@=0/";

		ExtractedUserInfo userInfo = upgrade.extractUserInfo(sample);
		assertTrue("146724412".equals(userInfo.getUid()));
		assertTrue("LZ萌".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_8() {
		String sample =  "/timestamp@=1513920284038/messageId@=5176/type@=upgrade/uid@=8530897/rid@=2020877/gid@=0/nn@=哲学攻破我最后的防线/level@=5/ic@=avanew@Sface@S201712@S22@S00@Se05a2fcc6b6dd547c4155eb8d4c0bb65/sahf@=0/";

		ExtractedUserInfo userInfo = upgrade.extractUserInfo(sample);
		assertTrue("8530897".equals(userInfo.getUid()));
		assertTrue("哲学攻破我最后的防线".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_9() {
		String sample =  "/timestamp@=1513917243045/messageId@=1685/type@=upgrade/uid@=32966468/rid@=2020877/gid@=0/nn@=安河桥上拉过屎/level@=19/ic@=avanew@Sface@S201711@S12@S19@S28797e2d44b41da996c60306f72b3aaa/sahf@=0/";

		ExtractedUserInfo userInfo = upgrade.extractUserInfo(sample);
		assertTrue("32966468".equals(userInfo.getUid()));
		assertTrue("安河桥上拉过屎".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_10() {
		String sample =  "/timestamp@=1513916887033/messageId@=1268/type@=upgrade/uid@=53020866/rid@=2020877/gid@=0/nn@=豆子赐名的碧瑶你真非/level@=51/ic@=avanew@Sface@S201712@S21@S15@Sc03a253fcf24f901dfc665dafb0df643/sahf@=0/";

		ExtractedUserInfo userInfo = upgrade.extractUserInfo(sample);
		assertTrue("53020866".equals(userInfo.getUid()));
		assertTrue("豆子赐名的碧瑶你真非".equals(userInfo.getNn()));
	}
}
