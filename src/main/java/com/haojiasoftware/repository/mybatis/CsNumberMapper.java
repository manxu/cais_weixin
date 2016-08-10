package com.haojiasoftware.repository.mybatis;

import java.util.List;
import java.util.Map;

import com.haojiasoftware.entity.CsNumber;
import com.haojiasoftware.entity.NumberCount;

@MyBatisRepository
public interface CsNumberMapper {

    CsNumber selectByPrimaryKey(Integer id);
    
    CsNumber selectByUserIdAndAcId(Map<String,Object> param);
    
    Integer selectByAcAndNumber(Map<String,Object> param);
    
    Integer selectCountByAcId(Long acId);
    
    List<NumberCount> getLuck(Map<String,Object> param);
}