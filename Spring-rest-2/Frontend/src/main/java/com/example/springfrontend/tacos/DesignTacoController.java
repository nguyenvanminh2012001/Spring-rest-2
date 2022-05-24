package com.example.springfrontend.tacos;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DesignTacoController {
    private RestTemplate rest = new RestTemplate();

    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        List<Ingredient> ingredients =
                Arrays.asList(Objects.requireNonNull(rest.getForObject("http://localhost:8080/ingredients", Ingredient[].class)));
        Ingredient.Type[] types = Ingredient.Type.values();
        for (Ingredient.Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),

                    filterByType(ingredients, type));

        }
    }

    private List<Ingredient> filterByType(List<Ingredient>
                                                  ingredients, Ingredient.Type type) {
        List<Ingredient> ingrList = new ArrayList<>();
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getType().equals(type))

                ingrList.add(ingredient);
        }
        return ingrList;
    }
}