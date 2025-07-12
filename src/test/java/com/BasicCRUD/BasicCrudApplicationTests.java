package com.BasicCRUD;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.BasicCRUD.entity.User;
import com.BasicCRUD.repository.UserRepository;

@SpringBootTest
class BasicCrudApplicationTests {
	@Autowired
	private UserRepository user;

	@Test
	void saveUser() {
		User us = new User();
		us.setName("Bikash");
		us.setEmail("bikashj995@gmail.com");
		us.setMobile("9114165927");
		user.save(us);
	}

	@Test
	void deleteUser() {
		user.deleteById(3L);
	}

	@Test
	void updateUser() {
		User us = new User();
		us.setId(2L);
		us.setName("Ankita");
		us.setEmail("ankitamohaptra532@gmail.com");
		us.setMobile("8328857252");
		user.save(us);
	}

	@Test
	void getUser() {
		Optional<User> val = user.findById(1L);
		if (val.isPresent()) {
			User us = new User();
			System.out.println(us.getId());
			System.out.println(us.getName());
			System.out.println(us.getEmail());
			System.out.println(us.getMobile());
		} else {
			System.out.println("No record found");
		}
	}
}
