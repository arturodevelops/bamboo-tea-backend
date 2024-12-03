package com.bambootea.api.services;

import com.bambootea.api.entities.Drink;
import com.bambootea.api.repositories.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {
    @Autowired
    private DrinkRepository drinkRepository;

    public Drink createDrink(Drink drink){
        return drinkRepository.save(drink);
    }

    public List<Drink> getAllDrinks(){
        return drinkRepository.findAll();
    }

    public Drink getDrinkById(Long id){
        return drinkRepository.findById(id).orElse(null);
    }

    public Drink updateDrink(Long id,Drink drink){
        drink.setId(id);
        return drinkRepository.save(drink);
    }

    public void deleteDrink(Long id){
        drinkRepository.deleteById(id);
    }
}
