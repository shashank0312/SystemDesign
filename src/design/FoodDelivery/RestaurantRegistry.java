/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.FoodDelivery;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AnaData
 */
public enum RestaurantRegistry {
    INSTANCE;
    
    List<Restaurant> cache;
    void refreshRestaurants(){}
    
    List<Restaurant> getRestaurants(){
        return new ArrayList<Restaurant>();
    }
}
