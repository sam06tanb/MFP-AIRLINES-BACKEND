package dev.samir.mfpbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MfpBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MfpBackendApplication.class, args);
    }

}
