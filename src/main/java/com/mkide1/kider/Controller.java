package com.mkide1.kider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
@GetMapping("/get")
public String meth1() {
	return "Hello";
}
}
