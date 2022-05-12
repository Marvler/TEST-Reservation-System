package com.sda.testreservationsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;
    private String reservationIdentifier;
    private LocalDateTime reservationStart;
    private LocalDateTime reservationEnd;
    private ConferenceRoom conferenceRoom;
}
