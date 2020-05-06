package com.zwt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zwt.bean.Admin;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	@RequestMapping("/index")
	public ModelAndView toIndex(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();
		HttpSession session = req.getSession();
		Admin admin = (Admin)session.getAttribute("admin");
		System.out.println(admin.toString());
		mv.setViewName("/pages/index");
		return mv;
	}
}
