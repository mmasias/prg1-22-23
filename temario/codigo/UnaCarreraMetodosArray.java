import java.util.Scanner;
public class UnaCarreraMetodosArray {
    
	static final int MAXIMO_TURNOS = 20;
	static final int META = 60;
    
	public static void main(String[] args) {

        int[] jugadores = {0, 0, 0, 0};
        int turno = 0;
        do {
                turno++;
                mover(jugadores);
                imprimir(jugadores);

        } while (!hayGanador(jugadores, META) && quedanTurnos(turno));
        
        dimeQuienGano(jugadores, quedanTurnos(turno));  
    }
    
    private static void mover(int[] jugadores) {

        for (int i=0; i<jugadores.length; i++){
            jugadores[i] = avance(jugadores[i]);
        }
    }

    static boolean quedanTurnos(int turno) {

        return turno<MAXIMO_TURNOS;
    }

    static void dimeQuienGano(int[] jugadores, boolean aunQuedanTurnos){
        
        if (!aunQuedanTurnos){
            System.out.println("No gano nadie porque se agotaron los turnos");
        } else {
            
            int ganador=0;
            int posicionGanador = jugadores[0];
            for(int i=1; i<jugadores.length; i++){
                if (jugadores[i]>posicionGanador) {
                    ganador = i;
                }
            }
            System.out.println("El ganador es" + ganador);
        }
    }
    
    static boolean hayGanador(int[] jugadores, int laMeta){
        
        for (int i=0; i<jugadores.length; i++){
            if (jugadores[i]>laMeta){
                return true;
            }
        }
        return false;
    }

    static void imprimir(int[] jugadores){
        
        for (int i=0; i<jugadores.length; i++){
            imprimeCamello(jugadores[i]);
        }
        imprimeLinea(); 
        
    }

    static void imprimeCamello(int unaPosicion){
        
        for(int i=0;i<=unaPosicion;i++){
            System.out.print(".");
        }
        System.out.println(";--;'");    
    }   

    static void imprimeLinea() {

        System.out.println("~~ ".repeat(MAXIMO_TURNOS));
    }

    static int avance(int unaPosicion){
        
        return (int)(Math.random()*3+1) + unaPosicion;
        
    }
        
    static String pregunta(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine(); 
    }

 }