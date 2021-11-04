package com.example.demo.dal;

import com.example.demo.model.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
    //Taco save(Taco design);
}
