package com.nado.userMonitorMicroservice.enums;

import static com.nado.douyuConnectorMicroservice.util.CommonUtil.*;

import com.nado.userMonitorMicroservice.entity.ExtractedUserInfo;
public enum UserActivityRelatedMessageTypes {
	dgb {
		private Long count = 0l;
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			
			this.count++;
			return new ExtractedUserInfo(matchDigitalValue(message, "uid"), matchStringValue(message, "nn"));
		}

		@Override
		public Long getCount() {
			
			return count;
		}
	}, blab {
		private Long count = 0l;
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			
			this.count++;
			return new ExtractedUserInfo(matchDigitalValue(message, "uid"), matchStringValue(message, "nn"));
		}

		@Override
		public Long getCount() {
			
			return count;
		}
	}, bc_buy_deserve {
		private Long count = 0l;
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			
			this.count++;
			return new ExtractedUserInfo(matchNestedValue(message, "id"), matchNestedValue(message, "nick"));
		}

		@Override
		public Long getCount() {
			
			return count;
		}
	}, chatmsg {
		private Long count = 0l;
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			
			this.count++;
			return new ExtractedUserInfo(matchDigitalValue(message, "uid"), matchStringValue(message, "nn"));
		}

		@Override
		public Long getCount() {
			
			return count;
		}
	}, uenter {
		private Long count = 0l;
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			
			this.count++;
			return new ExtractedUserInfo(matchDigitalValue(message, "uid"), matchStringValue(message, "nn"));
		}

		@Override
		public Long getCount() {
			
			return count;
		}
	}, onlinegift {
		private Long count = 0l;
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			
			this.count++;
			return new ExtractedUserInfo(matchDigitalValue(message, "uid"), matchStringValue(message, "nn"));
		}

		@Override
		public Long getCount() {
			
			return count;
		}
	}, upgrade {
		private Long count = 0l;
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			
			this.count++;
			return new ExtractedUserInfo(matchDigitalValue(message, "uid"), matchStringValue(message, "nn"));
		}

		@Override
		public Long getCount() {
			
			return count;
		}
	}, gpbc {
		private Long count = 0l;
		@Override
		public ExtractedUserInfo extractUserInfo(String message) {
			
			this.count++;
			return new ExtractedUserInfo(matchDigitalValue(message, "did"), matchStringValue(message, "dnk"));
		}

		@Override
		public Long getCount() {
			
			return count;
		}
	};
	
	public abstract ExtractedUserInfo extractUserInfo(String message);
	public abstract Long getCount();
}
