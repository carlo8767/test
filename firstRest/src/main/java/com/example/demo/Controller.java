package com.example.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;




@Component  // component dependency 
@Qualifier("regular")// qualifier with a determinate name
public class Controller {
	
	
	UserAccount userAccount;

	
	
	
	public void  readJsonFile ( JSONObject json) {

		Object obj = json;
	    Map<String, Object> map = (Map<String, Object>) obj;
	    for(Map.Entry<String, Object> ewt : map.entrySet()) {
	    	System.out.println(ewt.getKey());
	    	JSONArray arr = (JSONArray) ewt.getValue();
	    
	    	for(int a = 0; a<arr.size(); a++){
	    		arr.get(a);
	    		System.out.println(arr.get(a));
	    		
	    	}
	    		
	    	}
	    	
	    }
		
	}

