public class MainTrabajador {
    public static void main(String[] args){
        // creacion de un arreglo de objetos Trabajador
        Trabajador[] t = new Trabajador[3];
        // creacion de los objetos operario y vendedor y asignacion al arreglo
        t[0] = new Operario(31901103, "Kevin Jurado", 100.0, 120.0);
        t[1] = new Vendedor(36958741, "Francisco Fandiño", 2000.0, 21.5);
        t[2] = new Operario(1102569847, "Teresa Cano", 500.0, 60.0);

        for (int i = 0; i < t.length; i++){
            System.out.println("El salario de " + t[i].getNombre() + " Es de: " + t[i].pagar());
        }

    }
}
