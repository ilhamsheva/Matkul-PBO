package com.kuliah.parent;

public class Ikan {
    protected String bernafas;

    public Ikan() {
        this.bernafas = "Insang";
    }
    
    public void display() {
        System.out.println("ikan bernafas " + bernafas);
    }
}
