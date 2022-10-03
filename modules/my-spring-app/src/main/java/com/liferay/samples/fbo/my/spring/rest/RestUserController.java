package com.liferay.samples.fbo.my.spring.rest;

import com.liferay.samples.fbo.my.spring.model.User;

import javax.ws.rs.Produces;

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
		user.setFirstName("John");
		user.setLastName("Doe");
		user.setUserId(id);
		return user;
	}
	
}
