import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) throws Exception {

        Scanner sc= new Scanner(System.in);

        double coins = (€2, €1, €0.5, €0.20, €0.10, €0.05, €0.01);
        double amountPaid, amountToPaid, amountChange;

        System.out.println("Enter the amount paid: ");
        amountPaid = sc.nextDouble();
        System.out.println("Enter the amount to paid: ");
        amountToPaid = sc.nextDouble();



        sc.close();
    }
}
