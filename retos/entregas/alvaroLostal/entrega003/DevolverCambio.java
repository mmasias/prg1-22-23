import java.util.Scanner;

public class DevolverCambio {
    public static void main(String [] args) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        double dineroEntregado, dineroAPagar, numeroDeBilletes, resto;
        int billete500 = 500;
        int billete200 = 200;
        int billete100 = 100;
        int billete50 = 50;
        int billete20 = 20;
        int billete10 = 10;
        int billete5 = 5;
        int moneda2 = 2;
        int moneda1 = 1;
        double moneda05 = 0.5;
        double moneda02 = 0.2;
        double moneda01 = 0.1;
        double moneda005 = 0.05;
        double moneda001 = 0.01;

        System.out.print("Monto entregado (en euros): ");
        dineroEntregado = entrada.nextDouble();

        System.out.print("Monto a pagar (en euros): ");
        dineroAPagar = entrada.nextDouble();

        System.out.println("------");

        if (dineroEntregado < dineroAPagar){
            System.out.println("No hay dinero suficiente para realizar el pago");
            System.out.println();
        }else if (dineroAPagar == dineroEntregado){
            System.out.println("No hay cambio");
            System.out.println();
        }else{
            double devolucionDinero = dineroEntregado - dineroAPagar;
            System.out.println("Se procede a devolver: "+ devolucionDinero + " euros");
            System.out.println();
            System.out.println("Se realiza de la siguiente manera: ");
            System.out.println();

            numeroDeBilletes = (int)devolucionDinero/billete500;
            resto = devolucionDinero % billete500;
            if(numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println( numeroDeBilletes +" billete(s) de 500 euros");
            }

            numeroDeBilletes = resto / billete200;
            resto = resto % billete200;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" billete(s) de 200 euros"); 
            }

            numeroDeBilletes = resto / billete100;
            resto = resto % billete100;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" billete(s) de 100 euros");
            }

            numeroDeBilletes = resto / billete50;
            resto = resto % billete50;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" billete(s) de 50 euros");
            }

            numeroDeBilletes = resto / billete20;
            resto = resto % billete20;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" billete(s) de 20 euros");
            }

            numeroDeBilletes = resto / billete10;
            resto = resto % billete10;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" billete(s) de 10 euros");
            }

            numeroDeBilletes = resto / billete5;
            resto = resto % billete5;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" billete(s) de 5 euros");
            }

            numeroDeBilletes = resto / moneda2;
            resto = resto % moneda2;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 2 euros");
            }

            numeroDeBilletes = resto / moneda1;
            resto = resto % moneda1;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 1 euros");
            }

            numeroDeBilletes = resto / moneda05;
            resto = resto % moneda05;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 0.5 euros");
            }

            numeroDeBilletes = resto/moneda02;
            resto = resto % moneda02;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 0.2 euros");
            }

            numeroDeBilletes = resto / moneda01;
            resto = resto % moneda01;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 0.1 euros");
            }

            numeroDeBilletes = resto / moneda005;
            resto = resto % moneda005;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 0.05 euros");
            }

            numeroDeBilletes = resto / moneda001;
            resto = resto % moneda001;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 0.01 euros");
            }

        }
        System.out.println("------");

        entrada.close();
    }
}