package com.proj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.proj.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	@Query("SELECT u FROM User u where u.email = ?1 and u.password = ?2")
	User findUser(String email, String password);
	@Query("SELECT u FROM User u where u.UserName = ?1")
	User findByUserName(String userName);
	
}

