
import java.util.Scanner;

public class miniRetosVariables {
    public static void main(String[]args){

        System.out.println("\n");
        System.out.println("El ejercicio 1 consiste en un programa que dados 2 numeros calcule y muestre el promedio");
        System.out.println("\n");
        System.out.println("El ejercicio 2 consiste en un programa que dado el lado de un cuadrado te calcule su área, al igual que la de un rectángulo conociendo base y altura y de un círculo conociendo el radio y pi");
        System.out.println("\n");
        System.out.println("El ejercicio 3 consiste en un prigrama que conociendo sus notas (parcial, final, evaluación contínua y evaluación del profesor), calcule su nota final");
        System.out.println("\n");
        Scanner s = new Scanner (System.in);
        System.out.print("Elija el numero de ejercicio 1,2 o 3:");
        int n;
        n = s.nextInt();
        while ((n>3) || (n<1)){

            System.out.print("Numero incorrecto por favor seleccionelo de nuevo:");
            n=s.nextInt();
        }
        if (n==1){
            double x ; double y;
            System.out.print("Di un numero cualquiera: ");
            x = s.nextDouble();
            System.out.print("Di otro numero cualquiera: ");
            y = s.nextDouble();
            System.out.println("El promedio será "+ ejercicio1(x, y));
            
        }
        if (n==2){
            int n2;
            System.out.print("Con que figura deseas operar 1(cuadrado), 2(rectangulo), 3(triangulo):");
            n2=s.nextInt();
            while ((n2>3) || (n2<1)){

                System.out.print("Numero incorrecto por favor seleccionelo de nuevo:");
                n2=s.nextInt();
            }
            if (n2==1){
                double x;
                System.out.print("Elija la medida del lado del cuadrado:");
                x=s.nextDouble();
                System.out.println("El área del cuadrado de lado "+x+" es "+ ejercicio21(x));
            }else if (n2==2){
                double x; double y;
                System.out.print("Elija la medida de la base del rectangulo:");
                x=s.nextDouble();
                System.out.print("Eija la medida de la altura del rectangulo:");
                y=s.nextDouble();
                System.out.println("El área del rectangulo con base "+x+" y altura "+y+" será igual a "+ ejercicio22(x,y));
            }else if (n2==3){
                double r;
                System.out.print("Elija la medida del radio del circulo:");
                r=s.nextDouble();
                System.out.println("El área del circulo con radio "+r+" sera igual a "+ ejercicio23(r));
            }

        }
        if (n==3){
            double p;//EXAMEN PARCIAL:25%
            double c;//CONTINUA:20%
            double pr;//EVALUACION PROFESOR 5%
            double f;//EXAMEN FINAL 50%

            System.out.print("Introduzca su nota de el examen parcial:");
            p=s.nextDouble();
            System.out.print("Introduzca su nota de la evaluación continua:");
            c=s.nextDouble();
            System.out.print("Introduzca su nota de la evaluacion del profesor:");
            pr=s.nextDouble();
            System.out.print("Introduzca su nota de el examen final:");
            f=s.nextDouble();

            System.out.println("\n");
            System.out.println("Su nota media de este curso en la UNEAT es "+ ejercicio3(p, c, pr, f));
        }
        s.close();
    }

    public static double ejercicio1(double x, double y){
        double suma; double resultado;
        suma = x+y;
        resultado = suma/2;
        return resultado;
    }


    public static double ejercicio21(double x){
        double resultado;
        resultado = x*x;
        return resultado;

    }

    public static double ejercicio22(double x, double y){
        double resultado;
        resultado = x*y;
        return resultado;

    }

    public static double ejercicio23(double r){
        double resultado; double pi;
        pi=3.141592;
        resultado = pi*r*r;
        return resultado;

    }

    public static double ejercicio3(double p, double c, double pr, double f){
        double resultado; 
        resultado = p*0.25+c*0.2+pr*0.05+f*0.5;
        return resultado;

    }
}
