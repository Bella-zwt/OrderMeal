package com.zwt.mapper;

import java.sql.Date;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.zwt.bean.Customer;

@Component
public interface CustomerMapper {

	//查询openid是否已经存在，存在则表示已经授权过，即为注册过
	public Customer selectCustomer(@Param("openId")String openId);
	
	//将新用户信息写入表中
	public void insertCustomer(@Param("customerId")Integer customerId,@Param("openId")String openId,@Param("nickName")String nickName,@Param("sex")String sex,@Param("isMember")Boolean isMember,@Param("headImg")String headImg,@Param("memberNember")String memberNember,@Param("memberTime")Date memberTime);
}
