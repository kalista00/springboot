package com.example.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.boot.service.TestService;

@Controller
public class HelloController {
	
	@Autowired
	private TestService service;
	
	@RequestMapping("mybatis")
	public @ResponseBody String mybatis() {
		
		return "<h2>mybatis="+service.testCount()+"</h2>";
	}
	@RequestMapping("hello")
	public String hello() {
		
		return "hello";
	}
}
