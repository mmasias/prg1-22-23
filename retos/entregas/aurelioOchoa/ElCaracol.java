
public class ElCaracol {

  // Acorta System.out.print y System.out.println porque me da pereza
  static void print(Object arg){ System.out.print(arg); }
  static void println(Object arg){ System.out.println(arg); }

  // Graficos
  static final String BORDE_SUPERIOR_COCHE = "[][]    O-=-O   [][]"; 
  static final String BORDE_SUPERIOR = "[][]            [][]";
  static final String PARED_DEL_POZO = "  [].:.:.:.:.:.:[]  ";
  static final String PARED_CARACOL  = "  []   _@)_/’   []  ";
  static final String PARED_CON_AGUA = "  []~~~~~~~~~~~~[]  ";
  static final String BORDE_INFERIOR = "  [][][][][][][][]  ";    

  // Variables globales
  static int dia;
  static int climaDia;
  static int nivelDeAgua;
  static int bajadaCaracol;
  static int subidaCaracol;
  static boolean caracolEnPozo  = true;
  static boolean pasaCoche = false;
  static final int profundidadTotal = 20;
  static int profundidadCaracol = 10 + (int)(Math.random() * 11);
  
  // Funcion principal
  public static void main(String[] args){
    introduccion();
    while (caracolEnPozo) {
      simulacionDia();
      if (caracolEnPozo){
        imprimirStatus();
        imprimirPozo();
      } else {
        break;
      }
    };
  }

  // Introduccion al juego
  static void introduccion(){
    println("");
    println("~ Bienvenido a la historia del caracol ~");
    println("");
    println("Un caracol esta andando por en medio de una calle.");
    println("El despistado caracol ha caido en el pozo y ha atterizado a "+ profundidadCaracol +" de la salida!");
    println("");
  }
 
  // Imprime los datos viaje del caracol
  static void imprimirStatus(){
    String statusClima[] = {  "Llueve muy fuerte(+5 agua)! ", "Lueve(+2 agua)! ", "Hace buen clima!" };
    String status = "Día ["+ dia +"] / Sube: ["+ subidaCaracol +"] / Baja: ["+ bajadaCaracol +"] / Altura al final del día: ["+ profundidadCaracol +"]";
    if (pasaCoche) {
      print("Pasa un coche(-2 metros)! ");
    }
    println(statusClima[climaDia]);
    println(status);
  }
 
  // Imprime el pozo, el nivel del agua y la posicion del caracol
  static void imprimirPozo(){
 
    String queImprimir;
    
    if (pasaCoche) {
      println(BORDE_SUPERIOR_COCHE);
    } else {
      println(BORDE_SUPERIOR);
    }

    for (int profundidad = 1; profundidad <= profundidadTotal; profundidad++){
      if (profundidad == profundidadCaracol) {
        queImprimir = PARED_CARACOL;
      } else {
        if (profundidad > profundidadTotal - nivelDeAgua) {
          queImprimir = PARED_CON_AGUA;
        } else {
          queImprimir = PARED_DEL_POZO;
        }
      }
      println(queImprimir + " __ " + profundidad);
    }

    println(BORDE_INFERIOR);
    println("");
  }
  
  // Simulacion diaria
  static void simulacionDia(){
    dia += 1;                                                 // El dia avanza
    subidaCaracol = 1 + (int)(Math.random() * 4);             // Se obtiene cuanto sube el caracol
    cansancio();                                              // Verificar cansancio dependiendo del dia
    profundidadCaracol = profundidadCaracol - subidaCaracol;  // El caracol sube
    bajadaCaracol = (int)(Math.random() * 3);                 // Se obtiene cuanto baja el caracol
    coches();                                                 // Se verifica si pasa un coche
    clima();                                                  // Se verifica el clima
    profundidadCaracol = profundidadCaracol + bajadaCaracol;  // El caracol baja
    verificarLimites();                                       // Verifica los limites
    verificarSalida();                                        // Verifica si el caracol ha salido del pozo
  }

  // Simulacion de cansancio por mes
  static void cansancio () {
    if (dia > 10) {
      subidaCaracol = 1 + (int)(Math.random() * 3);
    }
    if (dia > 20) {
      subidaCaracol = 1 + (int)(Math.random() * 2);
    }
    if (dia > 50) {
      println("El caracol ha muerto por inanicion :(");
      caracolEnPozo = false;
    }
  }
  
  // Simulacion de paso de coches por dia
  static void coches () {
    int probabilidad = 1 + (int)(Math.random() * 100);
    if (probabilidad <= 35) {
      pasaCoche = true;
      bajadaCaracol += 2;
    } else {
      pasaCoche = false;
    }
  }
  
  // Simulacion de clima por dia
  static void clima () {
    int probabilidad = 1 + (int)(Math.random() * 100);
    if (probabilidad <= 5) {        // lluvia fuerte
      nivelDeAgua += 5;
      climaDia = 0;
    } else if (probabilidad <= 10){ // lluvia debil
      nivelDeAgua += 2;
      climaDia = 1;
    } else {
      climaDia = 2;
    }
  }

  // Evita que el caracol se pase de los limites del agua y el pozo
  static void verificarLimites() {
    if (profundidadCaracol > profundidadTotal){
      profundidadCaracol = 20;
    }
    if (profundidadCaracol > profundidadTotal - nivelDeAgua) {
      profundidadCaracol =  profundidadTotal - nivelDeAgua;
    }
  }

  // Verifica si el caracol ha salido del pozo
  static void verificarSalida () {
    if (profundidadCaracol <= 0) {
      caracolEnPozo = false;
    }
  }
}

