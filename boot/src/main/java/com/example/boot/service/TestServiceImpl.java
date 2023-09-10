package com.example.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot.mybatis.TestMapper;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestMapper mapper;
	
	@Override
	public Integer testCount() {
		return mapper.testCount();
	}
	
}
