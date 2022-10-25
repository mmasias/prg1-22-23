
import java.util.Scanner;

public class DevolucionCambio {
    public static void main(String [] args) {
        System.out.println("\n");
        Scanner s = new Scanner(System.in);
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
        dineroEntregado = s.nextDouble();

        System.out.print("Monto a pagar (en euros): ");
        dineroAPagar = s.nextDouble();

        System.out.println();
        if (dineroEntregado < dineroAPagar){
            System.out.println("Aqui falta dinero, no hay suficiente para pagar su compra.");
            System.out.println();
        }else if (dineroAPagar == dineroEntregado){
            System.out.println("Lo ha pagado justo, no se tiene que devolver cambio.");
            System.out.println();
        }else{
            double devolucionDinero = dineroEntregado - dineroAPagar;
            System.out.println("se debe devolver la cantidad de "+ devolucionDinero);
            System.out.println("Se deben entregar: ");

            numeroDeBilletes = (int)devolucionDinero/billete500;
            resto = devolucionDinero % billete500;
            if(numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println( numeroDeBilletes +" billete(s) de 500");
            }

            numeroDeBilletes = resto / billete200;
            resto = resto % billete200;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" billete(s) de 200"); 
            }

            numeroDeBilletes = resto / billete100;
            resto = resto % billete100;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" billete(s) de 100");
            }

            numeroDeBilletes = resto / billete50;
            resto = resto % billete50;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" billete(s) de 50");
            }

            numeroDeBilletes = resto / billete20;
            resto = resto % billete20;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" billete(s) de 20");
            }

            numeroDeBilletes = resto / billete10;
            resto = resto % billete10;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" billete(s) de 10");
            }

            numeroDeBilletes = resto / billete5;
            resto = resto % billete5;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" billete(s) de 5");
            }

            numeroDeBilletes = resto / moneda2;
            resto = resto % moneda2;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 2");
            }

            numeroDeBilletes = resto / moneda1;
            resto = resto % moneda1;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 1");
            }

            numeroDeBilletes = resto / moneda05;
            resto = resto % moneda05;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 0.5");
            }

            numeroDeBilletes = resto/moneda02;
            resto = resto % moneda02;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 0.2");
            }

            numeroDeBilletes = resto / moneda01;
            resto = resto % moneda01;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 0.1");
            }

            numeroDeBilletes = resto / moneda005;
            resto = resto % moneda005;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 0.05");
            }

            numeroDeBilletes = resto / moneda001;
            resto = resto % moneda001;
            if (numeroDeBilletes >= 1){

                numeroDeBilletes = (int)numeroDeBilletes;
                System.out.println(numeroDeBilletes +" moneda(s) de 0.01");
            }

        }

        s.close();
    }
}
