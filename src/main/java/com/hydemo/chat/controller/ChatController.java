package com.hydemo.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
	@Autowired
	ResourceLoader resourceLoader;
	
	@GetMapping("/")
	public String mainPage() {
		// System.out.println("loaded");
		return "main";
	}
	
	
}
