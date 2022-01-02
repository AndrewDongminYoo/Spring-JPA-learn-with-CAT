package com.andrew.catfoodadviser.repository;

import java.lang.Long;
import com.andrew.catfoodadviser.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecallRepository extends JpaRepository<Issue, Long> {
}
