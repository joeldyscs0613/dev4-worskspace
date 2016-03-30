package com.angularjspractice.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TileWelcomeController {

	@RequestMapping("/welcome")
	public String welcome(Map<String, Object> model) {
		model.put("message", "Hello Spring Boot with Tiles");
		return "welcome";
	}
	
	@RequestMapping("/index")
	public String index(Map<String, Object> model) {
		return "index";
	}
}
