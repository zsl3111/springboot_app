package com.qa.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1Controller")
public class Test1Controller {
	@RequestMapping("/test")
	public Object test(){
		return "success";
	}
}
