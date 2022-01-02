package com.andrew.catfoodadviser.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ActivityLevel {

    GROWING_KITTEN_OR_MOM_CAT(30, "자묘 및 임신묘"),
    VERY_ACTIVE_CAT(14, "활동적인 고양이"),
    SITTING_CAT(12, "중성화 했거나 얌전한 고양이"),
    FAT_CAT(8, "저열량 식단이 필요한 고양이"),
    SENIOR_CAT(7, "활동이 거의 없는 고양이");

    private final Integer activeLevel;
       // 권장 칼로리 = RER * active
//    0.5kg 41.6kcal * activeLevel / 10
//    1.0kg 70.0kcal * activeLevel / 10
//    1.5kg 94.8kcal * activeLevel / 10
//    2.0kg 130.kcal * activeLevel / 10
//    2.5kg 145.kcal * activeLevel / 10
//    3.0kg 160.kcal * activeLevel / 10
//    4.0kg 190.kcal * activeLevel / 10
//    5.0kg 220.kcal * activeLevel / 10
    private final String describe;
}
