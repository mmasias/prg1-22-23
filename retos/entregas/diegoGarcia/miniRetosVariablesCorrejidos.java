public class miniRetosVariablesCorrejidos {
    public static void main(String[]args){
        System.out.println("==========================================================================================================================");
        System.out.println("El ejercicio 1 consiste en un programa que dados 2 numeros calcule y muestre el promedio");
        System.out.println("==========================================================================================================================");
        System.out.println("\n");

        double x; double y; double resultado;

        x=10;
        y=0;
        resultado=(x+y)/2;

        System.out.println("El promedio de "+x+" y de "+y+" es igual a "+resultado);

        System.out.println("\n");
        System.out.println("==================================================================================================================================================");
        System.out.println("El ejercicio 2 consiste en un programa que dado el lado de un cuadrado te calcule su área, al igual que la de un rectángulo conociendo base y altura y de un círculo conociendo el radio y pi");
        System.out.println("==================================================================================================================================================");
        System.out.println("\n");
        double lado; double areaCuadrado;
        lado=10;
        areaCuadrado=lado*lado;

        System.out.println("El área del cuadrado de lado "+lado+" es igual a "+areaCuadrado);
        System.out.println("\n");

        double base; double altura; double areaRectangulo;
        base=10;
        altura=20;
        areaRectangulo=base*altura;

        System.out.println("El área del rectandulo de base "+base+" y altura "+altura+" es igual a "+areaRectangulo);
        System.out.println("\n");

        double radio; double pi; double areaCirculo;
        radio=5;
        pi=3.141592;
        areaCirculo=pi*radio*radio;

        System.out.println("El área del circulo de radio "+radio+" es igual a "+areaCirculo);

        System.out.println("\n");
        System.out.println("==========================================================================================================================");
        System.out.println("El ejercicio 3 consiste en un programa que conociendo sus notas (parcial, final, evaluación contínua y evaluación del profesor), calcule su nota final");
        System.out.println("==========================================================================================================================");
        System.out.println("\n");

        double parcial=6;//EXAMEN PARCIAL:25%
        double continua=7;//CONTINUA:20%
        double profesor=10;//EVALUACION PROFESOR 5%
        double examenFinal=4;//EXAMEN FINAL 50%
        double nota;//NOTA FINAL


        nota=parcial*0.25+continua*0.2+profesor*0.05+examenFinal*0.5;

        System.out.println("La nota en este curso de Programacion 1 en la UNEAT es igual a "+nota);
        System.out.println("\n");


        




    }
    
}
