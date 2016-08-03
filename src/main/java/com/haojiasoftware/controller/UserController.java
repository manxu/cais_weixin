package com.haojiasoftware.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haojiasoftware.entity.CsUser;
import com.haojiasoftware.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "info")
	public @ResponseBody String weixinService(HttpSession session) throws Exception {
		CsUser u = userService.getUserByOpenId(((CsUser)session.getAttribute("LoginUser")).getOpenId());
		JSONObject o = JSONObject.fromObject(u);
		return o.toString();
	}
	
	
	@RequestMapping("shuzi")
	public String shuzi(HttpServletRequest req){
		return "shuzi";  
	}
	
	
}
