package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

	@Bean
	List<User> UserList(){

		User user1 = new User(1, "Ana");
		System.out.println(user1);

		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		System.out.println(userList);
		return userList;


	}

}
