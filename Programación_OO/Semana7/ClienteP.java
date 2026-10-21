package Programación_OO.Semana7;

public class ClienteP {
    
    private int cedula;
    private String nombre;
    
    public ClienteP(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return 
        "ClienteP [cedula=" + cedula + ", nombre=" + nombre + "]";
    }

    
}
