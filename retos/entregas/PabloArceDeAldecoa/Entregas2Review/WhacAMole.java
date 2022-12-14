import java.util.*;
public class WhacAMole{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int casilla = 0, topo = 0, aciertos=0;
        for (int z=1; z<=16; z++){
            String estado = "fallo";
            topo = (int)(Math.random()*16)+1; 
            System.out.print("Golpe entre 1 y 16:   ");
            int mazo = entry.nextInt();
            System.out.println("Golpe en ["+mazo+"] / Monigote en ["+topo+"]");
            System.out.println("+"+("- ").repeat(18)+"+");
            for (int i=0;i<=3;i++){
                System.out.print("|  ");
                for (int j=1;j<=4;j++){
                    casilla= i*4+j;
                    if (topo != mazo || casilla!=mazo)
                        if (casilla == mazo){System.out.print("  ([])  ");}
                        else if (casilla == topo){System.out.print("  ('')  ");}
                        else {System.out.print("  (  )  ");}
                    else{System.out.print("  (**)  "); aciertos++; estado = "acierto";}
                }
                System.out.println("  |");
            }
            System.out.println("+"+("- ").repeat(18)+"+");
            System.out.println("Turno["+z+"]  /  Aciertos["+aciertos+"]\n["+estado+"]\n"+("= ").repeat(18));
        }
        entry.close();
    }
}