public class Trabajador {
    // Atributos
    private int cedula;
    private String nombre;
    private double salario;

    // Constructor
    public Trabajador(int cedula, String nombre, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    // Metodo pagar

    public int pagar() {
        return (int) (salario * 1.10);
    }

    public double getSalario() {
        return salario;
    }
}
