package Programación_OO.Semana7;

import java.util.Date;

public class MainP {
    public static void main(String[] args) {

    Foto misFoto [] = {
        new Foto("Foto_En_Japon"),
        new Foto("Foto_En_Peru"),
        new Foto("Foto_En_Mongolia"),
        new Foto("Foto_En_Vietnam"),
    };

    Camara camara1 = new Camara(10, "Sony", "A7 IV");
    Impresion impresion1 = new Impresion(10, "Rojo", misFoto);

    Producto [] carrito = {camara1, impresion1};

    ClienteP clienteP = new ClienteP(31903254, "Eulalio Mosquera");

    Date fechaActual = new Date();

    Pedido pedido1 = new Pedido(clienteP, carrito, fechaActual, 96536541);

    System.out.println(pedido1);
        
    }
}

