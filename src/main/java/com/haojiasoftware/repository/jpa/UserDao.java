package com.haojiasoftware.repository.jpa;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.haojiasoftware.entity.CsUser;

/**
 * 用户dao
 *
 */
public interface UserDao extends JpaSpecificationExecutor<CsUser>,PagingAndSortingRepository<CsUser, Long>{

}
