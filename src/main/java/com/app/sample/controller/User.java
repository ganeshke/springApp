package com.app.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

	@RequestMapping("/getUserName")
	public String userName() {
		return "Ganesha";
	}
}
