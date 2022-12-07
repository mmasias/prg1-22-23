import java.util.Scanner;

public class UnaCarreraMetodos {
    public static void main(String[] args) {

		int posicionJugador = 0;
		int posicionOrdenador = 0;
		boolean hayGanador = false;
		boolean quedanTurnos = true;
		int turnos = 0;
		final int MAXIMO_TURNOS = 50;
		final int META = 60;
		
		do {
				posicionJugador = avance(posicionJugador);
				posicionOrdenador = avance(posicionOrdenador);
				
				imprimir(posicionJugador,posicionOrdenador);
				
				hayGanador = hayGanador(posicionJugador,posicionOrdenador, META);
				
		} while (!hayGanador && quedanTurnos);
        
		dimeQuienGano(posicionJugador,posicionOrdenador);
    }
	
	static void dimeQuienGano(int posicion1, int posicion2){
		
		if (posicion1>posicion2) {
			System.out.println("Gano 1");
		} else {
			System.out.println("Gano 2");
		}
	}
	
	static boolean hayGanador(int posicion1, int posicion2, int laMeta){
		
		return posicion1>=laMeta || posicion2>=laMeta;
		
	}

	static void imprimir(int posicion1, int posicion2){
		
		imprimeCamello(posicion1);
		imprimeCamello(posicion2);
		imprimeLinea();
				
	}
	
	static void imprimeLinea() {
		System.out.println("----------------------------");
	}

	static int avance(int unaPosicion){
		
		int unAvance;
		unAvance = (int)(Math.random()*3+1);
		
		return unAvance + unaPosicion;
		
	}
		
	static String pregunta(){
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine(); 
	}

	static void imprimeCamello(int unaPosicion){
		
		for(int i=0;i<=unaPosicion;i++){
			System.out.print(".");
		}
		System.out.println(";--;'");		
	}

 }
