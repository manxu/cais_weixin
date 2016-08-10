package com.haojiasoftware.repository.jpa;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.haojiasoftware.entity.CsActivity;
import com.haojiasoftware.entity.CsUser;

/**
 * 用户dao
 *
 */
public interface ActivityDao extends JpaSpecificationExecutor<CsActivity>,PagingAndSortingRepository<CsActivity, Long>{

}
