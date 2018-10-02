package com.app.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

	@RequestMapping("/getUserName")
	public String userName() {
		return "Ganesha";
	}

	@RequestMapping("/getUserNames")
	public String userAge() {
		return "23";
	}
	@RequestMapping("/userNameLists")
	public String[] userNames() {
		String[] s1 = { "gani", "jagsi", "hari" };
return s1;
		
	}

}
