package dev.samir.mfpbackend.mapper;

import dev.samir.mfpbackend.controller.request.UserRequest;
import dev.samir.mfpbackend.controller.response.UserResponse;
import dev.samir.mfpbackend.entity.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {

    public static User toUser(UserRequest request) {
        return User.builder()
                .username(request.username())
                .email(request.email())
                .password(request.password())
                .build();
    }

    public static UserResponse toUserResponse(User user) {
        return UserResponse.builder()
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }

}
