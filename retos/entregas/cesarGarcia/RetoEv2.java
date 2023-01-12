public class RetoEv2 {
    public static void main(String[] args) {
        int Jornada=12*60;
        double probabilidadLlegada;
        int cola;
        int caja1;
        int caja2;
        int caja3;
        int caja4;
        int items;
        int atencion;
        atencion = 0;
        cola = 0;
        caja1 = 0;
        caja2  = 0;
        caja3 = 0;
        caja4 = 0;
        items=0;
        int MinutosSinCola;
        MinutosSinCola = 0;

        for (int minuto=1; minuto <= Jornada ; minuto = minuto + 1) {

                System.out.println (" >> MINUTO " + minuto);

                probabilidadLlegada = Math.random();
                if (probabilidadLlegada<=0.4) {
                    System.out.println(" - Llegó una persona");
                    cola = cola + 1;
                } else {
                    System.out.println(" - No llegó nadie");
                }
                System.out.println("> Personas en cola: " + cola);
                if (caja1<=0 && cola>0) {
                    cola = cola - 1;
                    caja1 = (int)(Math.random()*11)+5;
                    atencion = atencion + 1;
                System.out.println("Pasa una persona a la caja 1 llevando " + caja1 + (" items"));
            }   else if (caja2<=0 && cola>0) {
                    cola = cola - 1;
                    caja2 = (int)(Math.random()*11)+5;
                    atencion = atencion + 1;
                System.out.println("Pasa una persona a la caja 2 llevando " + caja2 + (" items"));
            }   else if (caja3<=0 && cola>0) {
                    cola = cola - 1;
                    caja3 = (int)(Math.random()*11)+5;
                    atencion = atencion + 1;
                System.out.println("Pasa una persona a la caja 3 llevando " + caja3 + (" items"));
            }   else if (caja4<=0 && cola>0) {
                    cola = cola - 1;
                    caja4 = (int)(Math.random()*11)+5;
                    atencion = atencion + 1;
                System.out.println("Pasa una persona a la caja 4 llevando " + caja4 + (" items"));
            }
                if (cola<=0) {
                    MinutosSinCola = MinutosSinCola + 1;
                }
                if (caja1>0) {
                    caja1 = caja1 -1;
                    items = items + 1;
                    System.out.println("> La caja 1 atiende un item, le quedan "+ caja1 + " items");
            }   if (caja2>0) {
                    items = items + 1;
                    caja2 = caja2 -1;
                System.out.println("> La caja 2 atiende un item, le quedan "+ caja2 + " items");
            }   if (caja3>0) {
                    items = items + 1;
                    caja3 = caja3 -1;
                System.out.println("> La caja 3 atiende un item, le quedan "+ caja3 + " items");
            }   if (caja4>0) {
                    items = items + 1;
                    caja4 = caja4 -1;
                System.out.println("> La caja 4 atiende un item, le quedan "+ caja4 + " items");
            }
        }
        System.out.println("Minutos totales sin cola: " + MinutosSinCola);   
        System.out.println("Al final del día se vendieron un total de " + items + " items");
        System.out.println("Personas atendidas durante la jornada: " + atencion);
    }
}
