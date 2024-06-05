package com.example.hello_springboot.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

@RestController  
@CrossOrigin
public class HelloController {

	@GetMapping("/hello")  
	private String getAllStudent()   
	{  
		String text = "hello text is success";
		System.out.println(text);
		return text;  
	}
}
