public class caracolcaracolin{
    public static void main (String Args[]){
        int profundidadTotal= 20;
        int profundidadAgua = 0;
        int profundidadCaracol = (int) (Math.random() * (20-10 + 1)) + 10;
        String Borde_pozo_Coche = "[..]   O-=-O    [..]";
        String Borde_pozo =       "[..]            [..]";
        String Pozo_Pared =       "  [].:.:.:.:.:.:[]  ";
        String Pozo_Caracol =     "  []   _@)_/’   []  ";
        String Pozo_Mojado =      "  []~~~~~~~~~~~~[]  ";
        String Fondo_Pozo =       "  [][][][][][][][]  ";

        for(int Día= 1;Día <= 50 && profundidadCaracol >= 0 && profundidadCaracol < profundidadTotal - profundidadAgua; Día++){

            System.out.println("Día " + Día);
            System.out.println("---------------------------");
            if (Día == 1){
                System.out.println("El caracol cayó al pozo y se agarró a " + profundidadCaracol +" metros de profundidad");
            }
            if(Día <= 10 && profundidadCaracol < profundidadTotal - profundidadAgua){
                int AscensoCaracol = (int) (Math.random() * (4-1+1)+1);
                System.out.println();
                System.out.println("El caracol ascendió " + AscensoCaracol);
                profundidadCaracol = profundidadCaracol - AscensoCaracol;
            }
            if(Día > 10 && Día <= 20 && profundidadCaracol < profundidadTotal - profundidadAgua){
                int AscensoCaracol = (int) (Math.random() * (3-1+1)+1);
                System.out.println();
                System.out.println("El caracol ascendió " + AscensoCaracol);
                profundidadCaracol = profundidadCaracol - AscensoCaracol;
            }
            if(Día > 20 && Día < 50 && profundidadCaracol < profundidadTotal - profundidadAgua){
                int AscensoCaracol = (int) (Math.random() * (2-1+1)+1);
                System.out.println();
                System.out.println("El caracol ascendió " + AscensoCaracol);
                profundidadCaracol = profundidadCaracol - AscensoCaracol;
            }
            if (Día == 50){
                System.out.println("El caracol murió de inanición");

            }
            if(profundidadCaracol < 0){
                System.out.println("El caracol logró salir del pozo");

            }
            else{
                if(Día == 50){

                }
                else{
                    int CaidaCaracol   = (int) (Math.random() * (2-0+1)) + 0;
                    System.out.println("El caracol se cayó por la noche unos " + CaidaCaracol );
                    System.out.println();
                    profundidadCaracol = profundidadCaracol + CaidaCaracol;
                }

            }

            int Clima = (int) (Math.random() * (100-0));

        if(Clima <=5){
            System.out.println("Hoy hubo lluvia fuerte, el agua subió 5m");
            profundidadAgua=profundidadAgua + 5;
            if(profundidadCaracol <= profundidadTotal - profundidadAgua){
                System.out.println("El caracol terminó ahogado en el agua del pozo");
            }
        }

        if(Clima <=15 && Clima > 5){
            System.out.println("Hoy hubo lluvia leve, el agua subió 2m");
            profundidadAgua=profundidadAgua + 2;
            if(profundidadCaracol <= (profundidadTotal - profundidadAgua)){
                System.out.println("El caracol terminó ahogado en el agua del pozo");
            }
        }
        if(Clima >15){
            System.out.println("Hoy hizo sol");
            if(profundidadCaracol <= (profundidadTotal - profundidadAgua)){

            }
        }

        int Probabilidad_coche = (int) (Math.random() * (100-0));
        if(Probabilidad_coche <= 35){
            System.out.println();
            System.out.println("Aparca un coche cerca del pozo lo cual hace caer al caracol 2 metros");
            profundidadCaracol = profundidadCaracol + 2;
            System.out.println(Borde_pozo_Coche);
        }    
        else{
            System.out.println(Borde_pozo);
        }

        for(int profundidad = 0 ; profundidad <= profundidadTotal  ; profundidad++){
            if (profundidad>=profundidadTotal-profundidadAgua){
                System.out.println(Pozo_Mojado + " __ " + profundidad);
            }   else    {
                if(profundidadCaracol == profundidad){
                    System.out.println(Pozo_Caracol + " __ " + profundidad);
                }   else{
                        System.out.println(Pozo_Pared + " __ " + profundidad);
                }
            }
        }
        System.out.println(Fondo_Pozo); 
    }
}
}