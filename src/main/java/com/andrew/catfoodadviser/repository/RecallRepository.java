package com.andrew.catfoodadviser.repository;

import com.andrew.catfoodadviser.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecallRepository extends JpaRepository<Long, Issue> {
}
