import java.util.Scanner; 

public class RetoAdivinacion {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Piense un numero del 1 al 100");

        int respuesta;
        int numero;


        numero = 0; 
       
        System.out.println("----------------------------------------");
       
        System.out.println("¿El número pensado está en la primera tarjeta?");
        System.out.println("No=0 Si=1");
        respuesta= entrada.nextInt();
        if (respuesta == 1) {
            System.out.println("Okey");
            numero= numero+ 1;
        }else if (respuesta == 0) {
            System.out.println("mmmm....");
        } else {
            System.out.println("Ese número no es ni el 0 ni el 1....");

        }
    
        System.out.println("----------------------------------------");
        
        
        System.out.println("¿El número pensado está en la segunda tarjeta?");
        System.out.println("No=0 Si=1");
        respuesta= entrada.nextInt();
        if (respuesta == 1) {
            System.out.println("Okey");
            numero= numero+ 2;
        }else if (respuesta == 0) {
            System.out.println("mmmm....");
        } else {
            System.out.println("Ese número no es ni el 0 ni el 1.... Reinicia");

        }
    
        
        System.out.println("----------------------------------------");
      
        
        System.out.println("¿El número pensado está en la tercera tarjeta?");
        System.out.println("No=0 Si=1");
        respuesta= entrada.nextInt();
        if (respuesta == 1) {
            System.out.println("Okey");
            numero= numero+ 4;
        }else if (respuesta == 0) {
            System.out.println("mmmm....");
        } else {
            System.out.println("Ese número no es ni el 0 ni el 1....");

        }
    
        
        System.out.println("----------------------------------------");
       
        
        System.out.println("¿El número pensado está en la cuarta tarjeta?");
        System.out.println("No=0 Si=1");
        respuesta= entrada.nextInt();
        if (respuesta == 1) {
            System.out.println("Okey");
            numero= numero+ 8;
        }else if (respuesta == 0) {
            System.out.println("mmmm....");
        } else {
            System.out.println("Ese número no es ni el 0 ni el 1....");

        }

        System.out.println("----------------------------------------");


        System.out.println("¿El número pensado está en la quinta tarjeta?");
        System.out.println("No=0 Si=1");
        respuesta= entrada.nextInt();
        if (respuesta == 1) {
            System.out.println("Okey");
            numero= numero+ 16;
        }else if (respuesta == 0) {
            System.out.println("mmmm....");
        } else {
            System.out.println("Ese número no es ni el 0 ni el 1....");

        }
    
        System.out.println("----------------------------------------");


        System.out.println("¿El número pensado está en la sexta tarjeta?");
        System.out.println("No=0 Si=1");
        respuesta= entrada.nextInt();
        if (respuesta == 1) {
            System.out.println("Okey");
            numero= numero+ 32;
        }else if (respuesta == 0) {
            System.out.println("mmmm....");
        } else {
            System.out.println("Ese número no es ni el 0 ni el 1....");

        }

        System.out.println("----------------------------------------");


        System.out.println("¿El número pensado está en la séptima tarjeta?");
        System.out.println("No=0 Si=1");
        respuesta= entrada.nextInt();
        if (respuesta == 1) {
            System.out.println("Okey");
            numero= numero+ 64;
        }else if (respuesta == 0) {
            System.out.println("mmmm....");
        } else {
            System.out.println("Ese número no es ni el 0 ni el 1....");

        }
    


        System.out.println("Su número es el " + numero);
        entrada.close();
    
    }   

    

}
