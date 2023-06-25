package net.javaguides.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public DatabaseInitializer databaseInitializer() {
		return new DatabaseInitializer();
	}

	@Bean
	public DatabaseInitializerUsingInterfaces databaseInitializerUsingInterfaces() {
		return new DatabaseInitializerUsingInterfaces();
	}

	@Bean
	public DatabaseInitializerUsingAnnotation databaseInitializerUsingAnnotation() {
		return new DatabaseInitializerUsingAnnotation();
	}
}
