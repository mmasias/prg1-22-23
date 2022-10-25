public class DevolverCambio {
    public static void main(String[] args) {

        double coste, pagado, vuelta, resto, cantidad;

        coste = 1238.46;
        pagado = 2000;
        vuelta = pagado - coste;

        System.out.println("El cliente tiene que pagar " + coste + " y entrega " + pagado + "€");

        if (pagado < coste) {
            System.out.println("No le alcanza para pagar " + coste + "€");
        } else {
            System.out.println("Se le devuelven " + vuelta + "€");

            if ((vuelta / 500) >= 1) {
                resto = vuelta % 500;
                cantidad = (vuelta - resto) / 500;
                System.out.println("Se le devuelven " + (int)cantidad + " billetes de 500€");
                vuelta = Math.round((vuelta - (cantidad * 500)) * 100.0) / 100.0;
            }
            if ((vuelta / 200) >= 1) {
                resto = vuelta % 200;
                cantidad = (vuelta - resto) / 200;
                System.out.println("Se le devuelven " + (int)cantidad + " billetes de 200€");
                vuelta = Math.round((vuelta - (cantidad * 200)) * 100.0) / 100.0;
            }
            if ((vuelta / 100) >= 1) {
                resto = vuelta % 100;
                cantidad = (vuelta - resto) / 100;
                System.out.println("Se le devuelven " + (int)cantidad + " billetes de 100€");
                vuelta = Math.round((vuelta - (cantidad * 100)) * 100.0) / 100.0;
            }
            if ((vuelta / 50) >= 1) {
                resto = vuelta % 50;
                cantidad = (vuelta - resto) / 50;
                System.out.println("Se le devuelven " + (int)cantidad + " billetes de 50€");
                vuelta = Math.round((vuelta - (cantidad * 50)) * 100.0) / 100.0;
            }
            if ((vuelta / 20) >= 1) {
                resto = vuelta % 20;
                cantidad = (vuelta - resto) / 20;
                System.out.println("Se le devuelven " + (int)cantidad + " billetes de 20€");
                vuelta = Math.round((vuelta - (cantidad * 20)) * 100.0) / 100.0;
            }
            if ((vuelta / 10) >= 1) {
                resto = vuelta % 10;
                cantidad = (vuelta - resto) / 10;
                System.out.println("Se le devuelven " + (int)cantidad + " billetes de 10€");
                vuelta = Math.round((vuelta - (cantidad * 10)) * 100.0) / 100.0;
            }
            if ((vuelta / 5) >= 1) {
                resto = vuelta % 5;
                cantidad = (vuelta - resto) / 5;
                System.out.println("Se le devuelven " + (int)cantidad + " billetes de 5€");
                vuelta = Math.round((vuelta - (cantidad * 5)) * 100.0) / 100.0;
            }
            if ((vuelta / 2) >= 1) {
                resto = vuelta % 2;
                cantidad = (vuelta - resto) / 2;
                System.out.println("Se le devuelven " + (int)cantidad + " monedas de 2€");
                vuelta = Math.round((vuelta - (cantidad * 2)) * 100.0) / 100.0;
            }
            if ((vuelta / 1) >= 1) {
                resto = vuelta % 1;
                cantidad = (vuelta - resto) / 1;
                System.out.println("Se le devuelven " + (int)cantidad + " monedas de 1€");
                vuelta = Math.round((vuelta - (cantidad * 1)) * 100.0) / 100.0;
            }
            if ((vuelta / 0.5) >= 1) {
                resto = vuelta % 0.5;
                cantidad = (vuelta - resto) / 0.5;
                System.out.println("Se le devuelven " + (int)cantidad + " monedas de 50 cent");
                vuelta = Math.round((vuelta - (cantidad * 0.5)) * 100.0) / 100.0;
            }
            if ((vuelta / 0.2) >= 1) {
                resto = vuelta % 0.2;
                cantidad = (vuelta - resto) / 0.2;
                System.out.println("Se le devuelven " + (int)cantidad + " monedas de 20 cent");
                vuelta = Math.round((vuelta - (cantidad * 0.2)) * 100.0) / 100.0;
            }
            if ((vuelta / 0.1) >= 1) {
                resto = vuelta % 0.1;
                cantidad = (vuelta - resto) / 0.1;
                System.out.println("Se le devuelven " + (int)cantidad + " monedas de 10 cent");
                vuelta = Math.round((vuelta - (cantidad * 0.1)) * 100.0) / 100.0;
            }
            if ((vuelta / 0.05) >= 1) {
                resto = vuelta % 0.05;
                cantidad = (vuelta - resto) / 0.05;
                System.out.println("Se le devuelven " + (int)cantidad + " monedas de 5 cent");
                vuelta = Math.round((vuelta - (cantidad * 0.05)) * 100.0) / 100.0;
            }
            if ((vuelta / 0.02) >= 1) {
                resto = vuelta % 0.02;
                cantidad = (vuelta - resto) / 0.02;
                System.out.println("Se le devuelven " + (int)cantidad + " monedas de 2 cent");
                vuelta = Math.round((vuelta - (cantidad * 0.02)) * 100.0) / 100.0;
            }
            if ((vuelta / 0.01) >= 1) {
                resto = vuelta % 0.01;
                cantidad = (vuelta - resto) / 0.01;
                System.out.println("Se le devuelven " + (int)cantidad + " monedas de 1 cent");
                vuelta = Math.round((vuelta - (cantidad * 0.01)) * 100.0) / 100.0;
            }
        }
    }
}
