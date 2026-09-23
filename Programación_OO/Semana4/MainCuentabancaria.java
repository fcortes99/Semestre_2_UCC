public class MainCuentabancaria {
    public static void main(String[] args) {

        Cuentabancaria objCuenta1 = new Cuentabancaria(0.0, "Jorge Meza", "100-256398-36", "Ahorros");

        // Mostrar El objeto en su estado inicial
        System.out.println(objCuenta1);
        // Consignacion
        System.out.println("Saldo Despues de Consignacion: " + objCuenta1.consignar(3200.0));
        // Mostrar El objeto despues de Consignacion
        System.out.println(objCuenta1);
        // Mostrar El objeto despues de Consignacion
        System.out.println("Saldo Despues de Retiro: " + objCuenta1.retirar(3400.0));
        // Mostrar El objeto despues de Retiro
        System.out.println(objCuenta1);
        //Consultar Saldo
        System.out.println("Saldo Actual: " + objCuenta1.consultarSaldo());

    }
}
