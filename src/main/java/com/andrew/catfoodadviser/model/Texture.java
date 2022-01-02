package com.andrew.catfoodadviser.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Texture {

    EXTRUSION(Moisture.DRY, "압출팽화 사료"),
    FREEZE_DRIED(Moisture.DRY, "동결건조 사료"),
    DRIED_JERKY(Moisture.DRY, "건조육포 사료"),
    OVEN_BAKED(Moisture.DRY, "오븐베이크 사료"),

    PATE(Moisture.WET, "파테/무스 타입"),
    IN_GRAVY(Moisture.WET, "그레이비 타입"),
    SHREDDED(Moisture.WET, "슈레디드 타입"),
    FLAKED(Moisture.WET, "플레이크드 타입");

    private final Moisture moisture;
    private final String processKor;
}

