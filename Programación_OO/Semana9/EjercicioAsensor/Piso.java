package Programación_OO.Semana9.EjercicioAsensor;

public class Piso {
    
    private int numeroPiso;
    private BotonPiso botonSubir;
    private BotonPiso botonBajar;
    
    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setBotonSubir(BotonPiso botonSubir) {
        this.botonSubir = botonSubir;
    }

    public void setBotonBajar(BotonPiso botonBajar) {
        this.botonBajar = botonBajar;
    }

    public Piso(int numeroPiso, BotonPiso botonSubir, BotonPiso botonBajar) {
        this.numeroPiso = numeroPiso;
        this.botonSubir = botonSubir;
        this.botonBajar = botonBajar;
    }

    @Override
    public String toString() {
        return "Piso [numeroPiso=" + numeroPiso + ", botonSubir=" + botonSubir + ", botonBajar=" + botonBajar + "]";
    }

    

    
    
}
