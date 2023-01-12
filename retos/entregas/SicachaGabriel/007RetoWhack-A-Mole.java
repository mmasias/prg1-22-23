import java.util.Scanner;

public class Whack {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int PosicionMole = 0;
        int PosicionMole2= 0;
        int PosicionPasada1;
        int PosicionPasada2;
        int PosicionGolpe = 0;
        int NumeroAciertos = 0;
        String BordeHorizontal = "+----------------------------+";
        String Acierto = " [**] ";
        String Mole = " [''] ";
        String Golpe = " [[]] ";
        String Agujero = " (  ) ";
        String Barra = "==============================";


        System.out.println("Preparate!");
        for (int turno = 1; turno <= 15; turno ++){
            PosicionPasada1 = PosicionMole;
            PosicionPasada2 = PosicionMole2;


            System.out.println("Golpe en ["+PosicionGolpe+"] / Monigotes en ["+PosicionMole+"] y ["+PosicionMole2+"]");
            System.out.println(BordeHorizontal);
            for (int i = 1; i <= 16; i++){
                if (i%4 == 1){
                    System.out.print("|  ");
                }
                if ((i == PosicionGolpe)&&(i == PosicionMole || i == PosicionMole2)){
                    System.out.print(Acierto);
                } else if (i == PosicionGolpe){
                    System.out.print(Golpe);
                } else if (i == PosicionMole || i == PosicionMole2){
                    System.out.print(Mole);
                } else {
                    System.out.print(Agujero);
                }
                if ((i+1)%4 == 1){
                    System.out.println("  |");
                }
            }
            System.out.println(BordeHorizontal);
            System.out.println("Turno:["+ turno +"] / Aciertos:["+ NumeroAciertos+"]");
            if (turno != 1){
                if ((PosicionGolpe == PosicionMole)||(PosicionGolpe == PosicionMole2){
                    System.out.println("[ACIERTO]");
                    NumeroAciertos = NumeroAciertos + 1;
                } else {
                    System.out.println("[FALLO]");
                } 
            }

            
            System.out.println(Barra);
            System.out.println("Golpe (entre 1 y 16):");
            do {
                PosicionMole = (int) (Math.random()*16) +1;
                PosicionMole2 = (int) (Math.random()*16) +1;
            } while (PosicionMole == PosicionPasada1 || PosicionMole2 == PosicionPasada2);
            
            while (PosicionMole2 == PosicionMole){
                PosicionMole2 = (int) (Math.random()*16) +1;
            }
            PosicionGolpe = entrada.nextInt();
        }
        entrada.close();
    }
}   

