package com.andrew.catfoodadviser.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class CatFood extends Analysis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String formula;
    @ManyToOne
    private Company manufacturer;
    @ManyToOne
    private Company importer;
    private Texture process;
    private Double packagingSize;
    private Double EnergyPer100g;
    @OneToMany
    private List<Ingredient> ingredients;
    private Double ingredientsScore;
    private Integer allergyWarning;
    private Age targetAge;
    private ActivityLevel activityLevel;
    private Texture texture;
}
