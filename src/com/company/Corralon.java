package com.company;

import java.util.ArrayList;

public class Corralon {

    private ArrayList <Producto> catalogo = new ArrayList<>(); // Ver de agregar el tipo dentro de los <> si no funciona
    private ArrayList <Cliente> carteraClientes = new ArrayList<>(); // Ver lo mismo del de arriba si no funciona
    private ArrayList <Pedido> ultimosPedidos = new ArrayList<>();

    public Corralon(){

    }

    public void vender(Cliente cliente,Pedido pedido){

        cliente.getDescuento();
        for (int i =0; i < pedido.getItems().size() ; i++){
            for (int e =0; e < catalogo.size(); e++){
                if(pedido.getItems().get(i).getProducto().getId() == catalogo.get(e).getId()){
                    catalogo.get(e).setStock(catalogo.get(e).getStock() - pedido.getItems().get(i).getCantidad());
                }
            }
        }

        ultimosPedidos.add(pedido);
    }

    public void agregarClientesAlaLista (Cliente agregar){
        carteraClientes.add(agregar);
    }

    public void mostrarClientes(){
        System.out.println("Listado de Clientes");
        for (int i =0; i < carteraClientes.size();i++){
            System.out.println(carteraClientes.get(i).toString());
        }
    }

    public void agregarProductoAlCatalogo(Producto agregar){
        catalogo.add(agregar);
    }
    public void mostrarCatalogo (){
        System.out.println("Productos del catalogo: ");

        for(int i =0; i < catalogo.size(); i++){
            System.out.println(catalogo.get(i).toString());
        }
    }


    void mostrarUltimosPedidos(){
        for (int i =0; i < ultimosPedidos.size(); i++){
            ultimosPedidos.get(i).mostrarPedido();
        }
    }
}
