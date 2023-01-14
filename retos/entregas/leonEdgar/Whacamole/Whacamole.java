import java.util.Scanner;

public class Whacamole {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            int filas = 4;
            int columnas = 4;
            int contadorTurnos=0; 
            int golpeHorizontalJugador=0;
            int golpeVerticalJugador=0;
            int contadorPuntos=0;
            while(contadorTurnos<=15){
                System.out.println("Elija un hueco en horizontal al que golpear del 1 al 4");
                golpeHorizontalJugador = scanner.nextInt();
                System.out.println("Elija un hueco en vertical al que golpear del 1 al 4");
                golpeVerticalJugador = scanner.nextInt();
                while(golpeHorizontalJugador<=0 || golpeHorizontalJugador > 4){
                    System.out.println("MAAAAL, elija un numero horizontal al que golpear entre el 1 y el 4 ");
                    golpeHorizontalJugador = scanner.nextInt();
                }
                while(golpeVerticalJugador<=0 || golpeVerticalJugador > 4){
                    System.out.println("MAAAAL, elija un numero vertical al que golpear entre el 1 y el 4 ");
                    golpeVerticalJugador = scanner.nextInt();
                }
                int posicionTopoHorizontal=(int)(Math.random()*4)+1;
                int posicionTopoVertical=(int)(Math.random()*4)+1;
                int posicionTopoHorizontal2=(int)(Math.random()*4)+1;
                int posicionTopoVertical2=(int)(Math.random()*4)+1;
                System.out.println("golpeas en ["+ golpeHorizontalJugador +","+ golpeVerticalJugador +"] / Ha salido el topo en [" + posicionTopoHorizontal +","+ posicionTopoVertical +"] y en [" + posicionTopoHorizontal2 +","+ posicionTopoVertical2 +"]" );
                for (int i = 1; i <= filas; i++) {
                    for (int j = 1; j <= columnas; j++) {               
                        if(posicionTopoHorizontal==golpeHorizontalJugador && posicionTopoVertical==golpeVerticalJugador && golpeHorizontalJugador==i && golpeVerticalJugador==j){
                            System.out.print("[**]");
                            contadorPuntos++;
                        }else if(posicionTopoHorizontal2==golpeHorizontalJugador && posicionTopoVertical2==golpeVerticalJugador && golpeHorizontalJugador==i && golpeVerticalJugador==j){
                            System.out.print("[**]");
                            contadorPuntos++;
                        }else if(posicionTopoHorizontal==i && posicionTopoVertical==j){
                            System.out.print("(‘’)");
                        }else if(posicionTopoHorizontal2==i && posicionTopoVertical2==j){
                            System.out.print("(‘’)");
                        }else if(golpeHorizontalJugador==i && golpeVerticalJugador==j){
                            System.out.print("[[]]");
                        }else{
                            System.out.print("(  )");
                        }
                        if(j%columnas==0){
                            System.out.println();
                        }                 
                    }
                } 
                contadorTurnos++;
                System.out.println("Turno: [" + contadorTurnos +"] Aciertos: [" + contadorPuntos +"]");            
            }
        }    
    }    
}