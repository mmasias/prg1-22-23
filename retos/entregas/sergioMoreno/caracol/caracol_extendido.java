public class caracol_extendido {
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
        double probabilidadCoche = 0;
        int caidaCoche = 0;
        double probabilidadClima = 0;

        while (vidaCaracol == true){

            if(contadorDia <= 10){
                subida = (Math.random()*3)+1;
            }
            
            if(contadorDia > 10 && contadorDia <= 20){
                subida = (Math.random()*2)+1;
            }

            if(contadorDia > 20){
                subida = (Math.random()*1)+1;
            }

            probabilidadCoche = (Math.random());

            if (probabilidadCoche <= 0.35){
                System.out.println();
                System.out.println("Un coche ha aparcado cerca, debido al temblor, caes 2 metros");
                caidaCoche = 2;
            } else {
                System.out.println();
                System.out.println("Un coche NO ha aparcado cerca");
                caidaCoche = 0;
            }

            probabilidadClima = (Math.random());

            if (probabilidadClima <= 0.05){
                System.out.println();
                System.out.println("Hay lluvia fuerte y el pozo se ha inundado, la profundidad disminuye 5 metros");
                alturaAgua = alturaAgua - 5;
            }

            if (probabilidadClima <= 0.15 && probabilidadClima >=0.05){
                System.out.println();
                System.out.println("Hay lluvia debil y el pozo se ha inundado, la profundidad disminuye 2 metros");
                alturaAgua = alturaAgua - 2;
            }

            if (probabilidadClima >= 0.15){
                System.out.println();
                System.out.println("Hay hace buen clima");
            }
        
            bajada = (Math.random()*2);

            alturaFinal = profundidadCaida + bajada - subida + caidaCoche;

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

            if(alturaFinal <= 0 || alturaAgua <= alturaFinal || contadorDia >= 50){
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

        if (contadorDia >= 50){
            System.out.println();
            System.out.println("El caracol muere de inanicion");
        }

    }
}