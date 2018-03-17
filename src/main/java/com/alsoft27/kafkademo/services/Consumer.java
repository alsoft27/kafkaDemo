package com.alsoft27.kafkademo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;

import com.alsoft27.kafkademo.storage.MessageStorage;

public class Consumer {

	private static final Logger log = LoggerFactory.getLogger(Consumer.class);

	@Autowired
	MessageStorage storage;

	@KafkaListener(topics = "${spring.kafka.topic.kafkaData}")
	public void receive(String content) {
		log.info("received content='{}'", content);
		storage.put(content);
	}

	@Bean
	public Consumer consumer() {
		return new Consumer();
	}
}
