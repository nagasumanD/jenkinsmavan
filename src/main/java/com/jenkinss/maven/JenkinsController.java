package com.jenkinss.maven;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {
	@GetMapping("/random")
	public String randomString() {
		return "String with random values :"+ UUID.randomUUID();
		
	}
	@GetMapping("/success")
	public String SuccessString() {
		return "Successful random String with random values :"+ UUID.randomUUID();
		
	}

}
