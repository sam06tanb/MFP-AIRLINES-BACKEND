package dev.samir.mfpbackend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(unique = true, nullable = false, length = 25)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dateHour;

    @NotNull
    @Column(unique = true, nullable = false, length =40)
    private String origin;

    @NotNull
    @Column(unique = true, nullable = false, length = 40)
    private String destination;

    @NotNull
    @Column(unique = true, nullable = false, length = 25)
    private int duration;


}
