package com.andrew.catfoodadviser.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

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
    private String formular;
    @ManyToOne
    private Company manufacturer;
    @ManyToOne
    private Company importer;
    private Texture process;
    private ProteinSource mainProtein;
    private FatOilSource mainFatOrOil;
    private CarboSource mainCarbohydrate;
    private Double packagingSize;
    private Double Energy;
    @ManyToMany
    private List<Ingredient> ingredients;
    @OneToOne
    private Analysis analysis;
}
