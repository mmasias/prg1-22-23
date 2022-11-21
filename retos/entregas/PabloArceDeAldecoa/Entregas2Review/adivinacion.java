import java.util.Scanner;
public class adivinacion {
    public static void main(String[] args) {
        Scanner entry= new Scanner(System.in);
        int numero=0;
        System.out.println(("-").repeat(20)+"\n       0 = NO\n       1 = SI\n"+("-").repeat(20));
        System.out.println("Piensa un numero del 1 al 99");
        for (int i=0;i<=6;i++){
            System.out.print("¿Esta en la tabla "+(i+1)+"? ");int opcion=entry.nextInt();
            if (opcion == 1){numero+=Math.pow(2,i);}
        }
    System.out.println("Tu número es el "+numero+".");
    }
}
