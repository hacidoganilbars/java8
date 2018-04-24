package com.doganilbars.interfacedata;

public interface IMyData {
	
	default void print(String str) {
		if(!isNull(str)) {
			System.out.println("IMyData Print::"+str);
		}
	}
	
	static boolean isNull(String str) {
		System.out.println("Interface Null Check");
		return str==null ? true :"".equals(str) ? true:false;
	}

}
