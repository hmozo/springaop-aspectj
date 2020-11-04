package com.pluralsight.aop.simpleaspect;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {
	
	public void doSomething(int i) {
		
	}
	
	public String returnsString() {
		return "Hola";
	}
}
