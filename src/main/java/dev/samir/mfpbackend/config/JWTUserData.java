package dev.samir.mfpbackend.config;

import lombok.Builder;

@Builder
public record JWTUserData(Long id, String username, String password, String email) {
}