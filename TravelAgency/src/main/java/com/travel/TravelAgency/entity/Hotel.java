package com.travel.TravelAgency.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String name;
    private int standard;
    private String description;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City designatedCity;

}
