package Programación_OO.Semana9.EjercicioAsensor;

import java.util.ArrayList;

public class SistemaControl {

    private Ascensor asensores;
    private Piso[] pisos;
    private ArrayList<Integer> solicitudesPendientes;
    
    public SistemaControl(Ascensor asensores, Piso[] pisos) {
        this.asensores = asensores;
        this.pisos = pisos;
        this.solicitudesPendientes = new ArrayList<>();
    }

    public void solicitudPasillo (int piso, String direccion){
        this.solicitudesPendientes.add(piso);
        System.out.println("Se ha Registrado la solicitud en el piso " + piso + " Para " + direccion);
    }

    public void solicitudAscensor (int piso){
        this.solicitudesPendientes.add(piso);
        System.out.println("Se ha Registrado la solicitud en el piso " + piso + ". ");
    }

    public void ProcesarSolicitudes (){
        if (solicitudesPendientes.isEmpty()){
            System.out.println("No hay solicitudes pendientes");
        }else{
            int pisoDestino = solicitudesPendientes.get(0);
            asensores.mover(pisoDestino);
            solicitudesPendientes.remove(0);
        }

    }

}
