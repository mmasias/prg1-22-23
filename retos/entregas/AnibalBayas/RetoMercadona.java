import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class RetoMercadona {
    public static void main(String[] args) {
        int PersonasEnCola = 0;
        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int Colavacia = 0;
        int GenteQueLlega=0;
        int itemstotales=0;

        for (int i = 0; i < 721; i = i + 1) {
            int llegagente = (int) (Math.random() * 11) + 1;

            System.out.println();
            System.out.println(
                    "--------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.print("Minuto " + i);
            System.out.print(" --- Gente en cola: " + PersonasEnCola);

            if (PersonasEnCola < 1) {
                Colavacia = Colavacia + 1;

            } else {

            }

            if (llegagente <= 4) {
                PersonasEnCola = PersonasEnCola + 1;
                System.out.println(" --- Llega una persona a la cola");
                GenteQueLlega= GenteQueLlega+1;

            } else {
                System.out.println(" --- No ha llegado nadie");

            }
            if (caja1 < 1 && PersonasEnCola > 0) {
                caja1 = caja1 + 1;
                PersonasEnCola = PersonasEnCola - 1;
                caja1 = (int) (Math.random() * 10 + 6);
                System.out.print("Pasa una persona a la caja 1 portando " + caja1 + " items -----");
                itemstotales= itemstotales+caja1;

            }
            if (caja1 > 0) {
                caja1 = caja1 - 1;
                System.out.println(">  La caja 1 atiende un item, le quedan " + caja1);
            }
            if (caja2 < 2 && PersonasEnCola > 0) {
                caja2 = caja2 + 1;
                PersonasEnCola = PersonasEnCola - 1;
                caja2 = (int) (Math.random() * 10 + 6);
                System.out.print("Pasa una persona a la caja 2 portando " + caja2 + " items -----");
                itemstotales= itemstotales+caja2;

            }
            if (caja2 > 0) {
                caja2 = caja2 - 1;
                System.out.println(">  La caja 2 atiende un item, le quedan " + caja2);
            }
            if (caja3 < 2 && PersonasEnCola > 0) {
                caja3 = caja3 + 1;
                PersonasEnCola = PersonasEnCola - 1;
                caja3 = (int) (Math.random() * 10 + 6);
                System.out.print("Pasa una persona a la caja 3 portando " + caja3 + " items -----");
                itemstotales= itemstotales+caja3;

            }
            if (caja3 > 0) {
                caja3 = caja3 - 1;
                System.out.println(">  La caja 3 atiende un item, le quedan " + caja3);
            }
            if (caja4 < 2 && PersonasEnCola > 0) {
                caja4 = caja4 + 1;
                PersonasEnCola = PersonasEnCola - 1;
                caja4 = (int) (Math.random() * 10 + 6);
                System.out.print("Pasa una persona a la caja 4 portando " + caja4 + " items -----");
                itemstotales= itemstotales+caja4;

            }
            if (caja4 > 0) {
                caja4 = caja4 - 1;
                System.out.println(">  La caja 4 atiende un item, le quedan " + caja4);
            }
                                 

        }
        System.out.println("");        
        System.out.println("En la cola al finalizar habia "+ PersonasEnCola +" persona(s)");  
        System.out.println("Durante "+Colavacia+" minuto(s) la cola estaba vacía");
        System.out.println("En total han pasado "+GenteQueLlega+" personas por la cola");
        System.out.println("En total se han procesado "+itemstotales+" items"); 
    }

}
