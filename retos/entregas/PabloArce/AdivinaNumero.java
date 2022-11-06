import java.util.Scanner;
public class AdivinaNumero{
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int numeroAleatorio=0, intento=0, contadorCaliente=0,trampa=0;
        NumeroAleatorio=(int)(Math.random()*100+1);
        trampa=(int)(Math.random()*5+1);
        if (Math.random()<=0.5){trampa-=(2*trampa);}
        for (int i=0;i<5;i++){
            System.out.print("Dime un número del uno al 100: ");
            intento=entry.nextInt();
            // Es menor, mayor o has acertado
            if (intento<numeroAleatorio){System.out.println("Es mayor.");}
            else if (numeroAleatorio<intento){System.out.println("Es menor.");}
            else{System.out.println("Has acertado en el intento número "+(i+1)+".");
                break;} 
            //
            ////Caliente, frio o tibio
            int aproximacion=numeroAleatorio-intento;
            if (aproximacion<=5 & aproximacion>=-5){System.out.println("Caliente.");
                //Trampas
                contadorCaliente++;
                if (contadorCaliente==2){System.out.println("¡Achús!"); 
                    numeroAleatorio+=trampa;
                    contadorCaliente=0;}
                    if (numeroAleatorio>100){numeroAleatorio-=(numeroAleatorio-100);}
                //
            }
            else if (aproximacion<=10 & aproximacion>=-10){System.out.println("Tibio.");
                contadorCaliente=0;}
            else{System.out.println("Frio.");
                contadorCaliente=0;}
            ////
            if (i==4){System.out.println("No te quedan mas intentos, has perdido. Era el: "+numeroAleatorio);}
        }
    }   
}
