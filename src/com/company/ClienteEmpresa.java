package com.company;

public class ClienteEmpresa extends Cliente implements Empresa {

    private int cuit;
    private float iva;

    public float getDescuento(){

        return Empresa.descuento;
    }


    public ClienteEmpresa(int id, int dni, int telefono, String nombre, String apellido, String fechaNac,int cuit, float iva) {
        super(id, dni, telefono, nombre, apellido, fechaNac);
        this.iva = iva;
        this.cuit = cuit;
    }

    @Override
    public String pagar() {

        return "Soy empresa pago con tarjeta";
    }

    @Override
    public String toString() {
        return "Cliente Empresa \n" +"Id= "+this.getId()+
                ", cuit=" + cuit +
                ", iva=" + iva +
                ", Nombre= "+this.getNombre()+", Apellido= "+this.getApellido()+", DNI= "+this.getDni()+", Fecha de Nac= "+this.getFechaNac()+", Telefono= "+this.getTelefono();
    }
}
