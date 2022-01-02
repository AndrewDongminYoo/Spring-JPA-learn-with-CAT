package com.andrew.catfoodadviser.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logoImage;
    private String koreanName;
    private String englishName;
    private String country;
    private Double socialScore;

    public Company(String name) {
        this.englishName = name;
        this.socialScore = 5.0;
    }
}
