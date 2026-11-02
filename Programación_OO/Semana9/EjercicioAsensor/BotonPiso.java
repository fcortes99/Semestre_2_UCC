package Programación_OO.Semana9.EjercicioAsensor;

public class BotonPiso extends Boton{

    private String direccion;
    private int numeroPiso;
    
    public String getDireccion() {
        return direccion;
    }
    public int getNumeroPiso() {
        return numeroPiso;
    }
    public BotonPiso(boolean presionado, boolean iluminado, boolean enFalla, String direccion, int numeroPiso) {
        super(presionado, iluminado, enFalla);
        this.direccion = direccion;
        this.numeroPiso = numeroPiso;
    }
    @Override
    public String toString() {
        return "BotonPiso [direccion=" + direccion + ", numeroPiso=" + numeroPiso + "]";
    }

    

    
    
}
