import java.util.Scanner;

public class WhacAMole {


    static int totalAciertos = 0;
    static int numeroTurno=1;

    public static void main (String[] args){

        final int filasMax = 6 ;
        final int columnasMax = 6;

        do{

            imprimeAgujeros(columnasMax, filasMax);

        }while(numeroTurno<=15);

        System.out.println("Has tenido un total de "+ totalAciertos + " aciertos ");
    }

    static int entradaColumnaInt(){

        System.out.print("Introduce tu Columna --> ");
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt(); 

    }

    static int entradaFilaInt(){

        System.out.print("Introduce tu Fila --> ");
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt(); 

    }

    static int numeroAzar(){

		int max=4;
		int min=1;
		
		return (int)(Math.random() * (max-min+1))+min;

    }

    static void imprime(String valor){

        System.out.print(valor);
    }

    static void imprimeTurno(){
        System.out.println("TURNO " + numeroTurno);
        numeroTurno++;

    }

    static void contadorAciertos(boolean acierta){



        if(acierta==true){
            System.out.print("[ACIERTO]");
            totalAciertos++;
        } else {
            System.out.print("[FALLO]");
        }
        System.out.println(" Aciertos( " + totalAciertos +" )");
        acierta = false;


    }

    static void imprimeAgujeros(int columnasTotales, int filasTotales){

        final String bordeSuperiorInferior = "+------------------------+";
        final String bordeDerechoIzquierdo = "|";
    
        final String agujeroVacio = " (  ) ";
        final String agujeroGolpeado = " [[]] ";
        final String agujeroRaton = " ('') ";
        final String agujeroAcertado = " [**] ";
        int filaRaton;
        int columnaRaton;


        imprimeTurno();
        
        filaRaton=numeroAzar();
        columnaRaton=numeroAzar();
        int filaEntrada = entradaColumnaInt();
        int columnaEntrada=entradaFilaInt();
        boolean golpeado = false;



        for (int fila=0; fila<filasTotales; fila++){

            if (fila==0||fila==5){

                imprime(bordeSuperiorInferior);

            }else if((fila>=1) && (fila<=4)){

                for(int columna=0; columna<columnasTotales; columna++){

                    if(columna==0 || columna==5){

                        imprime(bordeDerechoIzquierdo);

                    }else if(columna>=1 && columna<=4){

                        if((columnaRaton==columnaEntrada && filaRaton==filaEntrada) && (columnaEntrada==columna && filaEntrada==fila)){

                            imprime(agujeroAcertado);
                            golpeado = true;

                        }else if (columna==columnaRaton && fila==filaRaton){

                            imprime(agujeroRaton);

                        }else if (columnaEntrada==columna && filaEntrada==fila){

                            imprime(agujeroGolpeado);
                        }else{

                            imprime(agujeroVacio);

                        }  
                    } 
                }
            }

            System.out.println("");
            
        }
        contadorAciertos(golpeado);
    }
}
