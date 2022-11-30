import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double cantidad;
        int Billetes500, Billetes200, Billetes100, Billetes50, Billetes20, Billetes10, Billetes5, Monedas2, Monedas1, Monedas05, Monedas02, Monedas01, Monedas005, Monedas002, Monedas001;

        System.out.println("Dime la cantidad que quieres que te divida en billetes y monedas");
        cantidad= entrada.nextDouble();

        if (cantidad >= 500){
            Billetes500 = (int)(cantidad/500);
            cantidad = cantidad-(Billetes500*500);
            System.out.println("Tienes "+ Billetes500);
        }

        if (cantidad >= 200){
            Billetes200 = (int)(cantidad/200);
            cantidad = cantidad-(Billetes200*200);
            System.out.println("Tienes "+ Billetes200);
        }

        if (cantidad >= 100){
            Billetes100 = (int)(cantidad/100);
            cantidad = cantidad-(Billetes100*100);
            System.out.println("Tienes "+ Billetes100);
        }

        if (cantidad >= 50){
            Billetes50 = (int)(cantidad/50);
            cantidad = cantidad-(Billetes50*50);
            System.out.println("Tienes "+ Billetes50);
        }

        if (cantidad >= 20){
            Billetes20 = (int)(cantidad/20);
            cantidad = cantidad-(Billetes20*20);
            System.out.println("Tienes "+ Billetes20);
        }

        if (cantidad >= 10){
            Billetes10 = (int)(cantidad/10);
            cantidad = cantidad-(Billetes10*10);
            System.out.println("Tienes "+ Billetes10);
        }

        if (cantidad >= 5){
            Billetes5 = (int)(cantidad/5);
            cantidad = cantidad-(Billetes5*5);
            System.out.println("Tienes "+ Billetes5);
        }

        if (cantidad >= 2){
            Monedas2 = (int)(cantidad/2);
            cantidad = cantidad-(Monedas2*2);
            System.out.println("Tienes "+ Monedas2);
        }

        if (cantidad >= 1){
            Monedas1 = (int)(cantidad/1);
            cantidad = cantidad-(Monedas1*1);
            System.out.println("Tienes "+ Monedas1);
        }

        if (cantidad >= 0.5){
            Monedas05 = (int)(cantidad/0.5);
            cantidad = cantidad-(Monedas05*0.5);
            System.out.println("Tienes "+ Monedas05);
        }
        if (cantidad >= 0.2){
            Monedas02 = (int)(cantidad/0.2);
            cantidad = cantidad-(Monedas02*0.2);
            System.out.println("Tienes "+ Monedas02);
        }

        if (cantidad >= 0.1){
            Monedas01 = (int)(cantidad/0.1);
            cantidad = cantidad-(Monedas01*0.1);
            System.out.println("Tienes "+ Monedas01);
        }

        if (cantidad >= 0.05){
            Monedas005 = (int)(cantidad/0.05);
            cantidad = cantidad-(Monedas005*0.05);
            System.out.println("Tienes "+ Monedas005);
        }

        if (cantidad >= 0.02){
            Monedas002 = (int)(cantidad/0.02);
            cantidad = cantidad-(Monedas002*0.02);
            System.out.println("Tienes "+ Monedas002);
        }

        if (cantidad >= 0.01){
            Monedas001 = (int)(cantidad/0.01);
            cantidad = cantidad-(Monedas001*0.01);
            System.out.println("Tienes "+ Monedas001);
        }
         entrada.close();
    }
}