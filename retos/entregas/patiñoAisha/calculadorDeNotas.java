public class calculadorDeNotas {
    public static void main(String[] args){

        int parcial = 8;
        int evaluacionContinua = 10;
        int examen = 9;
        int opinion = 10;

        double notaFinal = (examen * .5) + (parcial * .2) + (evaluacionContinua * .2) + (opinion*.1);

        System.out.print("Tu nota final es: " + notaFinal);
    }
}
