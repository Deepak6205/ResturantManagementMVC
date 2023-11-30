package com.geekster.RestaurantManagement.controller;

import com.geekster.RestaurantManagement.model.Restaurant;
import com.geekster.RestaurantManagement.model.Speciality;
import com.geekster.RestaurantManagement.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    //Add restaurant:

    @PostMapping("restaurant")
    public String addRestaurant(@RequestBody Restaurant newRestaurant){
       return restaurantService.addRestaurant(newRestaurant);
    }


    // get Restaurant:

    @GetMapping("restaurant/id/{id}")
    public Restaurant getRestaurantById(@PathVariable Integer id){
        return restaurantService.getRestaurantById(id);
    }
    //Add Restaurants:

    @PostMapping("restaurants")
    public String addRestaurants(@RequestBody List<Restaurant> newRestaurants){
       return restaurantService.addRestaurants(newRestaurants);

    }

    //Get all Restaurants:
    @GetMapping("restaurants")
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    // update restaurant info:

    @PutMapping("restaurant/id/{id}/speciality")
    public String updateRestaurant(@PathVariable Integer id, @RequestParam Speciality speciality){
        return restaurantService.updateRestaurant(id,speciality);
    }

    //delete restaurants:
    @DeleteMapping("delete/id/{id}")
    public String deleteRestaurant(@PathVariable Integer id){
        return restaurantService.deleteRestaurant(id);
    }
}
