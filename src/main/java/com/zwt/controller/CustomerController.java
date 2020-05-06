package com.zwt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zwt.serviceImpl.CustomerServiceImpl;

@Controller
@RestController
@RequestMapping("/cus")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerServic;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> login(@RequestBody Map<String, Object> map) {
		System.out.println("in");
		System.out.println(map.toString());
		return customerServic.customerLogin(map);
	}
}
