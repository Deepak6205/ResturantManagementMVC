package com.geekster.RestaurantManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Restaurant {
    @Id
    private Integer restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantNumber;
    @Enumerated(EnumType.STRING)
    private Speciality speciality;
}
