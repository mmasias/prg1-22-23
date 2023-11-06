public class CaracolReto {
    public static void main(String args[]){
        String Coche = "[__]    O-=-O     [__]";
        String Borde = "[__]              [__]";
        String CaracolBorde = "[__]    _@)_/’    [__]";
        String Pared = "  []:. :. :. :. :.[]";
        String Caracol = "  []    _@)_/’    []";
        String Agua = "  []~~~~~~~~~~~~~~[]";
        String Fondo = "  [][][][][][][][][]";
        int ProfundidadPozo = -20;
        int AlturaCaracol = (int)(Math.random()*10)+ProfundidadPozo;
        int dia = 0;
        int subida;
        int bajada;
        int NivelAgua = -20;
        double ProbabilidadCoche;
        double Clima;

        while ((AlturaCaracol<1) && (dia < 50)){

            dia = dia + 1;
            subida = (int) (Math.random()*4)+1;
            if (dia > 10){
                subida = (int) (Math.random()*3)+1;
            }
            if (dia > 20){
                subida = (int) (Math.random()*2)+1;
            }
            bajada = (int) (Math.random()*3);

            Clima = (Math.random()*100);
            if (Clima <=5){
                NivelAgua = NivelAgua +5;
                System.out.print("Llueve Fuertemente!");
            } else if (Clima <=15){
                NivelAgua = NivelAgua +2;
                System.out.print("LLueve!");
            }

            ProbabilidadCoche = (Math.random()*100);
            if (ProbabilidadCoche <= 35){
                bajada = bajada + 2;
                System.out.print(" Pasa un coche!");
            }
            System.out.println();

            AlturaCaracol = AlturaCaracol + subida - bajada;
            if (AlturaCaracol <= NivelAgua){
                AlturaCaracol = NivelAgua + 1;
            }
            if (AlturaCaracol <= ProfundidadPozo){
                AlturaCaracol = ProfundidadPozo + 1;
            }
            System.out.print("Dia [" + dia + "] /");
            System.out.print(" Sube [" + subida + "] /");
            System.out.print(" Baja [" + bajada + "] /");
            System.out.println(" Altura al final del dia ["+ AlturaCaracol +"]");

            for (int i = 1; i >= ProfundidadPozo; i--){
                if (i == 1){
                    if (ProbabilidadCoche <= 35){
                        System.out.println(Coche);
                    } else {
                        if (AlturaCaracol == 1){
                            System.out.println(CaracolBorde);
                        } else{
                    System.out.println(Borde);
                        }
                    } 
                } else if (i == AlturaCaracol){
                    System.out.println(Caracol+"_ __"+i);
                } else if (i == ProfundidadPozo){
                    System.out.println(Agua+"_ __"+i);
                    System.out.println(Fondo);
                    System.out.println("");
                } else if (i <= NivelAgua){
                    System.out.println(Agua+"_ __"+i);   
                } else {
                    System.out.println(Pared+"_ __"+i);
                }
            }
        if (AlturaCaracol>=1){
            System.out.println("¡El caracol ha logrado escapar el pozo! _@)_/’");
        }
        if (dia == 50){
        System.out.println("Murio el dia 50 a una profundidad de "+ AlturaCaracol);
        }
        }
    }
}
