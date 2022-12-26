import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double amountToPay, paidAmount, change, Subtract, quantity;

        System.out.println("Enter the amount to pay: ");
        amountToPay = sc.nextDouble();

        System.out.println("Enter the paid amount: ");
        paidAmount = sc.nextDouble();

        change = paidAmount - amountToPay;

        System.out.println("El cliente tiene que pagar " + amountToPay + " y entrega " + paidAmount + "€");

        if (paidAmount < amountToPay) {
            System.out.println("No le alcanza para pagar " + amountToPay + "€");
        } else {
            System.out.println("Se le devuelven " + change + "€");

            if ((change / 500) >= 1) {
                Subtract = change % 500;
                quantity = (change - Subtract) / 500;
                System.out.println("Se le devuelven " + (int) quantity + " billetes de 500€");
                change = Math.round((change - (quantity * 500)) * 100.0) / 100.0;
            }
            if ((change / 200) >= 1) {
                Subtract = change % 200;
                quantity = (change - Subtract) / 200;
                System.out.println("Se le devuelven " + (int) quantity + " billetes de 200€");
                change = Math.round((change - (quantity * 200)) * 100.0) / 100.0;
            }
            if ((change / 100) >= 1) {
                Subtract = change % 100;
                quantity = (change - Subtract) / 100;
                System.out.println("Se le devuelven " + (int) quantity + " billetes de 100€");
                change = Math.round((change - (quantity * 100)) * 100.0) / 100.0;
            }
            if ((change / 50) >= 1) {
                Subtract = change % 50;
                quantity = (change - Subtract) / 50;
                System.out.println("Se le devuelven " + (int) quantity + " billetes de 50€");
                change = Math.round((change - (quantity * 50)) * 100.0) / 100.0;
            }
            if ((change / 20) >= 1) {
                Subtract = change % 20;
                quantity = (change - Subtract) / 20;
                System.out.println("Se le devuelven " + (int) quantity + " billetes de 20€");
                change = Math.round((change - (quantity * 20)) * 100.0) / 100.0;
            }
            if ((change / 10) >= 1) {
                Subtract = change % 10;
                quantity = (change - Subtract) / 10;
                System.out.println("Se le devuelven " + (int) quantity + " billetes de 10€");
                change = Math.round((change - (quantity * 10)) * 100.0) / 100.0;
            }
            if ((change / 5) >= 1) {
                Subtract = change % 5;
                quantity = (change - Subtract) / 5;
                System.out.println("Se le devuelven " + (int) quantity + " billetes de 5€");
                change = Math.round((change - (quantity * 5)) * 100.0) / 100.0;
            }
            if ((change / 2) >= 1) {
                Subtract = change % 2;
                quantity = (change - Subtract) / 2;
                System.out.println("Se le devuelven " + (int) quantity + " monedas de 2€");
                change = Math.round((change - (quantity * 2)) * 100.0) / 100.0;
            }
            if ((change / 1) >= 1) {
                Subtract = change % 1;
                quantity = (change - Subtract) / 1;
                System.out.println("Se le devuelven " + (int) quantity + " monedas de 1€");
                change = Math.round((change - (quantity * 1)) * 100.0) / 100.0;
            }
            if ((change / 0.5) >= 1) {
                Subtract = change % 0.5;
                quantity = (change - Subtract) / 0.5;
                System.out.println("Se le devuelven " + (int) quantity + " monedas de 50 cent");
                change = Math.round((change - (quantity * 0.5)) * 100.0) / 100.0;
            }
            if ((change / 0.2) >= 1) {
                Subtract = change % 0.2;
                quantity = (change - Subtract) / 0.2;
                System.out.println("Se le devuelven " + (int) quantity + " monedas de 20 cent");
                change = Math.round((change - (quantity * 0.2)) * 100.0) / 100.0;
            }
            if ((change / 0.1) >= 1) {
                Subtract = change % 0.1;
                quantity = (change - Subtract) / 0.1;
                System.out.println("Se le devuelven " + (int) quantity + " monedas de 10 cent");
                change = Math.round((change - (quantity * 0.1)) * 100.0) / 100.0;
            }
            if ((change / 0.05) >= 1) {
                Subtract = change % 0.05;
                quantity = (change - Subtract) / 0.05;
                System.out.println("Se le devuelven " + (int) quantity + " monedas de 5 cent");
                change = Math.round((change - (quantity * 0.05)) * 100.0) / 100.0;
            }
            if ((change / 0.02) >= 1) {
                Subtract = change % 0.02;
                quantity = (change - Subtract) / 0.02;
                System.out.println("Se le devuelven " + (int) quantity + " monedas de 2 cent");
                change = Math.round((change - (quantity * 0.02)) * 100.0) / 100.0;
            }
            if ((change / 0.01) >= 1) {
                Subtract = change % 0.01;
                quantity = (change - Subtract) / 0.01;
                System.out.println("Se le devuelven " + (int) quantity + " monedas de 1 cent");
                change = Math.round((change - (quantity * 0.01)) * 100.0) / 100.0;
            }
        }

        sc.close();
    }

}