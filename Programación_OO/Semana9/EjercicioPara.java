package Programación_OO.Semana9;

public class EjercicioPara {
    public static void main(String[] args) {
        int count = 10;
        do
        {
            System.out.println(count +" ");
            count = count - 1;
        }
        while (count >= 5);


        int[] array = {1, 4, 3, 6, 8, 2, 5};
        int what = array[0];

        for (int index=0; index < array.length; index++)
        {
            if ( array[ index ] > what )
            what = array[ index ];

        }
        System.out.println( what );
    }
}
