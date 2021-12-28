package com.zhao.dubbo.consumer.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import com.zhao.dubbo.service.ZhaoTestService;

@Service
public class TestService {
	
	@DubboReference(version = "1.0.0")
	private ZhaoTestService zhaoTestService;
	
	public String zhaoTestService() {
		return zhaoTestService.test(10);
	}
	
}

