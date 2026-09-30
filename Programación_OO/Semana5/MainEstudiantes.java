public class MainEstudiantes {
    
    public static void main(String[] args) {
        
        Estudiantes objEstudiantes1 = new Estudiantes("Armando Perez", "25497412", 26, "Derecho");
        Estudiantes objEstudiantes2 = new Estudiantes("Santiago Jurado", "8596472", 18, "Ingenieria Industrial");
        Estudiantes objEstudiantes3 = new Estudiantes("Camila Guevara", "789456123", 29, "Fisica");

        System.out.println(objEstudiantes1);
        System.out.println(objEstudiantes2);
        System.out.println(objEstudiantes3);

        // Uso de los metodos Getter a Setter

        System.out.println("La Edad del Estuadiante 2: " + objEstudiantes1.getEdad());
        System.out.println("La Edad del Estuadiante 3: " +objEstudiantes3.getEdad());

        // Cambiar el nombre del OBJ2

        System.out.println(objEstudiantes2);
        objEstudiantes2.setNombre("Eustaquio Vargas");
        System.out.println(objEstudiantes2);

        System.out.println(objEstudiantes3);
        objEstudiantes3.setPrograma("Quimica");
        System.out.println(objEstudiantes3);


        // Validar Edad

        objEstudiantes1.setEdad(-9);
        System.out.println(objEstudiantes1);
        objEstudiantes1.setEdad(34);
        System.out.println(objEstudiantes1);

        // Validar Nombre Vacio

        objEstudiantes2.setNombre("");
        System.out.println(objEstudiantes2);
        objEstudiantes2.setNombre("Julian");
        System.out.println(objEstudiantes2);



    }
}
