public class CCCF1 {
    public static void main(String[] args){

        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int colaActual = 0;
        for(var ia = 0; ia<=720; ia=ia+1 ){
        
        double probaPersona = 1 + (Math.random() * 10);
        int prob1 = (int)probaPersona;

            if (prob1 <= 6){
                colaActual = colaActual + 1; 
            }else{
                colaActual = colaActual + 0;
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
            }

            if (caja2 >= 1){
                caja2 = caja2 - 1;
            }

            if (caja3 >= 1){
                caja3 = caja3 - 1;
            }

            if (caja4 >= 1){
                caja4 = caja4 - 1;
            }


            if (prob1 <= 4){
                System.out.println("MINUTO" + ia + " - Ha llegado alguien. - En cola: " + colaActual);
                System.out.println("Caja 1: ["+ caja1 + "]" + "  Caja 2: ["+ caja2 + "]" +"  Caja 3: ["+ caja3 + "]" + "  Caja 4: ["+ caja4 + "]");
                System.out.println("-----------------------------------------------------");
            }else{
                System.out.println("MINUTO" + ia + " - No ha llegado un nuevo cliente - En cola: " + colaActual);
                System.out.println("Caja 1: ["+ caja1 + "]" + "  Caja 2: ["+ caja2 + "]" +"  Caja 3: ["+ caja3 + "]" + "  Caja 4: ["+ caja4 + "]");
                System.out.println("-----------------------------------------------------");
            }
        }
    }
}
