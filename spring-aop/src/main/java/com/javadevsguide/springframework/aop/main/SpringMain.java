package com.javadevsguide.springframework.aop.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevsguide.springframework.aop.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		System.out.println("printing employee name in Main class: "+employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Spiderman");
		
		employeeService.getEmployee().throwException();
		
		ctx.close();
	}

}
