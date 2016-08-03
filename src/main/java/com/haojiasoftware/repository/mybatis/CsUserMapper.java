package com.haojiasoftware.repository.mybatis;

import java.util.Map;

import com.haojiasoftware.entity.CsUser;
@MyBatisRepository
public interface CsUserMapper {

    CsUser selectByPrimaryKey(Integer id);
    CsUser selectByOpenId(Map map); 
}