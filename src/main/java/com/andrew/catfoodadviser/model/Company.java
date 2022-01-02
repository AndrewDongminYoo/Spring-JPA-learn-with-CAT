package com.andrew.catfoodadviser.model;

import com.mongodb.lang.Nullable;
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
    private Double socialScore = 5.0;
}
