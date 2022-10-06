package com.liferay.samples.fbo.my.ext.service;

import org.springframework.stereotype.Component;

@Component
public class FooServiceImpl implements FooService {

	@Override
	public String foo() {
		return "bar";
	}
	
}
