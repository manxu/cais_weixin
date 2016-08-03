package com.haojiasoftware.repository.mybatis;

import com.haojiasoftware.entity.CsNumber;

@MyBatisRepository
public interface CsNumberMapper {

    CsNumber selectByPrimaryKey(Integer id);
}