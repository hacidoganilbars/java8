package com.doganilbars.main;

import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Islem {

	public static void main(String[] args) {
		try {
			ScriptEngine se = new ScriptEngineManager().getEngineByName("javascript");
			se.eval(new FileReader("src/com/doganilbars/javascript/demo2.js"));
			Invocable i1 = (Invocable) se;
			i1.invokeFunction("fn1", "Hacý Doðan");

			Invocable i2 = (Invocable) se;
			i2.invokeFunction("fn2", 1, 2);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
