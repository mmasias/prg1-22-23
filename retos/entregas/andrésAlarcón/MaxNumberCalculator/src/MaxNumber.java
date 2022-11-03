import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int numberOne;
        int numberTwo;
        int maxNumber;

        System.out.println("Ingresa un numero");
        numberOne = sc.nextInt();
        System.out.println("Ingresa otro numero");
        numberTwo = sc.nextInt();

        maxNumber = ((numberOne + numberTwo)+(numberOne - numberTwo))/2;

        System.out.println("El numero mayor es " + maxNumber);

        sc.close();
        

    }
}
