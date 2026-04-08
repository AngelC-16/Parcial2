/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.cargolink.logistics;

import core.cargolink.logistics.Shipping.Shipping;
import core.client.Client;
import java.util.ArrayList;

/**
 *
 * @author acarrillog
 */
public class LogisticsCenter {
    private String name;
    private String city;
    private String country;
    private double latitude;
    private double longitude;
    private ArrayList<Shipping> shipping;

    public LogisticsCenter(String name, String city, String country, double latitude, double longitude, ArrayList<Shipping> shipping) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.shipping = shipping;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public ArrayList<Shipping> getShipping() {
        return shipping;
    }

    public boolean addShipping(Shipping shipping){
        if(!this.shipping.contains(shipping)){
            this.shipping.add(shipping);
            return true;
        }
        return false;
    }
}
