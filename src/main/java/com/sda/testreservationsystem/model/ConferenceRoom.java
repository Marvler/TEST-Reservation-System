package com.sda.testreservationsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ConferenceRoom")
public class ConferenceRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long conferenceRoomId;
    private String conferenceRoomName;
    private String conferenceRoomIdentifier;
    private Integer level;
    private Boolean availability;
    private Integer numberOfSeats;
    private Integer numberOfStandings;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Reservation> reservations;
}
