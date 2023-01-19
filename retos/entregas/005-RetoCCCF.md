            public class Carrefour {


        /**
         * Clientes 60% 1 min
         * 4 cajas (fila general que se va a la vacia Carrefour)
         * 1 cliente >5 <15 items     
         * 1 min/item
         */

            public static void main(String[] args){
                int minuto=0;

                int personasEnCola=0;
                int itemsClienteCaja1=0;
                int itemsClienteCaja2=0;
                int itemsClienteCaja3=0;
                int itemsClienteCaja4=0;
                int llegaPersona=0;

                //Random de items de cliente entre 5 y 15 (fuera del do while porque es solo al principio)
                itemsClienteCaja1 = (int)(Math.random() * (11)+5);
                itemsClienteCaja2 = (int)(Math.random() * (11)+5);
                itemsClienteCaja3 = (int)(Math.random() * (11)+5);
                itemsClienteCaja4 = (int)(Math.random() * (11)+5);


                //Do while ejecutado 1 vez
                do{
                int llegaPersonaPorcentaje =(int) (Math.random()*100);



                //Si el porcentaje de personas es menor a 60, sumas personas en cola y estableces llegaPersona es igual a 1
                if(llegaPersonaPorcentaje<=60){
                    personasEnCola++;
                    llegaPersona=1;
                }else{
                    //Si no estableces llegaPersona a 0 para mostrarlo en consola
                    llegaPersona=0;
                };

                /**si los items de cada caja es mayor a 0 se quita un item cada minuto
                 * si es igual a cero se hace otro random y se quita una persona de la caja correspondiente
                 */
                if(itemsClienteCaja1>0){
                    itemsClienteCaja1--;
                }else if(itemsClienteCaja1==0){
                    itemsClienteCaja1 = (int)(Math.random() * (11)+5);
                    personasEnCola=personasEnCola-1;
                }
                if(itemsClienteCaja2>0){
                    itemsClienteCaja2--;
                }else if(itemsClienteCaja2==0){
                    itemsClienteCaja2 = (int)(Math.random() * (11)+5);
                    personasEnCola=personasEnCola-1;
                }
                if(itemsClienteCaja3>0){
                    itemsClienteCaja3--;
                }else if(itemsClienteCaja3==0){
                    itemsClienteCaja3 = (int)(Math.random() * (11)+5);
                    personasEnCola=personasEnCola-1;
                }
                if(itemsClienteCaja4>0){
                    itemsClienteCaja4--;
                }else if(itemsClienteCaja4==0){
                    itemsClienteCaja4 = (int)(Math.random() * (11)+5);
                    personasEnCola=personasEnCola-1;
                }



                //Esquema

                System.out.println("------------------------------------------------");
                System.out.println(" MINUTO " + minuto + "- Llegan "+llegaPersona+ " clientes - En Cola: "+ personasEnCola);
                System.out.println("CAJA1 ["+itemsClienteCaja1+"] | CAJA2 ["+itemsClienteCaja2+"] | CAJA3 ["+itemsClienteCaja3+"] | CAJA4 ["+itemsClienteCaja4+"] ");
                System.out.println("------------------------------------------------");



                //Suma un minuto más
                minuto++;

                //Siempre que el minuto sea menor o igual que 720
                }while(minuto<=720);


            }
        }


