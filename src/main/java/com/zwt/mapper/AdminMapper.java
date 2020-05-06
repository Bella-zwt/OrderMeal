package com.zwt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import com.zwt.bean.Admin;

@Component
public interface AdminMapper {
	
	//管理员登录
	public Admin selectAdmin(@Param("username")String username,@Param("password")String password);
	
	//查询所有的管理员
	public List<Admin> selectAll();
	
	//添加管理员
	public void insertAdmin(@Param("username")String username,@Param("password")String password);
}
