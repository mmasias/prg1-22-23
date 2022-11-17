public class simulacionParcial {
    public static void main(String[] args) {
        int totalTiempo = 12 * 60;
        int unaCola = 0;
        int unaCaja = 0;
        double probabilidadLlegada;

        for (int minuto = 1; minuto <= totalTiempo; minuto = minuto + 1) {
            System.out.print("minuto" + minuto);
            probabilidadLlegada = Math.random();

            if (probabilidadLlegada <= .4) {
                System.out.println("-Llego una persona");
                unaCola = unaCola + 1;
            } else {
                System.out.println();
            }

            System.out.println("> Persona en cola: " + unaCola);

            if (unaCaja <= 0 && unaCola > 0) {
                System.out.println("Pasa una persona a la caja");
                unaCola = unaCola - 1;
                unaCaja = (int) (Math.random() * 10) + 5;
                System.out.println("Pasa una persona a la caja 1 llevando [" + unaCaja + "] items");
            }

            if (unaCaja > 0) {
                unaCaja = unaCaja - 1;
                System.out.println("prsona le quedan [" + unaCaja + "] items");
            }
        }
        System.out.println("Fin de la simulacion");
    }
}
