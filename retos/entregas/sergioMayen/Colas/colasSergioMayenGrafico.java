package Colas;
import java.util.Scanner;

public class colasSergioMayenGrafico {

    static int enCola = 0, productosVendidos = 0, personasAtendidas = 0; 
    public static void main(String[] args){
        Scanner siguiente = new Scanner(System.in);

        int hora = 0, probabilidadCliente = 0, cantidadCaja1 = 0, cantidadCaja2 = 0, cantidadCaja3 = 0, cantidadCaja4 = 0, producto = 0; 

        do{
            hora ++;

            cantidadCaja1 = entraCliente(cantidadCaja1);
            cantidadCaja2 = entraCliente(cantidadCaja2);
            cantidadCaja3 = entraCliente(cantidadCaja3);
            cantidadCaja4 = entraCliente(cantidadCaja4);
            imprimir(cantidadCaja1, cantidadCaja2, cantidadCaja3, cantidadCaja4, hora);
            llegadaCliente(probabilidadCliente);
            siguiente.nextLine();

        }while (hora < 20);{
            jordanaTerminada();
        }
    }

    private static int entraCliente(int cantidadCaja) {

        if(cantidadCaja == 0 && enCola >= 1){
            cantidadCaja = productoCliente();
            productosVendidos = productosVendidos + cantidadCaja;
            personasAtendidas = personasAtendidas + 1;
            enCola = enCola - 1;
        }if(cantidadCaja > 0){
            cantidadCaja = cantidadCaja - 1;
        }if(cantidadCaja == 0){
            cantidadCaja = 0;
        }
        return cantidadCaja;
    }

    static int productoCliente() {
        int producto;
        producto = (int)Math.floor(Math.random()* (15 - 5)) + 5;
        return producto;
    }

    static void llegadaCliente(double probabilidadCliente) {

        probabilidadCliente = Math.random();
        if(probabilidadCliente >= 0.60){
            System.out.println(" - Llego una persona");
            enCola = enCola + 1;
        }else{
            System.out.println("");
        }
        System.out.println("> Persona en cola: " + enCola); 
        
    }

    static void imprimir(int caja1, int caja2, int caja3, int caja4, int hora) {
        imprimeCajaUno(caja1);
        imprimeCajaDos(caja2);
        imprimeCajaTres(caja3);
        imprimeCajaCuatro(caja4);
        System.out.println("Horas trancurridas " + hora + "h");
    }

    static void imprimeCajaCuatro(int cantidadCaja4) {
        for(int i=1;i<=cantidadCaja4;i++){
			System.out.print(" -.- ");
		}
		System.out.println("___");	
    }

    static void imprimeCajaTres(int cantidadCaja3) {
        for(int i=1;i<=cantidadCaja3;i++){
			System.out.print(" -.- ");
		}
		System.out.println("___");	
    }

    static void imprimeCajaDos(int cantidadCaja2) {
        for(int i=1;i<=cantidadCaja2;i++){
			System.out.print(" -.- ");
		}
		System.out.println("___");	
    }

    static void imprimeCajaUno(int cantidadCaja1) {
        for(int i=1;i<=cantidadCaja1;i++){
			System.out.print(" -.- ");
		}
		System.out.println("___");	
    }

    private static void jordanaTerminada() {
        System.out.println("---".repeat(10));
        System.out.println("El total de personas atendidas fueron: " + personasAtendidas);
        System.out.println("El total de productos atendidos fueron: " + productosVendidos);
        System.out.println("---".repeat(10));
    }
}
