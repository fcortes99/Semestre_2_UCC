package Programación_OO.Semana7;

public class Camara extends Producto {
    
    private String marca;
    private String modelo;
    public Camara(int nuemero, String marca, String modelo) {
        super(nuemero);
        this.marca = marca;
        this.modelo = modelo;
    }
    @Override
    public String toString() {
        return "Camara [marca=" + marca + ", modelo=" + modelo + "]";
    }

    

}
