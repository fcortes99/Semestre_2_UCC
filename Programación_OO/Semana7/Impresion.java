package Programación_OO.Semana7;

import java.util.Arrays;

public class Impresion extends Producto{
    
    private String color;
    private Foto[] foto;
    
    public Impresion(int nuemero, String color, Foto[] foto) {
        super(nuemero);
        this.color = color;
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Impresion [color=" + color + ", foto=" + Arrays.toString(foto) + "]";
    }
     
    
}
