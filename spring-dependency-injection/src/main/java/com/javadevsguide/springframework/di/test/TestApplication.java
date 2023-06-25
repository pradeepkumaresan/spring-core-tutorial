package com.javadevsguide.springframework.di.test;

import com.javadevsguide.springframework.di.constructor.ConstructorBasedInjection;
import com.javadevsguide.springframework.di.setter.SetterBasedInjection;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javadevsguide.springframework.di.config.AppConfiguration;
import com.javadevsguide.springframework.di.field.FieldBasedInjection;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		FieldBasedInjection fieldBasedInjection = applicationContext.getBean(FieldBasedInjection.class);
		fieldBasedInjection.processMsg("message sent from field injection");

		SetterBasedInjection setterBasedInjection = applicationContext.getBean(SetterBasedInjection.class);
		setterBasedInjection.processMsg("message sent from setter injection");

		ConstructorBasedInjection constructorBasedInjection = applicationContext.getBean(ConstructorBasedInjection.class);
		constructorBasedInjection.processMsg("message sent from constructor injection");
	}
}
