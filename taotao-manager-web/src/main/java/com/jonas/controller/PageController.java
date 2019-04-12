package com.jonas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
	
	//去往菜单页面
	@RequestMapping(value="/item-{page}",method=RequestMethod.GET)
	public String toPage(@PathVariable("page")String page){
		return "item-" + page;
	}
	
	//去往首页
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(){
		return "index";
	}
}
