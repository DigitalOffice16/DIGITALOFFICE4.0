package com.edigital.office.util;

public class EdigitalOfficeUtil {
	public enum Role {
		ADMIN(1l,"admin power"), USER(2l,"user power");
		private long id;
        private String desc;
		private Role(long id,String desc) {
			this.id = id;
			this.desc=desc;
		}
		public long getId() {
			return id;
		}
		public String getDesc() {
			return desc;
		}
	};
	
	
}
