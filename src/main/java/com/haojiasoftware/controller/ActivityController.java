package com.haojiasoftware.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haojiasoftware.entity.CsActivity;
import com.haojiasoftware.entity.CsNumber;
import com.haojiasoftware.entity.CsUser;
import com.haojiasoftware.entity.NumberCount;
import com.haojiasoftware.service.ActivityService;

@Controller
@RequestMapping(value = "/activity")
public class ActivityController {
	
	@Autowired
	private ActivityService activityService;
	
	/**
	 * 初始化详情页
	 * @param id
	 */
	@RequestMapping(value="detailInit/{id}")
	public String detail_init(@PathVariable("id")Long id,Model model,HttpSession session){
		CsActivity ac = activityService.getActivityById(id);
		model.addAttribute("ac",ac);
		session.setAttribute("curAcId", ac.getId());
		return "detail";
	}
	/**
	 * 获取当前人对当前活动的猜记录
	 */
	@RequestMapping(value="ajaxCurNumber")
	@ResponseBody
	public String ajaxCurNumber(HttpSession session){
		CsUser u = (CsUser)session.getAttribute("LoginUser");
		Long curAcId = (Long)session.getAttribute("curAcId");
		CsNumber nu = activityService.getNumberByUserIdAndAcId(u.getId(),curAcId);
		JSONObject ob = JSONObject.fromObject(nu);
		return ob.toString();
				
	}
	
	/**
	 * 获取竞猜结果(活动已结束时)
	 */
	@RequestMapping(value="ajaxResult")
	@ResponseBody
	public String ajaxResult(HttpSession session){
		CsUser u = (CsUser)session.getAttribute("LoginUser");
		Long curAcId = (Long)session.getAttribute("curAcId");
		CsActivity ac = activityService.getActivityById(curAcId);
		JSONObject ob = new JSONObject();
		ob.put("openFlag",ac.getOpenFlag());
		if(ac.getOpenFlag().intValue()==1){
			//获取当前人结果
			CsNumber nu = activityService.getNumberByUserIdAndAcId(u.getId(),curAcId);
			Integer ccount = null;
			if(nu==null){
				ccount = 0;
			}else{
				ccount = activityService.getCountByNumber(ac.getId(),nu.getNumber());
			}
			ob.put("ccount", ccount);
			//获取当前活动中奖结果
			List<NumberCount> luck = activityService.getLuckByAc(ac);
		}
		return null;
		
	}
	
	
}
