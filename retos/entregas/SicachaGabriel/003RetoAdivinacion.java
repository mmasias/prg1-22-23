import java.util.Scanner;

public class Adivinacion {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        int R;
        System.out.println("Utilize 1 para SI, 0 para No");
        System.out.println("");
        System.out.println("Piense un número del 1 al 99");
        System.out.println("");
        for (int i = 1; i<=7; i++){
            System.out.println("Está tu número en la tarjeta "+ i);
            R = entrada.nextInt();
            if (i == 1 && R == 1){
                num = num + 1;
            }
            if (i == 2 && R == 1){
                num = num + 2;
            }
            if (i == 3 && R == 1){
                num = num + 4;
            }
            if (i == 4 && R == 1){
                num = num + 8;
            }
            if (i == 5 && R == 1){
                num = num + 16;
            }
            if (i == 6 && R == 1){
                num = num + 32;
            }
            if (i == 7 && R == 1){
                num = num + 64;
            }
            if (num > 99){
                System.out.println("No parece que estes siguiendo las instrucciones apropiadamente");
            }
        }
        System.out.println("El numero pensado es " + num);
        entrada.close();

    }
}
