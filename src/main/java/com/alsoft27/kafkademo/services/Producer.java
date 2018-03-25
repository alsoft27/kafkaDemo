package com.alsoft27.kafkademo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	private static final Logger log = LoggerFactory.getLogger(Producer.class);

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void send(String topic, String data) {
		log.info("sending data='{}' to topic='{}'", data, topic);
		kafkaTemplate.send(topic, data);
	}
}
