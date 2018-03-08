package com.alsoft27.kafkademo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	private static final Logger log = LoggerFactory.getLogger(Producer.class);

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Value("${alsoft.kafka.topic}")
	String kafkaTopic = "Kafka-Demo";

	public void send(String data) {
		log.info("sending data='{}'", data);

		kafkaTemplate.send(kafkaTopic, data);
	}
}
