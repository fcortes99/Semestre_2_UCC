package Programación_OO.Semana9.EjercicioAsensor;

public class PuertasPiso extends Puerta {
    
    private int numeroPiso;
    private boolean abiertaPiso;


    public PuertasPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }



    public void abrir(){
        this.abiertaPiso = true;
        System.out.println("[PUERTA PISO " + numeroPiso + "] La puerta del piso se ha ABIERTO.");
    }

    public void cerrar(){
        this.abiertaPiso = false;
        System.out.println("[PUERTA PISO " + numeroPiso + "] La puerta del piso se ha CERRADO.");
    }
}
