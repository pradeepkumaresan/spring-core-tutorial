package net.javaguides.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseInitializerUsingInterfaces
		implements InitializingBean, DisposableBean {

	private final List<User> listOfUsers = new ArrayList<>();

	@Override
	public void afterPropertiesSet() {
		User user = new User(1, "User");
		User user1 = new User(2, "Admin");
		User user2 = new User(3, "SuperAdmin");

		listOfUsers.add(user);
		listOfUsers.add(user1);
		listOfUsers.add(user2);
		System.out.println("-----------Interface init() ------------");
		for (User user3 : listOfUsers) {
			System.out.println(user3.toString());
		}
		// save to database

	}

	@Override
	public void destroy() {
		// Delete from database
		listOfUsers.clear();
		System.out.println("-----------Interface destroy() ------------");
	}
}
