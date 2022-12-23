import java.util.Scanner;
public class RetoDevolverCambio {
    public static void main(String [] args) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        double dineroPagado, dineroAPagar, CantidadDeBilletes, resto;
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

        System.out.print("Dinero entregado (en euros): ");
        dineroPagado = entrada.nextDouble();

        System.out.print("Dinero a pagar (en euros): ");
        dineroAPagar = entrada.nextDouble();

        System.out.println("               ");

        if (dineroPagado < dineroAPagar){
            System.out.println("Falta dinero para completar el pago");
            System.out.println();
        }else if (dineroAPagar == dineroPagado){
            System.out.println("No hay cambio");
            System.out.println();
        }else{
            double devolucionDinero = dineroPagado - dineroAPagar;
            System.out.println("Se procede a devolver: "+ devolucionDinero + " euros");
            System.out.println();
            System.out.println("Se devuleve tanto dinero: ");
            System.out.println();

            
            CantidadDeBilletes = (int)devolucionDinero/billete500;
            resto = devolucionDinero % billete500;
            if(CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println( CantidadDeBilletes +" billete(s) de 500 euros");
            }

            
            CantidadDeBilletes = resto / billete200;
            resto = resto % billete200;
            if (CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println(CantidadDeBilletes +" billete(s) de 200 euros"); 
            }

            
            CantidadDeBilletes = resto / billete100;
            resto = resto % billete100;
            if (CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println(CantidadDeBilletes +" billete(s) de 100 euros");
            }

            
            CantidadDeBilletes = resto / billete50;
            resto = resto % billete50;
            if (CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println(CantidadDeBilletes +" billete(s) de 50 euros");
            }

           
            CantidadDeBilletes = resto / billete20;
            resto = resto % billete20;
            if (CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println(CantidadDeBilletes +" billete(s) de 20 euros");
            }

           
            CantidadDeBilletes = resto / billete10;
            resto = resto % billete10;
            if (CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println(CantidadDeBilletes +" billete(s) de 10 euros");
            }

            
            CantidadDeBilletes = resto / billete5;
            resto = resto % billete5;
            if (CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println(CantidadDeBilletes +" billete(s) de 5 euros");
            }

            
            CantidadDeBilletes = resto / moneda2;
            resto = resto % moneda2;
            if (CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println(CantidadDeBilletes +" moneda(s) de 2 euros");
            }

            
            CantidadDeBilletes = resto / moneda1;
            resto = resto % moneda1;
            if (CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println(CantidadDeBilletes +" moneda(s) de 1 euro(s)");
            }

           
            CantidadDeBilletes = resto / moneda05;
            resto = resto % moneda05;
            if (CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println(CantidadDeBilletes +" moneda(s) de 0.5 euros");
            }

           
            CantidadDeBilletes = resto/moneda02;
            resto = resto % moneda02;
            if (CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println(CantidadDeBilletes +" moneda(s) de 0.2 euros");
            }

            
            CantidadDeBilletes = resto / moneda01;
            resto = resto % moneda01;
            if (CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println(CantidadDeBilletes +" moneda(s) de 0.1 euro(s)");
            }

           
            CantidadDeBilletes = resto / moneda005;
            resto = resto % moneda005;
            if (CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println(CantidadDeBilletes +" moneda(s) de 0.05 euros");
            }

            
            CantidadDeBilletes = resto / moneda001;
            resto = resto % moneda001;
            if (CantidadDeBilletes >= 1){

                CantidadDeBilletes = (int)CantidadDeBilletes;
                System.out.println(CantidadDeBilletes +" moneda(s) de 0.01 euro(s)");
            }

        }
        System.out.println("         ");

        entrada.close();
    }
    
    
}
