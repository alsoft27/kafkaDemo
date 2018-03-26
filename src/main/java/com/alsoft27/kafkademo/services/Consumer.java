package com.alsoft27.kafkademo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.alsoft27.kafkademo.storage.MessageStorage;

@Service
public class Consumer {

	private static final Logger log = LoggerFactory.getLogger(Consumer.class);

	@Autowired
	MessageStorage storage;

	@KafkaListener(topics = "${kafka.cloudkarafka.topic}")
	public void receive(String content) {
		log.info("received content='{}'", content);
		storage.put(content);
	}

}
