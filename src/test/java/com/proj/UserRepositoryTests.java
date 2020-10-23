//package com.proj;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.test.annotation.Rollback;
//
//import com.proj.model.User;
//import com.proj.repositories.UserRepository;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
//public class UserRepositoryTests{
//	
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private TestEntityManager testEntityManager; 
//	
//	@Test
//	public void testCreateUser() {
//		User user = new User("Reham97","123456789","reham3@yahoo.com");
//		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//		User savedUser = userRepository.save(user);
//		
//		User existUser = testEntityManager.find(User.class, savedUser.getId());
//		
//		assertThat(existUser.getUserName()).isEqualTo(user.getUserName());
//	}
//	
//	@Test
//	public void finUserByEmail() {
//		String email="reham@yahoo.com";
//		String password="123456789";
//		User user = userRepository.findUser(email,password);
//		
//		assertThat(user).isNotNull();
//		
//	}
//	
//}
//
//
