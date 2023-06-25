package net.javaguides.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DatabaseInitializerUsingAnnotation {

	private final List<User> listOfUsers = new ArrayList<>();

	@PostConstruct
	public void init() {
		User user = new User(1, "User");
		User user1 = new User(2, "Admin");
		User user2 = new User(3, "SuperAdmin");

		listOfUsers.add(user);
		listOfUsers.add(user1);
		listOfUsers.add(user2);
		System.out.println("-----------Annotation init() ------------");
		for (User user3 : listOfUsers) {
			System.out.println(user3.toString());
		}
		// save to database

	}

	@PreDestroy
	public void destroy() {
		// Delete from database
		listOfUsers.clear();
		System.out.println("-----------Annotation destroy() ------------");
	}
}
