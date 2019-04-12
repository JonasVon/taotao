package com.jonas.test.page;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.jonas.mapper.TbItemMapper;
import com.jonas.pojo.TbItem;
import com.jonas.pojo.TbItemExample;

public class TestPage {

	@Test
	public void testPageHelper(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		TbItemMapper mapper = context.getBean(TbItemMapper.class);
		PageHelper.startPage(1,3);
		TbItemExample example = new TbItemExample();
		List<TbItem> list = mapper.selectByExample(example);
		List<TbItem> list2 = mapper.selectByExample(example);
		System.out.println(list.size());
		System.out.println(list2.size());
		for(TbItem tbItem : list){
			System.out.println(tbItem.getId() + "<<<" + tbItem.getTitle());
		}
	}
}
