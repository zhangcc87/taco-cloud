package com.example.demo.dal;

import com.example.demo.model.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient findById(String id);

    Ingredient save(Ingredient ingredient);
}
