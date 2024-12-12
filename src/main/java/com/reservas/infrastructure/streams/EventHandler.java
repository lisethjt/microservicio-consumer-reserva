package com.reservas.infrastructure.streams;

import org.springframework.kafka.annotation.KafkaHandler;

public abstract class EventHandler<T> {

	@KafkaHandler
	public void handle(T event) {
		processEvent(event);
	}

	protected abstract void processEvent(T event);
}