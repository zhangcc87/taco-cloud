package com.example.demo.dal;

import com.example.demo.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

    /**
    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient findById(String id);

    Ingredient save(Ingredient ingredient);
     */
}
