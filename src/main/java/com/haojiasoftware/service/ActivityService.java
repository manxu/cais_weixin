package com.haojiasoftware.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haojiasoftware.entity.CsActivity;
import com.haojiasoftware.entity.CsNumber;
import com.haojiasoftware.entity.NumberCount;
import com.haojiasoftware.repository.jpa.ActivityDao;
import com.haojiasoftware.repository.jpa.UserDao;
import com.haojiasoftware.repository.mybatis.CsNumberMapper;
import com.haojiasoftware.repository.mybatis.CsUserMapper;

@Service
public class ActivityService {
	
	@Resource
	private CsUserMapper userMapper;
	@Resource
	private UserDao userDao;
	
	@Resource
	private ActivityDao activityDao;
	@Resource
	private CsNumberMapper numberMapper;
	
	/**
	 * 根据id 获取活动
	 */
	public CsActivity getActivityById(Long id){
		return activityDao.findOne(id);
	}
	
	/**
	 * 获取 猜数字
	 */
	public CsNumber getNumberByUserIdAndAcId(Long userId,Long acId){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("userId",userId);
		param.put("acId",acId);
		return numberMapper.selectByUserIdAndAcId(param);
	}
	
	/**
	 * 获取数字的出现个数
	 */
	public Integer getCountByNumber(Long acId,Integer number){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("number",number);
		param.put("acId",acId);
		return numberMapper.selectByAcAndNumber(param);
	}
	
	/**
	 * 获取幸运
	 */
	public List<NumberCount> getLuckByAc(CsActivity ac){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("acId",ac.getId());
		param.put("limit", ac.getPrizeNum());
		return numberMapper.getLuck(param);
	}
	
}
