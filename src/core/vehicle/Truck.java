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
public class Truck extends Vehicle {
    private String licensePlate;

    public Truck(double cargoCapacity,String licensePlate) {
        super(cargoCapacity);
        this.licensePlate = licensePlate;
    }


    public String getLicensePlate() {
        return licensePlate;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public ArrayList<Shipping> getShipppings() {
        return shipppings;
    }
    
    
    
}
