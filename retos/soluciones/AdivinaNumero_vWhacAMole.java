import java.util.Scanner;
public class AdivinaNumero_vWhacAMole {    
	public static void main(String[] args) {
        int numeroDelUsuario;
        int numeroDeLaMaquina;
        final int LIMITE_INFERIOR = 1;
        final int LIMITE_SUPERIOR = 16;  

        System.out.println("Piensa un numero entre [" + LIMITE_INFERIOR + " y "+ LIMITE_SUPERIOR +"]");

        do{
            numeroDeLaMaquina = piensaUnNumero(LIMITE_INFERIOR, LIMITE_SUPERIOR);
            numeroDelUsuario  = preguntaEntero("Adivina!!! [Pista, el numero pensado es "+numeroDeLaMaquina+"]");  
            imprimeTablero(numeroDelUsuario);
        } while (!loAdivino(numeroDelUsuario, numeroDeLaMaquina));
    }

    static int piensaUnNumero(int limiteInferior, int limiteSuperior) {
        return (int)(Math.random()*(limiteSuperior-limiteInferior+1)+limiteInferior);
    }

    static boolean loAdivino(int numeroDelUsuario, int numeroDeLaMaquina) {
        if (numeroDelUsuario==numeroDeLaMaquina) {
            return true;
        }
        daleUnaPista(numeroDelUsuario, numeroDeLaMaquina);
        return false;
    }

    static void daleUnaPista(int numeroDelUsuario, int numeroDeLaMaquina) {
        int distancia = Math.abs(numeroDeLaMaquina-numeroDelUsuario);
        if (distancia<=3) {
            System.out.println("CALIENTE");
        } else if (distancia<=10) {
            System.out.println("TIBIO");
        } else {
            System.out.println("FRIO");
        }
    }

    static void imprimeTablero(int golpe){
        for(int i=1; i<=16; i++){
            if (i==golpe) {
                System.out.print("[#] ");
            } else {
                System.out.print("[ ] ");
            }
            
            if (i%4==0) {
                System.out.println();
            }
        }
    }

    static int preguntaEntero(String pregunta){
        System.out.println(pregunta);
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
 }