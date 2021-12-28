package com.zhao.dubbo.provider.service.impl;

import org.apache.dubbo.config.annotation.DubboService;

import com.zhao.dubbo.service.ZhaoTestService;

@DubboService(version = "1.0.0",interfaceClass = ZhaoTestService.class)
public class ZhaoTestServiceImpl implements ZhaoTestService{

	@Override
	public String test(int id) {
		
		return "Zhao test" + id;
	}

}
