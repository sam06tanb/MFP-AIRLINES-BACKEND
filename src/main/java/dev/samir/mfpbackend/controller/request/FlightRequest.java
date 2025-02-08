package dev.samir.mfpbackend.controller.request;

import java.util.Date;

public record FlightRequest(Date dateHour, String origin, String destination, int duration, Long ticket) {
}
