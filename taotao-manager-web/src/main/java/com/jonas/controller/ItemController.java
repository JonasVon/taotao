package com.jonas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jonas.common.pojo.EasyUIDatagridResult;
import com.jonas.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	ItemService itemService;

	@ResponseBody
	@RequestMapping(value="/item/list",method=RequestMethod.GET)
	public EasyUIDatagridResult getItemList(Integer page,Integer rows){
		return itemService.getItemList(page, rows);
	}
}
