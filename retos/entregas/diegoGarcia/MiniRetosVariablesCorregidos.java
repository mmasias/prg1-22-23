public class MiniRetosVariablesCorregidos {
    public static void main(String[]args){
        System.out.println("==========================================================================================================================");
        System.out.println("El ejercicio 1 consiste en un programa que dados 2 numeros calcule y muestre el promedio");
        System.out.println("==========================================================================================================================");
        System.out.println("\n");

        double valor1, valor2, promedio;

        valor1 = 10;
        valor2 = 0;
        promedio=(valor1 + valor2) / 2;

        System.out.println("El promedio de "+ valor1 +" y de "+ valor2 +" es igual a "+ promedio);

        System.out.println("\n");
        System.out.println("==================================================================================================================================================");
        System.out.println("El ejercicio 2 consiste en un programa que dado el lado de un cuadrado te calcule su área, al igual que la de un rectángulo conociendo base y altura y de un círculo conociendo el radio y pi");
        System.out.println("==================================================================================================================================================");
        System.out.println("\n");

        double lado, areaCuadrado;
        lado = 10;
        areaCuadrado = lado * lado;
        
        System.out.println("El área del cuadrado de lado "+ lado +" es igual a "+ areaCuadrado);
        System.out.println("\n");

        double base, altura, areaRectangulo;
        base = 10;
        altura = 20;
        areaRectangulo = base * altura;

        System.out.println("El área del rectandulo de base "+ base +" y altura "+ altura +" es igual a "+ areaRectangulo);
        System.out.println("\n");

        double radio, pi, areaCirculo;
        radio = 5;
        pi = 3.141592;
        areaCirculo = pi * radio * radio;

        System.out.println("El área del circulo de radio "+ radio +" es igual a "+ areaCirculo);

        System.out.println("\n");
        System.out.println("==========================================================================================================================");
        System.out.println("El ejercicio 3 consiste en un programa que conociendo sus notas (parcial, final, evaluación contínua y evaluación del profesor), calcule su nota final");
        System.out.println("==========================================================================================================================");
        System.out.println("\n");

        double parcial = 6;
        double continua = 7;
        double profesor = 10;
        double examenFinal = 4;
        double nota;                        //NOTA FINAL
        double porcentajeParcial = 0.25;
        double porcentajeContinua = 0.20;
        double porcentajeProfesor = 0.05;
        double porcentajeExamenFinal = 0.5;

        nota = parcial * porcentajeParcial + continua * porcentajeContinua + profesor * porcentajeProfesor + examenFinal * porcentajeExamenFinal;

        System.out.println("La nota en este curso de Programacion 1 en la UNEAT es igual a "+ nota);
        System.out.println("\n");


        




    }
}
