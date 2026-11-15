package Programación_OO.Semana9.EjercicioAsensor;

public class MainAscensor {
    
    public static void main(String[] args) {
        
        Ascensor miAscensor = new Ascensor();


        Piso[] edificioPisos = new Piso[5];
            for (int i = 0; i < edificioPisos.length; i++){
                edificioPisos[i] = new Piso(
                    i + 1, 
                    new BotonPiso(false, false, false, "SUBIR", i + 1),
                    new BotonPiso(false, false, false, "BAJAR", i + 1),
                    new PuertasPiso(i + 1)
                );


            }

        SistemaControl control = new SistemaControl(miAscensor, edificioPisos);

        control.solicitudPasillo(3, "SUBIDA");

        control.ProcesarSolicitudes();

        control.solicitudAscensor(5);

        control.ProcesarSolicitudes();

        control.ProcesarSolicitudes();

        }
}
