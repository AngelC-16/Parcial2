/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.cargolink;

import core.vehicle.Plane;
import core.vehicle.Ship;
import core.vehicle.Truck;
import core.vehicle.Vehicle;
import core.client.Client;
import core.cargolink.CargoLink;
import core.cargolink.logistics.LogisticsCenter;
import core.cargolink.logistics.Shipping.Shipping;
import java.util.ArrayList;


public class CargoLink {
    private ArrayList<Client> client;
    private ArrayList<Center> center;
    private ArrayList<Vehicle> vehicles;
    private final ArrayList<Object> vehicle;
    
    public CargoLink(){
        this.client = new ArrayList<>();
        this.center = new ArrayList<>();
        this.vehicle = new ArrayList<>();
    }    
    
    public ArrayList<Client> getClients() {
        return client;
    }

    public ArrayList<Center> getCenter() {
        return center;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
    
    
    
    
}
