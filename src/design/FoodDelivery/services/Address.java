/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.FoodDelivery.services;

import java.net.URL;

/**
 *
 * @author AnaData
 */
public interface Address {
    void parseAddress(String address);
    
    Address getAddress();
}
