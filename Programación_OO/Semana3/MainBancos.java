public class MainBancos {

    public static void main(String[] args) {
        
        Banco objBanco1 = new Banco(2000.0, "Maria Angulo", 523700, "Ahorros");
        Banco objBanco2 = new Banco(3500.0, "Pilar Angulo", 319012, "Corriente");

        System.out.println(objBanco1.toString());
        System.out.println(objBanco1.consignacion(1500.2));
        System.out.println(objBanco2.toString());
        System.out.println(objBanco2.retiro(700.3));
    }
    
}
