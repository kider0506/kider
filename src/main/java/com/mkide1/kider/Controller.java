package com.mkide1.kider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
@GetMapping("/get")
public String meth1() {
	logger.info("Welcome");
	System.out.println("Hi");
	return "Hello2";
}
}
