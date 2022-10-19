import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        double examen_final, examen_parcial, evaluacion_continua, evaluacion_profesor, nota_final;

        System.out.println("Ingrese la nota del examen final");
        examen_final = lector.nextDouble();
        System.out.println("Ingrese la nota del examen parcial");
        examen_parcial = lector.nextDouble();
        System.out.println("Ingrese la nota de la evaluación continua");
        evaluacion_continua = lector.nextDouble();
        System.out.println("Ingrese la nota de la evaluación del profesor");
        evaluacion_profesor = lector.nextDouble();

        nota_final = examen_final * 0.5 + examen_parcial * 0.25 + evaluacion_continua * 0.2 + evaluacion_profesor * 0.05;

        System.out.println("La nota final es: "+nota_final);

        lector.close();
    }
}
