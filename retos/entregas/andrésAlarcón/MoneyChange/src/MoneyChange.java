import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) throws Exception {

        Scanner sc= new Scanner(System.in);

        int amountBills, bill500 = 500, bill200 = 200, bill100 = 100, bill50 = 50, bill20 = 50, bill10 = 50, bill5 = 5, coin2 = 10, coin1 = 1 ;

        double coins01 = 0.5, coins02 = 0.2, coins03 = 0.1, coins04 = 0.05, coins05 = 0.01;

        double amountPaid, amountToPaid, amountChange;

        System.out.println("Enter the amount paid: ");
        amountPaid = sc.nextDouble();

        System.out.println("Enter the amount to paid: ");
        amountToPaid = sc.nextDouble();

        amountBills = (int) (amountChange / bill500);

        amountChange = (amountPaid - amountToPaid);


        if (amountChange > 0) {
            amountChange = amountChange - (bill500 * amountBills);
            System.out.println("");
            amountChange = (int) (amountChange * bill500);
        }

        sc.close();
    }
}
