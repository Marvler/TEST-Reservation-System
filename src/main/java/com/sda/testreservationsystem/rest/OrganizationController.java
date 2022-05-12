package com.sda.testreservationsystem.rest;


import com.sda.testreservationsystem.model.Organization;
import com.sda.testreservationsystem.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organization")
@RequiredArgsConstructor
public class OrganizationController {

   private final OrganizationService organizationService;

    @GetMapping
    public ResponseEntity<List<Organization>> getAllOrganizations() {
        List<Organization> organizations = organizationService.getAllOrganizations();
        return new ResponseEntity<>(organizations, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Organization> getOrganizationById(@PathVariable("id") final Long id)
    //    throws ReservationNotFoundException
    {
        Organization organization = organizationService.getOrganizationById(id);
        return new ResponseEntity<>(organization, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Organization> addOrganization(@RequestBody final Organization organization)
    // throws ReservationAlreadyExistException
    {
        //Organization newOrganization = organizationService.saveOrganization(organization);
       // return new ResponseEntity<>(newOrganization, HttpStatus.CREATED);
       return ResponseEntity.status(HttpStatus.CREATED).body(organizationService.createReservation(organization));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Organization> updateOrganization(@PathVariable final Long id,
                                                         @RequestBody final Organization organization)
    //    throws OrganizationNotFoundException
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(organizationService.updateOrganization(id, organization));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrganization(@PathVariable("id") Long id) {
        organizationService.deleteReservationById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
