package com.reservas.infrastructure.streams.events;

import java.time.Instant;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BookingEvent {

	private String name;
	private String hotel;
	private Long flightId;
	private String company;
	private Long bookingId;
	private Instant date;
	private String email;
}