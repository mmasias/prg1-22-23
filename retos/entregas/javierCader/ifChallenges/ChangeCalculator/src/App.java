import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Change Calculator");
        Scanner scanner = new Scanner(System.in);

        int billetes500 = 0, billetes200 = 0, billetes100 = 0, billetes50 = 0, billetes20 = 0, billetes10 = 0,
                billetes5 = 0;

        int monedas2 = 0, monedas1 = 0, monedas05 = 0, monedas02 = 0, monedas01 = 0, monedas005 = 0, monedas001 = 0;

        System.out.println("Input the amount to pay:");
        double toPay = scanner.nextDouble();
        System.out.println("Input the amount given:");
        double given = scanner.nextDouble();

        double change = given - toPay;
        System.out.println(change);

        billetes500 = (int) (change / 500);
        change = change - (billetes500 * 500);
        if (billetes500 > 0) {
            System.out.println("Numero de billetes de 500: " + billetes500);
        }

        billetes200 = (int) (change / 200);
        change = change - (billetes200 * 200);
        if (billetes200 > 0) {
            System.out.println("Numero de billetes de 200: " + billetes200);
        }

        billetes100 = (int) (change / 100);
        change = change - (billetes100 * 100);
        if (billetes100 > 0) {
            System.out.println("Numero de billetes de 100: " + billetes100);
        }

        billetes50 = (int) (change / 50);
        change = change - (billetes50 * 50);
        if (billetes50 > 0) {
            System.out.println("Numero de billetes de 50: " + billetes50);
        }

        billetes20 = (int) (change / 20);
        change = change - (billetes20 * 20);
        if (billetes20 > 0) {
            System.out.println("Numero de billetes de 20: " + billetes20);
        }

        billetes10 = (int) (change / 10);
        change = change - (billetes10 * 10);
        if (billetes10 > 0) {
            System.out.println("Numero de billetes de 10: " + billetes10);
        }

        billetes5 = (int) (change / 5);
        change = change - (billetes5 * 5);
        if (billetes5 > 0) {
            System.out.println("Numero de billetes de 5: " + billetes5);
        }

        monedas2 = (int) (change / 2);
        change = change - (monedas2 * 2);
        if (monedas2 > 0) {
            System.out.println("Numero de monedas de 2: " + monedas2);
        }

        monedas1 = (int) (change / 1);
        change = change - (monedas1 * 1);
        if (monedas1 > 0) {
            System.out.println("Numero de monedas de 1: " + monedas1);
        }

        monedas05 = (int) (change / 0.5);
        change = change - (monedas05 * 0.5);
        if (monedas05 > 0) {
            System.out.println("Numero de monedas de 0.5: " + monedas05);
        }

        // System.out.println("Change antes de Monedas 0.2:" + change); por alguna razon
        // aqui le quita una decima
        monedas02 = (int) (change / 0.2);
        change = change - (monedas02 * 0.2);
        if (monedas02 > 0) {
            System.out.println("Numero de monedas de 0.2: " + monedas02);
        }

        monedas01 = (int) (change / 0.1);
        change = change - (monedas01 * 0.1);
        if (monedas01 > 0) {
            System.out.println("Numero de monedas de 0.1: " + monedas01);
        }

        monedas005 = (int) ((change) / 0.05);
        change = change - (monedas005 * 0.05);
        if (monedas005 > 0) {
            System.out.println("Numero de monedas de 0.05: " + monedas005);
        }

        monedas001 = (int) (change / 0.01);
        change = change - (monedas001 * 0.01);
        if (monedas001 > 0) {
            System.out.println("Numero de monedas de 0.01: " + monedas001);
        }

        scanner.close();
    }
}
