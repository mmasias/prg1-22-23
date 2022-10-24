public class cuadrado {

    public static void main(String[] args) {

        int lado;
        int area;

        lado = 5;
        area = lado * lado;

        System.out.println("Area: " + area);
    }
}
public class Circulo {

    public static void main(String[] args) {

        float pi, radio, area;

        pi = 3.141592;
        radio = 5;

        area = pi * radio * radio;

        System.out.println("El area del circulo es: " + area)
    }
}
public class triangulo {

    public static void main(String[] args) {

        int altura;
        int base;
        int area;

        altura = 5;
        base = 10;
        area = base * altura/2;

        System.out.println("El area del triangulo es: " + area)
    }
}
