import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double finalExam, midtermExam, continuousAssessment, teacherEvaluation, finalGrade;
        double percentFinalExam, percentMidtermExam, percentContinuousAssessment, percentTeacherEvaluation;

        percentFinalExam = 0.5;
        percentMidtermExam = 0.25;
        percentContinuousAssessment = 0.2;
        percentTeacherEvaluation = 0.05;

        System.out.println("Enter the final exam grade");
        finalExam = lector.nextDouble();
        System.out.println("Enter the midterm exam grade");
        midtermExam = lector.nextDouble();
        System.out.println("Enter the continuous assessment grade");
        continuousAssessment = lector.nextDouble();
        System.out.println("Enter the teacher evaluation grade");
        teacherEvaluation = lector.nextDouble();
        finalGrade = (finalExam * percentFinalExam) + (midtermExam * percentMidtermExam)
                + (continuousAssessment * percentContinuousAssessment) + (teacherEvaluation * percentTeacherEvaluation);

        System.out.println("The final grade is: " + finalGrade);

        lector.close();
    }
}
