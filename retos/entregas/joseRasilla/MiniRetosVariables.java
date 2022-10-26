public class MiniRetosVariables {

    public static void main(String[] args) {

        /* Ejercicio 1 - Calculadora de promedios */
        double nota1, nota2, media;

        nota1 = 8;
        nota2 = 7;

        media = (nota1 + nota2) / 2;

        System.out.println("En el primer examen obtuvo una nota de: " + nota1);
        System.out.println("En el segundo examen obtuvo una nota de: " + nota2);

        System.out.println("La nota media es: " + media);
        System.out.println("\n");

        
        /* Ejercicio 2 - Area de un cuadrado */
        double lado, areaCuadrado;

        lado = 3;
        areaCuadrado = lado * lado;

        System.out.println("El area del cuadrado de lado " + lado + " es: " + areaCuadrado);
        System.out.println("\n");
        

        /* Ejercicio 3 - Area de un rectangulo */
        double base, altura, areaRectangulo;

        base = 2;
        altura = 5;

        areaRectangulo = base * altura;

        System.out.println("El area del rectangulo de base " + base + " y  altura " + altura + " es: " + areaRectangulo);
        System.out.println("\n");
        

        /* Ejercicio 4 - Area de un circulo */
        double radio, areaCirculo;

        radio = 1.5;

        areaCirculo = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo de radio " + radio + " es: " + areaCirculo);
        System.out.println("\n");


        /* Ejercicio 5 - Nota final */
        double notaParcial, percParcial, notaFinal, percFinal, notaEvCont, percCont, notaEvProf, percProf, notaCurso;

        notaParcial = 9.75;
        notaFinal = 9.25;
        notaEvCont = 9;
        notaEvProf = 10;

        percParcial = 0.25;
        percFinal = 0.5;
        percCont = 0.2;
        percProf = 0.05;

        notaCurso = notaParcial*percParcial + notaFinal*percFinal + notaEvCont*percCont + notaEvProf*percProf;

        System.out.println("La nota final del curso es: " + notaCurso);
        System.out.println("\n");
    }

}
