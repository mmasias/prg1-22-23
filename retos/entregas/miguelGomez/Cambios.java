import java.util.Scanner;

public class Cambios{
    public static void main (String Args[]){
    // Recuerda que las entradas de scanner con decimales deben ponerse con una ","
    
    Scanner entrada = new Scanner(System.in);

    System.out.println("¿Cúal es el importe a pagar?");
    Double Cobro = entrada.nextDouble();

    System.out.println("¿Con cuánto pagarás los " + Cobro + "€ que cuesta tu compra?");
    Double Pago = entrada.nextDouble();
    
    CalcularyDevolverCambio(Pago,Cobro);
    
        entrada.close();
    } 

    static void CalcularyDevolverCambio(double Pago, double Cobro){
        System.out.println("Se han recibido " + Pago + "€");
        System.out.println("---------------------------------");
        System.out.println("El precio del producto es de " + Cobro + "€");
        
        double Cambio = Pago - Cobro;
        
        System.out.println("Se deben devolver: " + Cambio + "€");
        System.out.println("Se devuelve de esta manera:");
        System.out.println("+--------------------------+");
        
        Cambio = ContarBilletes500(Cambio);
        
        Cambio = ContarBilletes200(Cambio);
        
        Cambio = ContarBilletes100(Cambio);
        
        Cambio = ContarBilletes50(Cambio);
        
        Cambio = ContarBilletes20(Cambio);
        
        Cambio = ContarBilletes10(Cambio);
        
        Cambio = ContarBilletes5(Cambio);
        
        Cambio = ContarMonedas2(Cambio);
        
        Cambio = ContarMonedas1(Cambio);
        
        Cambio = ContarMonedas0_5(Cambio);
        
        Cambio = ContarMonedas0_2(Cambio);
        
        Cambio = ContarMonedas0_1(Cambio);
        
        Cambio = ContarMonedas0_05(Cambio);
        }

    static double ContarBilletes500(double Cambio){
        
        if(Cambio >= 500){
            double Billetes500 = Cambio/500;            
            Cambio = Cambio - Math.floor(Billetes500) * 500;
            System.out.println("Se devuelven " + Math.floor(Billetes500) + " billetes de 500€");
            
        }
        return Cambio;
    }

    static double ContarBilletes200(double Cambio){
        if(Cambio >= 200 && Cambio < 500){
            double Billetes200 = Cambio/200;
            Cambio = Cambio - Math.floor(Billetes200) * 200;
            System.out.println("Se devuelven " + Math.floor(Billetes200) + " billetes de 200€");
            }
            return Cambio;
    }

    static double ContarBilletes100(double Cambio){
        if(Cambio >= 100 && Cambio < 200){
            double Billetes100 = Cambio/100;
            Cambio = Cambio - Math.floor(Billetes100) * 100;
            System.out.println("Se devuelven " + Math.floor(Billetes100) + " billetes de 100€");
            }
            return Cambio;
    }

    static double ContarBilletes50(double Cambio){
        if (Cambio >= 50 && Cambio < 100){
            double Billetes50 = Cambio/50;
            Cambio = Cambio - Math.floor(Billetes50) * 50;
            System.out.println("Se devuelven " + Math.floor(Billetes50) + " billetes de 50€");
            }
            return Cambio;
    }

    static double ContarBilletes20(double Cambio){
        if (Cambio >= 20 && Cambio < 50){
            double Billetes20 = Cambio/20;
            Cambio = Cambio - Math.floor(Billetes20) * 20;
            System.out.println("Se devuelven " + Math.floor(Billetes20) + " billetes de 20€");
            }
            return Cambio;
    }

    static double ContarBilletes10(double Cambio){
        if (Cambio >= 10 && Cambio < 20){
            double Billetes10 = Cambio/10;
            Cambio = Cambio - Math.floor(Billetes10) * 10;
            System.out.println("Se devuelven " + Math.floor(Billetes10) + " billetes de 10€");
            }
            return Cambio;
    }

    static double ContarBilletes5(double Cambio){
        if (Cambio >= 5 && Cambio < 10){
            double Billetes5 = Cambio/5;
            Cambio = Cambio - Math.floor(Billetes5) * 5;
            System.out.println("Se devuelven " + Math.floor(Billetes5) + " billetes de 5€");
            }
            return Cambio; 
    }

    static double ContarMonedas2(double Cambio){
    if (Cambio >= 2 && Cambio < 5){
        double Monedas2 = Cambio/2;
        Cambio = Cambio - Math.floor(Monedas2) * 2;
        System.out.println("Se devuelven " + Math.floor(Monedas2) + " monedas de 2€");
        }
        return Cambio;
}

    static double ContarMonedas1(double Cambio){
        if (Cambio >= 1 && Cambio < 2){
            double Monedas1 = Cambio/1;
            Cambio = Cambio - Math.floor(Monedas1) * 1;
            System.out.println("Se devuelven " + Math.floor(Monedas1) + " monedas de 1€");
            }
            return Cambio;
    }

    static double ContarMonedas0_5(double Cambio){
        if (Cambio >= 0.5 && Cambio < 1){
            double Monedas0_5 = Cambio/0.5;
            Cambio = Cambio - Math.floor(Monedas0_5) * 0.5;
            System.out.println("Se devuelven " + Math.floor(Monedas0_5) + " monedas de 0.5€");
            }
            return Cambio;
    }

    static double ContarMonedas0_2(double Cambio){
        if (Cambio >= 0.2 && Cambio < 0.5){
            double Monedas0_2 = Cambio/0.2;
            Cambio = Cambio - Math.floor(Monedas0_2 * 0.2);
            System.out.println("Se devuelven " + Math.floor(Monedas0_2) + " monedas de 0.2€");
            }
            return Cambio;
    }

    static double ContarMonedas0_1(double Cambio){
        if (Cambio >= 0.1 && Cambio < 0.2){
            double Monedas0_1 = Cambio/0.1;
            Cambio = Cambio - Math.floor(Monedas0_1) * 0.1;
            System.out.println("Se devuelven " + Math.floor(Monedas0_1) + " monedas de 0.1€");
            }
            return Cambio;
    }

    static double ContarMonedas0_05(double Cambio){
        if (Cambio >= 0.05 && Cambio < 0.1){
            double Monedas0_05 = Cambio/0.05;
            Cambio = Cambio - Math.floor(Monedas0_05) * 0.05;
            System.out.println("Se devuelven " + Math.floor(Monedas0_05) + " monedas de 0.05€");
            }
            return Cambio;
    }

    static double ContarMonedas0_01(double Cambio){
        if (Cambio >= 0.01 && Cambio < 0.05){
            double Monedas0_01 = Cambio/0.01;
            Cambio = Cambio - Math.floor(Monedas0_01) * 0.01;
            System.out.println("Se devuelven " + Math.floor(Monedas0_01) + " monedas de 0.01€");
            }
            return Cambio;
    }
}