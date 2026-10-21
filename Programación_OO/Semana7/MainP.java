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

    Producto [] carrito1 = {camara1, impresion1};
    Producto [] carrito2 = {camara2, impresion2};

    ClienteP clienteP1 = new ClienteP(31903254, "Eulalio Mosquera");
    ClienteP clienteP2 = new ClienteP(1105478962, "Jorge Perez");

    Date fechaActual = new Date();

    Pago pago1 = new Efectivo(1500.0, 2500.0);
    Pago pago2 = new Transferencia(1500.0, "PSE", 239854);
    Pago pago3 = new Tarjetacredito(1500.0, "Bando de Occidente", 256);

    Pedido pedido1 = new Pedido(clienteP1, carrito1, fechaActual, pago1.toString());
    Pedido pedido2 = new Pedido(clienteP2, carrito2, fechaActual, pago3.toString());

    Pedido[] listaPedidos = { pedido1, pedido2 };

    for (Pedido pedido : listaPedidos) {
        System.out.println(pedido);
    }
    }
}

