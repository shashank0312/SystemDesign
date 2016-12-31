/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.FoodDelivery;

import design.FoodDelivery.services.MenuService;
import design.FoodDelivery.services.Service;
import java.util.List;

/**
 *
 * @author AnaData
 */
public class Menu  {    
        List<MenuItem> items;
        Service service = new MenuService();
        List<MenuItem> getMenuItems(){
            return items;
        }
        
}
