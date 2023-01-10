class MarcoMetodos {

    public static void main(String[] args){
        
        int[] marco={0};
        int[] madre = {350};
        int dia = 0;

        do {
            dia++;
            moverMarco(marco);
            moverMadre(madre);
        } while (!estenJuntos(marco, madre));
        System.out.println("Se han encontrado el dia " + dia);
    }

    static void moverMadre(int[] madre) {
        madre[0] = madre[0] + 80;
    }

    static void moverMarco(int[] marco) {

        double velocidad = ((Math.random()*6)+10) * factorClimatico() * factorMonoCansado();
        double tiempo = (Math.random()*2)+8 - factorMonoEscapado();
        double espacio = velocidad * tiempo;

        marco[0] = marco[0] + (int) espacio;
    }

    static double factorClimatico() {
        
        double elClima = Math.random();

        if (elClima<0.1) {
            return 0.25;
        } else if (elClima<0.4) {
            return 0.75;
        }

        return 1;
    }

    static double factorMonoCansado(){

        if (Math.random()<0.25) {
            return 0.9;
        }
        return 1;
    }

    static double factorMonoEscapado(){
        
        if (Math.random()<0.15) {
            return 2;
        }
        return 0;        
    }

    static boolean estenJuntos(int[] marco, int[] madre) {

        if(madre[0] - marco[0] < 0) {
            return true;
        }
        return false;
    }
}
