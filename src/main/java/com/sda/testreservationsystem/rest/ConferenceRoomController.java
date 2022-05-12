package com.sda.testreservationsystem.rest;


import com.sda.testreservationsystem.model.ConferenceRoom;
import com.sda.testreservationsystem.model.Organization;
import com.sda.testreservationsystem.model.Reservation;
import com.sda.testreservationsystem.service.ConferenceRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conferenceroom")
@RequiredArgsConstructor
public class ConferenceRoomController {

   private final ConferenceRoomService conferenceRoomService;

    @GetMapping
    public List<Reservation> getConferenceRooms() {

        return conferenceRoomService.getAllConferenceRooms();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConferenceRoom> getConferenceRoomById(@PathVariable final Long id)
    //    throws ReservationNotFoundException
    {
        return ResponseEntity.ok(conferenceRoomService.getConferenceRoomById(id));
    }

    @PostMapping
    public ResponseEntity<ConferenceRoom> addConferenceRoom(@RequestBody final ConferenceRoom conferenceRoom)
    // throws ReservationAlreadyExistException
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(conferenceRoomService.createConferenceRoom(conferenceRoom));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ConferenceRoom> updateConferenceRoom(@RequestParam final Long id,
                                                           @RequestBody final ConferenceRoom conferenceRoom)
    //    throws OrganizationNotFoundException
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(conferenceRoomService.updateConferenceRoom(id, conferenceRoom));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConferenceRoom(@PathVariable Long id) {
        conferenceRoomService.deleteConferenceRoomById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
