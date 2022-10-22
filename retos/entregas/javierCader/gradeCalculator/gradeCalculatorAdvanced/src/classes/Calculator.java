package classes;

import javax.swing.JOptionPane;

public class Calculator extends JOptionPane {
    public Calculator() {

        double partialExamGrade= Double.parseDouble(JOptionPane.showInputDialog("Input your Partial Exam Grade", "Partial Exam Grade"));

        double finalExamGrade = Double.parseDouble(JOptionPane.showInputDialog("Input your Final Exam Grade", "Final Exam Grade"));

        double continuesEvaluationGrade = Double.parseDouble(JOptionPane.showInputDialog("Input your Continual Evaluation Grade", "Continual Evaluation Grade"));

        double teacherEvaluationGrade = Double.parseDouble(JOptionPane.showInputDialog("Input your teacher Evaluation Grade", "Teacher Evaluation Grade"));

        //double[] grades = {partialExamGrade, finalExamGrade, continuesEvaluationGrade, teacherEvaluationGrade};

        //double[] percentage = {0.25, 0.5, 0.2, 0.05};

        double finalGrade = (partialExamGrade * 0.25) + (finalExamGrade * 0.5) + (continuesEvaluationGrade * 0.2) + (teacherEvaluationGrade * 0.05);

        JOptionPane.showMessageDialog(null, String.format("Your final grade is %f", finalGrade), "Final Grade", JOptionPane.INFORMATION_MESSAGE);

    }
}
