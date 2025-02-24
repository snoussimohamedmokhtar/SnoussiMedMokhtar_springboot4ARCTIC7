package com.example.firstspringboot.Service;

import com.example.firstspringboot.Entity.Reservation;
import com.example.firstspringboot.Repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    ReservationRepository reservationRepository;
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }
    public Reservation retrieveReservation(String reservationId) {
        return reservationRepository.findById(reservationId).get();
    }
    public Reservation addReservation(Reservation e) {
        return reservationRepository.save(e);
    }
    public void removeReservation(String reservationId) {
        reservationRepository.deleteById(reservationId);
    }
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
