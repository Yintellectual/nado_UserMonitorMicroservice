package com.nado.userMonitorMicroservice.repository;

public interface UserRepository {
	String getNn(String uid);

	String getUid(String nn);

	void save(String uid, String nn);
	
	void delete(String uid);
}
