public class MainBiblioteca {
    public static void main(String[] args) {
        
        Biblioteca Libro1 = new Biblioteca("Cuento", 987654, "Casa Tomada", "Julio Cortázar", 1946, "Disponible", false);
        Biblioteca Libro2 = new Biblioteca("Ensayo", 112233, "Teoría General de los Sistemas", "Ludwig von Bertalanffy", 1968, "Disponible", false);
        Biblioteca Libro3 = new Biblioteca("Manual", 445566, "Programación en Java", "James Gosling", 2005, "Prestado", true);
        Biblioteca Libro4 = new Biblioteca("Texto", 778899, "Física Universitaria", "Sears y Zemansky", 2013, "Disponible", false);
        Biblioteca Libro5 = new Biblioteca("Poesía", 998877, "La Odisea", "Homero", 2001, "Prestado", true);

        
        System.out.println("--- ESTADO INICIAL ---");
        System.out.println(Libro1.toString());
        System.out.println();

        
        System.out.println("--- INTENTO DE PRÉSTAMO ---");
        Libro1.prestar(); 
        
        System.out.println("\nEstado después del préstamo:");
        System.out.println(Libro1.toString());
        System.out.println();

       
        System.out.println("--- INTENTO DE DEVOLUCIÓN ---");
        Libro1.devolver();

        System.out.println("\nEstado final:");
        System.out.println(Libro1.toString());


        System.out.println("--- ESTADO INICIAL ---");
        System.out.println(Libro5.toString());
        System.out.println();

        
        System.out.println("--- INTENTO DE PRÉSTAMO ---");
        Libro5.prestar(); 
        
        System.out.println("\nEstado después del préstamo:");
        System.out.println(Libro5.toString());
        System.out.println();

       
        System.out.println("--- INTENTO DE DEVOLUCIÓN ---");
        Libro5.devolver();

        System.out.println("\nEstado final:");
        System.out.println(Libro5.toString());
    }
    
}

