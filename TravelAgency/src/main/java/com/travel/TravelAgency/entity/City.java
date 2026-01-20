package com.travel.TravelAgency.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String	name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "continent_id")
    private Continent membership;

}
