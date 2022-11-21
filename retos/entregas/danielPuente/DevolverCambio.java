public class DevolverCambio {
    public static void main(String[] args) {
        double cuenta, entregado, devolución, resto, número;
        cuenta = 967.60;
        entregado = 1230;
        devolución = entregado - cuenta;

        System.out.println("El cliente tiene que pagar la cantidad de " + cuenta + " y entrega la cantidad de " + devolución + "€");
        if (entregado < cuenta) {
            System.out.println("No puede pagar el total de" + cuenta + "€");
        } else {
            System.out.println("Le devuelven" + devolución + "€");
            if ((devolución / 500) >= 1) {
                resto = devolución % 500;
                número = (devolución - resto) / 500;
                System.out.println("Le devuelven " + (int)número + " billetes de 500€");
                devolución = Math.round((devolución - (número * 500)) * 100.0) / 100.0;
            }
            if ((devolución / 200) >= 1) {
                resto = devolución % 200;
                número = (devolución - resto) / 200;
                System.out.println("Le devuelven " + (int)número + " billetes de 200€");
                devolución = Math.round((devolución - (número * 200)) * 100.0) / 100.0;
            }
            if ((devolución / 100) >= 1) {
                resto = devolución % 100;
                número = (devolución - resto) / 100;
                System.out.println("Le devuelven " + (int)número + " billetes de 100€");
                devolución = Math.round((devolución - (número * 100)) * 100.0) / 100.0;
            }
            if ((devolución / 50) >= 1) {
                resto = devolución % 50;
                número	 = (devolución - resto) / 50;
                System.out.println("Le devuelven " + (int)número + " billetes de 50€");
                devolución = Math.round((devolución - (número * 50)) * 100.0) / 100.0;
            }
            if ((devolución / 20) >= 1) {
                resto = devolución % 20;
                número = (devolución - resto) / 20;
                System.out.println("Le devuelven " + (int)número + " billetes de 20€");
                devolución = Math.round((devolución - (número * 20)) * 100.0) / 100.0;
            }
            if ((devolución / 10) >= 1) {
                resto = devolución % 10;
                número = (devolución - resto) / 10;
                System.out.println("le devuelven " + (int)número + " billetes de 10€");
                devolución = Math.round((devolución - (número * 10)) * 100.0) / 100.0;
            }
            if ((devolución / 5) >= 1) {
                resto = devolución % 5;
                número = (devolución - resto) / 5;
                System.out.println("Le devuelven " + (int)número + " billetes de 5€");
                devolución = Math.round((devolución - (número* 5)) * 100.0) / 100.0;
            }
            if ((devolución / 2) >= 1) {
                resto = devolución % 2;
                número = (devolución - resto) / 2;
                System.out.println("Le devuelven " + (int)número + " monedas de 2€");
                devolución = Math.round((devolución - (número * 2)) * 100.0) / 100.0;
            }
            if ((devolución / 1) >= 1) {
                resto = devolución % 1;
                número = (devolución - resto) / 1;
                System.out.println("Le devuelven " + (int)número + " monedas de 1€");
                devolución = Math.round((devolución - (número * 1)) * 100.0) / 100.0;
            }
            if ((devolución / 0.5) >= 1) {
                resto = devolución % 0.5;
                número = (devolución - resto) / 0.5;
                System.out.println("Le devuelven " + (int)número + " monedas de 50 cent");
                devolución = Math.round((devolución - (número * 0.5)) * 100.0) / 100.0;
            }
            if ((devolución / 0.2) >= 1) {
                resto = devolución % 0.2;
                número = (devolución - resto) / 0.2;
                System.out.println("Le devuelven " + (int)número + " monedas de 20 cent");
                devolución = Math.round((devolución - (número* 0.2)) * 100.0) / 100.0;
            }
            if ((devolución / 0.1) >= 1) {
                resto = devolución % 0.1;
                número = (devolución - resto) / 0.1;
                System.out.println("Le devuelven " + (int)número + " monedas de 10 cent");
                devolución = Math.round((devolución - (número * 0.1)) * 100.0) / 100.0;
            }
            if ((devolución / 0.05) >= 1) {
                resto = devolución % 0.05;
                número = (devolución - resto) / 0.05;
                System.out.println("Le devuelven " + (int)número + " monedas de 5 cent");
                devolución = Math.round((devolución - (número * 0.05)) * 100.0) / 100.0;
            }
            if ((devolución / 0.02) >= 1) {
                resto = devolución % 0.02;
                número = (devolución - resto) / 0.02;
                System.out.println("Le devuelven " + (int)número + " monedas de 2 cent");
                devolución = Math.round((devolución - (número * 0.02)) * 100.0) / 100.0;
            }
            if ((devolución/ 0.01) >= 1) {
                resto = devolución % 0.01;
                número = (devolución - resto) / 0.01;
                System.out.println("Le devuelven " + (int)número + " monedas de 1 cent");
                devolución = Math.round((devolución - (número * 0.01)) * 100.0) / 100.0;
            }
        }
    }
}