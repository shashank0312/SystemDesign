/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.FoodDelivery;

import java.util.List;

/**
 *
 * @author AnaData
 */
public class Order {
    List<MenuItem> itemsOrdered;
    Restaurant restaurant;
    enum OrderStatus{PENDING,DELIVERED,CANCELLED}  
    
    Order(Restaurant restaurant){
        this.restaurant=restaurant;
    }
    
    void setItems(List<MenuItem> items){
        itemsOrdered = items;
    }
}
