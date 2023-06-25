package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
@RestController
class ServerController{   
    @RequestMapping("/hash")
    public String myHash(){
    	String data = "Hello World, it's Ty Simpson!";
        String checksum = generateChecksum(data);
        return "<p>data:"+data +"</p>" 
        		+ "<p>Checksum: " + checksum + "</p>";
    }


private String generateChecksum(String data) {
	
		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
			return bytesToHex(hash);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}


}

private static String bytesToHex(byte[] bytes) {
	StringBuilder result = new StringBuilder();
	for (byte b: bytes) {
		result.append(String.format("%02x", b));
	}
	return result.toString();
}
}