package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemo {
		@GetMapping("/hi")
		public String sayHi() {
			
			System.out.println("Yogita!!");
			return "My name is Yogita and my batch code is ANP-C1496";
			
		}
	}

