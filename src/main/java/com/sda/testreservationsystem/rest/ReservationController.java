package com.sda.testreservationsystem.rest;

import com.sda.testreservationsystem.model.Reservation;
import com.sda.testreservationsystem.service.ReservationService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservation")
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;


  @GetMapping
    public ResponseEntity<List<Reservation>> getAllReservations() {
      return ResponseEntity.ok(reservationService.getAllReservations);
  }

  @GetMapping("/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable final Long id)
        //    throws ReservationNotFoundException
  {
        return ResponseEntity.ok(reservationService.getReservationById(id));
  }

  @PostMapping
    public ResponseEntity<Reservation> addReservation(@RequestBody final Reservation reservation)
       // throws ReservationAlreadyExistException
  {
    return ResponseEntity.status(HttpStatus.CREATED).body(reservationService.createReservation(reservation));
  }

  @PutMapping("/{id}")
    public ResponseEntity<Reservation> updateReservation(@RequestParam final Long id,
                                                         @RequestBody final Reservation reservation)
  //    throws ReservationNotFoundException
  {
    return ResponseEntity.status(HttpStatus.CREATED).body(reservationService.updateReservation(id, reservation));
  }


  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteReservation(@PathVariable Long id) {
    reservationService.deleteReservationById(id);
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }

}
