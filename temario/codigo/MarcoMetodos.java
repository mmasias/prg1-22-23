class MarcoMetodos {

    static final double FACTOR_VELOCIDAD_LLUVIA_FUERTE = 0.25, PROBABILIDAD_LLUVIA_FUERTE = 0.1;
    static final double FACTOR_VELOCIDAD_LLUVIA_DEBIL = 0.75, PROBABILIDAD_LLUVIA_DEBIL = 0.4;

    static final double FACTOR_VELOCIDAD_MONO_CANSADO = 0.9, PROBABILIDAD_MONO_CANSADO = 0.25;
    static final double FACTOR_TIEMPO_MONO_ESCAPE = 2, PROBABILIDAD_MONO_ESCAPE = 0.15;

    static final double FACTOR_VELOCIDAD_NORMAL = 1;
    static final double FACTOR_TIEMPO_NORMAL = 0;

    public static void main(String[] args) {

        int[] marco = { 0 };
        int[] madre = { 350 };
        int dia = 0;

        do {
            dia++;
            System.out.println("DIA " + dia);
            moverMarco(marco);
            moverMadre(madre);
        } while (!estenJuntos(marco, madre));
        System.out.println("Se han encontrado el dia " + dia);
    }

    static void moverMadre(int[] madre) {

        System.out.println("> La madre avanza 80 Km");
        madre[0] = madre[0] + 80;
    }

    static void moverMarco(int[] marco) {

        double velocidad = ((Math.random() * 6) + 10) * factorClimatico() * factorMonoCansado();
        double tiempo = (Math.random() * 2) + 8 - factorMonoEscapado();
        double espacio = velocidad * tiempo;

        System.out.println("> Marco avanza " + (int) espacio);

        marco[0] = marco[0] + (int) espacio;
    }

    static double factorClimatico() {

        double elClima = Math.random();

        if (elClima < PROBABILIDAD_LLUVIA_FUERTE) {
            System.out.println("> Llueve mucho!");
            return FACTOR_VELOCIDAD_LLUVIA_FUERTE;
        } else if (elClima < PROBABILIDAD_LLUVIA_DEBIL) {
            System.out.println("> Llueve un poco");
            return FACTOR_VELOCIDAD_LLUVIA_DEBIL;
        }
        System.out.println("> Hace bueno");
        return FACTOR_VELOCIDAD_NORMAL;
    }

    static double factorMonoCansado() {

        if (Math.random() < PROBABILIDAD_MONO_CANSADO) {
            System.out.println("> El mono se canso");
            return FACTOR_VELOCIDAD_MONO_CANSADO;
        }
        return FACTOR_VELOCIDAD_NORMAL;
    }

    static double factorMonoEscapado() {

        if (Math.random() < PROBABILIDAD_MONO_ESCAPE) {
            System.out.println("> El mono se escapo");
            return FACTOR_TIEMPO_MONO_ESCAPE;
        }
        return FACTOR_TIEMPO_NORMAL;
    }

    static boolean estenJuntos(int[] marco, int[] madre) {

        if (madre[0] - marco[0] < 0) {
            System.out.println("¡Marco ha encontrado a su madre!");
            return true;
        }
        System.out.println("> LA DISTANCIA ES " + (madre[0] - marco[0]));
        return false;
    }
}
