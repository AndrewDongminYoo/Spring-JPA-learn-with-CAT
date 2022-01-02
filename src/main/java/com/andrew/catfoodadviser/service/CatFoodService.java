package com.andrew.catfoodadviser.service;

import com.andrew.catfoodadviser.repository.CatFoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CatFoodService {

    private final CatFoodRepository catFoodRepository;
}
