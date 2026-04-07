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
    private ArrayList<LogisticsCenter> center;
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

    public ArrayList<LogisticsCenter> getCenter() {
        return center;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public boolean addClient(Client client){
        if(!this.client.contains(client)){
            this.client.add(client);
            return true;
        }
        return false;
    }
    
    
    
    public boolean addLogisticsCenter(LogisticsCenter logisticsCenter){
        if(!this.center.contains(logisticsCenter)){
            this.center.add(logisticsCenter);
            return true;
        }
        return false;
    }
    
    public boolean addCenter(Vehicle vehicle){
        if(!this.vehicle.contains(vehicle)){
            this.vehicle.add(vehicle);
            return true;
        }
        return false;
    }
}
