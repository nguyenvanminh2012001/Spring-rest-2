package com.example.lok.tacos.data;

import com.example.lok.tacos.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IngredientRepo extends JpaRepository<Ingredient, String> {
    Optional<Ingredient> findById(String id);
}
