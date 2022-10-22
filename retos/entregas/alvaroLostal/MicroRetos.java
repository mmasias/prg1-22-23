public class MicroRetos {
    public static void main(String[] args){
        double a, b, promedio;
        a = 7;
        b = 9;
        promedio = (a+b)/2;
        System.out.println("El promedio entre los dos numeros es: " + promedio);
        System.out.println("-------------------------");

        double lado1, lado2, areaCuadrado;
        lado1 = 3;
        lado2 = 4;
        areaCuadrado = lado1*lado2;
        System.out.println("El area del cuadrado es: " + areaCuadrado);

        double base, altura, areaTriangulo;
        base = 7;
        altura = 5;
        areaTriangulo = base*altura;
        System.out.println("El area del triangulo es: " + areaTriangulo);

        double pi, radio, areaCirculo;
        pi = 3.141592;
        radio = 7;
        areaCirculo = pi*radio*radio;
        System.out.println("El area del circulo es: " + areaCirculo);
        System.out.println("-------------------------");

        double parcial, evFinal, evContinua, evProfesor, porcentajeParcial, porcentajeEvFinal, porcentajeEvContinua, porcentajeEvProfesor, notaFinal;
        parcial = 8;
        evFinal = 6;
        evContinua = 8.5;
        evProfesor = 7;
        porcentajeParcial = 0.25;
        porcentajeEvFinal = 0.5;
        porcentajeEvContinua = 0.2;
        porcentajeEvProfesor = 0.05;
        notaFinal = (parcial*porcentajeParcial)+(evFinal*porcentajeEvFinal)+(evContinua*porcentajeEvContinua)+(evProfesor*porcentajeEvProfesor);
        System.out.println("La nota final es: " + notaFinal);

    }
}
