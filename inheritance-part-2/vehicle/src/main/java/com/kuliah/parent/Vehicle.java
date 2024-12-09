package com.kuliah.parent;

// Superclass
public class Vehicle {
    String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Metode untuk menampilkan informasi kendaraan
    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}