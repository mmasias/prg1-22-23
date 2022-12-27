import java.util.Scanner;

public class retoWML {

  static Scanner input = new Scanner(System.in);

  static void println(Object arg){ System.out.println(arg); }
  static void print(Object arg){ System.out.print(arg); }

  static int turno;
  static int aciertos;
  static int statusTurno;
  static int posicionGolpe;
  static int posicionMonigote1;
  static int posicionMonigote2;

  static final int dimension = 4;

  static final String BORDE_HORIZONTAL = "+" + "-".repeat(dimension * 7) + "+";
  static final String BORDE_VERTICAL   = "|";
  static final String AGUJERO          = " (  ) " ;
  static final String AGUJERO_MONIGOTE = " (‘’) ";
  static final String AGUJERO_GOLPEADO = " [[]] ";
  static final String AGUJERO_GOLPEADO_MONIGOTE = " [**] ";

  public static void main(String[] args) {
    introduccion();
    while (turno < 15){
      simulacionposicionGolpe();
      imprimirArcade();
      imprimirStatus();
    }
    println("El juego ha terminado! Has acertado "+ aciertos +" veces");
    println("");
  }

  public static void introduccion(){
    println("");
    println("~ Bienvenido a Whac A Mole ~");
  }

  public static void simulacionposicionGolpe(){
    turno++;

    do {
      println("");
      print("Golpe (entre 1 y 16): ");
      posicionGolpe = input.nextInt();
    } while (posicionGolpe < 1 || posicionGolpe > 16 );

    do {
      posicionMonigote1 = 1 + (int)(Math.random() * 16);
      posicionMonigote2 = 1 + (int)(Math.random() * 16);
    } while (posicionMonigote1 == posicionMonigote2);

    if (posicionGolpe == posicionMonigote1 || posicionGolpe == posicionMonigote2){
      aciertos += 1;
      statusTurno = 0;
    } else {
      statusTurno = 1;
    }
  }

  public static void imprimirArcade () {
    println("=".repeat(30));
    println("Golpe en ["+ posicionGolpe +"] / Monigote 1 en ["+ posicionMonigote1 +"] / Monigote 2 en ["+ posicionMonigote2 +"]");

    int numeroAgujero = 0;

    println(BORDE_HORIZONTAL);
    for (int y = 1; y <= dimension; y = y + 1) {
      print(BORDE_VERTICAL + "  ");
      for (int x = 1; x <= dimension; x = x + 1) {
        numeroAgujero++;
        if (numeroAgujero == posicionGolpe && (posicionGolpe == posicionMonigote1 || posicionGolpe == posicionMonigote2)){
          print(AGUJERO_GOLPEADO_MONIGOTE);
        } else if (numeroAgujero == posicionMonigote1 || numeroAgujero == posicionMonigote2){
          print(AGUJERO_MONIGOTE);
        } else if (numeroAgujero == posicionGolpe) {
          print(AGUJERO_GOLPEADO);
        } else {
          print(AGUJERO);
        }
      }
      println("  " + BORDE_VERTICAL);
    }
    println(BORDE_HORIZONTAL);
  }

  public static void imprimirStatus () {
    String status = "Turno: ["+ turno +"] / Aciertos: ["+ aciertos +"]";
    String statusGolpe[] = { "[ACIERTO]", "[FALLO]" };
    println(status);
    println(statusGolpe[statusTurno]);
    println("=".repeat(30));
  }
}