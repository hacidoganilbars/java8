package com.doganilbars.main;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Islem {
	public static void main(String[] args) {

		try {

			ScriptEngine se = new ScriptEngineManager().getEngineByName("javascript");
			se.eval("print('Hello js');");
			se.eval(new FileReader("src/com/doganilbars/javascript/demo1.js"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
