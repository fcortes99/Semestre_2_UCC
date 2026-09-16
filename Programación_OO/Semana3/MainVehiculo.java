public class MainVehiculo {
    
    public static void main(String[] args) {
        
        // Constante es un valor que no cambia durante la ejecucion del codigo y debe de ir en Mayusculas sostenida

        final int AÑO_ACTUAL = 2026;

        Vehiculo objVehiculo1 = new Vehiculo(2025, "Mazda", "Rojo", 1005.6, "Sedan");
        Vehiculo objVehiculo2 = new Vehiculo(1980, "Nissan", "Azul", 950.3, "Sedan");
        //System.out.println(objVehiculo1.toString());

        System.out.println(objVehiculo1.toString());
        System.out.println(objVehiculo1.calcularantVehiculo(AÑO_ACTUAL) + " Año");
        System.out.println(objVehiculo2.toString());
        System.out.println(objVehiculo2.calcularantVehiculo(AÑO_ACTUAL) + " Años");



    }
}
