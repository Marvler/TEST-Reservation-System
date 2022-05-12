package com.sda.testreservationsystem.service;

import com.sda.testreservationsystem.model.Reservation;
import com.sda.testreservationsystem.repository.ConferenceRoomRepository;
import com.sda.testreservationsystem.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    private final ConferenceRoomRepository conferenceRoomRepository;
    private final OrganizationRepository organizationRepository;
    public List<Reservation> getAllReservations; //?


    @Autowired
    public ReservationService(ConferenceRoomRepository conferenceRoomRepository,
                              OrganizationRepository organizationRepository) {
        this.conferenceRoomRepository = conferenceRoomRepository;
        this.organizationRepository = organizationRepository;
    }

    public void getAllReservations(){
        //TO DO
    }

    public void deleteReservationById(Long id) {
        //TO DO
    }

    public Reservation updateReservation(Long id, Reservation reservation) {
        //TO DO
        return null;
    }

    public Reservation getReservationById(Long id) {
        //TO DO
        return null;
    }

    public Reservation createReservation(Reservation reservation) {
        //TO DO
        return null;
    }
}
