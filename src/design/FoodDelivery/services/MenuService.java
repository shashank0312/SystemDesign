/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.FoodDelivery.services;

import design.FoodDelivery.Menu;

/**
 *
 * @author AnaData
 */
public class MenuService extends Service {
    @Override
    public Menu getData() {
        return new Menu();
    }

    @Override
    public Object search(String name) {
        return null;
    }
    
    
}
