import java.util.Scanner;
public class WhacAMole {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        int turno = 1;
        int filas = 4;
        int columnas = 4;
        int puntos = 0;
        int huecoJugador;
        int huecoMaquina;
        int huecoMaquina2;

        while (turno <=16){
            
            System.out.println("Turno: " + turno);
            System.out.println("Elija un hueco al que golpear del 1 al 16");
            huecoJugador = s.nextInt();
            while(huecoJugador<=0 || huecoJugador > 16){
                System.out.println("ERROR, elija un numero del 1 al 16 ");
                huecoJugador = s.nextInt();
            }

            huecoMaquina = (int)((Math.random()*16)+1);

            huecoMaquina2 = (int)((Math.random()*16)+1);

            while(huecoMaquina == huecoMaquina2){
                huecoMaquina2 = (int)((Math.random()*16)+1);
            }
            System.out.println("Han salido el hueco " + huecoMaquina +" y el hueco " + huecoMaquina2);


            for (int i = 1; i <= filas; i++) {
                for (int j = 1; j <= columnas; j++) {
    
                    if(huecoJugador == huecoMaquina || huecoJugador == huecoMaquina2){

                        if (huecoJugador == huecoMaquina){
                            if(i == 1 + (huecoJugador / 4) && j == (huecoJugador % 4)){
                                System.out.print("[**]");
                                puntos++;
                            }else if(huecoJugador % 4 == 0 && i == huecoJugador / 4 && j == 4){
                                System.out.print("[**]");
                                puntos++;
                                
                            }else if(i == 1 + (huecoMaquina2 / 4) && j == (huecoMaquina2 % 4)){

                                System.out.print("(‘’)");
    
                            }else if (huecoMaquina2 % 4 == 0 && i == huecoMaquina2 / 4 && j == 4) {
    
                                System.out.print("(‘’)");
    
                            }else{
                                System.out.print("(  )");
                            }
                        }else if(huecoJugador == huecoMaquina2){
                            if(i == 1 + (huecoJugador / 4) && j == (huecoJugador % 4)){
                                System.out.print("[**]");
                                puntos++;
                            }else if(huecoJugador % 4 == 0 && i == huecoJugador / 4 && j == 4){
                                System.out.print("[**]");
                                puntos++;
                                
                            }else if(i == 1 + (huecoMaquina / 4) && j == (huecoMaquina % 4)){

                                System.out.print("(‘’)");
    
                            }else if (huecoMaquina % 4 == 0 && i == huecoMaquina / 4 && j == 4) {
    
                                System.out.print("(‘’)");
    
                            }else{
                                System.out.print("(  )");
                            }
                        }

                    
                    
                    }else {

                        if(i == 1 + (huecoJugador / 4) && j == (huecoJugador % 4)){

                            System.out.print("[[]]");

                        }else if (huecoJugador % 4 == 0 && i == huecoJugador / 4 && j == 4) {
                        
                            System.out.print("[[]]");

                        }else if(i == 1 + (huecoMaquina / 4) && j == (huecoMaquina % 4)){

                                System.out.print("(‘’)");

                        }else if (huecoMaquina % 4 == 0 && i == huecoMaquina / 4 && j == 4) {

                                System.out.print("(‘’)");

                        }else if(i == 1 + (huecoMaquina2 / 4) && j == (huecoMaquina2 % 4)){

                            System.out.print("(‘’)");

                        }else if (huecoMaquina2 % 4 == 0 && i == huecoMaquina2 / 4 && j == 4) {

                            System.out.print("(‘’)");

                        }else{

                            System.out.print("(  )");
                        }

                    }
                }
                System.out.println();
            }
            turno++;

        }
        System.out.println();
        System.out.println("Puntuacion final = " + puntos);

        s.close();
    }
}
