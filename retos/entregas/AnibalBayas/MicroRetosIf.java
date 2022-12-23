import java.util.Scanner;

public class MicroRetosIf {
 
    //Lanzamiento de moneda al aire
    

    public static void main(String[] args){
        
        
        System.out.println("Vamos a lanzar una moneda al aire...");
        System.out.println("¡¡¡¡¡¡Lanzaaamooossss!!!!!!");
        System.out.println("");
        System.out.println("");
        int moneda = (int) (Math.random()*2);
        if (moneda == 1) {
            System.out.println("¡¡¡Ha salido cara!!!");

        } else if  (moneda == 0) {
            System.out.println("¡¡¡Ojooo salió cruz!!!");
        }
        
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        double  dividendo, divisor, resultado;
        System.out.println("Vamos a hacer una división");
        
       
       System.out.println("Dime un dividendo");
        dividendo= entrada.nextDouble();
        System.out.println("Dime un divisor");
        divisor= entrada.nextDouble();
        resultado = (dividendo/divisor);
        System.out.println("El resultado es "+ resultado);
        if (divisor == 0){
            System.out.println("No se puede dividir entre 0");

        }
      System.out.println("---------------------------------------------------------------------------------------------------");
      System.out.println("Vamos a hacer una ecuación de segundo grado");
      
      double coeficienteCuadratico, coeficientelineal, independiente, ecuacioncuadraticapositivos, ecuacioncuadraticanegativos, raiz;
      System.out.print("Escribir coeficiente cuadratico: ");
      coeficienteCuadratico = entrada.nextDouble();
      System.out.println();
      System.out.println();
      System.out.print("Escribir coeficiente linea: ");
      coeficientelineal = entrada.nextDouble();
      System.out.println();
      System.out.println();
      System.out.print("Escribir termino independiente: ");
      independiente = entrada.nextDouble();
      System.out.println();
      System.out.println();

      raiz = Math.sqrt(Math.pow(coeficientelineal, 2)-4 * coeficienteCuadratico * independiente);
      ecuacioncuadraticapositivos = (-coeficientelineal + raiz)/(2*coeficienteCuadratico);
      ecuacioncuadraticanegativos = (-coeficientelineal - raiz)/(2*coeficienteCuadratico);
      System.out.println("En la ecuacion "+ coeficienteCuadratico +"x^2 + "+ coeficientelineal +"x + "+ independiente +" concluimos que su raiz positiva es igual a "+ ecuacioncuadraticapositivos +" y que su raiz negativa es igual a "+ ecuacioncuadraticanegativos);
      entrada.close();
  }



    
}
