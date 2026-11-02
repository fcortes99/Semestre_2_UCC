package Programación_OO.Semana9.EjercicioAsensor;

public class Boton {
    private boolean presionado;
    private boolean iluminado;
    private boolean enFalla;
    
    public Boton(boolean presionado, boolean iluminado, boolean enFalla) {
        this.presionado = presionado;
        this.iluminado = iluminado;
        this.enFalla = enFalla;
    }

    

    public boolean isPresionado() {
        return presionado;
    }



    public boolean isIluminado() {
        return iluminado;
    }



    public boolean isEnFalla() {
        return enFalla;
    }



    public void setPresionado(boolean presionado) {
        this.presionado = presionado;
    }



    public void setIluminado(boolean iluminado) {
        this.iluminado = iluminado;
    }



    public void setEnFalla(boolean enFalla) {
        this.enFalla = enFalla;
    }



    @Override
    public String toString() {
        return "Boton [presionado=" + presionado + ", iluminado=" + iluminado + ", enFalla=" + enFalla + "]";
    }

    


}
