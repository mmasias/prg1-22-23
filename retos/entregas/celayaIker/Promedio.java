import java.util.Scanner;

public class Promedio {
    public static void main( String[] args ) {
        int n1, n2, promedio;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = teclado.nextInt();

        promedio = (n1 + n2)/2;

        System.out.println( "El promedio es " + promedio );
        teclado.close();
    }
}
