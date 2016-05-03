package net.machs.alanis;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloworldApplication.class, args);
	}

	@RequestMapping("/")
	public String helloWorld() throws UnknownHostException {
		return "Hello from Spring Boot! (host:" + InetAddress.getLocalHost().getHostName() + ", ip: "
				+ InetAddress.getLocalHost().getHostAddress() + ", date: " + new Date().toString() + " \n";
	}
}
