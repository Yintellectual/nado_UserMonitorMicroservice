package com.nado.userMonitorMicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtractedUserInfo {
	public String uid;
	public String nn;
}
