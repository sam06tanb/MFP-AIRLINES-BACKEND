package dev.samir.mfpbackend.service;

import dev.samir.mfpbackend.entity.User;
import dev.samir.mfpbackend.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User save (User user) {
        String Password = user.getPassword();
        user.setPassword(passwordEncoder.encode(Password));
        return userRepository.save(user);
    }


}
