public class CCCF_basico {
    public static void main(String[] args){
    
    int caja1;
    caja1 = 0;

    int caja2;
    caja2 = 0;

    int caja3;
    caja3 = 0;

    int caja4;
    caja4 = 0;

    int cola;
    cola = 0;
    
    for(int minuto = 0; minuto <= 720; minuto = minuto + 1){

        double probabilidadCliente = Math.random(); 

        if (probabilidadCliente <= 0.4){
            cola++;
            System.out.println("MINUTO " + minuto + " - " + " Llega 1 cliente " + " - " + " En cola: " + cola);

        } else{

            System.out.println("MINUTO " + minuto + " - " + " No llega ningun cliente " + " - " + " En cola: " + cola);

        }

        if (caja1 <=0 && cola>0){
            caja1 = (int)(Math.random()*15+5);
            cola--;
            System.out.println("Entra una persona a la caja 1 con " + caja1 + " items");
        }

        if (caja1 > 0){
            caja1--;
            System.out.println("A la caja 1 le quedan: " + caja1 + " items");
        }

        if (caja2 <=0 && cola>0){
            caja2 = (int)(Math.random()*15+5);
            cola--;
            System.out.println("Entra una persona a la caja 2 con " + caja2 + " items");
        }

        if (caja2 > 0){
            caja2--;
            System.out.println("A la caja 2 le quedan: " + caja2 + " items");
        }

        if (caja3 <=0 && cola>0){
            caja3 = (int)(Math.random()*15+5);
            cola--;
            System.out.println("Entra una persona a la caja 3 con " + caja3 + " items");
        }

        if (caja3 > 0){
            caja3--;
            System.out.println("A la caja 3 le quedan: " + caja3 + " items");
        }

        if (caja4 <=0 && cola>0){
            caja4 = (int)(Math.random()*15+5);
            cola--;
            System.out.println("Entra una persona a la caja 4 con " + caja4 + " items");
        }

        if (caja4 > 0){
            caja4--;
            System.out.println("A la caja 4 le quedan: " + caja4 + " items");
        }

        System.out.println("-----------------------------------------------------");

    }

    }
}