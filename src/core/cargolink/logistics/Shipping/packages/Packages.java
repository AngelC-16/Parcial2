/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.cargolink.logistics.Shipping.packages;

/**
 *
 * @author acarrillog
 */
public class Packages {
    private double weight;
    private Content type;
    private double value;

    public Packages(double weight, Content type, double value) {
        this.weight = weight;
        this.type = type;
        this.value = value;
    }

    public double getWeight() {
        return weight;
    }

    public Content getType() {
        return type;
    }

    public double getValue() {
        return value;
    }
    
    
}
