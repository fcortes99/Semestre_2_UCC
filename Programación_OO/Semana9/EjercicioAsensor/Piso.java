package Programación_OO.Semana9.EjercicioAsensor;

public class Piso {
    
    private int numeroPiso;
    private BotonPiso botonSubir;
    private BotonPiso botonBajar;
    private PuertasPiso puertasPiso;
    
    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setBotonSubir(BotonPiso botonSubir) {
        this.botonSubir = botonSubir;
    }

    public void setBotonBajar(BotonPiso botonBajar) {
        this.botonBajar = botonBajar;
    }

    public PuertasPiso getPuertasPiso() {
        return puertasPiso;
    }

    public Piso(int numeroPiso, BotonPiso botonSubir, BotonPiso botonBajar, PuertasPiso puertasPiso) {
        this.numeroPiso = numeroPiso;
        this.botonSubir = botonSubir;
        this.botonBajar = botonBajar;
        this.puertasPiso = puertasPiso;
    }

    @Override
    public String toString() {
        return "Piso [numeroPiso=" + numeroPiso + ", botonSubir=" + botonSubir + ", botonBajar=" + botonBajar + "]";
    }

    

    
    
}
