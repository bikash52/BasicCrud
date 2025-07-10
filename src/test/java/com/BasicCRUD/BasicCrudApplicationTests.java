package com.BasicCRUD;

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
		User us=new User();
		us.setName("Akash");
		us.setEmail("as=kasj995@gmail.com");
		us.setMobile("9114158927");
		user.save(us);
	}
	
	@Test
	void deleteUser() {
		User us=new User();
		user.deleteById(3L);
	}

	@Test
	void updateUser() {
		User us=new User();
		us.setId(2L);
		us.setName("Ankita");
		us.setEmail("ankitamohaptra532@gmail.com");
		us.setMobile("8328857252");
		user.save(us);
	}
}
