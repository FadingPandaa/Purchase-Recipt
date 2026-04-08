/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package camerarecipt;

/**
 *
 * @author ST10437711
 */
class Camera {

    private String brand;
    private double mirrorlessPrice;
    private double dslrPrice;

    public Camera(String brand, double mirrorlessPrice, double dslrPrice) {
        this.brand = brand;
        this.mirrorlessPrice = mirrorlessPrice;
        this.dslrPrice = dslrPrice;
    }

    public String getBrand() {
        return brand;
    }

    public double getMirrorlessPrice() {
        return mirrorlessPrice;
    }

    public double getDslrPrice() {
        return dslrPrice;
    }

    public double calculatePriceDifference() {
        return mirrorlessPrice - dslrPrice;
    }
}