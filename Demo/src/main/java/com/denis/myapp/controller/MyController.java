package com.denis.myapp.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(MyController.class);
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	 public String hello(Model model){
		return "home";
	}

}
