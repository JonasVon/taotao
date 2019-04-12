package com.jonas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonas.mapper.TestMapper;
import com.jonas.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper testMapper;
	
	@Override
	public String queryNow() {
		return testMapper.queryNow();
	}

}
