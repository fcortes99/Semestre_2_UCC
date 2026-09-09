public class Ejercicio2 {
    
    //Atributos
    private int id;
    private int cedula;
    private String nombre;
    private String apellidos;
    private int edad;
    private double estatura;

    // Constructor: el metodo constructor de la clase se reconoce porque tiene el mismo nombre de la clase.
    // permite darle vida al objeto
    
    public Ejercicio2(int id, int cedula, String nombre, String apellidos, int edad, double estatura ){

        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;

    }

    public String toString(){

        return  "Ejercicio2 {id: "+ id + " cedula: " + cedula + " nombre: " + nombre + " apellidos: " + apellidos + " edad: " + edad + " estatura: " + estatura;
    }

}
