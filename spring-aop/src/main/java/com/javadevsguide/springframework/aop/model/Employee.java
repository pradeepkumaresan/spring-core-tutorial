package com.javadevsguide.springframework.aop.model;

import com.javadevsguide.springframework.aop.aspect.Loggable;

public class Employee {

	private String name;
	
	public String getName() {
		//System.out.println("Employee getName() called");
		return name;
	}

	@Loggable
	public void setName(String nm) {
		this.name=nm;
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}
	
}
