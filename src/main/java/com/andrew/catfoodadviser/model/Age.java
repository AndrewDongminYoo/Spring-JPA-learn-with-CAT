package com.andrew.catfoodadviser.model;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Age {

    ALL_LIFE_STAGE("ALL", "전연령"),
    BABY("BABY", "4개월 이하"),
    KITTEN("KITTEN", "1년 이하"),
    ADULT("ADULT", "1년 이상 7세 이하"),
    MATURE("MATURE", "7세 이상"),
    SENIOR("SENIOR", "11세 이상");

    private final String lifeCycle;
    private final String inKorean;
}
