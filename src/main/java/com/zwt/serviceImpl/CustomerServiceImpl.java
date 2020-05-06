package com.zwt.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zwt.bean.Customer;
import com.zwt.mapper.CustomerMapper;
import com.zwt.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Map<String, String> customerLogin(Map<String, Object> customer) {
		Customer cus = customerMapper.selectCustomer((String)customer.get("openId"));
		Map<String, String> map = new HashMap<String, String>();
		if (cus == null) {
			System.out.println(customer.get("nickName"));
			String sex = (int)customer.get("sex")==1?"男":"女";
			customerMapper.insertCustomer(null, (String)customer.get("openId"), (String)customer.get("nickName"), 
					sex, false, (String)customer.get("headImg"), null, null);
			map.put("code", "sucess");
		}else {
			System.out.println(cus.toString());
			map.put("code", "sucess2");
		}
		
		return map;
	}
	
	
}
