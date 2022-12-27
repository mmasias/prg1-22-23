package examenParcial;
import java.util.Random;
import java.util.Scanner;

public class examenParcial {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String recorridoJugador = " "; // recorrido dado por el jugador en el tablero representado por espacios
    String notificacionJugador = "Reto del Camello por Aurelio Ochoa"; // Notificacion mostrada despues del turno que indica el numero de casillas avanzadas 
    int totalDeTurnos = 0; //turnos totales del jugador
    int totalDeCasillas = 60; //total de casillas en el tablero

    for (int posicionJugador = 0; posicionJugador < totalDeCasillas;){
      int probablidadAcierto = new Random().nextInt(100) + 1; //numero aleatorio del 1 al 100

      System.out.println();
      System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
      System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
      System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
      System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
      System.out.println("[J]|" + recorridoJugador + ";--;'");
      System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
      System.out.println("Turno: " + totalDeTurnos + " - " + notificacionJugador + " - " + "Esta en la casilla: " + posicionJugador);
      System.out.print("Elija un agujero: ");
      int turnoDeJugador = input.nextInt();

      if(turnoDeJugador == 1){
        if( probablidadAcierto <= 60){
          posicionJugador = posicionJugador + 1;
          recorridoJugador = recorridoJugador + " ";
          notificacionJugador = "Avanza 1 casilla";
        }
        else{
            notificacionJugador = "No avanza ninguna casilla";
        }
      } else if(turnoDeJugador == 2){
        if( probablidadAcierto <= 40){
          posicionJugador = posicionJugador + 2;
          recorridoJugador = recorridoJugador + "  ";
          notificacionJugador = "Avanza 2 casillas";
        }
        else{
          notificacionJugador = "No avanza ninguna casilla";
        }
      } else if(turnoDeJugador == 3){
        if( probablidadAcierto <= 30){
          posicionJugador = posicionJugador + 4;
          recorridoJugador = recorridoJugador + "    ";
          notificacionJugador = "Avanza 4 casillas";
        }
        else{
          notificacionJugador = "No avanza ninguna casilla";
        }
      } else if(turnoDeJugador == 4){
        if( probablidadAcierto <= 10){
          posicionJugador = posicionJugador + 6;
          recorridoJugador = recorridoJugador + "      ";
          notificacionJugador = "Avanza 6 casillas";
        }
        else{
          notificacionJugador = "No avanza ninguna casilla";
        }
      }
      else{
        notificacionJugador = turnoDeJugador + " no es una eleccion valida";
        System.out.println();
        System.out.println("Elija un agujero:" + turnoDeJugador);
        System.out.println();
      }
      totalDeTurnos = totalDeTurnos + 1;
    }
  }
}