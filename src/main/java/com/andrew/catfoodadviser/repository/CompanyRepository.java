package com.andrew.catfoodadviser.repository;
import java.lang.Long;
import com.andrew.catfoodadviser.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
