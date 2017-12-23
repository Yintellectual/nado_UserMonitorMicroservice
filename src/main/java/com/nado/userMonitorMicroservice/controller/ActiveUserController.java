package com.nado.userMonitorMicroservice.controller;

import java.time.LocalDateTime;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nado.userMonitorMicroservice.repository.ActiveUserRepository;
import com.nado.userMonitorMicroservice.repository.UserRepository;

@Controller
public class ActiveUserController {
	@Autowired
	ActiveUserRepository activeUserRepository;
	@Autowired
	UserRepository userRepository;
	@RequestMapping("/api/user/getUidByNn")
	@ResponseBody
	public String getUidByNn(String nn){
		return userRepository.getUid(nn);
	}
	@RequestMapping("/api/user/getNnByUid")
	@ResponseBody
	public String getNnByUid(String uid){
		return userRepository.getNn(uid);
	}
	@RequestMapping("/api/activeUsers/getDAUByDate")
	@ResponseBody
	public Long getDAUByDate(String date){
		return activeUserRepository.getDAU(date);
	}
	@RequestMapping("/api/activeUsers/getDAUToday")
	@ResponseBody
	public Long getDAUToday(){
		return activeUserRepository.getDAU(LocalDateTime.now());
	}
	@RequestMapping("/api/activeUsers/getWAUToday")
	@ResponseBody
	public Long getWAUToday(){
		return activeUserRepository.getWAU(LocalDateTime.now());
	}
	@RequestMapping("/api/activeUsers/getMAUToday")
	@ResponseBody
	public Long getMAUToday(){
		return activeUserRepository.getMAU(LocalDateTime.now());
	}
}
