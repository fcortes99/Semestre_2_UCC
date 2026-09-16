public class Vehiculo {
    
    // Atributos de la Clase 

    private int modelo;
    private String marca;
    private String color;
    private double peso;
    private String linea;

    //Construtor de la clase
    public Vehiculo (int modelo, String marca, String color, double peso, String linea){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.peso = peso;
        this.linea = linea;
    }

    public String toString(){
        return "Vehiculo[ Modelo: " + modelo +" Marcar: " + marca + " Color: " + "peso: " + peso + " Linea: " + linea + " ]";

    }

     // Metodo toString Sirve para ver como esta creado el objeto 
    public int calcularantVehiculo(int añoActual){
        return añoActual - modelo;
    };
   
}
