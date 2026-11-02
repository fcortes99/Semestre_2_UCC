package Programación_OO.Semana9.EjercicioAsensor;

import java.util.List;
public class Asensor {
    
    private int pisoActual;
    private String direccion;
    private Puerta puerta;
    private List<BotonAsensor> botonesInternos;
    
    public Asensor() {
        this.pisoActual = 1;
        this.direccion = "DETENIDO";
        this.puerta = new Puerta();
    }

    public Asensor(int pisoActual) {
        this.pisoActual = pisoActual;
        this.direccion = "DETENIDO";
        this.puerta = new Puerta();
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public String getDireccion() {
        return direccion;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public void mover(int pisoDestino){
        if (pisoDestino > this.pisoActual){
            this.direccion = "SUBIENDO";
            System.out.println("El ascensor esta subiendo desde el piso " + this.pisoActual + " hacia el piso " + pisoDestino);
        }else if (pisoDestino < this.pisoActual){
            this.direccion = "BAJANDO";
            System.out.println("El bajando esta subiendo desde el piso " + this.pisoActual + " hacia el piso " + pisoDestino);
        }else {
            System.out.println("El ascensor ya se encuentra en el piso" + this.pisoActual);
            return;
        }

        this.pisoActual = pisoDestino;
        this.direccion = "DETENIDO";
        System.out.println("El ascensor ha llegado a su piso" + this.pisoActual);

        this.puerta.abrir();

    }

    


}
