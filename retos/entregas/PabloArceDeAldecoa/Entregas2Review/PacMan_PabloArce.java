import java.util.*;
public class PacMan_PabloArce {
    public static void main(String args[]) {
        //Inicialización de variables
        int [][] terreno = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,2,2,2,2,2,2,2,2,2,2,2,2,2,1,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
            {1,2,1,1,1,1,2,1,1,1,1,1,1,2,1,2,1,1,1,1,1,1,2,1,1,1,1,2,1},
            {1,2,1,3,3,1,2,1,3,3,3,3,1,2,1,2,1,3,3,3,3,1,2,1,3,3,1,2,1},
            {1,2,1,1,1,1,2,1,1,1,1,1,1,2,1,2,1,1,1,1,1,1,2,1,1,1,1,2,1},
            {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
            {1,2,1,1,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,1,1,1,2,1},
            {1,2,2,2,2,2,2,1,2,2,2,2,2,2,1,2,2,2,2,2,2,1,2,2,2,2,2,2,1},
            {1,1,1,1,1,1,2,1,1,1,1,1,1,2,1,2,1,1,1,1,1,1,2,1,1,1,1,1,1},
            {3,3,3,3,3,1,2,1,2,2,2,2,2,2,2,2,2,2,2,2,2,1,2,1,3,3,3,3,3},
            {3,3,3,3,3,1,2,1,2,1,1,1,1,5,4,5,1,1,1,1,2,1,2,1,3,3,3,3,3},
            {1,1,1,1,1,1,2,1,2,1,3,3,3,3,3,3,3,3,3,1,2,1,2,1,1,1,1,1,1},
            {2,2,2,2,2,2,2,2,2,5,3,3,3,3,3,3,3,3,3,5,2,2,2,2,2,2,2,2,2},
            {1,1,1,1,1,1,2,1,2,1,3,3,3,3,3,3,3,3,3,1,2,1,2,1,1,1,1,1,1},
            {3,3,3,3,3,1,2,1,2,1,1,1,1,5,4,5,1,1,1,1,2,1,2,1,3,3,3,3,3},
            {3,3,3,3,3,1,2,1,2,2,2,2,2,2,2,2,2,2,2,2,2,1,2,1,3,3,3,3,3},
            {1,1,1,1,1,1,2,1,1,1,1,1,1,2,1,2,1,1,1,1,1,1,2,1,1,1,1,1,1},
            {1,2,2,2,2,2,2,1,2,2,2,2,2,2,1,2,2,2,2,2,2,1,2,2,2,2,2,2,1},
            {1,2,1,1,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,1,1,1,2,1},
            {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
            {1,2,1,1,1,1,2,1,1,1,1,1,1,2,1,2,1,1,1,1,1,1,2,1,1,1,1,2,1},
            {1,2,1,3,3,1,2,1,3,3,3,3,1,2,1,2,1,3,3,3,3,1,2,1,3,3,1,2,1},
            {1,2,1,1,1,1,2,1,1,1,1,1,1,2,1,2,1,1,1,1,1,1,2,1,1,1,1,2,1},
            {1,2,2,2,2,2,2,2,2,2,2,2,2,2,1,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
        };
        int vidas = 3; int [] puntos = {0}; //Tiene que ser matriz, por algún motivo los int no se editan en metodos estaticos
        boolean ganar = false;
        while(vidas!=0 && ganar == false){
            int [] posPacMan = {12,14}, posFantasma1 = {13,10}, posFantasma2 = {13,18}, posFantasma3 = {11,10}, posFantasma4 = {11,18};
            int [] movimientoPasado = {3,3,3,3,3}; //El primer movimiento permitido siempre va a ser ha un espacio vacio (3)
            int [] contadorFantasma = {0};
            while(true){
                mostrarTerreno(terreno, posPacMan, posFantasma1, posFantasma2, posFantasma3, posFantasma4);
                mostrarDatos(vidas, puntos[0]);
                if (evaluarMuerte(terreno, posPacMan)){vidas--;break;}
                else if (evaluarGanar(movimientoPasado, terreno)){ganar = true; break;}
                int contadorTurnos = 0;
                preguntartecla(posPacMan, terreno, movimientoPasado, contadorTurnos, puntos); contadorTurnos++;
                establecerMovimiento(posFantasma1, terreno, "fantasma", movimientoPasado, contadorTurnos, puntos, posPacMan, contadorFantasma); contadorTurnos++;
                establecerMovimiento(posFantasma2, terreno, "fantasma", movimientoPasado, contadorTurnos, puntos, posPacMan, contadorFantasma); contadorTurnos++;
                establecerMovimiento(posFantasma3, terreno, "fantasma", movimientoPasado, contadorTurnos, puntos, posPacMan, contadorFantasma); contadorTurnos++;
                establecerMovimiento(posFantasma4, terreno, "fantasma", movimientoPasado, contadorTurnos, puntos, posPacMan, contadorFantasma);
            }
            limpiarFantasmas(terreno, posFantasma1, posFantasma2, posFantasma3, posFantasma4);
        }
        if (ganar){hasGanado();}
        else {gameOver();}
    }

    static void gameOver(){ 
        System.out.println("\n".repeat(10));
        System.out.println(" _____                         ____                 ");
        System.out.println("/ ____|                       / __ |                ");
        System.out.println("| |  __  __ _ _ __ ___   ___  | |  | |_   _____ _ __ ");
        System.out.println("| | |_ |/ _` | '_ ` _ ( / _ ( | |  | ( | / / _ ( '__|");
        System.out.println("| |__| | (_| | | | | | |  __/ | |__| || V /  __/ |   ");
        System.out.println("(_____|(__,_|_| |_| |_|(___|  (____/  |_/ (___|_|   "); 
        System.out.println("\n".repeat(10));
    }

    static void hasGanado(){ 
        System.out.println("\n".repeat(10));
        System.out.println("    __________________|      |____________________________________________");
        System.out.println("     ,--.    ,--.          ,--.   ,--.");
        System.out.println("    |oo  | _  )  `.       | oo | |  oo|");
        System.out.println("o  o|~~  |(_) /   ;       | ~~ | |  ~~|o  o  o  o  o  o  o  o  o  o  o");
        System.out.println("    |/)/)|   '._,'        |/)/)| |/)/)|");
        System.out.println("__________________        ____________________________________________"); 
        System.out.println("                  |      |          ¡Has ganado!");
        System.out.println("\n".repeat(10));
    }

    static void mostrarTerreno(int [][] terreno, int [] posPacMan, int [] posFantasma1, int [] posFantasma2, int [] posFantasma3, int [] posFantasma4){
        String pacMan = "()>", fantasma = "º_º";
        terreno[posPacMan[0]][posPacMan[1]] = 6;
        terreno[posFantasma1[0]][posFantasma1[1]] = 7;
        terreno[posFantasma2[0]][posFantasma2[1]] = 8;
        terreno[posFantasma3[0]][posFantasma3[1]] = 9;
        terreno[posFantasma4[0]][posFantasma4[1]] = 10;
        for (int fila = 0; fila < terreno.length; fila++){
            for (int columna = 0; columna < terreno[fila].length; columna++){
                int posicion = terreno[fila][columna];
                if(posicion==1) { System.out.print("[#]");}		
				else if (posicion==2) { System.out.print(" · ");}
                else if (posicion==3) { System.out.print("   ");}
                else if (posicion==4) { System.out.print("[-]");}
                else if (posicion==5) { System.out.print("[+]");}
                else if (posicion==6) { System.out.print(pacMan);}
                else if (posicion==7 || posicion==8 || posicion==9 || posicion==10) { System.out.print(fantasma);}
            }
            System.out.println("");
        }
    }

    static void mostrarDatos(int vidas, int puntos){
        for(int i = 0; i<vidas; i++){System.out.print(" .--."+" ".repeat(6));}
        System.out.println("");
        for(int i = 0; i<vidas; i++){System.out.print("/ _.-'"+" ".repeat(5));}
        System.out.print(" ".repeat(40)+"Puntuación: "+ puntos);
        System.out.println("");
        for(int i = 0; i<vidas; i++){System.out.print("|  '-."+" ".repeat(5));}
        System.out.println("");
        for(int i = 0; i<vidas; i++){System.out.print(" '--' "+" ".repeat(5));}
        System.err.println("");
    }

    static boolean evaluarMuerte(int [][] terreno, int [] posPacMan){
        int Pacman=terreno[posPacMan[0]][posPacMan[1]];
        if (Pacman == 7 || Pacman == 8 || Pacman == 9 || Pacman == 10){return true;}
        return false;
    }

    static boolean evaluarGanar(int [] movimientoPasado, int [][] terreno){
        int bolitasRestantes = 0;
        for (int i = 0; i < movimientoPasado.length; i++){
            if (movimientoPasado[i] == 2){
                bolitasRestantes++;
            }
        }
        for (int i = 0; i < terreno.length; i++){
            for(int j = 0; j < terreno[i].length; j++){
                if (terreno[i][j] == 2){
                    bolitasRestantes++;
                }
            }
        }
        if (bolitasRestantes == 0){
            return true;
        }
        return false;
    }

    static void preguntartecla(int [] unPersonaje, int [][] terreno, int [] movimientoPasado, int contadorTurnos, int [] puntos){
        Scanner entry = new Scanner(System.in);
        System.out.println("");
        String tecla = entry.nextLine();
        int [] nosDaIgual = {0};
        establecerMovimiento(unPersonaje, terreno, tecla, movimientoPasado, contadorTurnos, puntos, unPersonaje, nosDaIgual);
    }

    static String movimientoFantasma(int [][] terreno, int [] unPersonaje, int [] posPacMan, int [] contadorFantasma){
        contadorFantasma[0]++;
        int diferenciaX = posPacMan[1] - unPersonaje[1];
        int diferenciaY = posPacMan[0] - unPersonaje[0];
        int numAleatorio = (int)(Math.random()*3)+1; // Para que si alguno no pueda avanzar porque esta bloqueado, pruebe el otro 
        for (int i = 0; i<2 ; i++){ // por si sale numAleatorio = 2, que le una oportunidad en numAleatorio 1 (se prioriza que te persiga)

            if (contadorFantasma[0] >= 10){ // esto es un "try and catch". Si el camino horizontal y vertical mas eficiente estan bloqueados, el bucle se vuelve infinito, asi que establecemos que sea aleatorio hasta que se solucione
                numAleatorio = 3;
            }

            if (numAleatorio == 1){
                if (diferenciaX > 0){
                    return "d";
                }
                else if (diferenciaX < 0){
                    return "a";
                }
                else{numAleatorio = 2;}
            }

            else if (numAleatorio == 2){
                if (diferenciaY > 0){
                    return "s";
                }
                else if (diferenciaY < 0){
                    return "w";
                }
                else{numAleatorio = 1;}
            }

            else if (numAleatorio == 3){
                numAleatorio = (int)(Math.random()*4+1);
                if (numAleatorio == 1){return "w";}
                else if (numAleatorio == 2){return "s";}
                else if (numAleatorio == 3){return "a";}
                return "d";
            }
        }
        return " ";
    }

    static void establecerMovimiento(int [] unPersonaje, int [][] terreno, String tecla, int [] movimientoPasado, int contadorTurnos, int [] puntos,int [] posPacMan, int [] contadorFantasma){
        String eje = ""; 
        int movimiento = 0;
        if (tecla.equals("fantasma")){tecla = movimientoFantasma(terreno,unPersonaje,posPacMan, contadorFantasma);}
        if (tecla.equals("w") || tecla.equals("s")){
            eje = "Y";
            if (tecla.equals("w")){movimiento--;}
            else{movimiento++;}
        }

        else if (tecla.equals("a") || tecla.equals("d")){
            eje = "X";
            if (tecla.equals("a")){movimiento--;}
            else{movimiento++;}
        }

        evaluarMovimiento(unPersonaje, terreno, tecla, eje, movimiento, movimientoPasado, contadorTurnos, puntos, posPacMan,contadorFantasma);

    }

    static void evaluarMovimiento(int [] unPersonaje, int [][] terreno, String tecla, String eje, int movimiento, int [] movimientoPasado, int contadorTurnos, int [] puntos, int [] posPacMan, int [] contadorFantasma){
        int movimientoActual = terreno[unPersonaje[0]][unPersonaje[1]]; //El personaje actual
        if (eje.equals("Y")){
            int movimientoSupuesto = terreno[unPersonaje[0]+movimiento][unPersonaje[1]];
            if (!(movimientoActual==6)){
                if (!(movimientoSupuesto == 1)){
                    terreno[unPersonaje[0]][unPersonaje[1]]=movimientoPasado[contadorTurnos];
                    movimientoPasado[contadorTurnos] = movimientoSupuesto;
                    unPersonaje[0]+=movimiento;
                    contadorFantasma[0] = 0; //Si el movimiento entra, se resetea
                }
                else{establecerMovimiento(unPersonaje, terreno, "fantasma", movimientoPasado, contadorTurnos, puntos, posPacMan, contadorFantasma);}
            }
            else{
                if (!(movimientoSupuesto == 1 || movimientoSupuesto == 5)){
                    terreno[unPersonaje[0]][unPersonaje[1]] = 3;
                    if (movimientoSupuesto == 2){puntos[0]+=5;}
                    unPersonaje[0]+=movimiento;
                }
            }
        }

        else if (eje.equals("X")){
            if (tunel(terreno, movimientoActual, movimiento, unPersonaje, puntos, movimientoPasado, contadorTurnos) == false){
                int movimientoSupuesto = terreno[unPersonaje[0]][unPersonaje[1]+movimiento];
                if (!(movimientoActual==6 )){ // Es decir, si es un fantasma (no 6, que es pac man)
                    if (!(movimientoSupuesto == 1)){
                        terreno[unPersonaje[0]][unPersonaje[1]]=movimientoPasado[contadorTurnos];
                        movimientoPasado[contadorTurnos] = movimientoSupuesto;
                        unPersonaje[1]+=movimiento;
                        contadorFantasma[0] = 0; //Si el movimiento entra, se resetea
                    }
                    else{establecerMovimiento(unPersonaje, terreno, "fantasma", movimientoPasado, contadorTurnos, puntos, posPacMan, contadorFantasma);}
                    // vuelve a establecer movimiento ya que el fantasma no se choca nunca
                }
                else{
                    if (!(movimientoSupuesto == 1 || movimientoSupuesto == 5)){
                        terreno[unPersonaje[0]][unPersonaje[1]] = 3;
                        if (movimientoSupuesto == 2){puntos[0]+=5;}
                        unPersonaje[1]+=movimiento;
                    }
                }
            }
        }
    }

    static boolean tunel(int [][] terreno, int movimientoActual, int movimiento, int [] unPersonaje, int[] puntos, int [] movimientoPasado, int contadorTurnos){
        int fila = unPersonaje[0]; int columna = unPersonaje[1];
        if (fila == 12 && columna == 28){
            if (movimiento == 1){
                if (movimientoActual == 6){
                    terreno[unPersonaje[0]][unPersonaje[1]] = 3;
                    if (terreno[12][0] == 2){puntos[0]+=5;}
                    unPersonaje[1] = 0;
                }
                else { // seria mas facil volver a evaluarMovimiento con movimiento = -1, pero los int no se pueden cambiar entre funciones.
                    terreno[unPersonaje[0]][unPersonaje[1]]=movimientoPasado[contadorTurnos];
                    movimientoPasado[contadorTurnos] = terreno[unPersonaje[0]][unPersonaje[1]-movimiento];
                    unPersonaje[1]-=movimiento;
                }
                return true;
            }
        }
        else if(fila == 12 && columna == 0){
            if (movimiento == -1){
                if (movimientoActual == 6){
                    terreno[unPersonaje[0]][unPersonaje[1]] = 3;
                    if (terreno[12][28] == 2){puntos[0]+=5;}
                    unPersonaje[1] = 28;
                }
                else { // seria mas facil volver a evaluarMovimiento con movimiento = -1, pero los int no se pueden cambiar entre funciones.
                    terreno[unPersonaje[0]][unPersonaje[1]]=movimientoPasado[contadorTurnos];
                    movimientoPasado[contadorTurnos] = terreno[unPersonaje[0]][unPersonaje[1]-movimiento];
                    unPersonaje[1]-=movimiento;
                }
                return true;
            }
        }
        return false;
    }

    static void limpiarFantasmas(int [][] terreno, int [] posFantasma1, int [] posFantasma2, int [] posFantasma3, int [] posFantasma4){
        terreno[posFantasma1[0]][posFantasma1[1]] = 3;
        terreno[posFantasma2[0]][posFantasma2[1]] = 3;
        terreno[posFantasma3[0]][posFantasma3[1]] = 3;
        terreno[posFantasma4[0]][posFantasma4[1]] = 3;
    }
}