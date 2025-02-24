package com.example.firstspringboot.Service;
import com.example.firstspringboot.Entity.Reservation;
import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(String reservationId);
    public Reservation addReservation(Reservation r);
    public void removeReservation(String reservationId);
    public Reservation modifyReservation(Reservation reservation);

}
