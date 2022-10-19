public class App {
    public static void main(String[] args) throws Exception {

        double parcial = 8.5;
        double finalExam = 6;
        double evaluacionContinua = 5;
        double evaluacionProfesor = 4.5;

        double finalNote = (parcial * 0.2) + (finalExam * 0.5) + (evaluacionContinua * 0.2)
                + (evaluacionProfesor * 0.1);

        System.out.println("Su nota final es" + finalNote);
    }
}
