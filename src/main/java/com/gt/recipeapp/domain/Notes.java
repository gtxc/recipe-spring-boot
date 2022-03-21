package com.gt.recipeapp.domain;

/*
    Created by gt at 10:45 PM on Wednesday, August 18, 2021.
    Project: recipeapp, Package: com.gt.recipeapp.domain.
*/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Recipe recipe;
    private String recipeNotes;
}
