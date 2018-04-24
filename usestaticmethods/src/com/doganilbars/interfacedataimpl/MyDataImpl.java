package com.doganilbars.interfacedataimpl;

import com.doganilbars.interfacedata.IMyData;

public class MyDataImpl implements IMyData {

	public boolean isNull(String str) {
		System.out.println("Impl Null Check");
		return str == null ? true : false;
	}

}
