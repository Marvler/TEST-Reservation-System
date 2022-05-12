package com.sda.testreservationsystem.service;

import com.sda.testreservationsystem.repository.ConferenceRoomRepository;
import com.sda.testreservationsystem.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    private final ConferenceRoomRepository conferenceRoomRepository;
    private final OrganizationRepository organizationRepository;

    @Autowired
    public ReservationService(ConferenceRoomRepository conferenceRoomRepository,
                              OrganizationRepository organizationRepository) {
        this.conferenceRoomRepository = conferenceRoomRepository;
        this.organizationRepository = organizationRepository;
    }
}
