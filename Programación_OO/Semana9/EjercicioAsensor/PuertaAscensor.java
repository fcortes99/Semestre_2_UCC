package Programación_OO.Semana9.EjercicioAsensor;

public class PuertaAscensor extends Puerta{

    private boolean abiertaAsc;
    private boolean obstaculoAsc;

    public void abrir(){
        if (!this.obstaculoAsc){
            this.abiertaAsc = true;
            System.out.println("La puertas se han abierto automaticamente. ");
        } else{
            System.out.println("Obstaculo detectado. No se puede abrir las puertas. ");
        }
    }
    
}
