package com.andrew.catfoodadviser.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AllergenLevel {
    HIGH(2,"고위험군"),
    MEDIUM(1, "보통위험군"),
    LOW(0, "저위험군");

    private final Integer warn;
    private final String level;
}
