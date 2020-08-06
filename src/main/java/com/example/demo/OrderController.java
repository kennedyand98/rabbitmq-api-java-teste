package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OrderController {

	@Autowired
	OrderQueueSender sender;
	
	@Autowired
	OrderConsumer consumer;
	
	@PostMapping("/testeEnviar")
	public void post(@RequestParam(value = "msg", defaultValue = "Alo") String msg) {
		
		sender.send(msg);
	}
	
}
