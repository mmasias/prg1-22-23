import java.util.Scanner;

public class cccf{  
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int tiempoTotal=12;
        double probabilidadDeLlegada;
        int numeroCajas=0;
        int caja1=0;
        int caja2=0;
        int caja3=0;
        int caja4=0;
        int caja5=0;
        int cola=0;
        int cantidadItems1=0;
        int cantidadItems2=0;
        int cantidadItems3=0;
        int cantidadItems4=0;
        int cantidadItems5=0;
        int totalItems=0;
        int personasAtendidas=0;
        int minutosSincola=0;

        System.out.println("Cuantas cajas funcionan? (1-5)");
        numeroCajas= entrada.nextInt();

        for (int minuto=1; minuto<= tiempoTotal; minuto++ ){

            probabilidadDeLlegada=(Math.random()*10+1);
            System.out.println("==================================================");

            if (probabilidadDeLlegada<=4){

                cola= cola+1;                                    

                System.out.println("hora: "+minuto+" - +1 persona - En Cola: "+cola);                
            } else{
                System.out.println("hora: "+minuto+" - sin cambios - En Cola: "+cola);
            }  
            if (cola==0){
                minutosSincola++;
            }

            if (cola>=1 & caja1==0 & numeroCajas>=1 & numeroCajas<=5){
                personasAtendidas++;
                cola--;
                caja1=1;
                int cajactual = 1;
                cantidadItems1=(int)(Math.random()*10+5);
                System.out.println("+1 en"+cajactual+ "con:"+ cantidadItems1+ " cosas");
                totalItems=totalItems+cantidadItems1;
            }

            if (cola>=1 & caja2==0 & numeroCajas>=2 & numeroCajas<=5){

                personasAtendidas++;

                cola--;
                caja2=1;
                int cajactual = 2;
                cantidadItems2=(int)(Math.random()*10+5);
                System.out.println("+1 en"+cajactual+ "con:"+ cantidadItems1+ " cosas");
                totalItems=totalItems+cantidadItems2;
            }

            if (cola>=1 & caja3==0 & numeroCajas>=3 & numeroCajas<=5){

                personasAtendidas++;

                cola--;
                caja3=1;
                int cajactual = 3;
                cantidadItems3=(int)(Math.random()*10+5);
                System.out.println("+1 en"+cajactual+ "con:"+ cantidadItems1+ " cosas");
                totalItems=totalItems+cantidadItems3;
            }

            if (cola>=1 & caja4==0 & numeroCajas>=4 & numeroCajas<=5){

                personasAtendidas++;

                cola--;
                caja4=1;
                int cajactual = 4;
                cantidadItems4=(int)(Math.random()*10+5);
                System.out.println("+1 en"+cajactual+ "con:"+ cantidadItems1+ " cosas");
                totalItems=totalItems+cantidadItems4;
            }

            if (cola>=15 & caja5==0 & numeroCajas==5){

                personasAtendidas++;

                cola--;
                caja5=1;
                int cajactual = 5;
                cantidadItems5=(int)(Math.random()*10+5);
                System.out.println("+1 en"+cajactual+ "con:"+ cantidadItems1+ " cosas");
                totalItems=totalItems+cantidadItems5;
            }

            if(caja1==1){
                cantidadItems1= cantidadItems1-1;
            } 
            if(numeroCajas>=1 & numeroCajas<=5){
            System.out.println("Quedan "+cantidadItems1+" cosas en la caja 1");
            }
            if(cantidadItems1==0) {
                caja1=0;
            } 




            if(caja2==1){
                cantidadItems2= cantidadItems2-1;
            }
            if(numeroCajas>=2 & numeroCajas<=5){
                System.out.println("Quedan "+cantidadItems2+" cosas en la caja 2");
            } 
            if(cantidadItems2==0) {
                caja2=0;
            }




            if(caja3==1){
                cantidadItems3= cantidadItems3-1;
            } 
            if(numeroCajas>=3 & numeroCajas<=5){
                System.out.println("Quedan "+cantidadItems3+" cosas en la caja 3");
            }
            if(cantidadItems3==0) {
                caja3=0;
            }




            if(caja4==1){
                cantidadItems4= cantidadItems4-1;
            }
            if(numeroCajas>=4 & numeroCajas<=5){
                System.out.println("Quedan "+cantidadItems4+" cosas en la caja 4");
            }
            if(cantidadItems4==0) {
                caja4=0;
            } 




            if(caja5==1){
                cantidadItems5= cantidadItems5-1;

                System.out.println("Quedan "+cantidadItems5+" cosas en la caja 5");
            }
            if(cantidadItems5==0) {
                caja5=0;
            } 
        }           
            System.out.println ();
    }  
}