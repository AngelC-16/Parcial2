/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.cargolink.logistics.Shipping;

import core.cargolink.logistics.LogisticsCenter;
import core.client.Client;
import core.vehicle.Vehicle;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author acarrillog
 */
public class Shipping {
    private String code;
    private Client cliente;
    private LogisticsCenter originCenter;
    private LogisticsCenter distinationCenter;
    private Date registrationDate;
    private Date deliveryDate;
    private Status status;
    private ArrayList<Package> packages;
    private Vehicle vehicle;

    public Shipping(String code, Client cliente, LogisticsCenter originCenter, LogisticsCenter distinationCenter, Date registrationDate, Date deliveryDate, Status status, ArrayList<Package> packages, Vehicle vehicle) {
        this.code = code;
        this.cliente = cliente;
        this.originCenter = originCenter;
        this.distinationCenter = distinationCenter;
        this.registrationDate = registrationDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.packages = packages;
        this.vehicle = vehicle;
    }

    public String getCode() {
        return code;
    }

    public Client getCliente() {
        return cliente;
    }

    public LogisticsCenter getOriginCenter() {
        return originCenter;
    }

    public LogisticsCenter getDistinationCenter() {
        return distinationCenter;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public Status getStatus() {
        return status;
    }

    public ArrayList<Package> getPackages() {
        return packages;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    
    
}
