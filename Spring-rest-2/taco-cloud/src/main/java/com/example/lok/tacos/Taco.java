package com.example.lok.tacos;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Data
public class Taco {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private Date createdAt;
    private List<Ingredient> ingredients;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}