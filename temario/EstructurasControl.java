import java.util.Scanner;
public class EstructurasControl {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

		int numeroPorAdivinar;
		numeroPorAdivinar = (int)(Math.random()*10)+1;
		
		int intentoDelUsuario = 0;
		int numeroDeIntentos = 0;
		final int MAXIMO_DE_INTENTOS = 5;
		
		boolean haAdivinado = false;
		boolean quedanIntentos = true;
		
		do {
			numeroDeIntentos = numeroDeIntentos + 1;
			System.out.println(numeroDeIntentos	 + "º intento... Adivina [" + numeroPorAdivinar + "]: ");
			intentoDelUsuario = entrada.nextInt();
			if (intentoDelUsuario == numeroPorAdivinar) {
				System.out.println("Has adivinado!");
				haAdivinado = true;
			}	
			if (numeroDeIntentos >= MAXIMO_DE_INTENTOS) {
				quedanIntentos = false;
			}		
		} while(!haAdivinado && quedanIntentos);
    }
 }