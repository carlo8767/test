package service;

import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class HealthCheck implements HealthIndicator {

	@Override
	public Health health() {
		try {
			URL url = new URL ("www.google.comn");
			HttpURLConnection urlConn = (HttpURLConnection)url.openConnection();
			urlConn.setRequestMethod("POST");
			urlConn.connect();
			int code = urlConn.getResponseCode();
			if(code==200) {
				return Health.up().build();
				
			}
			
			
		}
		
		
		catch (Exception e) {
			return Health.down().withDetail("Error", "Service down").build();
			
		}
		return null;
		
		
		
		
	}
	
	
	
	

}
