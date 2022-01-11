package com.andrew.catfoodadviser.repository;
import java.lang.Long;
import com.andrew.catfoodadviser.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
