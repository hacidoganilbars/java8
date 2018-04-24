package com.doganilbars.main;

import com.doganilbars.interfaces.Interface1;
import com.doganilbars.interfaces.Interface2;
import com.doganilbars.myclass.MyClass;

public class Islem {
	public static void main(String[] args) {
		
		Interface1 interface1 = new MyClass();
		interface1.method1("ABC");
		interface1.log("my log 1");
		
		Interface2 interface2=new MyClass();
		interface2.method2();
		interface2.log("DEF");
	}

}
