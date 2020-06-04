package com.company;

import java.util.concurrent.ConcurrentNavigableMap;

public class ClienteFinal extends Cliente implements ConsumidorFinal {




    public ClienteFinal(int id, int dni, int telefono, String nombre, String apellido, String fechaNac) {
        super(id, dni, telefono, nombre, apellido, fechaNac);
    }

    @Override
    public String pagar() {
        return "Soy un cliente final y pago en efectivo";
    }

    @Override
    public String toString() {
        return "ClienteFinal\n "+ "Id =" + this.getId() +
                ", Dni = "  + this.getDni() +
                ", Telefono =" + this.getTelefono() +
                ", Nombre ='" + this.getNombre() + '\'' +
                ", Apellido ='" + this.getApellido() + '\'' +
                ", Fecha Nac ='" + this.getFechaNac() + '\'';
    }

    @Override
    public float getDescuento() {
        return ConsumidorFinal.descuento;
    }
}
