package com.example.firstspringboot.Repository;

import com.example.firstspringboot.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, String> {

}
