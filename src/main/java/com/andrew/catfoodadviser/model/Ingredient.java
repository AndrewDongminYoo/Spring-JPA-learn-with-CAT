package com.andrew.catfoodadviser.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
public class Ingredient {
    @Id
    private Long id;
    private String name;
    private AllergenLevel allergyLevel;
    private IngredientLevel level;
}
