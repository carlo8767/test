package com.example.demo;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.function.Consumer;

import javax.inject.Inject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonGetter;

@RestController




public class ResourceRest {
	
	 @Autowired // inject the dependecy 
	Controller controller ;
	@RequestMapping
	(value = "/hello" ,  method = RequestMethod.GET, 
	 consumes =org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	
	@ResponseBody
	public String greetingJson(HttpEntity<String> httpEntity, @PathVariable ("id")   String id) throws ParseException {

		
	    String wwe = httpEntity.getBody();
	
	    JSONParser parser = new JSONParser();  
	    JSONObject json = (JSONObject) parser.parse(wwe);
	   
	   // controller.readJsonFile(json);
	    
	    callServiceReadTotal();
	    
	    
	    // json contains the plain json string
	
	return id;
	 
	 }
	
	
	

	
	
	
		public void callServiceReadTotal () {
		
		  try {
			  
				URL url = new URL("https://sandbox.platfr.io//api/gbs/banking/v4.0/accounts");
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				 con.setRequestProperty("accept", "application/json");
				  con.setRequestProperty("Auth-Schema", "S2S");
				  con.setRequestProperty("Api-Key", "{FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP}");
				  con.setRequestMethod("GET");
				  con.setInstanceFollowRedirects(false);
				  System.out.println(con.getResponseCode());
				  InputStream responseStream  = con.getInputStream(); 
		  }
		  
		  catch (Exception e) {
			  System.out.println();
			  e.printStackTrace();
			  
		  }
			
			
	
		}

	

	}
	


	
	
	
