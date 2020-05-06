package com.zwt.service;

import java.util.List;
import java.util.Map;

import com.zwt.bean.Admin;

public interface AdminService {
	//管理员登录
	public Admin login(String username,String password);
	
	//显示所有管理员
	public  List<Admin> showAll();
	
	//添加管理员
	public Map<String, String> addAdmin(Map<String, Object> admin);
}
