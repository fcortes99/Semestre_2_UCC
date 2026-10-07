public class Arreglos {
    public static void main(String[] args) {
    int [] a = {6, 5, 9, 1, 8, 3, 2};
    int length = a.length;
        // mostrar el arreglo
    for (int i = 0; i < length; i++) {
        System.out.println("a[" + i + "] = " + a[i]);
    }

    int suma = 0;
    for (int i = 0; i < length; i++) {
        suma += a[i];
    }
    System.out.println("La suma del Arreglo es: " + suma);
}
}
