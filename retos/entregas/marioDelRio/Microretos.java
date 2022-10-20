public class Microretos{
    public static void main(String[]args){
        System.out.println("\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ejercicio 1");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        //consiste en sacar el promedio de dos numeros
        System.out.println("\n");
        double num1, num2, promedio;

        num1 = 8;
        num2 = 7;
        promedio = (num1+num2)/2;

        System.out.println("El promedio de los numeros "+ num1 +" y "+ num2 +" es: "+ promedio);

        System.out.println("\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ejercicio 2");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        //consiste en sacar el area del cuadrado, rectangulo y circulo
        System.out.println("\n");
        double lado, Areacuadrado;

        lado = 5;
        Areacuadrado = lado*lado;

        System.out.println("El Area del cuadrado de lado 5 es: "+ Areacuadrado);
        System.out.println("\n");
        double base, altura, Arearectangulo;

        base = 5;
        altura = 10;
        Arearectangulo = base*altura;

        System.out.println("El Area del rectangulo de base 5 y altura 10 es: "+ Arearectangulo);

        System.out.println("\n");
        double radio, pi, Areacirculo;

        radio = 9;
        pi = 3.141592;
        Areacirculo = pi*(radio*radio);

        System.out.println("El Area del rectangulo de radio 9 es: "+ Areacirculo);
        System.out.println("\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ejercicio 3");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        //consiste en sacar tu nota final teniendo las notas de los examenes parciales,final y de las evaluaciones continuas y del profesor
        System.out.println("\n");
        double examenparcial, porcentajeexamenparcial, examenfinal, porcentajeexamenfinal, evaluacioncontinua, porcentajeevaluacioncontinua, evaluaciondelprofesor, porcentajeevaluaciondelprofesor, notafinal;
        
        examenparcial = 5;
        porcentajeexamenparcial = 0.25;
        examenfinal = 4;
        porcentajeexamenfinal = 0.5;
        evaluacioncontinua = 8;
        porcentajeevaluacioncontinua= 0.2;
        evaluaciondelprofesor = 7.5;
        porcentajeevaluaciondelprofesor = 0.05;
        notafinal = (examenparcial*porcentajeexamenparcial)+(examenfinal*porcentajeexamenfinal)+(evaluacioncontinua*porcentajeevaluacioncontinua)+(evaluaciondelprofesor*porcentajeevaluaciondelprofesor);
        
        System.out.println("Tu nota final teniendo un "+ examenparcial +" , un "+ examenfinal +" en el examen final, un "+ evaluacioncontinua +" en la evaluacion continua y un "+ evaluaciondelprofesor +" en la evaluacion del profesor es: "+ notafinal);
        System.out.println("\n");
        


        







        
    }
}
