import java.util.Scanner;

class Reservas{

  // Acorta System.out.print y System.out.println porque me da pereza
  static void print(Object arg){ System.out.print(arg); }
  static void println(Object arg){ System.out.println(arg); }

  static Scanner entrada = new Scanner(System.in);
  static String[] salones = {"", "", "", "", "", ""};

	public static void main(String[] args){
		
		boolean salir = false;
		int opcionMenu;

    println("");
    println("~ Sistema de reservas para biblioteca ~");
    println("=".repeat(40));
    println("");

		do {
			imprimeMenu();
			opcionMenu = preguntaOpcionMenu();
      switch (opcionMenu) {
        case 1:
          imprimeEstado();
        break;
        case 2:
          reservar();
        break;
        case 3:
          liberar();
        break;
        case 4:
          println("");
          println("Hasta la proxima!");
          println("");
          salir = true;
        break;
        default:
          println("ERROR: "+ opcionMenu +" no es una opcion valida");
          println("");
        break;
      }
		} while (!salir);
	}
	
	static void imprimeMenu() {
    println("Menu");
    println("-".repeat(30));
    println("(1) Imprimir estado de salones");
    println("(2) Reservar salon");
    println("(3) Liberar salon");
    println("(4) Salir del programa");
    println("");
  }

  static void imprimeEstado(){
    String estadoSalon;
    println("");
    println("Salones");
    println("-".repeat(30));
		for (int salon=0; salon < salones.length; salon++){
      if (salones[salon].isBlank()){
        estadoSalon = "Sin reservar";
      } else {
        estadoSalon = "Reservado por " + salones[salon];
      }
			println("Salon "+ salon +" "+ estadoSalon);
		}
    println("");
	}
	
	static void reservar(){
    println("");
    print("Salon a reservar:");
    int salon = entrada.nextInt();
    if (!salones[salon].isBlank()){
      println("ERROR: Ese salon ya esta ocupado por "+ salones[salon]);
      println("");
    } else {
    print("Nombre del reservante: ");
    String nombre = entrada.next(); 
    salones[salon] = nombre;
    println("");
    }
  }

	static void liberar(){
    println("");
    print("Salon a liberar:");
    int salon = entrada.nextInt();
    if (salones[salon].isBlank()){
      println("ERROR: Ese salon no esta ocupado");
      println("");
    } else {
      salones[salon] = "";
      println("El salon "+ salon +" ha sido liberado");
      println("");
    }
	}

	static int preguntaOpcionMenu(){
    print("Opcion: ");
		return entrada.nextInt();
	}	
}