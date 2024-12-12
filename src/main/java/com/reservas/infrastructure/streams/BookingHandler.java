package com.reservas.infrastructure.streams;

import com.reservas.infrastructure.streams.events.BookingEvent;

@Listener(topic = "${topics.consumer.topic.booking}")
public class BookingHandler extends EventHandler<BookingEvent> {

	@Override
	protected void processEvent(BookingEvent event) {
		System.out.println("******************* Logica de correo ");
		
	}

}
