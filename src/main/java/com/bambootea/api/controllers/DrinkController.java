package com.bambootea.api.controllers;

import com.bambootea.api.entities.Drink;
import com.bambootea.api.services.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drinks")
public class DrinkController {

    @Autowired
    private DrinkService drinkService;

    @PostMapping
    public Drink createDrink(@RequestBody Drink drink){
        return drinkService.createDrink(drink);
    }

    @GetMapping
    public List<Drink> getAllDrinks(){
        return drinkService.getAllDrinks();
    }

    @GetMapping("/{id}")
    public Drink getDrinkById(@PathVariable Long id){
        return drinkService.getDrinkById(id);
    }

    @PutMapping("/{id}")
    public Drink updateDrink(@PathVariable Long id, @RequestBody Drink drink){
        return drinkService.updateDrink(id, drink);
    }

    @DeleteMapping("/{id}")
    public void deleteDrink(@PathVariable Long id){
        drinkService.deleteDrink(id);
    }

}
