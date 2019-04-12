package com.jonas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jonas.common.pojo.EasyUIDatagridResult;
import com.jonas.mapper.TbItemMapper;
import com.jonas.pojo.TbItem;
import com.jonas.pojo.TbItemExample;
import com.jonas.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;
	
	@Override
	public EasyUIDatagridResult getItemList(Integer page, Integer rows) {
		if(page == null)page=1;
		if(rows == null)rows=30;
		PageHelper.startPage(page, rows);
		TbItemExample example = new TbItemExample();
		List<TbItem> list = tbItemMapper.selectByExample(example);
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		EasyUIDatagridResult result = new EasyUIDatagridResult();
		result.setTotal((int)pageInfo.getTotal());
		result.setRows(pageInfo.getList());
		return result;
	}

}
