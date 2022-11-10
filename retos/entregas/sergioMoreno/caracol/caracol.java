public class caracol {
    public static void main(String[] args){
        boolean vidaCaracol = true;
        int pozo = 20;
        double profundidadCaida = 0;  
        double subida = 0;
        double bajada = 0;
        double alturaFinal = 0;
        double alturaAgua = 20;
        int contadorDia = 1;
        profundidadCaida = (Math.random()*10)+10;

        while (vidaCaracol == true){

            subida = (Math.random()*3)+1;
            bajada = (Math.random()*2);
            alturaFinal = profundidadCaida + bajada - subida;

            System.out.println("");
            System.out.println("Dia: " + contadorDia + " | " + "Sube: " + subida + " | " + "Baja: " + bajada + " | " + "Altura al final del dia: " + alturaFinal);

            profundidadCaida = alturaFinal;
            contadorDia++;

            for (int i = 0; i <= pozo; i++){

                if((int)alturaFinal == i){
                    System.out.println("[]    _@)_/’    [] _ __" + i);
                } else if(i == 0){
                    System.out.println("[__]              [__]");
                } else if(i >= (int)alturaAgua){
                    System.out.println("[]~~~~~~~~~~~~~~[] _ __" + i);
                } else{
                    System.out.println("[]:. :. :. :. :.[] _ __ " + i);
                }

            } 

            System.out.println("[][][][][][][][][]");

            if(alturaFinal <= 0 || alturaAgua <= alturaFinal){
                vidaCaracol = false;
            }

        }
    
        if (alturaAgua <= alturaFinal){
            System.out.println();
            System.out.println("El caracol ha muerto ahogado");
        }

        if (alturaFinal <= 0){
            System.out.println();
            System.out.println("El caracol sobrevive");
        }

    }
}