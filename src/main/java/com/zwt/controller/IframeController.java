package com.zwt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zwt.bean.Admin;

@Controller
@RequestMapping("/iframe")
public class IframeController {

	@RequestMapping("/order")
	public ModelAndView toOrder(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("/pages/order");
		return mv;
	}
	
	@RequestMapping("/orderDetail")
	public ModelAndView toOrderDetail(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("/pages/orderDetail");
		return mv;
	}
	
	@RequestMapping("/addfood")
	public ModelAndView toAddfood(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("/pages/addfood");
		return mv;
	}
	
	@RequestMapping("/changefood")
	public ModelAndView toChangefood(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("/pages/changefood");
		return mv;
	}
	
	@RequestMapping("/addtype")
	public ModelAndView toAddtype(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("/pages/addtype");
		return mv;
	}
	
	@RequestMapping("/checktype")
	public ModelAndView toChecktype(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("/pages/checktype");
		return mv;
	}
	
	@RequestMapping("/adminlist")
	public ModelAndView toAdminlist(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("/pages/adminlist");
		return mv;
	}
	
	@RequestMapping("/addadmin")
	public ModelAndView toAddadmin(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("/pages/addadmin");
		return mv;
	}
	
	@RequestMapping("/lunbo")
	public ModelAndView toLunbo(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("/pages/lunbo");
		return mv;
	}
	
	@RequestMapping("/changefoodDetail")
	public ModelAndView toChangefoodDetail(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("/pages/changefoodDetail");
		return mv;
	}
}
