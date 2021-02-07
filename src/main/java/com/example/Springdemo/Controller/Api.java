package com.example.Springdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api")
public class Api {

@GetMapping("/name")	
public String getName() {
	return "I am PavanKumar";
}

@GetMapping("/Address")	
public String getAddress() {
	return "Bangalore";
}




	
}
