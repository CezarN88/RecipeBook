package com.recipebook.recipebook.services;

import com.recipebook.recipebook.models.Recipe;;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RecipeService {


    private List<Recipe> recipes = new ArrayList<>();

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public Recipe getRecipe(int index) {
        if (index >= 0 && index < recipes.size()) {
            return recipes.get(index);
        }
        return null;
    }

    public List<Recipe> getAllRecipes() {
        return recipes;
    }

    public void removeRecipe(int index) {
        if (index >= 0 && index < recipes.size()) {
            recipes.remove(index);
        }
    }
}
