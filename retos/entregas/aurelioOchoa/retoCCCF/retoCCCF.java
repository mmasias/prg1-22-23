package retoCCCF;

import java.util.Random;

public class retoCCCF {

  // Variables Globales
  static int cajasActivas = 3;
  static int cajas[] = new int[5];

  static int colaClientes;
  static int minutosColaVacia;

  static int statusCliente;
  static int clientesAtendidos;
  static int articulosVendidos;
  
  static Random random = new Random();

  // Funcion Principal
  public static void main(String[] args) {
    for (int hora = 1; hora <= 1; hora++){
      System.out.println("");
      System.out.println("~ Hora"+ hora +" ~");
      System.out.println("=".repeat(51));
      simulacionMinutos();
    }
  }

  static void simulacionMinutos(){
    for (int minuto = 1; minuto <= 60; minuto++){
      llegaCliente();
      if (colaClientes > 0){
        clienteACaja();
        cajasAtendiendo();
      }
      imprimirMinuto(minuto);
    }
    imprimirResumen();
  }

  static void llegaCliente(){
    int probabilidadLlegadaCliente = 1 + random.nextInt(100);
    if (probabilidadLlegadaCliente <= 40){
      colaClientes++;
      statusCliente = 0;
    } else {
      minutosColaVacia++;
      statusCliente = 1;
    }
  }

  static void clienteACaja(){
    if (colaClientes >= 15){
      cajasActivas = 4;
    } else {
      cajasActivas = 3;
    }

    for (int caja = 0; caja <= cajasActivas; caja++){
      if (cajas[caja] > 0){
        caja = caja++;
      } else {
        colaClientes--;
        cajas[caja] = 5 + random.nextInt(15);
        break;
      }
    }
  }
  
  static void cajasAtendiendo(){
    for (int caja = 0; caja <= cajasActivas; caja++){
      if (cajas[caja] > 0){
        cajas[caja]--;
        articulosVendidos++;
        if (cajas[caja] == 0){
          clientesAtendidos++;
        }
      }
    }
  }

  static void imprimirMinuto(int minuto){
    String llegaCliente[] = { "Llega 1 persona", "No llega nadie" };
    System.out.println("Minuto "+ minuto +" - " + llegaCliente[statusCliente] + " - En cola: " + colaClientes);
    for (int caja = 0; caja <= cajasActivas; caja++){
      System.out.print("Caja-"+ (caja+1) +":["+ cajas[caja] +"] | ");
    }
    System.out.println("");
    System.out.println("- ".repeat(26));
  }

  static void imprimirResumen(){
    System.out.println("RESUMEN");   
    System.out.println("=".repeat(51));
    System.out.println("Minutos sin nadie en cola: " + minutosColaVacia);
    System.out.println("Personas en la cola al cierre : "+ colaClientes);
    System.out.println("Personas atendidas en el dia  : "+ clientesAtendidos);
    System.out.println("Articulos vendidos en el dia  : "+ articulosVendidos);
    System.out.println("=".repeat(51));
  }
}