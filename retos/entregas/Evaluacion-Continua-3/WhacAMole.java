import java.util.Scanner;

public class WhacAMole {
        static int contadorTurno = 1;
        static int contadorAciertos = 0;





        public static void main(String[] args) {
            int filasMax = 6;
            int columnasMax = 6;

            do{
                imprimeAgujeros(filasMax, columnasMax);

            } while(contadorTurno <= 15);
        }

        static int entradaColumna() {
            System.out.println("Elija una columna: ");
            Scanner entrada = new Scanner(System.in);
            return entrada.nextInt();
        }
        static int entradaFila() {
            System.out.println("Elija una fila: ");
            Scanner entrada = new Scanner(System.in);
            return entrada.nextInt();
        }



        static void imprimeTurno() {
            System.out.println("Turno: [" + contadorTurno + "]");
            contadorTurno++;
        }

        static void acierta(boolean acierta) {

            if (acierta == true) {
                System.out.println("[ACIERTA]" + contadorAciertos);
                contadorAciertos++;
            } else {
                System.out.println("[FALLO]");
            }
            System.out.println("Aciertos: [" + contadorAciertos + "]");
            acierta = false;
        }

        static int numeroAleatorio() {
            int max = 4;
            int min = 1;
            return (int) (Math.random() * (max - min + 1)) + min;
        }

        static void imprime(String valor) {
            System.out.print(valor);
        }

        static void imprimeAgujeros(int filasTotales, int columnasTotales) {

            String Agujero = " (  ) ";
            String AgujeroMonigote = " (``) ";
            String AgujeroGolpeado = " [[]] ";
            String AgujeroAcertado = " [**] ";
            String BordeSupInfe = "+------------------------+";
            String BordeIzquieroDerecho = "|";
            int filaMonigote;
            int columnaMonigote;
            boolean golpeado = false;

            imprimeTurno();

            filaMonigote = numeroAleatorio();
            columnaMonigote = numeroAleatorio();
            int columnaElegida = entradaColumna();
            int filaEelegida = entradaFila();
            
            
            for( int fila = 0;fila<=filasTotales;fila++){

                if(fila == 0 || fila == 5){
                    imprime(BordeSupInfe);
            
                }else if (fila >= 1 && fila <= 4){
                    
                    for(int columna = 0; columna <= columnasTotales; columna++){

                        if(columna == 0 || columna == 5){
                            imprime(BordeIzquieroDerecho);
                        }
                        else if(columna>=1 && columna<=4){

                            if((filaMonigote == filaEelegida && columnaMonigote==columnaElegida) && (fila==filaEelegida && columna == columnaElegida)){
                                imprime(AgujeroAcertado);
                                golpeado = true;
                                
                            }else if(filaMonigote==fila && columna == columnaMonigote){
                                imprime(AgujeroMonigote);
                                
                            }else if(fila == filaEelegida && columna == columnaElegida){
                                imprime(AgujeroGolpeado);
                                
                            }else{
                                imprime(Agujero);
                            }
                            
                        }

                    }
                }
                System.out.println("");
            }
            acierta(golpeado);
                
        }
    }


