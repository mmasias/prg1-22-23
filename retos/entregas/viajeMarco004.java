import java.util.Scanner;
public class viajeMarco004{
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		double velocidadMarco, tiempoMarco;
		double espacioMarco;
		double probabilidadClima;
		double probabilidadMonoCansado, probabilidadMonoEscapado;
		boolean modoDebug = false;
		int distanciaParaDibujo;

		double distanciaMarcoMadre;
		double espacioMadre;

		String entradaDelUsuario;

		int numeroDia;

		numeroDia = 0;
		distanciaMarcoMadre = 350;

		while (distanciaMarcoMadre>0) {

			velocidadMarco 	= (Math.random()*(15-10))+10;
			tiempoMarco 	= (Math.random()*(10-8))+8;

			if (modoDebug) {
				System.out.println("> Velocidad original: "+velocidadMarco);
				System.out.println("> Tiempo original   : "+tiempoMarco);
				System.out.println("");
			}

			// INICIO DEL ANALISIS DEL CLIMA
				probabilidadClima = Math.random();
				if (modoDebug) {System.out.println("> Probabilidad de Clima: "+probabilidadClima);}
				if (probabilidadClima<0.1){
					System.out.println("Lluvia fuerte");
					velocidadMarco = velocidadMarco * 0.25;
				} else if (probabilidadClima<0.4) {
					System.out.println("Lluvia normal");
					velocidadMarco = velocidadMarco * 0.75;
				} else {
					System.out.println("Buen clima");
				}
			// FIN DEL ANALISIS DEL CLIMA

			// INICIO DE ANALISIS DEL MONO
				probabilidadMonoEscapado = Math.random();
				probabilidadMonoCansado  = Math.random();
				if (modoDebug) {
					System.out.println("> Probabilidad de Mono Cansado : "+probabilidadMonoCansado);
					System.out.println("> Probabilidad de Mono Escapado: "+probabilidadMonoEscapado);
				}

				if (probabilidadMonoEscapado<0.15) {
					System.out.println("El mono se ha escapado!");
					tiempoMarco = tiempoMarco-2;
				}

				if (probabilidadMonoCansado<0.25) {
					System.out.println("El mono se ha cansado!");
					velocidadMarco = velocidadMarco * 0.9;
				}
			// FIN DEL ANALISIS DEL MONO

			// CALCULOS FINALES (DEL DIA)
			numeroDia			= numeroDia + 1;
			espacioMarco 		= velocidadMarco * tiempoMarco;
			espacioMadre 		= 80;
			distanciaMarcoMadre = distanciaMarcoMadre + espacioMadre - espacioMarco;

			if (distanciaMarcoMadre<0){
				distanciaMarcoMadre = 0;
			}

			distanciaParaDibujo = (int) distanciaMarcoMadre;

			System.out.println("UN DIA DE MARCO (incluye video). Dia " + numeroDia);
			System.out.println("-------------------------------------------");

			System.out.print("m");
			for (int i=0;i<distanciaParaDibujo;i=i+10){
				System.out.print("_");
			}
			System.out.println("M");


			System.out.println();
			System.out.println("Velocidad de Marco: "+velocidadMarco);
			System.out.println("Tiempo de Marco   : "+tiempoMarco);
			System.out.println("Avance de Marco   : "+espacioMarco);
			System.out.println("Al final del dia la distancia entre Marco y su madre es: "+distanciaMarcoMadre);
			System.out.println("--------------------------------------");
			System.out.println("FIN DEL DIA DE MARCO");
			System.out.println("--------------------------------------");
			entradaDelUsuario = entrada.nextLine();

		}

		System.out.println("Marco ha encontrado a su madre el dia numero "+numeroDia);



	}
}