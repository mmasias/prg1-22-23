package retos.entregas.diegoGarcía;
import java.util.Scanner;
public class SimulacionParcial {
    public static void main (String[]args){

        int tiempoTotal = 12*60;                                      
        double probabilidadLlegada; 
        int cola = 0;
        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int caja5 = 0;
        boolean abrirCaja1 = true;
        boolean abrirCaja2 = true;
        boolean abrirCaja3 = true;
        boolean abrirCaja4 = true;
        boolean abrirCaja5Inicio = true;
        boolean abrirCaja5 = false;
        int contadorColaVacia = 0;
        int contadorPersonasAtendidas = 0;
        int contadorItemsVendidos = 0;
        int contadorPersonasCaja5 = 0;
        int eleccionCerrarCaja;
        Scanner s = new Scanner(System.in);

        System.out.println(" Si desea cerrar la caja 1 escriba 1, sino escriba otro numero");
        eleccionCerrarCaja = s.nextInt();
        if(eleccionCerrarCaja == 1){
            abrirCaja1 = false;
            System.out.println(" Se cerrara la caja 1");
        }else{
            System.out.println(" De acuerdo no se cierra la caja");
        }
        System.out.println();

        System.out.println(" Si desea cerrar la caja 2 escriba 1, sino escriba otro numero");
        eleccionCerrarCaja = s.nextInt();
        if(eleccionCerrarCaja == 1){
            abrirCaja2 = false;
            System.out.println(" Se cerrara la caja 2");
        }else{
            System.out.println(" De acuerdo no se cierra la caja");
        }
        System.out.println();

        System.out.println(" Si desea cerrar la caja 3 escriba 1, sino escriba otro numero");
        eleccionCerrarCaja = s.nextInt();
        if(eleccionCerrarCaja == 1){
            abrirCaja3 = false;
            System.out.println(" Se cerrara la caja 3");
        }else{
            System.out.println(" De acuerdo no se cierra la caja");
        }
        System.out.println();

        System.out.println(" Si desea cerrar la caja 4 escriba 1, sino escriba otro numero");
        eleccionCerrarCaja = s.nextInt();
        if(eleccionCerrarCaja == 1){
            abrirCaja4 = false;
            System.out.println(" Se cerrara la caja 4");
        }else{
            System.out.println(" De acuerdo no se cierra la caja");
        }
        System.out.println();

        System.out.println(" Si desea que si hay mucha gente no se abra la caja 5 escriba 1, sino escriba otro numero");
        eleccionCerrarCaja = s.nextInt();
        if(eleccionCerrarCaja == 1){
            abrirCaja5Inicio = false;
            System.out.println(" Nunca se abrira la caja 5");
        }else{
            System.out.println(" De acuerdo la caja puede entrar en funcionamiento");
        }
        System.out.println();

        if(abrirCaja1 == false && abrirCaja2 == false && abrirCaja3 == false && abrirCaja4 == false && abrirCaja5Inicio == false){
            System.out.println("HOY ES FIESTAA NO SE TRABAJAA!!!");
        }else{

            for(int minuto = 1; minuto<=tiempoTotal ; minuto++){

                probabilidadLlegada = Math.random();
    
                System.out.print(" Minuto "+ minuto);
    
                if(probabilidadLlegada <= 0.4){
                    System.out.print(" --> Llego una persona");
                    cola++;
    
                }else{
                    System.out.print("");
                }
                System.out.println(" --> Personas en cola: "+cola);
    
                if(cola == 0){
                    contadorColaVacia++;
                }
                
                if(cola > 0 && caja1 <= 0 && abrirCaja1){
    
                    cola--;
                    contadorPersonasAtendidas++;
                    caja1 = (int)(Math.random()*10)+5;
                    contadorItemsVendidos+=caja1;
                    System.out.println(" --> Pasa 1 persona a la caja 1 llevando "+ caja1 +" items");
                }
    
                if(caja1 > 0){
                    caja1--;
                    System.out.println(" La caja 1 atiende un item, quedan: "+ caja1+ " items");
                }
    
                if(cola > 0 && caja2 <= 0 && abrirCaja2){
    
                    cola--;
                    contadorPersonasAtendidas++;
                    caja2 = (int)(Math.random()*10)+5;
                    contadorItemsVendidos+=caja2;
                    System.out.println(" --> Pasa 1 persona a la caja 2 llevando "+ caja2 +" items");
                }
    
                if (caja2 > 0){
                    caja2--;
                    System.out.println(" La caja 2 atiende un item, quedan: "+ caja2+ " items");
                }
    
                if(cola > 0 && caja3 <= 0 && abrirCaja3){
    
                    cola--;
                    contadorPersonasAtendidas++;
                    caja3 = (int)(Math.random()*10)+5;
                    contadorItemsVendidos+=caja3;
                    System.out.println(" --> Pasa 1 persona a la caja 3 llevando "+ caja3 +" items");
                }
    
                if (caja3 > 0){
                    caja3--;
                    System.out.println(" La caja 3 atiende un item, quedan: "+ caja3+ " items");
                }
    
                if(cola > 0 && caja4 <= 0 && abrirCaja4){
    
                    cola--;
                    contadorPersonasAtendidas++;
                    caja4 = (int)(Math.random()*10)+5;
                    contadorItemsVendidos+=caja4;
                    System.out.println(" --> Pasa 1 persona a la caja 4 llevando "+ caja4 +" items");
                }
    
                if (caja4 > 0){
                    caja4--;
                    System.out.println(" La caja 4 atiende un item, quedan: "+ caja4+ " items");
                }
    
                if(cola > 15 && abrirCaja5 == false && abrirCaja5Inicio){
                    abrirCaja5 = true;
                    System.out.println(" Se abre la caja 5");
                }
    
                if(abrirCaja5 && caja5 == 0){
                    if(cola>0){
                        contadorPersonasCaja5++;
                        cola--;
                        contadorPersonasAtendidas++;
                        caja5 = (int)(Math.random()*10)+5;
                        contadorItemsVendidos+=caja5;
                        System.out.println(" --> Pasa 1 persona a la caja 5 llevando "+ caja5 +" items ");
                    }
                }
    
                if(caja5 > 0){
                    caja5--;
                    System.out.println(" La caja 5 atiende un item, quedan: "+ caja5+ " items");
                }
    
                if(abrirCaja5 && contadorPersonasCaja5 > 5 && caja5 == 0){
                    abrirCaja5 = false;
                    contadorPersonasCaja5 = 0;
                    System.out.println(" Se cierra la caja 5");
                }
    
                
    
                System.out.println("\n");
    
            }
            System.out.println("----------Fin de la jornada----------");
            System.out.println("Han habido "+ contadorColaVacia +" minutos con la cola vacia");
            System.out.println("Al finalizar el dia quedaban "+ cola +" personas en la cola");
            System.out.println("Se atendieron a "+ contadorPersonasAtendidas +" personas el dia de hoy");
            System.out.println("Se vendieron "+ contadorItemsVendidos +" items");
        }
        s.close();
    }
    
}
