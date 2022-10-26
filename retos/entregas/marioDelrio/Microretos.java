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
        double lado, areaCuadrado;

        lado = 5;
        areaCuadrado = lado * lado;

        System.out.println("El Area del cuadrado de lado 5 es: "+ areaCuadrado);
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
        double examenParcial, porcentajeExamenParcial, examenFinal, porcentajeExamenFinal, evaluacionContinua, porcentajeEvaluacionContinua, evaluaciondelProfesor, porcentajeEvaluaciondelProfesor, notaFinal;
        
        examenParcial = 5;
        porcentajeExamenParcial = 0.25;
        examenFinal = 4;
        porcentajeExamenFinal = 0.5;
        evaluacionContinua = 8;
        porcentajeEvaluacionContinua= 0.2;
        evaluaciondelProfesor = 7.5;
        porcentajeEvaluaciondelProfesor = 0.05;
        notaFinal = (examenParcial*porcentajeExamenParcial)+(examenFinal*porcentajeExamenFinal)+(evaluacionContinua*porcentajeEvaluacionContinua)+(evaluaciondelProfesor*porcentajeEvaluaciondelProfesor);
        
        System.out.println("Tu nota final teniendo un "+ examenParcial +" , un "+ examenFinal +" en el examen final, un "+ evaluacionContinua +" en la evaluacion continua y un "+ evaluaciondelProfesor +" en la evaluacion del profesor es: "+ notaFinal);
        System.out.println("\n");
        


        







        
    }
}
