import java.util.Scanner;
public class Cuadrado {
    public static void main( String[] args ) {
        int lado, area;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca el lado del cuadrado: " );
        lado = teclado.nextInt();

        area = (lado * lado);

        System.out.println( "El área es " + area );
    }
}
