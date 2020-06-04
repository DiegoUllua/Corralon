package com.company;

public class Item {
    private int cantidad;
    private Producto producto;

    public Item(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void mostrarItem (){

        System.out.println("ID: "+producto.getId()+", Nombre: "+producto.getNombre()+", Marca: "+producto.getMarca()+", Precio unitario: $"+producto.getPrecioUnitario()
        +", Stock: "+producto.getStock()+" | CANTIDAD: "+cantidad);
    }
}
