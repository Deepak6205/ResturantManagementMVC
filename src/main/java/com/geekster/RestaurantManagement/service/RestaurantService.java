package com.geekster.RestaurantManagement.service;

import com.geekster.RestaurantManagement.model.Restaurant;
import com.geekster.RestaurantManagement.model.Speciality;
import com.geekster.RestaurantManagement.repo.IRestaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    IRestaurant iRestaurant;


    public String addRestaurants(List<Restaurant> newRestaurants) {
        iRestaurant.saveAll(newRestaurants);
        return newRestaurants.size()+" restaurant added";
    }

    public List<Restaurant> getAllRestaurants() {
       return (List<Restaurant>) iRestaurant.findAll();
    }

    public String addRestaurant(Restaurant newRestaurant) {
        iRestaurant.save(newRestaurant);
        return "room added";
    }


    public Restaurant getRestaurantById(Integer id) {
        return iRestaurant.findById(id).get();
    }

    public String updateRestaurant(Integer id, Speciality speciality) {
        Restaurant newRestaurant = iRestaurant.findById(id).orElse(null);
        if (newRestaurant != null) {
            newRestaurant.setSpeciality(speciality);
            iRestaurant.save(newRestaurant);
            return "updated";
        } else {
            return "restaurant not found";
        }
    }

    public String deleteRestaurant(Integer id) {
        iRestaurant.deleteById(id);
        return "deleted";
    }
}
