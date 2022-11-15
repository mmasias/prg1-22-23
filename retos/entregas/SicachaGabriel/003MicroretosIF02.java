import java.util.Scanner;

public class Division {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        float num1;
        float num2;
        float div;
        System.out.println("Introdusca el primer numero");
        num1 = entrada.nextInt();
        System.out.println("introdusca el segundo");
        num2 = entrada.nextInt();
        if (num2 == 0){
            System.out.println("no puede dividir por 0");
        } else {
            div = num1/num2;
            System.out.println("el resultado es "+ div);
        }
        entrada.close();
    }
}
