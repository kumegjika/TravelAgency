package com.travel.TravelAgency.entity;
import com.travel.TravelAgency.BoardType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tours")
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "departure_city_id", nullable = false)
    private City departureCity;

    @ManyToOne
    @JoinColumn(name = "departure_airport_id")
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "destination_city_id")
    private City destinationCity;

    @ManyToOne
    @JoinColumn(name = "destination_airport_id")
    private Airport destinationAirport;

    @ManyToOne
    @JoinColumn(name = "destination_hotel_id")
    private Hotel destinationHotel;

    private LocalDate departureDate;
    private LocalDate returnDate;
    private int numberOfDays;

    @Enumerated(EnumType.STRING)
    private BoardType type;

    private BigDecimal priceForAdult;
    private BigDecimal priceForChild;

    private boolean promoted;

    private int adultSeats;
    private int childSeats;
}