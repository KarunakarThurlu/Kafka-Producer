package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.Country;
import com.kafka.model.Response;

@RestController
@RequestMapping("/api")
public class KafkaController {

	@Autowired
	private KafkaTemplate<String, Country> kafkaTemplate;
	
	@PostMapping("/kafkaproducerone")
	public Response<Country> publishMessage(@RequestBody Country data) {
		kafkaTemplate.send("cities", data);
		return new Response<>(data, HttpStatus.OK,"Published successfully!");
	}
	
	
}
