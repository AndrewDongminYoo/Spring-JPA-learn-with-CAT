package com.andrew.catfoodadviser.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IngredientLevel {
    HIGHEST_QUALITY(2, "최상급 원료"),
    GOOD_QUALITY(1, "상급 원료"),
    NORMAL_QUALITY(0, "일반적 원료"),
    QUESTIONABLE(-1, "저급한 원료");

    private final Integer good;
    private final String level;
}
