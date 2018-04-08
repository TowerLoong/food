package com.food.dao.intf;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.food.dao.model.UserInfo;

@Repository
public interface IUserInfoDao  extends JpaRepository<UserInfo,Integer>{

	//根据用户名和密码查询用户
@Query(value = "select ui.* from t_user_info ui where ui.user_name = ?1 and ui.user_pass = ?2", nativeQuery = true) 
	public List<UserInfo> findUserInfo( String userName,String userPass);
	
}
