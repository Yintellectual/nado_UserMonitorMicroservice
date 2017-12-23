package com.nado.userMonitorMicroservice.repository.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.nado.douyuConnectorMicroservice.util.CommonUtil;
import com.nado.userMonitorMicroservice.repository.ActiveUserRepository;

@Service
public class ActiveUserRepositoryRedisImpl implements ActiveUserRepository {
	@Autowired
	StringRedisTemplate stringRedisTemplate;
	SetOperations<String, String> setOperations;
	HashOperations<String, String, String> hashOperations;
	ListOperations<String, String> listOperations;

	@PostConstruct
	public void init() {
		setOperations = stringRedisTemplate.opsForSet();
		hashOperations = stringRedisTemplate.opsForHash();
		listOperations = stringRedisTemplate.opsForList();
	}

	private static String dauKey(String date) {
		return "nado:activeUser:dailySet:date:" + date;
	}

	private static String wauKey(String week) {
		return "nado:activeUser:weeklySet:week:" + week;
	}

	private static String mauKey(String month) {
		return "nado:activeUser:monthlySet:month:" + month;
	}

	@Override
	public void addUser(String uid, LocalDateTime time) {
		LocalDateTime virtulizedTime = CommonUtil.virtualizeDateTime(time);
		String date = virtulizedTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String week = virtulizedTime.format(DateTimeFormatter.ofPattern("yyyy-'W'ww"));
		String month = virtulizedTime.format(DateTimeFormatter.ofPattern("yyyy-MM"));
		addUser(uid, date, week, month);
	}

	@Override
	public void addUser(String uid, String date, String week, String month) {
		// TODO Auto-generated method stub
		setOperations.add(dauKey(date), uid);
		setOperations.add(wauKey(week), uid);
		setOperations.add(mauKey(month), uid);
	}

	@Override
	public Long getDAU(String date) {
		// TODO Auto-generated method stub
		return setOperations.size(dauKey(date));
	}

	@Override
	public boolean isActive(String uid, String date) {
		// TODO Auto-generated method stub
		return setOperations.isMember(dauKey(date), uid);
	}

	@Override
	public void deleteDate(String date) {
		// TODO Auto-generated method stub
		stringRedisTemplate.delete(dauKey(date));
	}

	@Override
	public Long getWAU(String week) {
		// TODO Auto-generated method stub
		return setOperations.size(wauKey(week));
	}

	@Override
	public Long getMAU(String month) {
		// TODO Auto-generated method stub
		return setOperations.size(mauKey(month));
	}

	@Override
	public Long getDAU(LocalDateTime time) {
		LocalDateTime virtulizedTime = CommonUtil.virtualizeDateTime(time);
		String date = virtulizedTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		// TODO Auto-generated method stub
		return getDAU(date);
	}

	@Override
	public Long getWAU(LocalDateTime time) {
		LocalDateTime virtulizedTime = CommonUtil.virtualizeDateTime(time);
		String week = virtulizedTime.format(DateTimeFormatter.ofPattern("yyyy-'W'ww"));
		// TODO Auto-generated method stub
		return getWAU(week);
	}

	@Override
	public Long getMAU(LocalDateTime time) {
		LocalDateTime virtulizedTime = CommonUtil.virtualizeDateTime(time);
		String month = virtulizedTime.format(DateTimeFormatter.ofPattern("yyyy-MM"));
		// TODO Auto-generated method stub
		return getMAU(month);
	}

}
