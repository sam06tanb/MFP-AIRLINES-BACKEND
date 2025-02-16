package dev.samir.mfpbackend.controller.response;

import lombok.Builder;

@Builder
public record UserResponse(Long id, String username, String email) {
}
