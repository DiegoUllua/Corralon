package com.company;

import javax.sound.midi.MidiMessage;

public class Producto {
    private int id,stock;
    private String nombre, marca;
    private float precioUnitario;

    public Producto (int id, String nombre, String marca, float precioUnitario, int stock){
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public int getId() {
        return id;
    }

    public int getStock() {
        return stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto \n" +
                "Id =" + id +
                ", Stock =" + stock +
                ", Nombre ='" + nombre + '\'' +
                ", Marca ='" + marca + '\'' +
                ", Precio unitario = $" + precioUnitario;
    }
}
