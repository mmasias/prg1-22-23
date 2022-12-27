import java.text.DecimalFormat;
import java.util.Random;

public class ElViajeDeMarco {

  // Acorta System.out.print y System.out.println porque me da pereza
  static void print(Object arg){ System.out.print(arg); }
  static void println(Object arg){ System.out.println(arg); }

  // Variables Globales
  static int dia;
  static double distanciaMarcoMadre = 350;
  static int climaMarco;
  static int climaMadre;
  static boolean sprintMarco;

  static double distanciaMarco;
  static double velocidadMarco;
  static double tiempoRecorridoMarco;

  static int statusMono;
  static boolean problemasMono;

  static double distanciaMadre;
  static double velocidadMadre;
  static double tiempoRecorridoMadre;

  static Random random = new Random();

  static final DecimalFormat dfSharp = new DecimalFormat("#.##");

  // Método principal
  public static void main(String[] args){
    println("");
    println("DIARIO DEL VIAJE DE MARCO");
    println("=".repeat(25));
    while(noEncuentro()){
      simulacionDia();
      imprimirDia();
    }
  }

  static void simulacionDia() {
    dia++;

    velocidadMarco = 10 + random.nextDouble(5);
    tiempoRecorridoMarco = 8 + random.nextDouble(2);
    climaMarco();
    relajoAmedio();
    distanciaMarco = velocidadMarco * tiempoRecorridoMarco;
    distanciaMarcoMadre = distanciaMarcoMadre - distanciaMarco;

    velocidadMadre = 6 + random.nextDouble(3);
    tiempoRecorridoMadre = 6 + random.nextDouble(3);
    climaMadre();
    distanciaMadre = velocidadMadre * tiempoRecorridoMadre;
    distanciaMarcoMadre = distanciaMarcoMadre + distanciaMadre;

    sprintMarco();
  }

  static void imprimirDia() {
    String statusClima[] = { "Ha hecho un buen día", "Ha llovido un poco", "¡Ha llovido muchísimo!" };
    String statusAmedio[] = { "¡Amedio se ha escapado! he perdido tiempo buscandolo", "Amedio esta cansado, lo he llevado en brazos" };
    String statusMarco = "Avance "+ dfSharp.format(tiempoRecorridoMarco) +" horas a "+ dfSharp.format(velocidadMarco) +" Km/h recorriendo "+ dfSharp.format(distanciaMarco) +" Km";
    String statusMadre = "Mama pudo avanzar "+ dfSharp.format(tiempoRecorridoMadre) +" horas a "+ dfSharp.format(velocidadMadre) +" Km/h recorriendo "+ dfSharp.format(distanciaMadre) +" Km";
    String finalDia = "Al final del día "+ dia +" la distancia entre Marco y su Madre es de "+ dfSharp.format(distanciaMarcoMadre) +" Km";
    println("Dia " + dia);
    println(statusClima[climaMarco]);
    if (problemasMono){
      println(statusAmedio[statusMono]);
    }
    println(statusMarco);
    println("Para mama: " + statusClima[climaMadre]);
    println(statusMadre);
    println(finalDia);
    if (sprintMarco) {
      println("A Marco le dicen que han visto a su mamá, y rompe a correr!!!");
    }
    println("- ".repeat(35));
  }

  static void climaMarco(){
    int probabilidad = 1 + random.nextInt(100);
    if (probabilidad <= 10){ // Lluvia fuerte
      velocidadMarco = (velocidadMarco*25)/100;
      climaMarco = 2;
    } else if (probabilidad <= 30){ // Lluvia debil
      velocidadMarco = velocidadMarco - (velocidadMarco*25)/100;
      climaMarco = 1;
    } else {
      climaMarco = 0;
    }
  }

  static void climaMadre(){
    int probabilidad = 1 + random.nextInt(100);
    if (probabilidad <= 10){ // Lluvia fuerte
      velocidadMadre = velocidadMadre - (velocidadMadre*25)/100;
      climaMadre = 2;
    } else if (probabilidad <= 30){ // Lluvia debil
      velocidadMadre = velocidadMadre - (velocidadMarco*50)/100;
      climaMadre = 1;
    } else {
      climaMadre = 0;
    }
  }

  static void relajoAmedio(){
    int probabilidad = 1 + random.nextInt(100);
    if (probabilidad <= 15){ // Amedio se escapa
      problemasMono = true;
      tiempoRecorridoMarco = tiempoRecorridoMarco - 2;
      statusMono = 0;
    } else if (probabilidad <= 25){ // Amedio se cansa
      problemasMono = true;
      velocidadMarco = velocidadMarco - (velocidadMarco*10)/100;
      statusMono = 1;
    } else {
      problemasMono = false;        
    }
  }

  static void sprintMarco(){
    if (distanciaMarcoMadre < 50){
      int probabilidad = 1 + random.nextInt(100);
      if (probabilidad <= 50){ // Se encuentra con alguien que le dice que esta cerca de su madre
        distanciaMarcoMadre = distanciaMarcoMadre - 25;
        sprintMarco = true;
      }
    }
  }

  static boolean noEncuentro(){
    if (distanciaMarcoMadre <= 0){
      println("*".repeat(50));
      println("Al final del día "+ dia +" Marco encuentra a su madre!!!");
      println("*".repeat(50));
      return false;
    } else {
      return true;
    }
  }
}