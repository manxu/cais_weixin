package com.haojiasoftware.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.haojiasoftware.entity.CsUser;
import com.haojiasoftware.repository.jpa.UserDao;
import com.haojiasoftware.repository.mybatis.CsUserMapper;

@Service
public class UserService {
	
	@Resource
	private CsUserMapper userMapper;
	@Resource
	private UserDao userDao;
	/**
	 * 根据openid 查询用户 
	 */
	public CsUser getUserByOpenId(String openId){
		Map<String,String> map = new HashMap<String, String>();
		map.put("openId",openId);
		return userMapper.selectByOpenId(map);
	}
	/**
	 * 保存用户 信息 ， 微信用户
	 */
	@Transactional(readOnly=true)
	public synchronized CsUser newUser(CsUser m){
		CsUser o = getUserByOpenId(m.getOpenId());
		if(o!=null){
			return o;
		}
		userDao.save(m);
		return m;
	}
	
}
