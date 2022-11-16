public class CARRE {
    public static void main(String args[]){
        int tiempoTotal = 12*60 ;
        int minutos = 0;
        int cola = 0;
        int Caja1 = 0;
        int Caja2 = 0;
        int Caja3 = 0;
        int Caja4 = 0;
        int MinutosSinCola = 0;
        int Personas = 0;
        int PersonasAtendidas = 0;
        int Articulos = 0;
        int ArticulosVendidos = 0;
        double probabilidad;

        while (tiempoTotal > minutos ){
            minutos = minutos + 1;
            if (Caja1>0){
                Caja1=Caja1 - 1;
            }
            if (Caja2>0){
                Caja2=Caja2 - 1;
            }
            if (Caja3>0){
                Caja3=Caja3 - 1;
            }
            if (Caja4>0){
                Caja4=Caja4 - 1;
            }

            System.out.print("MINUTO " + minutos + " - ");
            probabilidad = Math.random();
            if (probabilidad <= 0.4){
                System.out.print("Llega una persona - ");
                cola = cola + 1;
                Personas = Personas + 1;
            } else{
                System.out.print("No llega nadie - ");
            }

            if (cola > 0){
                if (Caja1 == 0){
                    Caja1 = (int)(Math.random()*11)+5;
                    cola = cola - 1;
                    Articulos = Articulos + Caja1;
                } else if (Caja2 == 0){
                    Caja2 = (int)(Math.random()*11)+5;
                    cola = cola - 1;
                    Articulos = Articulos + Caja2;
                } else if (Caja3 == 0){
                    Caja3 = (int)(Math.random()*11)+5;
                    cola = cola - 1;
                    Articulos = Articulos + Caja3;
                } else if (Caja4 == 0){
                    Caja4 = (int)(Math.random()*11)+5;
                    cola = cola - 1;
                    Articulos = Articulos + Caja4;
                }    
            } else {
                MinutosSinCola = MinutosSinCola + 1;
            } 
            
            System.out.println("En Cola: ["+cola+"]");
            System.out.println("Caja1:["+Caja1+"] | Caja2: ["+Caja2+"] | Caja3: ["+Caja3+"] | Caja4: ["+Caja4+"]"); 
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
        PersonasAtendidas = Personas - cola;
        ArticulosVendidos = Articulos - Caja1 - Caja2 - Caja3 - Caja4;
        System.out.println("RESUMEN");
        System.out.println("============================================================");
        System.out.println("Minutos con cola en cero      : " + MinutosSinCola);
        System.out.println("Personas en la cola al cierre :" + cola);
        System.out.println("Personas atendidas en el dia  :" + PersonasAtendidas);
        System.out.println("Articulos vendidos en el dia  :" + ArticulosVendidos);
        System.out.println("============================================================");
    }
}
