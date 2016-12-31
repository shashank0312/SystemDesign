/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.FoodDelivery;

import design.FoodDelivery.services.Address;
import design.FoodDelivery.services.Observer;
import design.FoodDelivery.services.MenuService;
import design.FoodDelivery.services.Service;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AnaData
 */
public class Restaurant implements Observer {
    Service service = new MenuService();
    Menu menu;
    Address address;
    Service orderService;
    @Override
    public void getUpdate() {
        menu = (Menu)service.getData();
    }
    
    Menu getMenu(){
        return menu;
    }
    
    List<MenuItem> getMenuItems(){
        return menu.getMenuItems();
    }
    
    OrderBuilder orderBuilder;
    OrderBuilder getOrderBuilder(){
        return orderBuilder;
    }
    class OrderBuilder{        
        Order order;
        List<MenuItem> items;
        OrderBuilder(Restaurant res){
            order = new Order(res);
            items = new ArrayList<>();
        }
        void addItem(MenuItem item){
            items.add(item);
        }
        Order build(){
            order.setItems(items);
            return order;
        }
    }
    
    Delivery confirmOrder(){
        return new Delivery();
    }
    
}
