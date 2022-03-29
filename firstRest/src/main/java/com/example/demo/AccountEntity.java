package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AccountEntity {
	
	
	public String name ; 
	public String password;
	
	
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name=name;
	}
	
	public void setPassword (String password) {
		this.password=password;
		
	}
	
	public String getPassword () {
		return password;
	}

}
