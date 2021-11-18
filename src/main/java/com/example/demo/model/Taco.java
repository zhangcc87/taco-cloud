package com.example.demo.model;

import javax.validation.constraints.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Taco {

    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<String> ingredients;


    private Long id;

    private Date createdAt;

}
