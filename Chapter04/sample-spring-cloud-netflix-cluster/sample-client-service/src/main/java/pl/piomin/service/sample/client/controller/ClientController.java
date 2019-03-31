package pl.piomin.service.sample.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@Value("${spring.profiles}")
	private String zone;

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/ping")
	public String ping() {
		return "I'm in zone " + zone;
	}
	
}
