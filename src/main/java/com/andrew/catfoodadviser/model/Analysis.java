package com.andrew.catfoodadviser.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
public class Analysis {

    // Main Analysis
    private Double protein;
    private Double fat;
    private Double fiber;
    private Double ash;
    private Double carbohydrate;
    private Double moisture;

    // Fatty Acids
    private Double omega3FattyAcid;
    private Double omega6FattyAcid;

    // Amino Acids
    private Double taurine;
    private Double lysine;
    private Double arginine;
    private Double methionine;

    // Minerals
    private Double calcium;
    private Double phosphorus;
    private Double potassium;
    private Double sodium;
    private Double chloride;
    private Double magnesium;
    private String iron;
    private String copper;
    private String manganese;
    private String zinc;
    private String iodine;
    private String selenium;

    // vitamins
    private String retinolA;
    private String calciferolD;
    private String tocopherolE;
    private String thiamineB1;
    private String riboflavinB2;
    private String pantothenicAcidB5;
    private String niacinB3;
    private String pyridoxineB6;
    private String folicAcidB9;
    private String biotinB7;
    private String vitaminB12;
}
