public class RetoCCCFdavid {
    public static void main(String[] args) {
        int minutos;
        int items;
        int probabilidadLlegadapersona = 60;
        int horas = 12;
        minutos = horas * 60;
        int cola = 0;
        int caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0;

        for (int i = 0; i <= minutos; i = i + 1) {
            if (caja1 >= 1) {
                caja1 = caja1 - 1;
            }
            if (caja2 >= 1) {
                caja2 = caja2 - 1;
            }
            if (caja3 >= 1) {
                caja3 = caja3 - 1;
            }
            if (caja4 >= 1) {
                caja4 = caja4 - 1;
            }
            if (Math.random() * 100 <= probabilidadLlegadapersona) {
                cola = cola + 1;
            }
            if (cola >= 1 && caja1 == 0) {
                cola = cola - 1;
                items = (int) (Math.random() * 10) + 5;
                caja1 = items;
            }
            if (cola >= 1 && caja2 == 0) {
                cola = cola - 1;
                items = (int) (Math.random() * 10) + 5;
                caja2 = items;
            }
            if (cola >= 1 && caja3 == 0) {
                cola = cola - 1;
                items = (int) (Math.random() * 10) + 5;
                caja3 = items;
            }
            if (cola >= 1 && caja4 == 0) {
                cola = cola - 1;
                items = (int) (Math.random() * 10) + 5;
                caja4 = items;
            }
            System.out.println("---------------------------------------------------------------------");
            System.out.println("- Minuto:"+i+ "-En cola:"+cola);
            System.out.println("Caja 1 ["+caja1 +"] | Caja 2 ["+caja2+"] | Caja 3 ["+caja3+"]  | Caja 4 ["+caja4+"]" );
        }
    }
}
