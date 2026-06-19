package com.nasa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DevOpsControllerJenkins {
	
	@GetMapping("/hola")
	public String holaMundo() {		
		return "Hola Mundo DevOps Jenkings";
	}

}
