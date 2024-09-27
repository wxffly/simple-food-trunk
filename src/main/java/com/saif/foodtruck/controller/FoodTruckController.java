package com.saif.foodtruck.controller;


import com.saif.foodtruck.model.FoodTruck;
import com.saif.foodtruck.service.FoodTruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class FoodTruckController {

    @Autowired
    private FoodTruckService foodTruckService;

    @RequestMapping("/allTrucks")
    public String allTrucks(Model model) throws IOException {
        List<FoodTruck> trucks = foodTruckService.getAllFoodTruck();
        model.addAttribute("trucks", trucks);
        return "trucks.html";
    }

    @RequestMapping("/trucksByType/{type}")
    public String trucksAtTime(@PathVariable("type") String type, Model model) throws IOException {
        List<FoodTruck> trucks = foodTruckService.getFoodTrucksByType(type);
        model.addAttribute("trucks", trucks);
        return "trucks.html";
    }
}
