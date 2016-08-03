package com.haojiasoftware.repository.mybatis;

import com.haojiasoftware.entity.CsActivity;

@MyBatisRepository
public interface CsActivityMapper {

    CsActivity selectByPrimaryKey(Integer id);
}