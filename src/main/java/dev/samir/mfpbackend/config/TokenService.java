package dev.samir.mfpbackend.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import dev.samir.mfpbackend.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Optional;


@Component
public class TokenService {

    @Value("${mfpAirlines.security.secret}")
    private String secret;

    public String generateToken(User user) {

        //criptografia do token
        Algorithm algorithm = Algorithm.HMAC256(secret);

        return JWT.create()
                //pega o email como subject pois subject serve para chave unica, email nesse caso
                .withSubject(user.getEmail())
                // colocar o resto dos dados necessarios
                .withClaim("userId", user.getId())
                .withClaim("username", user.getUsername())
                //expira em 24
                .withExpiresAt(Instant.now().plusSeconds(86400))
                .withIssuer("API MFP")
                .sign(algorithm);
    }

    public Optional<JWTUserData> verifyToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);

            DecodedJWT jwt = JWT.require(algorithm)
                    .build()
                    .verify(token);

            return Optional.of(JWTUserData
                    .builder()
                    .id(jwt.getClaim("userId").asLong())
                    .username(jwt.getClaim("username").asString())
                    .email(jwt.getSubject())
                    .build());
        } catch (JWTVerificationException e) {
            return Optional.empty();
        }
    }
}
