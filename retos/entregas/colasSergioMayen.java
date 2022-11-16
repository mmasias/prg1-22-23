package retos.entregas;
import java.util.Scanner;

public class colasSergioMayen {
    public static void main(String[] args){
        Scanner siguiente = new Scanner(System.in);

        int tiempo = 0, productosEnCaja1 = 0, productosEnCaja2 = 0, productosEnCaja3 = 0, productosEnCaja4 = 0, enCola = 0, caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0, personasAtendidas = 0, productosVendidos = 0;
        double probabilidadEntradaNuevo;

            
        while(tiempo < 720){
            tiempo = tiempo +1;

            probabilidadEntradaNuevo = Math.random();
            if(probabilidadEntradaNuevo <= 0.40){
                System.out.println(" - Llego una persona");
				enCola = enCola + 1;
            }else{
                System.out.println("");
            }
            System.out.println("> Persona en cola: " + enCola); 

            if(caja1 == 0 && enCola >= 1){
                caja1 =  caja1 + 1;
                enCola = enCola - 1;
                productosEnCaja1 = (int)Math.floor(Math.random()* (15 - 5)) + 5;
                productosVendidos = productosVendidos + productosEnCaja1;
                System.out.println("  >  El cliente lleva " + productosEnCaja1 + " productos" );
                personasAtendidas = personasAtendidas + 1;

            }if (productosEnCaja1 > 0){
				productosEnCaja1 = productosEnCaja1 - 1;
				System.out.println("  >  La caja 1 atiende un item, le quedan " + productosEnCaja1 );
			}if(productosEnCaja1 == 0){
                caja1 = 0;
            }

            if(caja2 == 0 && enCola >= 1){
                caja2 =  caja2 + 1;
                enCola = enCola - 1;
                productosEnCaja2 = (int)Math.floor(Math.random()* (15 - 5)) + 5;
                productosVendidos = productosVendidos + productosEnCaja2;
                System.out.println("  >  El cliente lleva " + productosEnCaja2 + " productos" );
                personasAtendidas = personasAtendidas + 1;

            }if (productosEnCaja2 > 0){
				productosEnCaja2 = productosEnCaja2 - 1;
				System.out.println("  >  La caja 2 atiende un item, le quedan " + productosEnCaja2 );
			}if(productosEnCaja2 == 0){
                caja2 = 0;
            }

            if(caja3 == 0 && enCola >= 1){
                caja3 =  caja3 + 1;
                enCola = enCola - 1;
                productosEnCaja3 = (int)Math.floor(Math.random()* (15 - 5)) + 5;
                productosVendidos = productosVendidos + productosEnCaja3;
                System.out.println("  >  El cliente lleva " + productosEnCaja3 + " productos" );
                personasAtendidas = personasAtendidas + 1;

            }if (productosEnCaja3 > 0){
				productosEnCaja3 = productosEnCaja3 - 1;
				System.out.println("  >  La caja 3 atiende un item, le quedan " + productosEnCaja3 );
			}if(productosEnCaja3 == 0){
                caja3 = 0;
            }

            if(caja4 == 0 && enCola >= 1){
                caja4 =  caja4 + 1;
                enCola = enCola - 1;
                productosEnCaja4 = (int)Math.floor(Math.random()* (15 - 5)) + 5;
                productosVendidos = productosVendidos + productosEnCaja4;
                System.out.println("  >  El cliente lleva " + productosEnCaja4 + " productos" );
                personasAtendidas = personasAtendidas + 1;

            }if (productosEnCaja4 > 0){
				productosEnCaja4 = productosEnCaja4 - 1;
				System.out.println("  >  La caja 4 atiende un item, le quedan " + productosEnCaja4 );
			}if(productosEnCaja4 == 0){
                caja4 = 0;
            }
            
            System.out.println("Tiempo "+ tiempo + " minutos");
            System.out.println("------------------------------------------------------");
            System.out.println("Caja 1 esta atendiendo a "+ caja1 + " persona ");
            System.out.println("Caja 2 esta atendiendo a "+ caja2 + " persona ");
            System.out.println("Caja 3 esta atendiendo a "+ caja3 + " persona ");
            System.out.println("Caja 3 esta atendiendo a "+ caja4 + " persona ");
            System.out.println("Personas atendidas en total "+ personasAtendidas);
            System.out.println("Productos vendidos en total "+ productosVendidos);
            System.out.println("------------------------------------------------------");

            siguiente.nextLine();
        }
    }
}