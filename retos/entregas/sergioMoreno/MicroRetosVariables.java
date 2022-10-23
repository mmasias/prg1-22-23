import java.util.Scanner;

public class MicroRetosVariables {
    public static void main(String[]args){

        //Ejercicio 1:
        System.out.println("Ejercicio 1 (dados 2 numeros calcule y muestre el promedio)");
        System.out.println("\n");
        
        double numero1;
        double numero2;
        double resultado;

        numero1=5;
        numero2=10;
        resultado=(numero1+numero2)/2;

        System.out.println("El promedio de " + numero1 + " y de " + numero2 + " es " + resultado); 
        System.out.println("\n");

        //Ejercicio 2:
        System.out.println("Ejercicio 2 (Area Cuadrado)");
        System.out.println("\n");

        double lado;
        double areaCuadrado;

        lado=3;
        areaCuadrado=lado*lado;

        System.out.println("El area del cuadrado es " + areaCuadrado);
        System.out.println("\n");

        //Ejercicio 3:
        System.out.println("Ejercicio 3 (Rectangulo)");
        System.out.println("\n");

        double base;
        double altura;
        double areaRectangulo;

        base=18;
        altura=8;
        areaRectangulo=base*altura;

        System.out.println("El area del rectangulo es " + areaRectangulo);
        System.out.println("\n");

        //Ejercicio 4:
        System.out.println("Ejercicio 4 (Circulo)");
        System.out.println("\n");

        double radio;
        double pi;
        double areaCirculo;

        radio=7;
        pi=3.141592;
        areaCirculo=radio*pi*radio;

        System.out.println("El area del circulo es " + areaCirculo);
        System.out.println("\n");

        //Ejercicio 5:
        System.out.println("Ejercicio 5 (Notas parcial, final, evaluacion continua y evaluacion del profesor, y calcular nota final");
        System.out.println("\n");

        double parcial; //25%
        double continua; //20%
        double profesor; //5%
        double examenFinal; //50%
        double nota;

        parcial=5;
        continua=2;
        profesor=7;
        examenFinal=4.5;

        nota=parcial*0.5+continua*0.2+profesor*0.05+examenFinal*0.5;

        System.out.println("La nota es " + nota);

    }
}