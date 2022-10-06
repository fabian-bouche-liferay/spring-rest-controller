package com.liferay.samples.fbo.my.spring.rest;

import com.liferay.samples.fbo.my.spring.model.User;
import com.liferay.samples.fbo.my.spring.service.UserService;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/api")
public class RestUserController {

	@GetMapping("/user/{id}")
	@Produces({"application/xml", "application/json"})
	public @ResponseBody User getUser(@PathVariable long id) {
		User user = new User();
		user.setFirstName(userService.getFirstName(id));
		user.setLastName(userService.getLastName(id));
		user.setUserId(id);
		return user;
	}

	@Autowired
	private UserService userService;
	
}
