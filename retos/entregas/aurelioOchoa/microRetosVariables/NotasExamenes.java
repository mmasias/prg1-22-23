package microRetosVariables;

import java.util.Scanner;

public class NotasExamenes {


  // Acorta System.out.print y System.out.println
  static void println(Object arg){ System.out.println(arg); }
  static void print(Object arg){ System.out.print(arg); }

  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {

    double 
    examenFinal,
    examenParcial,
    evaluacionContinua, 
    evaluacionProfesor, 
    notaFinal;

    println("Ingrese la nota del examen final");
    examenFinal = input.nextDouble();
    println("Ingrese la nota del examen parcial");
    examenParcial = input.nextDouble();
    println("Ingrese la nota de la evaluación continua");
    evaluacionContinua = input.nextDouble();
    println("Ingrese la nota de la evaluación del profesor");
    evaluacionProfesor = input.nextDouble();

    notaFinal = examenFinal * 0.5 + examenParcial * 0.25 + evaluacionContinua * 0.2 + evaluacionProfesor * 0.05;
    println("Su nota final es: "+notaFinal);

  }
}