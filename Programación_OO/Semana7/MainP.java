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

    Camara camara2 = new Camara(15, "Sony", "A8 IV");
    Impresion impresion2 = new Impresion(15, "Verde", misFoto);

    Producto [] carrito = {camara1, impresion1, camara2, impresion2};

    ClienteP clienteP1 = new ClienteP(31903254, "Eulalio Mosquera");
    ClienteP clienteP2 = new ClienteP(1105478962, "Jorge Perez");

    Date fechaActual = new Date();

    Pedido pedido1 = new Pedido(clienteP1, carrito, fechaActual, 96536541);
    Pedido pedido2 = new Pedido(clienteP2, carrito, fechaActual, 0);

    Pedido[] listaPedidos = { pedido1, pedido2 };

    for (Pedido p : listaPedidos) {
        if (p.validarTarjeta()) {
            System.out.println("Tarjeta válida. Procesando pedido...");
            System.out.println(p);
        } else {
            System.out.println("Error en la tarjeta. No se puede procesar el pedido.");
        }
        System.out.println("-------------------------------------------------");
    }
    }
}

