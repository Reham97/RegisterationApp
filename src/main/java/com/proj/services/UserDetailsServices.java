package com.proj.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.proj.details.CustomeUser;
import com.proj.model.User;
import com.proj.repositories.UserRepository;

public class UserDetailsServices implements UserDetailsService {

	@Autowired
	private UserRepository userRepository; 
	@Override
	public UserDetails loadUserByUsername(String userName ) throws UsernameNotFoundException {
		User user = userRepository.findByUserName(userName);
		if(user==null)
		{
			throw new UsernameNotFoundException("User not found");
		}
		
		return new CustomeUser(user);
	}

}
