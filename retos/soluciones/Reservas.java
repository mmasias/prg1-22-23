import java.util.Scanner;

class Reservas{
	public static void main(String[] args){
		
		boolean[] reservas = {false, false, false, false, false, false};
		String[] personas = {"", "", "", "", "", ""};
		boolean salir = false;
		String quienReserva;
		int opcionMenu;
		
		do {
			imprimeMenu();
			opcionMenu = preguntaEntero();
			if (opcionMenu==1) { imprimeEstado(); } 
			else if (opcionMenu==2) { reserva(reservas, personas); }
			else if (opcionMenu==3) { libera(reservas, personas); }
			else if (opcionMenu==4) { salir=true; }
		} while (!salir);
	}
	
	static void imprimeEstado(boolean[] salones){
		for (int salon=0;salon<salones.length; salon++){
			System.out.println(salon + " " + salones[salon]);
		}
	}
	
	static void reserva(int salon, boolean[] salones){
		salones[salon]=true;	
	}
	
	static String preguntaTexto(){
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine(); 
	}	

	static String preguntaEntero(){
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt(); 
	}	
}