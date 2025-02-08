package dev.samir.mfpbackend.controller.response;

import java.util.Date;

public record FlightResponse(Date dateHour, String origin, String destination, int duration, Long id) {
}
