public class CCCF {
    public static void main(String[] args) throws Exception {
        int tiempoTotal = 720;
        int caja1 = 0,
            caja2 = 0,
            caja3 = 0,
            caja4 = 0;
        int cola = 0;
        
        for (int minuto = 1; minuto <= tiempoTotal; minuto++) {
            int paquetes = (int)(Math.random() * 11) + 5;
            boolean llegaPersona = false;
            int probablidadDeLLegada = (int)(Math.random() * 10) + 1;
            if (probablidadDeLLegada <= 4) {
                llegaPersona = true;
                cola += 1;
            }

            if (caja1 > 0) {
                caja1 --;
            }
            if (caja2 > 0) {
                caja2 --;
            }
            if (caja3 > 0) {
                caja3 --;
            }
            if (caja4 > 0) {
                caja4 --;
            }

            if (caja1 == 0 && cola > 0) {
                caja1 += paquetes;
                cola--;
            }
            if (caja2 == 0 && cola > 0) {
                caja2 += paquetes;
                cola--;
            }
            if (caja3 == 0 && cola > 0) {
                caja3 += paquetes;
                cola--;
            }
            if (caja4 == 0 && cola > 0) {
                caja4 += paquetes;
                cola--;
            }
            if (llegaPersona) {
                System.out.println("MINUTO " + minuto + " - LLega una persona - En cola: " + cola + "\n Caja 1: [" + caja1 + "] | Caja 2: [" + caja2 + "] | Caja 3: [" + caja3 + "] | Caja 4: [" + caja4 + "]\n---------------------------------------");
            }
            if (!llegaPersona) {
                System.out.println("MINUTO " + minuto + " - No llega nadie - En cola: " + cola + "\n Caja 1: [" + caja1 + "] | Caja 2: [" + caja2 + "] | Caja 3: [" + caja3 + "] | Caja 4: [" + caja4 + "]\n---------------------------------------");
            }
        }
    }
}
