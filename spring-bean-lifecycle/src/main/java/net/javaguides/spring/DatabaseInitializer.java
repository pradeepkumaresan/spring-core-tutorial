package net.javaguides.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer {

	private final List<User> listOfUsers = new ArrayList<>();

	public void init() {
		User user = new User(1, "User");
		User user1 = new User(2, "Admin");
		User user2 = new User(3, "SuperAdmin");

		listOfUsers.add(user);
		listOfUsers.add(user1);
		listOfUsers.add(user2);
		System.out.println("-----------Bean init() ------------");
		for (User user3 : listOfUsers) {
			System.out.println(user3.toString());
		}
		// save to database

	}

	public void destroy() {
		// Delete from database
		listOfUsers.clear();
		System.out.println("-----------Bean destroy() ------------");
	}
}
