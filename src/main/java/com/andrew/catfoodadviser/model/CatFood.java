package com.andrew.catfoodadviser.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class CatFood {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String formula;
    @ManyToOne
    private Company manufacturer;
    @ManyToOne
    private Company importer;
    private Texture process;
    private Double packagingSize;
    private Double Energy;
    @OneToMany
    private List<Ingredient> ingredients;
    @OneToOne
    private Analysis analysis;
}
