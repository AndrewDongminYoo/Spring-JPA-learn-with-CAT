package com.andrew.catfoodadviser.model;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Entity
public class Recall {
    @Id
    private Long id;
    @OneToMany
    private List<CatFood> targetProducts;
    private LocalDateTime reportedAt;
    private String reason;
}
