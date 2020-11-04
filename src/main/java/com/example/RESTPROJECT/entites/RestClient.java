package com.example.RESTPROJECT.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rest_client")

public class RestClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "foundation_date_gt")
    private int foundation_date_gt;

    @Column(name = "foundation_date_lte")
    private int foundation_date_lte;

    @Column(name = "address")
    private String address;

    @Column(name = "countryCode", length = 3)
    private String countryCode;

    @Column(name = "cityName")
    private String cityName;
}
