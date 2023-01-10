class MarcoMetodos {

    public static void main(String[] args){
        
        int[] marco={0};
        int[] madre = {350};
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

        double velocidad = ((Math.random()*6)+10) * factorClimatico() * factorMonoCansado();
        double tiempo = (Math.random()*2)+8 - factorMonoEscapado();
        double espacio = velocidad * tiempo;

        System.out.println("> Marco avanza " + (int) espacio);

        marco[0] = marco[0] + (int) espacio;
    }

    static double factorClimatico() {
        
        double elClima = Math.random();

        if (elClima<0.1) {
            System.out.println("> Llueve mucho!");
            return 0.25;
        } else if (elClima<0.4) {
            System.out.println("> Llueve un poco");
            return 0.75;
        }
        System.out.println("> Hace bueno");
        return 1;
    }

    static double factorMonoCansado(){

        if (Math.random()<0.25) {
            System.out.println("> El mono se canso");
            return 0.9;
        }
        return 1;
    }

    static double factorMonoEscapado(){
        
        if (Math.random()<0.15) {
            System.out.println("> El mono se escapo");
            return 2;
        }
        return 0;        
    }

    static boolean estenJuntos(int[] marco, int[] madre) {

        if(madre[0] - marco[0] < 0) {
            System.out.println("¡Marco ha encontrado a su madre!");
            return true;
        }
        System.out.println("> LA DISTANCIA ES " + (madre[0] - marco[0]));
        return false;
    }
}
