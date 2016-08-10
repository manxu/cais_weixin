package com.haojiasoftware.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haojiasoftware.service.UserService;

@Controller
@RequestMapping(value = "/")
public class IndexController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "")
	public String weixinService(HttpSession session) throws Exception {
		return "index";
	}
	
}
