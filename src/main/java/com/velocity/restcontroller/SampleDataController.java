package com.velocity.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleDataController {

	@GetMapping("/getDataTest")
	public String getData() {
		return "Deloying application on AWS>>";
	}
}
