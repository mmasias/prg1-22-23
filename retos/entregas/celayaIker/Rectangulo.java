import java.util.Scanner;
public class Rectangulo {
    public static void main( String[] args ) {
        int base, altura, area;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca la base del rectángulo: " );
        base = teclado.nextInt();

        System.out.print( "Introduzca la altura del rectángulo: " );
        altura = teclado.nextInt();

        area = (base * altura);

        System.out.println( "El área es " + area );
        teclado.close();
    }
}
