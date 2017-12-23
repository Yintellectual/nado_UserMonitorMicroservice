package com.nado.userMonitorMicroservice.enums;

import static com.nado.douyuConnectorMicroservice.util.CommonUtil.*;

import com.nado.userMonitorMicroservice.entity.ExtractedUserInfo;
public enum UserActivityRelatedMessageTypes {
	dgb {
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			// TODO Auto-generated method stub
			return new ExtractedUserInfo(matchDigitalValue(message, "uid"), matchStringValue(message, "nn"));
		}
	}, blab {
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			// TODO Auto-generated method stub
			return new ExtractedUserInfo(matchDigitalValue(message, "uid"), matchStringValue(message, "nn"));
		}
	}, bc_buy_deserve {
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			// TODO Auto-generated method stub
			return new ExtractedUserInfo(matchNestedValue(message, "id"), matchNestedValue(message, "nick"));
		}
	}, chatmsg {
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			// TODO Auto-generated method stub
			return new ExtractedUserInfo(matchDigitalValue(message, "uid"), matchStringValue(message, "nn"));
		}
	}, uenter {
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			// TODO Auto-generated method stub
			return new ExtractedUserInfo(matchDigitalValue(message, "uid"), matchStringValue(message, "nn"));
		}
	}, onlinegift {
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			// TODO Auto-generated method stub
			return new ExtractedUserInfo(matchDigitalValue(message, "uid"), matchStringValue(message, "nn"));
		}
	}, upgrade {
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			// TODO Auto-generated method stub
			return new ExtractedUserInfo(matchDigitalValue(message, "uid"), matchStringValue(message, "nn"));
		}
	}, gpbc {
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			// TODO Auto-generated method stub
			return new ExtractedUserInfo(matchDigitalValue(message, "did"), matchStringValue(message, "dnk"));
		}
	};
	
	public abstract ExtractedUserInfo extractUserInfo(String message);
}
