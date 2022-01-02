package com.andrew.catfoodadviser.repository;

import com.andrew.catfoodadviser.model.CatFood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatFoodRepository extends JpaRepository<Long, CatFood> {
}
