package com.BikkadIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.BikkadIT.entity.User;
import com.BikkadIT.service.UserServiceI;

@Controller
public class UserController {

	@Autowired
	private UserServiceI userServiceI;

	@GetMapping("/welcome")
	public String loadForm() {

		return "registration";

	}

	@GetMapping("/login")
	public String preLogin() {
		return "login";

	}

	@PostMapping("/reg")
	public String userRegistration(User user, Model model) {
		System.out.println("Controller layer Method");
		System.out.println(user);
		int id = userServiceI.saveUser(user);

		model.addAttribute("ID", id);

		return "userSuccess";

	}
	
	@GetMapping("/log")
	public String loginCheck(User user) {
	System.out.println(user);
	boolean loginCheckServiceLayer = userServiceI.loginCheckServiceLayer(user);
		
	if(loginCheckServiceLayer) {
		return "loginSuccess";
	}else
		return "LoginFail";
		
	}
	
	
	
	

}

