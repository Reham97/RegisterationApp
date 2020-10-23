package com.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.proj.model.User;
import com.proj.repositories.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;

	@GetMapping("")
	public String tellHallo() {
		return "pages/index";
	}

//	@GetMapping("/signup")
//	public String showSignup(Model model) {
//		model.addAttribute("user", new User());
//		return "pages/signup";
//	}

//	@GetMapping("/signin")
//	public String showSignin(Model model) {
//		model.addAttribute("user", new User());
//		return "pages/signin";
//	}
//
//	@PostMapping("/signup")
//	public String processSignup(User user) {
//		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//		userRepository.save(user);
//		return "pages/signin";
//	}

		

	@GetMapping("/home")
	public String home() {
		return "pages/home";
	}

}
