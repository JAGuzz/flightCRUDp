package com.airline.flightReservation.controllers;

import com.airline.flightReservation.entities.Flight;
import com.airline.flightReservation.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping
    public List<Flight> getAllFlights(){
         return flightRepository.findAll();
    }

    @GetMapping("/{id}")
    public Flight getFlightbyId(@PathVariable Long id){
        return flightRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cant find flight by Id: " + id));
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight){
        return flightRepository.save(flight);
    }

    @PutMapping("/{id}")
    public Flight updateFlight(@PathVariable Long id, @RequestBody Flight flightDetails){
        Flight flight = flightRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cant find flight by Id: " + id));

        flight.setFlightNumber(flightDetails.getFlightNumber());
        flight.setDepartureName(flightDetails.getDepartureName());
        flight.setDestinationName(flightDetails.getDestinationName());
        flight.setDepartureDate(flightDetails.getDepartureDate());
        flight.setArrivalDate(flightDetails.getArrivalDate());

        return flightRepository.save(flight);
    }

    @DeleteMapping("/{id}")
    public String deleteFlight(@PathVariable Long id){
        Flight flight = flightRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cant find flight by Id: " + id));

        int flightN = flight.getFlightNumber();

        flightRepository.delete(flight);

        return "Flight with Id: " + id + " and flight number: " + flightN + " has been deleted.";
    }

}
