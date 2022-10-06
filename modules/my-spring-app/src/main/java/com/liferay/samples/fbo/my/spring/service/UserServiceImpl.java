package com.liferay.samples.fbo.my.spring.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

	@Override
	public String getFirstName(long id) {
		return "Jane";
	}

	@Override
	public String getLastName(long id) {
		return "Doe";
	}

}
