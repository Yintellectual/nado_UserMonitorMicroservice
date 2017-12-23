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
public class UserActivityRelatedMessageTypes_bc_buy_deserve_Test {

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
		String sample =  "/timestamp@=1513923991961/messageId@=8580/type@=bc_buy_deserve/level@=27/lev@=3/rid@=2020877/gid@=0/cnt@=1/hits@=1/sid@=143615369/sui@=id@A=143615369@Sname@A=@Snick@A=涂山豪豪@Sicon@A=avanew@ASface@AS201706@AS08@AS22@AScbd17d5fcbf5549c9bee8ae1821440ff@Srg@A=1@Spg@A=1@Srt@A=0@Sbg@A=0@Sweight@A=0@Scps_id@A=0@Sps@A=0@Ses@A=0@Sver@A=0@Sglobal_ban_lev@A=0@Sexp@A=0@Slevel@A=27@Scurr_exp@A=0@Sup_need@A=0@Sgt@A=0@Sit@A=0@Sits@A=0@Scm@A=0@Srni@A=0@Shcre@A=0@Screi@A=0@Sel@A=@Shfr@A=32694@Sfs@A=0@S/sahf@=0/bnn@=/bl@=0/brid@=0/hc@=/";
		ExtractedUserInfo userInfo = bc_buy_deserve.extractUserInfo(sample);
		assertTrue("userInfo.getUid() should be 143615369 but is "+userInfo.getUid(),"143615369".equals(userInfo.getUid()));
		assertTrue("涂山豪豪".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_2() {
		String sample = "/timestamp@=1513914569596/messageId@=16857/type@=bc_buy_deserve/level@=22/lev@=1/rid@=2020877/gid@=0/cnt@=1/hits@=1/sid@=73411431/sui@=id@A=73411431@Sname@A=@Snick@A=薛定谔的咪咪丶@Sicon@A=avanew@ASface@AS201712@AS21@AS18@AS96858079f635f752a47837366cc016db@Srg@A=1@Spg@A=1@Srt@A=0@Sbg@A=0@Sweight@A=0@Scps_id@A=0@Sps@A=0@Ses@A=0@Sver@A=0@Sglobal_ban_lev@A=0@Sexp@A=0@Slevel@A=22@Scurr_exp@A=0@Sup_need@A=0@Sgt@A=0@Sit@A=0@Sits@A=0@Scm@A=0@Srni@A=0@Shcre@A=0@Screi@A=0@Sel@A=@Shfr@A=0@Sfs@A=0@S/sahf@=0/bnn@=/bl@=0/brid@=0/hc@=/";
		ExtractedUserInfo userInfo = bc_buy_deserve.extractUserInfo(sample);
		assertTrue("73411431".equals(userInfo.getUid()));
		assertTrue("薛定谔的咪咪丶".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_3() {
		String sample =  "/timestamp@=1513873112036/messageId@=81219/type@=bc_buy_deserve/level@=38/lev@=3/rid@=2020877/gid@=0/cnt@=1/hits@=3/sid@=675555/sui@=id@A=675555@Sname@A=@Snick@A=Mirrorrrrrrr@Sicon@A=avanew@ASface@AS201712@AS10@AS02@AS52aa865cb078d9b76744d9686857b124@Srg@A=1@Spg@A=1@Srt@A=0@Sbg@A=0@Sweight@A=0@Scps_id@A=0@Sps@A=0@Ses@A=0@Sver@A=0@Sglobal_ban_lev@A=0@Sexp@A=0@Slevel@A=38@Scurr_exp@A=0@Sup_need@A=0@Sgt@A=0@Sit@A=0@Sits@A=0@Scm@A=0@Srni@A=0@Shcre@A=0@Screi@A=0@Sel@A=@Shfr@A=32702@Sfs@A=0@S/sahf@=0/bnn@=/bl@=0/brid@=0/hc@=/";
		ExtractedUserInfo userInfo = bc_buy_deserve.extractUserInfo(sample);
		assertTrue("675555".equals(userInfo.getUid()));
		assertTrue("Mirrorrrrrrr".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_7() {
		String sample = "/timestamp@=1513872128036/messageId@=71540/type@=bc_buy_deserve/level@=42/lev@=3/rid@=2020877/gid@=0/cnt@=1/hits@=4/sid@=9853292/sui@=id@A=9853292@Sname@A=@Snick@A=TinyTank丶@Sicon@A=avanew@ASface@AS201712@AS16@AS02@ASf6bcede14e11946f07908e1e02694b44@Srg@A=4@Spg@A=1@Srt@A=0@Sbg@A=0@Sweight@A=0@Scps_id@A=0@Sps@A=0@Ses@A=0@Sver@A=0@Sglobal_ban_lev@A=0@Sexp@A=0@Slevel@A=42@Scurr_exp@A=0@Sup_need@A=0@Sgt@A=0@Sit@A=0@Sits@A=0@Scm@A=0@Srni@A=0@Shcre@A=0@Screi@A=0@Sel@A=@Shfr@A=0@Sfs@A=0@S/sahf@=0/bnn@=/bl@=0/brid@=0/hc@=/";
		ExtractedUserInfo userInfo = bc_buy_deserve.extractUserInfo(sample);
		assertTrue("9853292".equals(userInfo.getUid()));
		assertTrue("TinyTank丶".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_8() {
		String sample = "/timestamp@=1513863961035/messageId@=32512/type@=bc_buy_deserve/level@=24/lev@=2/rid@=2020877/gid@=0/cnt@=1/hits@=1/sid@=18270207/sui@=id@A=18270207@Sname@A=@Snick@A=六费四杠五@Sicon@A=avanew@ASface@AS201711@AS11@AS14@ASc7bbf16ea685c36b98e08434116f9a28@Srg@A=1@Spg@A=1@Srt@A=0@Sbg@A=0@Sweight@A=0@Scps_id@A=0@Sps@A=0@Ses@A=0@Sver@A=0@Sglobal_ban_lev@A=0@Sexp@A=0@Slevel@A=24@Scurr_exp@A=0@Sup_need@A=0@Sgt@A=0@Sit@A=0@Sits@A=0@Scm@A=0@Srni@A=0@Shcre@A=0@Screi@A=0@Sel@A=@Shfr@A=32702@Sfs@A=0@S/sahf@=0/bnn@=/bl@=0/brid@=0/hc@=/";
		ExtractedUserInfo userInfo = bc_buy_deserve.extractUserInfo(sample);
		assertTrue("18270207".equals(userInfo.getUid()));
		assertTrue("六费四杠五".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_9() {
		String sample =  "/timestamp@=1513868146034/messageId@=53155/type@=bc_buy_deserve/level@=32/lev@=3/rid@=2020877/gid@=0/cnt@=1/hits@=1/sid@=218356/sui@=id@A=218356@Sname@A=@Snick@A=咖啡我喝麦斯威尔@Sicon@A=avatar@AS000@AS21@AS83@AS56_avatar@Srg@A=1@Spg@A=1@Srt@A=0@Sbg@A=0@Sweight@A=0@Scps_id@A=0@Sps@A=0@Ses@A=0@Sver@A=0@Sglobal_ban_lev@A=0@Sexp@A=0@Slevel@A=32@Scurr_exp@A=0@Sup_need@A=0@Sgt@A=0@Sit@A=0@Sits@A=0@Scm@A=0@Srni@A=0@Shcre@A=0@Screi@A=0@Sel@A=@Shfr@A=32702@Sfs@A=0@S/sahf@=0/bnn@=/bl@=0/brid@=0/hc@=/";
		ExtractedUserInfo userInfo = bc_buy_deserve.extractUserInfo(sample);
		assertTrue("218356".equals(userInfo.getUid()));
		assertTrue("咖啡我喝麦斯威尔".equals(userInfo.getNn()));
	}
	@Test
	public void correctlyExtractFromMessage_10() {
		String sample = "/timestamp@=1513872098034/messageId@=70957/type@=bc_buy_deserve/level@=61/lev@=3/rid@=2020877/gid@=0/cnt@=1/hits@=1/sid@=49895392/sui@=id@A=49895392@Sname@A=@Snick@A=哇塞丶悟空耶@Sicon@A=avanew@ASface@AS201712@AS21@AS00@AS783e740d37950fc255a5d3d2cead1e4d@Srg@A=4@Spg@A=1@Srt@A=0@Sbg@A=0@Sweight@A=0@Scps_id@A=0@Sps@A=0@Ses@A=0@Sver@A=0@Sglobal_ban_lev@A=0@Sexp@A=0@Slevel@A=61@Scurr_exp@A=0@Sup_need@A=0@Sgt@A=0@Sit@A=0@Sits@A=0@Scm@A=0@Srni@A=0@Shcre@A=0@Screi@A=0@Sel@A=@Shfr@A=32702@Sfs@A=0@S/sahf@=0/bnn@=/bl@=0/brid@=0/hc@=/";
		ExtractedUserInfo userInfo = bc_buy_deserve.extractUserInfo(sample);
		assertTrue("49895392".equals(userInfo.getUid()));
		assertTrue("哇塞丶悟空耶".equals(userInfo.getNn()));
	}
}
