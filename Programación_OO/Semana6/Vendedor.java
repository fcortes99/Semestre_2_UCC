public class Vendedor extends Trabajador{
    private double comision;

    // Constructor
    public Vendedor(int cedula, String nombre, double salario, double comision) {
        super(cedula, nombre, salario);
        this.comision = comision;
    }

    public int pagar() {
        return (int) (getSalario() * (1 + comision / 100));
    }
}
