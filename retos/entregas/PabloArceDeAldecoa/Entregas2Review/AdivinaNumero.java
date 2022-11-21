import java.util.Scanner;
public class AdivinaNumero{
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int NumeroAleatorio, Intento, ContadorCaliente=0,Trampa;
        NumeroAleatorio=(int)(Math.random()*100+1);
        Trampa=(int)(Math.random()*5+1);
        if (Math.random()<=0.5){Trampa-=(2*Trampa);}
        for (int i=0;i<5;i++){
            System.out.print("Dime un número del uno al 100: "); Intento=entry.nextInt();
            // Es menor, mayor o has acertado
            if (Intento<NumeroAleatorio){System.out.println("Es mayor.");}
            else if (NumeroAleatorio<Intento){System.out.println("Es menor.");}
            else{System.out.println("Has acertado en el intento número "+(i+1)+".");break;} 
            //
            ////Caliente, frio o tibio
            int Aproximacion=NumeroAleatorio-Intento;
            if (Aproximacion<=5 & Aproximacion>=-5){System.out.println("Caliente.");
                //Trampas
                ContadorCaliente++;
                if (ContadorCaliente==2){System.out.println("¡Achús!"); NumeroAleatorio+=Trampa; ContadorCaliente=0;}
                    if (NumeroAleatorio>100){NumeroAleatorio-=(NumeroAleatorio-100);}
                //
            }
            else if (Aproximacion<=10 & Aproximacion>=-10){System.out.println("Tibio.");ContadorCaliente=0;}
            else{System.out.println("Frio.");ContadorCaliente=0;}
            ////
            if (i==4){System.out.println("No te quedan mas intentos, has perdido. Era el: "+NumeroAleatorio);}
        }
    }   
}