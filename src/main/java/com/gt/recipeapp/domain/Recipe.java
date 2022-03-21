package com.gt.recipeapp.domain;

/*
    Created by gt at 10:39 PM on Wednesday, August 18, 2021.
    Project: recipeapp, Package: com.gt.recipeapp.domain.
*/

import javax.persistence.*;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Difficulty difficulty;
    private Byte[] image;
    @OneToOne
    private Notes notes;
}
