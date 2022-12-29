import java.util.Scanner;

public class MaxNumberAdvanced {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numberOne;
        int numberTwo;
        int maxNumber;

        System.out.println("Ingresa un numero");
        numberOne = sc.nextInt();
        System.out.println("Ingresa otro numero");
        numberTwo = sc.nextInt();

        if (numberOne > numberTwo) {
            maxNumber = numberOne;
        } else if (numberTwo > numberOne) {
            maxNumber = numberTwo;
        } else {
            maxNumber = numberOne;
            System.out.println("Son iguales");
        }
        System.out.println("El numero mayor es " + maxNumber);

        sc.close();

    }
}