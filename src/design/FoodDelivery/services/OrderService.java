/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.FoodDelivery.services;

import design.FoodDelivery.Delivery;
import design.FoodDelivery.Order;
import java.util.Map;

/**
 *
 * @author AnaData
 */
public class OrderService extends Service {
    Map<Order,Delivery> tracker;
    
    OrderService(){
        
    }
    void setOrder(Order order){
        
    }
    @Override
    public Delivery getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object search(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
