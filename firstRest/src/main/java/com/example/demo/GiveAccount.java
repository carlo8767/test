package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController


///http://localhost:8080/actuator/health

public class GiveAccount implements HealthIndicator {

	
	@Autowired
	AccountEntity entity ;	
	
	//http://localhost:8080/uno/due?dueValue="ass"
	//value = "/uno/due{dueValue}"
	
	@RequestMapping
	(value = "/uno" ,
	method = RequestMethod.POST 
			)
	
	
	//@RequestParam query parameter 
	// @RequestHeader
	
	@ResponseBody // return a Json
	public AccountEntity returnValue (	@RequestHeader ("dueValue") String dueValue ) {
		String returnValue = dueValue;
		String password = "12350";
		String ar = null;
		if(password.equals("12350")) {
			 ar = Health.up().build().toString();
			
		}
		
		entity.setName(dueValue);
		entity.setPassword(password);

		return entity ;
		
	}

	@Override
	public Health health() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
