import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Final Grade Calculator");

        System.out.println("Input Partial Exam Grade");
        double partialExam = scanner.nextDouble();

        System.out.println("Input Final Exam Grade");
        double finalExam = scanner.nextDouble();

        System.out.println("Input Continous Evaluation Grade");
        double continousEvaluation = scanner.nextDouble();

        System.out.println("Input Teacher Evaluation Grade");
        double teacherEvaluation = scanner.nextDouble();

        double finalGrade = (partialExam * 0.25) + (finalExam * 0.5) + (continousEvaluation * 0.2)
                + (teacherEvaluation * 0.05);

        System.out.println("Final Grade is " + finalGrade);

        scanner.close();
    }
}
