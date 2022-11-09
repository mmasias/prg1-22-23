public class Entrega2  {
    public static void main(String[]args){
     //El Ejercicio 1 consiste en que conocidos dos números, desarrollar un programa que calcule y muestre su promedio
        System.out.println("--------------Ejercicio 1--------------");
        double x, y, promedio;
        x = 27;
        y = 2;

        promedio = (x+y)/2;
        System.out.println("El promedio de estos numeros es " + promedio);
        System.out.println("--------------------------------------");

     //El Ejercicio 2 apartado A consiste en calcular el area de un cuadrado conociendo un lado, tambien el area de un rectangulo conociendo su base y altura, y de un círculo conociendo radio y pi
        System.out.println("--------------Ejercicio 2--------------");
        System.out.println("Apartado a)");
        double l, área; 
        l=10; 
        área= l*l ;
        System.out.println("El área del cuadrado de lado "+l+" es "+área); 
        System.out.println("-----------------------------------------");
        System.out.println("Apartado b)");
        double b, h, arearectangulo;
        b=30;
        h=120;
        arearectangulo=b*h;
        System.out.println("El área del rectangulo de base " +b+ " con altura " +h+  " es " +arearectangulo); 
        System.out.println("---------------------------------------------------------------");
        System.out.println("Apartado c)");
        double r, pi, areadecirculo;
        r=50;
        pi=3.14159265359;
        areadecirculo= r*r*pi;
        System.out.println("El área del circulo de radio " +r+ " es " +areadecirculo);
        System.out.println("-------------------------------------------------------");
     //El ejercicio 3 consiste en que conociendo sus notas (parcial, final, evaluación contínua y evaluación del profesor), calcular su nota final en UNEATLANTICO.
        System.out.println("------------------------Ejercicio 3---------------------------");
        double examenparcial, examenfinal, evaluacioncontinua, evaluaciondelprofesor, notafinal, porcentajeexamenparcial, porcentajeexamenfinal, porcentajeevaluacioncontinua, porcentajeevaluaciondelprofesor;
        porcentajeevaluacioncontinua=0.20;
        porcentajeevaluaciondelprofesor=0.05;
        porcentajeexamenfinal=0.50;
        porcentajeexamenparcial=0.25;
        examenfinal=5;
        examenparcial=1.8;
        evaluacioncontinua=9;
        evaluaciondelprofesor=5;
        notafinal= porcentajeevaluacioncontinua*evaluacioncontinua+porcentajeevaluaciondelprofesor*evaluaciondelprofesor+porcentajeexamenfinal*examenfinal+porcentajeexamenparcial*examenparcial;    
        System.out.println("La nota final de este alumno de UNEATLANTICO es un "+notafinal);
        System.out.println("--------------------------------------------------------------");
    }       
}