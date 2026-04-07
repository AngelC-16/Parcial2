/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle;

import core.cargolink.logistics.Shipping.Shipping;
import java.util.ArrayList;

/**
 *
 * @author acarrillog
 */
public class Ship extends Vehicle {
    private String name;

    public Ship(double cargoCapacity,String name) {
        super(cargoCapacity);
        this.name = name;
    }

    

    public String getName() {
        return name;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public ArrayList<Shipping> getShipppings() {
        return shipppings;
    }
    
    
}
