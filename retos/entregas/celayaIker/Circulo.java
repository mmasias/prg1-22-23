import java.util.Scanner;
public class Circulo {
    public static void main( String[] args ) {
        
        int radio;
        double area;
        double Pi;

        Pi = 3.141592;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca el radio del círculo: " );
        radio = teclado.nextInt();

        area = Pi * (radio^2);

        System.out.println( "El área es " + area );
        teclado.close();
    }
}
