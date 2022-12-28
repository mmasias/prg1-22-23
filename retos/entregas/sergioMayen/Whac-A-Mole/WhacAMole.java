import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class WhacAMole {
    private static int intentos = 4, ingresaY, ingresaX, puntos = 0;
    private static int[][] posicionTopo = definirTopo();
    private static String[][] mapaTopo = new String[4][4];
    
    public static void main (String[] arg){
        while(intentos > 0){
            System.out.println(Arrays.deepToString(posicionTopo));
            Scanner siguiente = new Scanner(System.in);

            pregunta();

            if(esTopo(ingresaX, ingresaY)){
                System.out.println("¡TOPO!");
                System.out.println("¡Haz acertado!");
            }
            else{
                System.out.println("¡FALLASTE!");
            }

            imprimirMapa();
            puntuacion();
            siguiente.nextLine();
            intentos --;
        }
    }

    private static int[][] definirTopo(){
        int[][] topo = new int[3][2];
        Random random = new Random();
        for (int i = 0; i < topo.length; i++) {
            topo[i][1] =  random.nextInt(3+1);
            topo[i][0] =  random.nextInt(3+1);
        }
        double distinctCount = Stream.of(topo).distinct().count();
        if(distinctCount != 3.0){
            return definirTopo();
        }
        else{
            return topo;
        }
    }

    private static boolean esTopo(int ingresaX, int ingresaY){
        for (int[] minaActual : posicionTopo) {
            if(ingresaX == minaActual[0] && ingresaY == minaActual[1]) {
                if(mapaTopo[ingresaY][ingresaX] != "(**)"){
                    mapaTopo[ingresaY][ingresaX] = "(**)";
                    puntos ++;
                }
                return true;
            }
            else if(mapaTopo[ingresaY][ingresaX]== null){
                mapaTopo[ingresaY][ingresaX] = "[[]]";
            }
        }
        return false;
    }

    private static void imprimirMapa(){
        imprimirBorde();
        for(int i = 0; i<mapaTopo.length; i++){
            System.out.print("  ");
            for(int j = 0; j<mapaTopo[0].length; j++){
                
                if(mapaTopo[i][j]== "[[]]"){
                    System.out.print("[[]]");
                }
                else if(mapaTopo[i][j]== "(**)"){
                    System.out.print(" (**) ");
                }
                else{
                    System.out.print(" ( ) ");
                }
            }
            System.out.println();
        }
        imprimirBorde();
    }

    private static void imprimirBorde(){
        System.out.println("*----------------------*");
    }

    private static void pregunta(){
        Scanner siguiente = new Scanner(System.in);
        System.out.println("Ingrese la posicion en X que quiere seleccionar (1-4)");
        ingresaX = siguiente.nextInt() -1;
        System.out.println("Ingrese la posicion en Y que quiere seleccionar (1-4)");
        ingresaY = siguiente.nextInt() -1;
    }

    private static void puntuacion(){
        System.out.println("PUNTOS GANADOS "+ puntos);
        System.out.println("INTENTOS "+ intentos);
    }
}
