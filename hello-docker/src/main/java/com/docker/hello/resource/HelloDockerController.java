package com.docker.hello.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/docker")
public class HelloDockerController {
	
	@GetMapping
	public String helloDocker() {
		return "Hello Docker, This is my first docker image";
	}	

}
