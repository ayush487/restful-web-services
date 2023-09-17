package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();
	private static int userCount = 0;
	
	static {
		users.add(new User(++userCount, "Adam", LocalDate.now().minusYears(30l)));
		users.add(new User(++userCount, "Eve", LocalDate.now().minusYears(25l)));
		users.add(new User(++userCount, "Jim", LocalDate.now().minusYears(20l)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User findById(int id) {
		User foundUser = users.stream().filter(user -> user.getId()==id).findFirst().orElse(null);
		return foundUser;
	}
	
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public void deleteById(int id) {
		users.removeIf(user -> user.getId()==id);
	}
}
