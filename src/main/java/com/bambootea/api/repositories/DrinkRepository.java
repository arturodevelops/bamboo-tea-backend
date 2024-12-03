package com.bambootea.api.repositories;

import com.bambootea.api.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink,Long> {
}
