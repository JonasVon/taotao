package com.jonas.service;

import com.jonas.common.pojo.EasyUIDatagridResult;

/**
 * 商品相关的接口
 * @author jonas
 *
 */
public interface ItemService {
	
	EasyUIDatagridResult getItemList(Integer page,Integer rows);
}
