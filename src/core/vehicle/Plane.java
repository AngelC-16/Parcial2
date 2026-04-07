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
public class Plane extends Vehicle  {
    private String code;

    public Plane(String code, float cargoCapacity, ArrayList<Shipping> shipppings) {
        super(cargoCapacity, shipppings);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public float getCargoCapacity() {
        return cargoCapacity;
    }

    public ArrayList<Shipping> getShipppings() {
        return shipppings;
    }
    
    
}
