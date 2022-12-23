public class Retocaracol {
    public static void main (String[] args){
        boolean caracolvivo = true;
        int fondopozo = 20;
        double profundidadcaida = 0;
        double subida = 0;
        double bajada = 0;
        double alturacaracol = 0; 
        double alturaagua = 20;
        int dias = 1;
        profundidadcaida = (Math.random()*10)+10;

        while (caracolvivo == true){

            subida = (Math.random()*3)+1;
            bajada = (Math.random()*2);
            alturacaracol= profundidadcaida + bajada - subida;

            System.out.println("");
            System.out.println("Dia:"+ dias + " | " + "En la mañana logro subir:"+subida + " | " + "Pero en la noche se cayo:" +bajada +" | " +"Altura del caracol fue:"+ alturacaracol);

            profundidadcaida = alturacaracol;
            dias++;

            for (int i = 0; i <= fondopozo; i++){

                if((int)alturacaracol == i){
                    System.out.println("[]    _@)_/    [] _ __" + i);
                }else if(i == 0){
                    System.out.println("[__]              [__]");
                }else if(i >= (int)alturaagua){
                    System.out.println("[]~~~~~~~~~~~~~~[] _ __" + i);
                } else{
                    System.out.println("[]:. :. :. :. :.[] _ __ "+i);
                }

            }
          
            System.out.println("[][][][][][][][][]");
         
            if(alturacaracol <= 0 || alturaagua <= alturacaracol){
                caracolvivo = false;
            }
       
        }   

        if(alturaagua <= alturacaracol){
           System.out.println();
           System.out.println("El caracol se ha ahogado,se murio");
        }
    
        if(alturacaracol<= 0){
           System.out.println();
           System.out.println("El caracol logro salir,felicidades");
        }

    }
}
