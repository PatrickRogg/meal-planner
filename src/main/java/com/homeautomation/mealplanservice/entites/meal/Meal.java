package com.homeautomation.mealplanservice.entites.meal;

import com.homeautomation.mealplanservice.controller.entities.ingredient.Ingredient;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String designation;

    private String recipeUrl;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Ingredient> ingredients;

    public Meal(String designation, String recipeUrl, List<Ingredient> ingredients) {
        this.designation = designation;
        this.recipeUrl = recipeUrl;
        this.ingredients = ingredients;
    }

    public Meal() {
    	
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getRecipeUrl() {
        return recipeUrl;
    }

    public void setRecipeUrl(String recipeUrl) {
        this.recipeUrl = recipeUrl;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
