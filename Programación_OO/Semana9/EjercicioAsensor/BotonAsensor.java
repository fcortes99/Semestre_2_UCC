package Programación_OO.Semana9.EjercicioAsensor;

public class BotonAsensor extends Boton{

    private int pisoDestino;
    private boolean botoEspecial;
    
    public int getPisoDestino() {
        return pisoDestino;
    }
    public boolean isBotoEspecial() {
        return botoEspecial;
    }
    public void setPisoDestino(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }
    public void setBotoEspecial(boolean botoEspecial) {
        this.botoEspecial = botoEspecial;
    }
    public BotonAsensor(boolean presionado, boolean iluminado, boolean enFalla, int pisoDestino, boolean botoEspecial) {
        super(presionado, iluminado, enFalla);
        this.pisoDestino = pisoDestino;
        this.botoEspecial = botoEspecial;
    }
    @Override
    public String toString() {
        return "BotonAsensor [pisoDestino=" + pisoDestino + ", botoEspecial=" + botoEspecial + "]";
    }

    
    
}
