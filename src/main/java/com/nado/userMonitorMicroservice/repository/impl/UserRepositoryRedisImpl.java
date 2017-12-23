package com.nado.userMonitorMicroservice.repository.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.nado.userMonitorMicroservice.repository.UserRepository;

@Service
public class UserRepositoryRedisImpl implements UserRepository {
	@Autowired
	StringRedisTemplate stringRedisTemplate;
	SetOperations<String, String> setOperations;
	HashOperations<String, String, String> hashOperations;
	ListOperations<String, String> listOperations;
	//ValueOperations<String, String> valueOperations;
	@PostConstruct
	public void init() {
		setOperations = stringRedisTemplate.opsForSet();
		hashOperations = stringRedisTemplate.opsForHash();
		listOperations = stringRedisTemplate.opsForList();
		
	}
	private static String userKey(String uid){
		return "nado:user:uid:"+uid;
	}
	private static final String NNUID_HASH_MAP_KEY ="nado:user:nns";  
	@Override
	public String getNn(String uid) {
		// TODO Auto-generated method stub
		return hashOperations.get(userKey(uid), "nn");
	}

	@Override
	public String getUid(String nn) {
		// TODO Auto-generated method stub
		return hashOperations.get(NNUID_HASH_MAP_KEY, nn);
	}

	@Override
	public void save(String uid, String nn) {
		// TODO Auto-generated method stub
		//save nado:user:nns, {nn}::{uid}
		hashOperations.put(NNUID_HASH_MAP_KEY, nn, uid);
		//save "nado:user:uid:"+{uid} nn::{nn}
		hashOperations.put(userKey(uid), "nn", nn);
	}

	@Override
	public void delete(String uid) {
		// TODO Auto-generated method stub
		String nn = getNn(uid);
		stringRedisTemplate.delete(userKey(uid));
		hashOperations.delete(NNUID_HASH_MAP_KEY, nn);
	}

}
