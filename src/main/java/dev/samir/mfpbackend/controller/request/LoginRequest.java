package dev.samir.mfpbackend.controller.request;

import lombok.Builder;

public record LoginRequest(String email, String password) {
}
