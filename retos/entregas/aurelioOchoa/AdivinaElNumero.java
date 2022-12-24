import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
  public static void main(String[] args) {
    // Crea una instancia de la clase Random para generar el número a adivinar
    Random rand = new Random();
    int numeroAdivinar = rand.nextInt(100) + 1;

    // Crea una instancia de la clase Scanner para leer los números que introduce el usuario
    Scanner scanner = new Scanner(System.in);

    // Inicializa la variable que llevará la cuenta de intentos
    int intentos = 0;
    int vecesCaliente = 0; // Inicializamos la variable que lleva la cuenta de veces caliente en 0

    System.out.println("");
    System.out.println("~ Bienvenido al juego del Adivino ~");

    // Bucle que se ejecuta mientras el usuario no haya adivinado el número y no haya superado el límite de intentos
    while (intentos < 5) {
      // Incrementa el contador de intentos
      intentos++;
      
      // Pide al usuario que introduzca un número
      System.out.println("");
      System.out.println("Intento["+intentos+"] ");
      System.out.print("Introduce un número: ");
      int numeroPropuesto = scanner.nextInt();

      // Calculamos la diferencia entre los números y se imprime la psita avanzada
      int diferencia = Math.abs(numeroAdivinar - numeroPropuesto);
      if (diferencia <= 5) {
        vecesCaliente++; // Incrementamos la variable que lleva la cuenta de veces caliente
        if (vecesCaliente >= 2) { // Si el usuario ha adivinado "Caliente" dos veces seguidas
          vecesCaliente = 0; // Reiniciamos la variable que lleva la cuenta de veces caliente
          numeroAdivinar = numeroAdivinar + (int)(Math.random() * ((5 - 1) + 1)) + 1; // Modificamos el número pensado aleatoriamente entre 1 y 5
          System.out.println("¡Achus!"); // Indicamos que el ordenador ha trampa
          if (numeroAdivinar > 100) { // Si el número pensado excede los límites (mayor a 100), lo ajustamos
            numeroAdivinar = 100;
          }
          if (numeroAdivinar < 1) { // Si el número pensado excede los límites (menor a 1), lo ajustamos
            numeroAdivinar = 1;
          }
        }
        System.out.println("Pista Avanzada: Caliente");
      }
      else if (diferencia <= 10) {
        vecesCaliente = 0; // Reiniciamos la variable que lleva la cuenta de veces caliente
        System.out.println("Pista Avanzada: Tibio");
      } else {
        vecesCaliente = 0; // Reiniciamos la variable que lleva la cuenta de veces caliente
        System.out.println("Pista Avanzada: Frio");
      }

      // Comprueba si el número introducido es mayor, menor o igual al número a adivinar
      if (numeroPropuesto > numeroAdivinar) {
        System.out.println("Pista: Es menor");
      } else if (numeroPropuesto < numeroAdivinar) {
        System.out.println("Pista: Es mayor");
      } else {
        // Si el número es igual, se sale del bucle y se muestra el mensaje de victoria
        System.out.println("");
        System.out.println("¡Has adivinado el número en el intento " + numeroAdivinar + "!");
        break;
      }
    }

    // Si se ha superado el límite de intentos, se muestra un mensaje de derrota
    if (intentos == 5) {
      System.out.println("");
      System.out.println("Lo siento, has agotado tus oportunidades. El número era " + numeroAdivinar);
    }
  }
}
