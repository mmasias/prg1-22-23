import java.util.Scanner;
public class WhacAMole {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int golpesAcertados = 0;
        int golpesFallados = 0;
        int intentosMaximos = 15;
        String AgujeroVacio = "(  )";
        String AgujeroMole = "(··)";
        String agujeroGolpe = "[[]]";
        String agujeroGolpeMole = "[**]";


        for (int i=0; i<intentosMaximos; i++){
            int numeroAleatorio = (int) (Math.random()*16);
            int numeroAleatorio2 = (int) (Math.random()*16);
            while (numeroAleatorio == numeroAleatorio2){
                numeroAleatorio2 = (int) (Math.random()*16);
            }
            System.out.print("Elige un numero del 1 al 16: ");
            int numeroElejido = sc.nextInt();

            System.out.println("+---------------------------------------+");
            for (int j=1; j<=16; j++){
                if (j == numeroAleatorio && j == numeroElejido){
                    System.out.print(agujeroGolpeMole);
                }else if (j == numeroAleatorio2 && j == numeroElejido){
                    System.out.print(agujeroGolpeMole);
                }else if (j == numeroElejido){
                    System.out.print(agujeroGolpe);
                }else if (j == numeroAleatorio){
                    System.out.print(AgujeroMole);
                }else if (j == numeroAleatorio2){
                    System.out.print(AgujeroMole);    
                }else{
                    System.out.print(AgujeroVacio);
                }
                if (j%4 == 0){
                    System.out.println();
                }
            }
            System.out.println("+---------------------------------------+");
            if(numeroAleatorio == numeroElejido || numeroAleatorio2 == numeroElejido){
                System.out.println("Golpeaste al topo");
                golpesAcertados++;
            }else{
                System.out.println("Fallaste");
                golpesFallados++;
            }
            System.out.println("Golpes acertados: " + golpesAcertados);
            System.out.println("Golpes fallados: " + golpesFallados);
            i++;
            System.out.println("Llevas " + i + " intentos");
            i--;
            System.out.println("+---------------------------------------+");
            System.out.println("");
            System.out.println("");
        }   
    }
}