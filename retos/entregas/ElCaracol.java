import java.util.Scanner;

public class ElCaracol {
    public static void main(String[] args) {

        // Variable que usaremos para pausar cada turno
        Scanner turno = new Scanner(System.in);
        String tiempo;

        int posicionDeCaracol, pisosRestantes, agua = 0, dia = 1;
        double probabilidadVehiculo, sube = 0, baja = 0, altura, clima;
        boolean modoDebug = false;

        // Valores iniciales
        // caracol random pos 10 y 20
        altura = ((Math.random() * (20 - 10)) + 10);

        /*
         * Posicion del caracol le asignamos la altura pero en entero para usarlo mas
         * facilmente en los condicionales y FORs
         */

        posicionDeCaracol = (int) altura;

        // Empezamos a correr los dias del caracol
        while (posicionDeCaracol > 0 && dia <= 50) {

            // Definimos las probaboloidades del vehiculo y el clima
            probabilidadVehiculo = Math.random();
            clima = Math.random();

            // clima del dia
            if (clima < 0.05) {// 0 a 5%
                agua = agua + 5;
                System.out.println("Luvia Fuerte");
            } else if (clima < 0.15) {// 5% a 15%
                agua = agua + 2;
                System.out.println("Luvia Debil");

            } else {// Eto abarca el 85% restante
                    // No hay lluvia
            }

            // Pisos entre el caracol y el fondo del poso
            pisosRestantes = 20 - agua;

            // Desplazamientos
            if (dia < 10) {
                sube = ((Math.random() * (4 - 1)) + 1);

            } else if (dia < 20) {
                sube = ((Math.random() * (3 - 1)) + 1);

            } else if (dia < 50) {
                sube = ((Math.random() * (2 - 1)) + 1);
            } else {
                // Caracol muere salir del while
            }

            baja = ((Math.random() * (2 - 0)) + 0);
            altura = (altura - sube) + baja;

            if (probabilidadVehiculo < 0.35) {
                altura = altura + 2;
                System.out.println("Ha aparcado un coche");
            }

            // Definimos que el caracol no puede bajar mas que el nivel del agua
            if (altura > pisosRestantes) {
                altura = (double) pisosRestantes;
            }
            posicionDeCaracol = (int) altura;

            if (modoDebug) {
                System.out.println(">Posicion del caracol: " + posicionDeCaracol);
                System.out.println(">Probabilidad del vehiculo: " + probabilidadVehiculo);
                System.out.println(">Probabilidad del clima: " + clima);
                System.out.println(">Pisos restantes: " + pisosRestantes);
            }
            // Imprimimos informacion inportante
            System.out.println(
                    "Dia [" + dia + "] / Sube: [" + sube + "] / Baja: [" + baja + "] / Altura: [-" + altura + "]");

            // Inicio de impresion del viaje del caracol y se muestra coche si pasa
            if (probabilidadVehiculo < 0.35) {
                System.out.println("[__]    o---o   [__]");
            } else {

                System.out.println("[__]            [__]");
            }

            // pisos desde arriba hasta caracol
            for (int i = 0; i < posicionDeCaracol; i = i + 1) {
                System.out.println("  []: :. :. :. :[] _ __ " + i);
            }
            // mostrar caracol
            System.out.println("  []: __(o)_/` :[] _ __ " + posicionDeCaracol);

            // pisos restantes
            for (int i = posicionDeCaracol + 1; i <= pisosRestantes; i = i + 1) {
                System.out.println("  []: :. :. :. :[] _ __ " + i);
            }
            // Agua
            for (int i = 0 + 1; i <= agua; i = i + 1) {
                System.out.println("  []~~~~~~~~~~~~[]");
            }
            System.out.println("  []~~~~~~~~~~~~[]");
            // Fondo
            System.out.println("  [][][][][][][][]");

            // dia siguiente

            if (posicionDeCaracol > 0) {
                dia = dia + 1;
            }

            tiempo = turno.nextLine();
        }
        if (dia < 49) {
            System.out.println("El caracol llega a los " + dia + " dias");

        } else {
            System.out.println("El caracol ha muerto el dia 50 a -" + posicionDeCaracol + " m de profundidad");
        }
    }

}
