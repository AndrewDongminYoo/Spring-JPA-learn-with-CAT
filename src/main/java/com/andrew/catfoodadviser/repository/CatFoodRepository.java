package com.andrew.catfoodadviser.repository;

import com.andrew.catfoodadviser.model.CatFood;
import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.Long;

public interface CatFoodRepository extends JpaRepository<CatFood, Long> {
}
