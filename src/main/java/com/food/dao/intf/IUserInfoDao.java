package com.food.dao.intf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.dao.model.UserInfo;

@Repository
public interface IUserInfoDao  extends JpaRepository<UserInfo,Integer>{

}
