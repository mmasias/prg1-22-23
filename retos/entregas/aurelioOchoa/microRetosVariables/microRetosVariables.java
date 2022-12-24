package microRetosVariables;
import java.util.Scanner;

public class microRetosVariables {

  // Acorta System.out.print y System.out.println
  static void println(Object arg){ System.out.println(arg); }
  static void print(Object arg){ System.out.print(arg); }

  static Scanner input = new Scanner(System.in);

  static boolean salir = false;

  public static void main(String[] args) {
    while (!salir){
      switch (eleccionMenu()){
        case 1: areaCuadrado()  ; break;
        case 2: areaRectangulo(); break;
        case 3: areaCirculo()   ; break;
        case 4: salir = true    ; break;
      }
    }
  }

  static int eleccionMenu(){
    println("\n (1) Obtener el area de un cuadrado");
    println(" (2) Obtener el area de un Rectangulo");
    println(" (3) Obtener el area de un circulo");
    println(" (4) Salir");
    print("~ Que deseas Hacer: ");
    int eleccion = input.nextInt();
    return eleccion;
  }

  static void areaCuadrado(){
    print("\n Lado del cuadrado: ");
    int lado = input.nextInt();
    println(" El area del cuadrado es: " + lado * lado);
  }

  static void areaRectangulo(){
    print("\n Base del rectangulo: ");
    int base = input.nextInt();
    print(" Altura del rectangulo: ");
    int altura = input.nextInt();
    println(" El area del cuadrado es: " + base * altura);  }

  static void areaCirculo(){
    double pi = 3.141592;
    print("\n Radio del circulo: ");
    int radio = input.nextInt();
    println(" El area del circulo es: " + pi * (radio*radio));
  }


}
