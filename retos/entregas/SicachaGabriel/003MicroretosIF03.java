import java.util.Scanner;

public class Ecuacion {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int Na;
        int Nb;
        int Nc;
        double X1;
        double X2;
        System.out.println("Introdusca el coeficiente a de la ecuacion ax^2 + bx + c = 0");
        Na = entrada.nextInt();
        if (Na == 0){
            System.out.println("el coeficiente a no puede ser 0");
        } else {
            System.out.println("Introdusca el coeficiente b de la ecuacion ax^2 + bx + c = 0");
            Nb = entrada.nextInt();
            System.out.println("Introdusca el coeficiente b de la ecuacion ax^2 + bx + c = 0");
            Nc = entrada.nextInt();
            X1 = ((-Nb+(Math.sqrt((Nb*Nb)-(4*Na*Nc))))/2*Na);
            X2 = ((-Nb-(Math.sqrt((Nb*Nb)-(4*Na*Nc))))/2*Na);
            System.out.println("El valor de las raices es: X1 = "+ X1 + "; X2 = " + X2);
        }

        entrada.close();
    }
}
