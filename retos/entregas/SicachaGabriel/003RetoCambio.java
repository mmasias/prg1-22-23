import java.text.DecimalFormat;
import java.util.Scanner;

public class Cambio {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        Float entregado;
        Float pagar;
        double devolver;
        int b500 = 0;
        int b200 = 0;
        int b100 = 0;
        int b50 = 0;
        int b20 = 0;
        int b10 = 0;
        int b5 = 0;
        int m2 = 0;
        int m1 = 0;
        int m05 = 0;
        int m02 = 0;
        int m01 = 0;
        int m005 = 0;
        int m001 = 0;
        System.out.println("Monto entregado (en euros): ");
        entregado = entrada.nextFloat();
        System.out.println("Monto a pagar (en euros): ");
        pagar = entrada.nextFloat();
        System.out.println("------------");
        devolver = (entregado - pagar);
        DecimalFormat dFormatter = new DecimalFormat("#.##");
        String fdevolver = dFormatter.format(devolver);
        entrada.close();
        System.out.println("Se procede a devolver: " + fdevolver + " euros");
        while (devolver >= 500){
            devolver = devolver - 500;
            b500 = b500 +1;
        }
        while (devolver >= 200){
            devolver = devolver - 200;
            b200 = b200 +1;
        }
        while (devolver >= 100){
            devolver = devolver -100;
            b100 = b100 +1;
        }
        while (devolver >=50){
            devolver = devolver -50;
            b50 = b50 +1;
        }
        while (devolver >=20){
            devolver = devolver -20;
            b20 = b20 +1;
        }
        while (devolver >=10){
            devolver = devolver -10;
            b10 = b10 +1;
        }
        while (devolver >=5){
            devolver = devolver -5;
            b5 = b5 +1;
        }
        while (devolver >=2){
            devolver = devolver -2;
            m2 = m2 +1;
        }
        while (devolver >=1){
            devolver = devolver -1;
            m1 = m1 +1;
        }
        while (devolver >=0.5){
            devolver = devolver - (0.5);
            m05 = m05 +1;
        }
        while (devolver >=0.2){
            devolver = devolver - (0.2);
            m02 = m02 +1;
        }
        while (devolver >=0.1){
            devolver = devolver - (0.1);
            m01 = m01 +1;
        }
        while (devolver >=0.05){
            devolver = devolver - (0.05);
            m005 = m005 +1;
        }
        while (devolver >=0.01){
            devolver = devolver - (0.01);
            m001 = m001 +1;
        }
        System.out.println("Se reliza de la siguiente manera:");
        if (b500 >= 1){
            System.out.println(b500 + " billete(s) de 500 euros");
        }
         if (b200 >= 1){
            System.out.println(b200 + " billete(s) de 200 euros");
        }
        if (b100 >= 1){
            System.out.println(b100 + " billete(s) de 100 euros");
        }
        if (b50 >= 1){
            System.out.println(b50 + " billete(s) de 50 euros");
        }
        if (b20 >= 1){
            System.out.println(b20 + " billete(s) de 20 euros");
        }
        if (b10 >= 1){
            System.out.println(b10 + " billete(s) de 10 euros");
        }
        if (b5 >= 1){
            System.out.println(b5 + " billete(s) de 5 euros");
        }
        if (m2 >= 1){
            System.out.println(m2 + " monedas(s) de 2 euros");
        }
        if (m1 >= 1){
            System.out.println(m1 + " monedas(s) de 1 euro");
        }
        if (m05 >= 1){
            System.out.println(m05 + " monedas(s) de 50 centimos");
        }
        if (m02 >= 1){
            System.out.println(m02 + " monedas(s) de 20 centimos");
        }
        if (m01 >= 1){
            System.out.println(m01 + " monedas(s) de 10 centimos");
        }
        if (m005 >= 1){
            System.out.println(m005 + " monedas(s) de 5 centimos");
        }
        if (m001 >= 1){
            System.out.println(m001 + " monedas(s) de 1 centimo");
        }
        System.out.println("------------");
    }
}
