package dev.samir.mfpbackend.repository;

import dev.samir.mfpbackend.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Long, Flight> {
}
