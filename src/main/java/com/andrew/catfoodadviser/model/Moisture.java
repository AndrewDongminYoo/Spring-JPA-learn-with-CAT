package com.andrew.catfoodadviser.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Moisture {

    DRY("dried", "건식"),
    WET("moist", "습식");

    private final String type;
    private final String typeInKor;
}
