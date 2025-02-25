package com.in.sp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {

	@Autowired
	RestTemplate restTemplate;
		
	@GetMapping("/employee")
	public String getEmpDetails()
	{
		String address = restTemplate.getForObject("http://localhost:8081/address", String.class);
		return "Name : Hina, Learning : Microservices " +address;
	}
	
}
