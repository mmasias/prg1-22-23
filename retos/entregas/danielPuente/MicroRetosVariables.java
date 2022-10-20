public class MicroRetosVariables{

    public static void main(String[]args){
        System.out.println("");
        System.out.println("Ejercicio 1: Conocidos dos números, desarrolle un programa que calcule y muestre su promedio");
        System.out.println("");
        double a; double b; double respuesta;
        a=15;
        b=25;
        respuesta=(a+b)/2;
        System.out.println("El promedio del ejercicio es " +respuesta);
        System.out.println("");
        System.out.println("Ejercicio 2:Desarrolle programas que permitan calcular el área");
        System.out.println("");
        System.out.println("Calcule el área de un cuadrado");
        System.out.println("");
        double lado; double ÁreaDelCuadrado;
        lado=5;
        ÁreaDelCuadrado=(lado*lado);
        System.out.println("El área del cuadrado es " +ÁreaDelCuadrado);
        System.out.println("");
        System.out.println("Calcule el área de un rectángulo");
        System.out.println("");
        double base; double altura; double ÁreaDelRectángulo;
        base=25;
        altura=5;
        ÁreaDelRectángulo=(base*altura);
        System.out.println("");
        System.out.println("El área del rectángulo es " +ÁreaDelRectángulo);
        System.out.println("");
        System.out.println("Calcule el área de un círculo");
        System.out.println("");
        double pi;double radio; double ÁreaDelCírculo;
        pi=3.141592;
        radio=5;
        ÁreaDelCírculo=(pi*(radio*radio));
        System.out.println("");
        System.out.println("El área del círculo es " +ÁreaDelCírculo);
        System.out.println("");
        System.out.println("Ejercicio 3:Desarrolle un programa que, conociendo sus notas (parcial, final, evaluación contínua y evaluación del profesor), calcule su nota final en UNEATLANTICO");
        System.out.println("");
        double parcial ;double examen; double contínua; double profesor;double NotaFinal;
        parcial=5;
        examen=7;
        contínua=5;
        profesor=10;
        NotaFinal=(parcial*0.25+examen*0.5+contínua*0.2+profesor*0.05);
        System.out.println("La nota final en UNEATLÁNTICO es " +NotaFinal);
    }
}
