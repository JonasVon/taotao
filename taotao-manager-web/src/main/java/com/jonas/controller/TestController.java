package com.jonas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jonas.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@ResponseBody
	@RequestMapping("/test/queryNow")
	public String queryNow(){
		return "Hello World " + testService.queryNow();
	}
}
