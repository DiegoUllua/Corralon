package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola bbota");
        // Clientes
        Cliente diego = new ClienteFinal(1,37893232,22321313,"Diego","Ullua","10/10/1993");
        Cliente empresa1 = new ClienteEmpresa(2,5453453,0002313,"Juan","Rodriguez","20/08/1989",213123232,21f);
        Cliente juan = new ClienteFinal(3,378912,2232123,"Juan","Perez","1/12/1993");
        Cliente empresa2 = new ClienteEmpresa(4,5452453,0202313,"Matias","Gonzalez","22/08/1982",213323232,21f);


        // Productos
        Producto cemento = new Producto(1,"Bolsa Cemento 20kg","Pingo",300f,50);
        Producto ladrillo = new Producto(2,"Ladrillo 6 huecos","Ladrillin",35f,1800);
        Producto arena = new Producto(3,"Arena x bolsa 5kg","Arenita",60f,200);
        Producto arenaGrande = new Producto(4,"Arena Bolson","Arenota",1500f,60);
        Producto pala = new Producto(5,"Pala Construccion","Paleishon",720f,20);
        Producto balde = new Producto(6,"Balde Construccion","Balderos",250f,100);
        Producto casco = new Producto(7,"Casco Profesional Construcion","Cascote",400f,100);
        Producto maquinaMezcla = new Producto(8,"Mezcladora Cemento","Mezcolanza",12000f,20);
        Producto carretilla = new Producto(9,"Carretilla","Marley",1800f,30);
        Producto bolsonPiedras = new Producto(10,"Bolson de Piedras","Flor de piedra",1900f,60);



        Corralon corralon = new Corralon();

        corralon.agregarProductoAlCatalogo(cemento);
        corralon.agregarProductoAlCatalogo(ladrillo);
        corralon.agregarProductoAlCatalogo(arena);
        corralon.agregarProductoAlCatalogo(arenaGrande);
        corralon.agregarProductoAlCatalogo(pala);
        corralon.agregarProductoAlCatalogo(balde);
        corralon.agregarProductoAlCatalogo(casco);
        corralon.agregarProductoAlCatalogo(maquinaMezcla);
        corralon.agregarProductoAlCatalogo(carretilla);
        corralon.agregarProductoAlCatalogo(bolsonPiedras);



        //corralon.mostrarCatalogo();

        corralon.agregarClientesAlaLista(diego);
        corralon.agregarClientesAlaLista(empresa1);
        corralon.agregarClientesAlaLista(juan);
        corralon.agregarClientesAlaLista(empresa2);
        // corralon.mostrarClientes();

        Pedido pedido1 = new Pedido(diego);
        Pedido pedido2= new Pedido(empresa1);

        pedido1.agregarAlCarrito(cemento,1);
        pedido1.agregarAlCarrito(pala,2);
        pedido1.agregarAlCarrito(balde,2);
        pedido1.agregarAlCarrito(arenaGrande,1);
        pedido1.agregarAlCarrito(bolsonPiedras,1);

        pedido2.agregarAlCarrito(bolsonPiedras,1);
        pedido2.agregarAlCarrito(arenaGrande,1);
        pedido2.agregarAlCarrito(casco,3);

        //pedido1.mostrarPedido();

        corralon.vender(pedido2.getCliente(),pedido2);


        corralon.vender(pedido1.getCliente(),pedido1);

        corralon.mostrarUltimosPedidos();

        corralon.mostrarCatalogo();



    }
}
