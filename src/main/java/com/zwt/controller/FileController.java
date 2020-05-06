package com.zwt.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/file")
public class FileController {

	@RequestMapping(value="/upload",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> upload(@RequestParam("file") MultipartFile file, HttpServletRequest req)
			throws IllegalStateException, IOException {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("file");
		// 判断文件是否为空，空则返回失败页面
		if (file.isEmpty()) {
			map.put("msg", "failed");
			return map;
		}
		// 获取文件存储路径（绝对路径）
		//String path = req.getServletContext().getRealPath("E:\\bishe\\code\\OrderMeal\\src\\main\\webapp\\file\\img");
		String path="E:\\bishe\\img";
		// 获取原文件名
		String fileName = file.getOriginalFilename();
		// 创建文件实例
		File filePath = new File(path, fileName);
//		// 如果文件目录不存在，创建目录
//		if (!filePath.getParentFile().exists()) {
//			filePath.getParentFile().mkdirs();
//			System.out.println("创建目录" + filePath);
//		}
		// 写入文件
		file.transferTo(filePath);
		System.out.println(filePath);
		map.put("msg", "success");
		map.put("filePath", "http://localhost/OrderMeal/file/img/"+fileName);
		return map;
	}  
	@RequestMapping(value="/upload2",method=RequestMethod.POST)
	@ResponseBody
	public String upload2(@RequestBody Map<String, Object> map)
			throws IllegalStateException, IOException {
		System.out.println("file");
		System.out.println(map.get("file"));
		return "success";
	} 
}
