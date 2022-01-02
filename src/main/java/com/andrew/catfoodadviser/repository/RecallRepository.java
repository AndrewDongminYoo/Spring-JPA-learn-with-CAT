package com.andrew.catfoodadviser.repository;

import com.andrew.catfoodadviser.model.Recall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecallRepository extends JpaRepository<Long, Recall> {
}
