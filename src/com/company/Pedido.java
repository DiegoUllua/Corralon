package com.company;

import java.util.ArrayList;

public class Pedido {

    private Cliente cliente;
    // Ver agregar fecha
    private ArrayList<Item> items = new ArrayList<>();
    private double precio, precioConDescuento;

    public Pedido (Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void agregarAlCarrito(Producto producto, int cantidad){
        Item item = new Item(cantidad,producto);
        items.add(item);

    }

    public double verPrecio(){
        precio=0;

        for (int i =0 ; i < items.size(); i++){
            precio += items.get(i).getProducto().getPrecioUnitario() * items.get(i).getCantidad();

        }



        return precio;
    }

    public double aplicarDescuento(){
        precioConDescuento = ( cliente.getDescuento() * precio ) / 100; // Aplica el descuento segun el tipo de cliente

        return precioConDescuento;
    }

    public void mostrarPedido(){

        System.out.println("\nPedido del cliente "+cliente.getId()+", Nombre y Apellido: "+cliente.getNombre()+" "+cliente.getApellido());
        for (int i =0; i < items.size(); i++){
            items.get(i).mostrarItem();
        }
        System.out.println("PRECIO BRUTO: $"+verPrecio()+", DESCUENTO: $"+aplicarDescuento()+", PRECIO FINAL: $"+(verPrecio() - aplicarDescuento()));
    }
}
