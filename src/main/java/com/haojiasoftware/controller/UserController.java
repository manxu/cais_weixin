package com.haojiasoftware.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haojiasoftware.entity.CsUser;
import com.haojiasoftware.service.UserService;
import com.haojiasoftware.timer.TimerUtilCollection;
import com.haojiasoftware.weixin.WeixinCommon;
import com.haojiasoftware.weixin.menu.MenuManager;
import com.haojiasoftware.weixin.menu.pojo.AccessToken;
import com.haojiasoftware.weixin.util.SignUtil;
import com.haojiasoftware.weixin.util.WeixinUtil;

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
	
}
