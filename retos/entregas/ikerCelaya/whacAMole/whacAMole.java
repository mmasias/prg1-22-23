import java.util.Scanner;

public class whacAMole {
    public static void main(String[]args){
        int dimension = 4;
        int turno = 1;
        int acierto = 0;
        int casilla = 0;
        int topo = 0; 
        int topo1=0;
        int contador = 1;

        Scanner entrada =  new Scanner(System.in);

        do{
            contador = 1;
            topo = ((int) (Math.random() * 100) % 16) + 1;
            do{
                topo1 = ((int) (Math.random() * 100) % 16) + 1;
            }
            while(topo==topo1);
            do{
                System.out.println("Golpe (entre 1 y 16)");
                casilla = entrada.nextInt();
            } 
            while(casilla < 0 || casilla > 16);
            for(int j = 1; j <= dimension; j = j + 1) {
                for(int i = 1; i <= dimension; i = i + 1) {
                    if(casilla == topo && casilla == contador) {
                        System.out.print(" [**] ");
                        acierto++;
                    } 
                    else if(casilla == topo1 && casilla == contador) {
                        System.out.print(" [**] ");
                        acierto++;
                    } 
                    else if(contador == casilla) {
                        System.out.print(" [[]] ");
                    } 
                    else if(contador == topo || contador==topo1) {
                        System.out.print(" [''] ");
                    } 
                    else {
                        System.out.print(" (  ) ");
                    }
                    contador++;
                }
                System.out.println();
            }
            System.out.println("Turno: " + turno + "  /  Aciertos: " + acierto);
            turno++;
        } 
        while(turno <= 16);
        System.out.println("El juego se ha acabado. Conseguiste: " + acierto + " aciertos");
    }
}
