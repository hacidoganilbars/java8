package com.doganilbars.myclass;

import com.doganilbars.interfaces.Interface1;
import com.doganilbars.interfaces.Interface2;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
		System.out.println("method 2 of Interface2");

	}

	@Override
	public void method1(String str) {
		System.out.println("method 1 of Interface1: " + str);

	}

	@Override
	public void log(String str) {
		System.out.println("MyClass logging::" + str);
		Interface1.super.log("abc");
	}

}
