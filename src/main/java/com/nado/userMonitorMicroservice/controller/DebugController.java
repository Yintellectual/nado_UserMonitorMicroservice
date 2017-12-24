package com.nado.userMonitorMicroservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nado.userMonitorMicroservice.enums.UserActivityRelatedMessageTypes;

@Controller
public class DebugController {

	@RequestMapping("/api/debug/countMessages")
	@ResponseBody
	public Map<String, Long> countMessages(){
		Map<String, Long> result = new HashMap<>();
		for(UserActivityRelatedMessageTypes type: UserActivityRelatedMessageTypes.values()){
			result.put(type.name(), type.getCount());
		}
		return result;
	}
}
