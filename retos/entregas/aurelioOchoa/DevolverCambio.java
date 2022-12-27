import java.util.Scanner;

public class DevolverCambio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double montoEntregado, montoAPagar, cambio;
    int billetes[] = {500, 200, 100, 50, 20, 10, 5};
    double monedas[] = {2, 1, 0.5, 0.2, 0.1, 0.05, 0.01};

    System.out.println("");
    System.out.println("~ Bienvenido al retornador ~");
    System.out.println("");

    System.out.print("Monto entregado (en euros): ");
    montoEntregado = scanner.nextDouble();
    System.out.print("Monto a pagar (en euros): ");
    montoAPagar = scanner.nextDouble();

    cambio = montoEntregado - montoAPagar;
    System.out.println("------");
    System.out.printf("Se procede a devolver: %.2f euros", cambio );
    System.out.println("\n");
    System.out.println("Se realiza de la siguiente manera:");
    System.out.println("\n");

    // Procesamos los billetes
    for (int billete = 0; billete < billetes.length; billete++) {
      int numBilletes = (int) (cambio / billetes[billete]);
      if (numBilletes > 0) {
        cambio -= numBilletes * billetes[billete];
        System.out.printf("%d billete(s) de %d euros\n", numBilletes, billetes[billete]);
      }
    }

    // Procesamos las monedas
    for (int moneda = 0; moneda < monedas.length; moneda++) {
      int numMonedas = (int) (cambio / monedas[moneda]);
      if (numMonedas > 0) {
        cambio -= numMonedas * monedas[moneda];
        System.out.printf("%d moneda(s) de %.2f euros\n", numMonedas, monedas[moneda]);
      }
    }

    System.out.println("------");
  }
}
