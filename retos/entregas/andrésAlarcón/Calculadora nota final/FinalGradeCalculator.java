import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        double finalexam, midtermexam, continuousassessment, teacherevaluation, finalgrade;

        System.out.println("Enter the final exam grade");
        finalexam = lector.nextDouble();
        System.out.println("Enter the midterm exam grade");
        midtermexam = lector.nextDouble();
        System.out.println("Enter the continuous assessment grade");
        continuousassessment = lector.nextDouble();
        System.out.println("Enter the teacher evvaluation grade");
        teacherevaluation = lector.nextDouble();
        finalgrade = finalexam * 0.5 + midtermexam * 0.25 + continuousassessment * 0.2 + teacherevaluation * 0.05;

        System.out.println("The final grade is: "+finalgrade);

        lector.close();
    }
}
