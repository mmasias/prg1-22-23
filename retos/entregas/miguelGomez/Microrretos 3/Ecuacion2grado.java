import java.util.Scanner;

public class Ecuacion2grado{
    public static void main (String Args[]){
        
    Scanner entrada = new Scanner(System.in);
    System.out.println("Dime el coeficiente de la x al cuadrado: ");
    int Coeficiente1 = entrada.nextInt();

    System.out.println("Dime el coeficiente de la x: ");
    int Coeficiente2 = entrada.nextInt();

    System.out.println("Dime el término independiente: ");
    int Coeficiente3 = entrada.nextInt();

    if ((Coeficiente2 * Coeficiente2) - (4 * Coeficiente1 * Coeficiente3) < 0 ) { 
        System.out.println("no existen soluciones ya que la raiz b al cuadrado menos 4ac da negativo");

        }
    else {
        System.out.println("Una de las raices es " + ((0-Coeficiente2) + Math.sqrt((Coeficiente2 * Coeficiente2) - (4 * Coeficiente1 * Coeficiente3)))/(2*Coeficiente1));
        System.out.println("La otra raiz es" + ((0-Coeficiente2) - Math.sqrt((Coeficiente2 * Coeficiente2) - (4 * Coeficiente1 * Coeficiente3)))/(2*Coeficiente1));

        entrada.close();
        }
    }
}