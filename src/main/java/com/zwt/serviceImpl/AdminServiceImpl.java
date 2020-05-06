package com.zwt.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zwt.bean.Admin;
import com.zwt.mapper.AdminMapper;
import com.zwt.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapper adminMapper;
	@Override
	public Admin login(String username, String password) {
		//System.out.println(username+password+"1");
		return adminMapper.selectAdmin(username, password);
	}
	@Override
	public List<Admin> showAll() {
		return adminMapper.selectAll();
	}
	@Override
	public Map<String, String> addAdmin(Map<String, Object> admin) {
		Map<String, String> map=new HashMap<String, String>();
		adminMapper.insertAdmin((String)admin.get("username"), (String)admin.get("password"));
		map.put("insert", "success");
		return map;
	}

	

}
