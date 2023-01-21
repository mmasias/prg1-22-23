import java.util.Scanner;

// Idea:
//
// Aparecen los monigotes y el jugador tiene que golpearlos
// La puntuacion depende del tiempo y si se tarda mucho, se van.
// Mostrar el resultado de la ronda 3 seg
// Repetir

public class WhacAMole {
    public static void main(String[] args) {

        System.out.println("\nInstrucciones:");
        System.out.println("Aparecen unos monigotes en las casillas");
        System.out.println("y para golpearlos, debes introducir el numero de la casilla, empezando desde el 0");
        System.out.println("Cuanto antes golpees, mas puntos ganas. Si tardas mucho, fallas el golpe.\n");

        try {Thread.sleep(3000);} // Esperar 3 segundos
            catch (InterruptedException e) {Thread.currentThread().interrupt();}

        // seleccion de dificultad
        System.out.println("facil: 3x3");
        System.out.println("medio: 5x4");
        System.out.println("dificil: 10x5 y alta rapidez");

        Scanner userInput = new Scanner(System.in);
        System.out.print("Seleciona dificultad: (facil/medio/dificil)");
        String dificultad = userInput.nextLine();


        int xMax = 3;
        int yMax = 3;
        int rapidezPuntuacion = 30;

        if (dificultad.equals("dificil")) {
            System.out.println("Dificultad dificil");
            xMax = 10;
            yMax = 5;
            rapidezPuntuacion = 16;
        }else if (dificultad.equals("medio")) {
            System.out.println("Dificultad medio");
            xMax = 5;
            yMax = 4;
        }else System.out.println("Dificultad facil");

        int tablero = xMax*yMax;

        String agujero = " (  ) ";
        String monigote = " (^^) ";
        String falloGolpe = " ([]) ";
        String monigoteGolpe = " [**] ";

        int puntuacion = 0;

        // Main loop del juego
        for (int turnos = 1; turnos <= 15; turnos++){
            System.out.println("   Inicio ronda " + turnos); //debug


            // generamos la posicion para los monigotes, si es la misma a la anterior, volvemos a generar

            int monigote1;
            int monigote2;
            int monigote1Bkp = -1;
            int monigote2Bkp = -1;

            do monigote1 = (int)(Math.random() * (tablero-2))+1;
            while(monigote1 == monigote1Bkp);
            monigote1Bkp = monigote1;

            do monigote2 = (int)(Math.random() * (tablero-2))+1;
            while(monigote2 == monigote2Bkp);
            monigote2Bkp = monigote2;


            //System.out.println("DEBUG: Monigotes en " + monigote1 + " y " + monigote2); //debug


            // Pasamos la posicion del monigote a posicion de la matriz

            int monigote1x = monigote1/yMax;
            int monigote1y = monigote1%yMax;
            int monigote2x = monigote2/yMax;
            int monigote2y = monigote2%yMax;


            // ASCII Monigotes

            for (int i = 0; i <= yMax-1; i++){
                for(int j = 0; j <= xMax-1; j++){
                    if (i == monigote1x && j == monigote1y || i == monigote2x && j == monigote2y){
                        System.out.print(monigote);
                    } else System.out.print(agujero);
                }
                System.out.println();
            } 


            //sistema de puntos por tiempo

            long tiempoA = System.currentTimeMillis();
            int seleccionUsuario = userInput.nextInt();
            long tiempoB = System.currentTimeMillis();

            int puntosRonda = (100 - (int)(tiempoB - tiempoA)/rapidezPuntuacion); 
            
            boolean acierto = false;
            if(seleccionUsuario == monigote1 || seleccionUsuario == monigote2){
                if (puntosRonda <= 0) {
                    System.out.println("Has tardado mucho, fallas el golpe.\n");
                    puntosRonda = 0;
                } else {
                    System.out.println("Golpeas y ganas " + puntosRonda + " puntos!\n");
                    acierto = true;
                    puntuacion += puntosRonda;
                }
            } else {
                System.out.println("Has fallado!\n");
                puntosRonda = 0;
            }


            // ASCII Resultado

            for (int i = 0; i <= yMax - 1; i++) {
                for (int j = 0; j <= xMax - 1; j++) {

                    if (i == monigote1x && j == monigote1y) { //Monigote 1
                        if((seleccionUsuario == monigote1) && (puntosRonda > 0)){
                            System.out.print(monigoteGolpe);
                        }else System.out.print(falloGolpe);
                    } else if(i == monigote2x && j == monigote2y){ //Monigote 2
                        if((seleccionUsuario == monigote2) && (puntosRonda > 0)){
                            System.out.print(monigoteGolpe);
                        }else System.out.print(falloGolpe);
                    } else
                        System.out.print(agujero);
                }
                System.out.println();
            }

            
            System.out.println("Puntos totales: " + puntuacion);

            try {Thread.sleep(3000);} // Esperar 3 segundos
                catch (InterruptedException e) {Thread.currentThread().interrupt();}

            System.out.println("-".repeat(15) + "\n");

        }

        userInput.close();

    }    
}
