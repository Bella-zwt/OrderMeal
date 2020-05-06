package com.zwt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.zwt.bean.Admin;
import com.zwt.serviceImpl.AdminServiceImpl;

@Controller
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminServiceImpl adminServic;

	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> login(HttpServletRequest req,HttpServletResponse resp) {
		Map<String, Object> map=new HashMap<>();
		String username = req.getParameter("username");
		String password=req.getParameter("password");
		Admin admin = adminServic.login(username, password);
		//System.out.println(admin.toString());
		if (admin==null) {
			map.put("code", "null");
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("admin", admin);
			map.put("code", "success");
			map.put("admin", admin);
		}
		return map;
	}
	
	@RequestMapping(value="/show",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> show() {
		Map<String, Object> map=new HashMap<>();
		List<Admin> admins=adminServic.showAll();
		map.put("admins", admins);
		return map;
	}
	
	@RequestMapping(value="/addAdmin",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> addAdmin(@RequestBody Map<String, Object> map){
		System.out.println(map.toString());
		return adminServic.addAdmin(map);
	}
}
