/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.FoodDelivery;

import design.FoodDelivery.services.Address;
import design.FoodDelivery.services.Observer;

/**
 *
 * @author AnaData
 */
public class Customer implements Observer {
    String userName;
    String name;
    
    Address address;

    @Override
    public void getUpdate() {
        
    }
    
    void order(MenuItem item){
        
    }
    
    void trackOrder(Order order){
        
    }
    
}
