package com.recipebook.recipebook.models;

import lombok.Data;

import java.util.List;

@Data
public class Recipe {

    private String title;
    private List<String> ingredients;
    private List<String> preparationSteps;
    private List<String> description;
    private long cookingtime;
}
