import java.util.Scanner;

public class ifMicroRetos{
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Ej 1:Escriba un programa que simule el lanzamiento de una moneda y nos diga al ejecutarse si ha salido cara o cruz.");
        System.out.println("");
        int ladoAlAzar;
        String lado;
        ladoAlAzar=(int)(Math.random()*2);
        if(ladoAlAzar==0){
            lado="Cara";
        }else{
            lado="Cruz";
        }
        System.out.println("Ha salido "+ lado);
        System.out.println("");
        System.out.println("Ej 2:Escriba un programa que pregunte dos números al usuario y realice la división de dos números, siempre y cuando el usuario no pida dividir por cero.");
        System.out.println("");
        Scanner g = new Scanner(System.in);
        double número,divisor,resultado;
        System.out.println("Escribe un numero");
        número=g.nextDouble();
        System.out.println("Escribe un divisor");
        divisor=g.nextDouble();
        System.out.println("");
        if(divisor==0){
            System.out.println("Indivisible");
        }else{
            resultado=número/divisor;
            System.out.println("La solución del ejercicio es"+resultado);
        }
        System.out.println("");
        System.out.println("Ej 3:Escriba un programa que pregunte al usuario los coeficientes y calcule las raíces de una ecuación de segundo grado ax^2 + bx + c = 0.");
        System.out.println("");
        double coeficienteA,raíz,coeficienteB,terminoC,ecuacionpositiva,ecuacionnegativa;

        System.out.println("Escribe el término independiente");
        terminoC=g.nextDouble();
        System.out.println("Escribe ellcoeficiente lineal");
        coeficienteA=g.nextDouble();
        System.out.println("Escribe el coeficiente cuadrático");
        coeficienteB=g.nextDouble();
        raíz=Math.sqrt(Math.pow(coeficienteB, 2)-4*coeficienteA*terminoC);
        ecuacionpositiva=(-coeficienteB+raíz)/(2*coeficienteA);
        ecuacionnegativa=(-coeficienteB-raíz)/(2*coeficienteA);
        System.out.println("La ecuación "+coeficienteA+"x^2+"+coeficienteB+"x+"+terminoC+" tiene como raíz "+ecuacionnegativa+" y "+ecuacionpositiva+"");
        g.close();
    }
}