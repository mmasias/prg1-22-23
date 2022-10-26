import java.util.Scanner;

public class DevolucionCambio {
    public static void main(String [] args) {
        System.out.println("\n");
        Scanner s = new Scanner(System.in);
        double dineroEntregado, dineroAPagar, resto;
		
		int numeroDeBilletes;
		
        int billete500 = 500;
        int billete200 = 200;
        int billete100 = 100;
        int billete50 = 50;
        int billete20 = 20;
        int billete10 = 10;
        int billete5 = 5;
        int moneda2 = 2;
        int moneda1 = 1;
        double moneda05 = 0.5;
        double moneda02 = 0.2;
        double moneda01 = 0.1;
        double moneda005 = 0.05;
        double moneda001 = 0.01;

        System.out.print("Monto entregado (en euros): ");
        dineroEntregado = s.nextDouble();

        System.out.print("Monto a pagar (en euros): ");
        dineroAPagar = s.nextDouble();

        System.out.println();
        if (dineroEntregado < dineroAPagar){
            System.out.println("Aqui falta dinero, no hay suficiente para pagar su compra.");
            System.out.println();
        }else if (dineroAPagar == dineroEntregado){
            System.out.println("Lo ha pagado justo, no se tiene que devolver cambio.");
            System.out.println();
        }else{
			
            double devolucionDinero = dineroEntregado - dineroAPagar;
			
            System.out.println("se debe devolver la cantidad de "+ devolucionDinero);
            System.out.println("Se deben entregar: ");



            numeroDeBilletes = (int)(devolucionDinero / billete500);
            
            if(numeroDeBilletes > 0){
				devolucionDinero = devolucionDinero - (billete500 * numeroDeBilletes);
            }
			System.out.println( numeroDeBilletes + " billete(s) de " + billete500);



            numeroDeBilletes = (int)(devolucionDinero / billete200);
            
            if(numeroDeBilletes > 0){
				devolucionDinero = devolucionDinero - (billete200 * numeroDeBilletes);
            }
			System.out.println( numeroDeBilletes + " billete(s) de " + billete200);
 
 
            numeroDeBilletes = (int)(devolucionDinero / moneda02);
            
            if(numeroDeBilletes > 0){
				devolucionDinero = devolucionDinero - (moneda02 * numeroDeBilletes);
            }
			System.out.println( numeroDeBilletes + " moneda(s) de " + moneda02);
 

        }

        s.close();
    }
}