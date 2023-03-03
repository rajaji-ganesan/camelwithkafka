package com.sample.camelkafka.integration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static org.apache.camel.LoggingLevel.ERROR;

@Component
public class KafkaIntegationRoute extends RouteBuilder {
	
	@Value("${camel.component.kafka.brokers}")
	private String hostName;
	
	@Value("${topicName}")
	private String topic;

	final String KAFKA_ENDPOINT = "kafka:%s?brokers=%s";

	@Override
	public void configure() throws Exception {
	
		fromF(KAFKA_ENDPOINT, topic,hostName)
        .log(ERROR, "[${header.kafka.OFFSET}] [${body}]")
		.toF(KAFKA_ENDPOINT, "kafkacameltopic",hostName);
		
	}
}
