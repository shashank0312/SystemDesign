/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.FoodDelivery.services;

import design.FoodDelivery.Restaurant;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AnaData
 */
public abstract class Service implements Subject{
    Address serviceAddress;
    List<Observer> observers;
    abstract public Object getData();
    abstract public Object search(String name);
    @Override
    public void register(Observer o) {        
    }
    @Override
    public void notifyOfChange() {
        for (Observer o : observers){
            o.getUpdate();
        }
    }
    
    static public Service menuService(){
        return new MenuService();
    }
    
    static public List<Restaurant> restaurantService(){
        return new ArrayList<>();
    }
    
    static public OrderService mapService(){
        return new OrderService();
    }
}
