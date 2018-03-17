package com.alsoft27.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alsoft27.kafkademo.services.Producer;
import com.alsoft27.kafkademo.storage.MessageStorage;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

	@Value("${spring.kafka.topic.kafkaData}")
	private String KAFKA_TOPIC;

	@Autowired
	Producer producer;

	@Autowired
	MessageStorage storage;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("data") String data) {
		producer.send(KAFKA_TOPIC, data);
		return "Done";
	}

	@GetMapping(value = "/consumer")
	public String getAllRecievedMessage() {
		String messages = storage.toString();
		storage.clear();

		return messages;
	}

}
