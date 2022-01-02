package com.andrew.catfoodadviser.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ingredient {
    private String name;
    private Boolean allergen;
}
