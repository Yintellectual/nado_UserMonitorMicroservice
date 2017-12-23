package com.nado.userMonitorMicroservice.repository;

import java.time.LocalDateTime;

public interface ActiveUserRepository {
	void addUser(String uid, String date, String week, String month);
	void addUser(String uid, LocalDateTime time);
	Long getDAU(String date);
	Long getDAU(LocalDateTime time);
	Long getWAU(String week);
	Long getWAU(LocalDateTime time);
	Long getMAU(String month);
	Long getMAU(LocalDateTime time);
	boolean isActive(String uid, String date);
	
	void deleteDate(String date);
}
