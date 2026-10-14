package Programación_OO.Semana7;

public class Mainbanco {
    public static void main(String[] args) {
        
        // creacion del obj cuenta 
        Cuenta cuenta = new Cuenta("3190112-1", "Camilo Cervantes", 0);

        // creacion del obj Cliente
        Cliente clientes = new Cliente(1108523684, "Viviana");

        // creacion del obj Banco
        Banco banco = new Banco("Avvillas", "Oficina Sur", cuenta);

        System.out.println(banco);

        banco.abrirCuenta(clientes);
    }
}
