package com.sda.testreservationsystem.service;

import com.sda.testreservationsystem.repository.ConferenceRoomRepository;
import com.sda.testreservationsystem.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    private final ConferenceRoomRepository conferenceRoomRepository;
    private final OrganizationRepository organizationRepository;
    private final ReservationService reservationService;

    @Autowired
    public ReservationService(ConferenceRoomRepository conferenceRoomRepository,
                              OrganizationRepository organizationRepository,
                              ReservationService reservationService) {
        this.conferenceRoomRepository = conferenceRoomRepository;
        this.organizationRepository = organizationRepository;
        this.reservationService = reservationService;
    }
}
