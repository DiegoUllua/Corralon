package com.company;

import java.util.Date;

public abstract class Cliente {

    private int id,dni,telefono;
    private String nombre, apellido;
    private String fechaNac;

    public Cliente(int id, int dni, int telefono, String nombre, String apellido, String fechaNac) {
        this.id = id;
        this.dni = dni;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public int getId() {
        return id;
    }

    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public abstract String pagar();

    public abstract float getDescuento();

    @Override
    public String toString() {
        return "Cliente \n" +
                "Id =" + id +
                ", Dni = "  + dni +
                ", Telefono =" + telefono +
                ", Nombre ='" + nombre + '\'' +
                ", Apellido ='" + apellido + '\'' +
                ", Fecha Nac ='" + fechaNac + '\'';
    }
}
