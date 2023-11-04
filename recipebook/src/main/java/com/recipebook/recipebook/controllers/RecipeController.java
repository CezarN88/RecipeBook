package com.recipebook.recipebook.controllers;

import com.recipebook.recipebook.models.Recipe;
import com.recipebook.recipebook.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    private final RecipeService recipeService;


    @GetMapping("/add")
    public String showAddNewRecipe(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "add_recipe";
    }

    @PostMapping("/add")
    public String addRecipe(@ModelAttribute("recipe") Recipe recipe) {
        recipeService.addRecipe(recipe);
        return "redirect:/recipes/browse";
    }

    @GetMapping("/browse")
    public String browseRecipes(Model model) {
        List<Recipe> recipes = recipeService.getAllRecipes();
        model.addAttribute("recipes", recipes);
        return "browse_recipes";
    }
    @GetMapping("/homepage")
    public String showHomepage(){
        return "homepage";
    }

}

