import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        double finalExam, midtermExam, continuousAssessment, teacherEvaluation, finalGrade;

        System.out.println("Enter the final exam grade");
        finalExam = lector.nextDouble();
        System.out.println("Enter the midterm exam grade");
        midtermExam = lector.nextDouble();
        System.out.println("Enter the continuous assessment grade");
        continuousAssessment = lector.nextDouble();
        System.out.println("Enter the teacher evvaluation grade");
        teacherEvaluation = lector.nextDouble();
        finalGrade = finalExam * 0.5 + midtermExam * 0.25 + continuousAssessment * 0.2 + teacherEvaluation * 0.05;

        System.out.println("The final grade is: "+finalGrade);

        lector.close();
    }
}
