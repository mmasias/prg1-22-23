public class Calculadora {
    public static void main(String[] args){


        double nota1 = 7.2;
        double nota2 = 6.8;
        double promedio;
        double ladoCuadrado = 4;
        double areaCuadrado;
        double baseRectangulo = 4;
        double alturaRectangulo = 8;
        double areaRectangulo;
        double pi = 3.141592;
        double radio = 3;
        double areaCirculo;
        double examenParcial = 8;
        double examenFinal = 7;
        double evaluacionContinua = 9;
        double evaluacionProfesor = 9;
        double notaFinalUneat;




        System.out.println("===========================");
        System.out.println("CALCULO PROMEDIO");
        System.out.println("===========================");
        System.out.println("");

                // PROMEDIO = (NOTA1 + NOTA2) / 2
        promedio = (nota1 * nota2)/2;
        System.out.println("Nota 1: " + nota1 );
        System.out.println("Nota 2: " + nota2 );
        System.out.println("Promedio: " + promedio );




        System.out.println("");
        System.out.println("===========================");
        System.out.println("CALCULO ÁREA");
        System.out.println("===========================");
        System.out.println("");

            // CUADRADO
                // LADO = 4 METROS
                // AREA = LADO * LADO
        areaCuadrado = ladoCuadrado * ladoCuadrado;
        System.out.println("Cuadrado con lado " + ladoCuadrado);
        System.out.println("Area del cuadrado: " + areaCuadrado );




        System.out.println("");

            // RECTANGULO
                // BASE = 4 METROS
                // ALTURA =  8 METROS
                // AREA = BASE * ALTURA
        areaRectangulo = baseRectangulo * alturaRectangulo;
        System.out.println("Rectángulo con base " + baseRectangulo + " y altura " + alturaRectangulo);
        System.out.println("Area del Rectángulo: " + areaRectangulo );






        System.out.println("");

            // CIRCULO
                // RADIO = 3 METROS
                // PI =  3.141592
                // AREA = PI* RADIO^2
        areaCirculo = pi * (radio * radio);
        System.out.println("Círculo con radio " + radio);
        System.out.println("Area del Círculo: " + areaCirculo );







        System.out.println("");
        System.out.println("===========================");
        System.out.println("CALCULO NOTA FINAL UNEAT");
        System.out.println("===========================");
        System.out.println("");

                // EXAMEN PARCIAL = 8
                // EXAMEN FINAL = 7
                // EVALUACION CONTINUA = 9
                // EVALUACION PROFESOR = 9
                // NOTA FINAL = ((EXAMEN PARCIAL * 0.3) + (EXAMEN FINAL * 0.5) + (EVALUACION CONTINUA * 0.1) + (EVALUACION PROFESOR * 0.1)) / 4

        notaFinalUneat = ((examenFinal * 0.5) + (examenParcial * 0.3) + (evaluacionContinua * 0.1) + (evaluacionProfesor * 0.1)) /4;
        System.out.println("Nota examen parcial: " + examenParcial );
        System.out.println("Nota examen final: " + examenFinal );
        System.out.println("Nota evaluacion continua: " + evaluacionContinua );
        System.out.println("Nota evaluacion profesor: " + evaluacionProfesor );
        System.out.println("Nota final: " + notaFinalUneat );
        System.out.println("===========================");



    }
}
