package com.andrew.catfoodadviser.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Analysis {

    // Main Analysis
    protected Double protein;
    protected Double fat;
    protected Double fiber;
    protected Double ash;
    protected Double carbohydrate;
    protected Double moisture;

    // Fatty Acids
    protected Double omega3FattyAcid;
    protected Double omega6FattyAcid;

    // Amino Acids
    protected Double taurine;
    protected Double lysine;
    protected Double arginine;
    protected Double methionine;

    // Minerals
    protected Double calcium;
    protected Double phosphorus;
    protected Double potassium;
    protected Double sodium;
    protected Double chloride;
    protected Double magnesium;
    protected String iron;
    protected String copper;
    protected String manganese;
    protected String zinc;
    protected String iodine;
    protected String selenium;

    // vitamins
    protected String retinolA;
    protected String calciferolD;
    protected String tocopherolE;
    protected String thiamineB1;
    protected String riboflavinB2;
    protected String pantothenicAcidB5;
    protected String niacinB3;
    protected String pyridoxineB6;
    protected String folicAcidB9;
    protected String biotinB7;
    protected String vitaminB12;
}
