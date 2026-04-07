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
public abstract class Vehicle {
  protected float cargoCapacity;
  protected ArrayList<Shipping> shipppings;

    public Vehicle(float cargoCapacity, ArrayList<Shipping> shipppings) {
        this.cargoCapacity = cargoCapacity;
        this.shipppings = new ArrayList<>();
    }

    public float getCargoCapacity() {
        return cargoCapacity;
    }

    public ArrayList<Shipping> getShipppings() {
        return shipppings;
    }

    
  
  
}
