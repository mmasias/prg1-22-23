public class CCCF2 {
    public static void main(String[] args){

        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int colaActual = 0;
        int min0Cola = 0;
        int numObjVen = 0;
        int persQueHanLlegado = 0;
        for(var ia = 0; ia<=720; ia=ia+1 ){
        
        double probaPersona = 1 + (Math.random() * 10);
        int prob1 = (int)probaPersona;

            if (prob1 <= 6){
                colaActual = colaActual + 1; 
            }else{
                colaActual = colaActual + 0;
            }

            if (prob1 <= 6){
                persQueHanLlegado = persQueHanLlegado + 1; 
            }else{
                persQueHanLlegado = persQueHanLlegado + 0;
            }



            if (colaActual >= 1){ 
                if (caja1 == 0){
                    double cantidadObjetos = Math.floor(Math.random() * 10 + 5);
                    int cant = (int)cantidadObjetos;
                colaActual = colaActual - 1;
                caja1 = caja1 + cant; 

                }else if (caja2 == 0){
                    double cantidadObjetos = Math.floor(Math.random() * 10 + 5);
                    int cant = (int)cantidadObjetos;
                colaActual = colaActual - 1;
                caja2 = caja2 + cant; 

                }else if (caja3 == 0){
                    double cantidadObjetos = Math.floor(Math.random() * 10 + 5);
                    int cant = (int)cantidadObjetos;
                colaActual = colaActual - 1;
                caja3 = caja3 + cant;
                
                }else if (caja4 == 0){
                    double cantidadObjetos = Math.floor(Math.random() * 10 + 5);
                    int cant = (int)cantidadObjetos;
                colaActual = colaActual - 1;
                caja4 = caja4 + cant; 
                }
            }

            if (caja1 >= 1){
                caja1 = caja1 - 1;
                numObjVen = numObjVen + 1;
            }

            if (caja2 >= 1){
                caja2 = caja2 - 1;
                numObjVen = numObjVen + 1;
            }

            if (caja3 >= 1){
                caja3 = caja3 - 1;
                numObjVen = numObjVen + 1;
            }

            if (caja4 >= 1){
                caja4 = caja4 - 1;
                numObjVen = numObjVen + 1;
            }

            if (colaActual == 0){
                min0Cola = min0Cola + 1;
            }


            if (prob1 <= 6){
                System.out.println("MINUTO" + ia + " - Ha llegado alguien. - En cola: " + colaActual);
                System.out.println("Caja 1: ["+ caja1 + "]" + "  Caja 2: ["+ caja2 + "]" +"  Caja 3: ["+ caja3 + "]" + "  Caja 4: ["+ caja4 + "]");
                System.out.println("-----------------------------------------------------");
            }else{
                System.out.println("MINUTO" + ia + " - No ha llegado un nuevo cliente - En cola: " + colaActual);
                System.out.println("Caja 1: ["+ caja1 + "]" + "  Caja 2: ["+ caja2 + "]" +"  Caja 3: ["+ caja3 + "]" + "  Caja 4: ["+ caja4 + "]");
                System.out.println("-----------------------------------------------------");
            }
        }
        System.out.println("=========================================================");
        System.out.println("INFORME FINAL: ");
        System.out.println("=========================================================");
        System.out.println("Minutos sin cola existente:  " + min0Cola);
        System.out.println("Personas en la cola al finalizar:  " + colaActual);
        System.out.println("Personas atenididas hoy:  " + (persQueHanLlegado - colaActual));
        System.out.println("Artículos vendidos hoy:  " + numObjVen);

    }
}
