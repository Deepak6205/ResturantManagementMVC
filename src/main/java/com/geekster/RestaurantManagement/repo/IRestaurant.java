package com.geekster.RestaurantManagement.repo;

import com.geekster.RestaurantManagement.model.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRestaurant extends CrudRepository<Restaurant,Integer> {


}
