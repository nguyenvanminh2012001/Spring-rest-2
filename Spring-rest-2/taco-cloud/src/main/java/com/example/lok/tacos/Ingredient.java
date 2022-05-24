package com.example.lok.tacos;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(force=true)
@Entity
@Getter
@Setter
public class Ingredient {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}