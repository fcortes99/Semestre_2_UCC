package Programación_OO.Semana9.EjercicioAsensor;

public class Puerta {

    private boolean abierta;
    private boolean obstaculo;
    
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
    public void setObstaculo(boolean obstaculo) {
        this.obstaculo = obstaculo;
    }



    public Puerta(boolean abierta, boolean obstaculo) {
        this.abierta = abierta;
        this.obstaculo = obstaculo;
    }
    public Puerta() {
        this.abierta = false;
        this.obstaculo = false;
    }

    public void abrir(){
        if (!this.obstaculo){
            this.abierta = true;
            System.out.println("La puertas del ascensor se han abierto automaticamente. ");
        } else{
            System.out.println("Obstaculo detectado. No se puede abrir las puertas. ");
        }

    }

    public void cerrar(){
        if (!this.obstaculo){
            this.abierta = false;
            System.out.println("Las puertas del ascensor se han cerrado automaticamente. ");
        
        } else{
            System.out.println("Obstaculo detectado. No se puede cerrar las puertas. ");
        }
    }

    
    
}
