public class CajasCarre {
	public static void main(String[] args) throws Exception {

		int tiempo = 12 * 60, tiempoSinClientes = 0, clientesEnCola = 0, clientesAtendidos = 0, itemsVendidos = 0; 
		int cajaUno = 0, cajaDos = 0, cajaTres = 0, cajaCuatro = 0, cajaCinco = 0, cajaSeis = 0;

		double probabilidadNuevoCliente;
		

		for (int minuto = 1; minuto <= tiempo; minuto = minuto + 1) {
			System.out.print("| Minuto: " + minuto + " - |");

			// Costumer arrival

			probabilidadNuevoCliente = Math.random();

				if (probabilidadNuevoCliente < 0.4) {
					System.out.print("| Llega una cliente - |");
					clientesEnCola = clientesEnCola + 1;
					} else {
					System.out.print("| No llega ningun cliente - |");
					tiempoSinClientes = tiempoSinClientes + 1;
					}

				System.out.println("| Clientes en cola: " + clientesEnCola + " |");
				System.out.print("| Caja 1: [" + cajaUno + "] |");
				System.out.print("| Caja 2: [" + cajaDos + "] |");
				System.out.print("| Caja 3: [" + cajaTres + "] |");
				System.out.print("| Caja 4: [" + cajaCuatro + "] |");
				System.out.print("| Caja 5: [" + cajaCinco + "] |");
				System.out.println("| Caja 6: [" + cajaSeis + "] |");
				System.out.println("|--------------------------------------------------------------------------------------------------|");

			// Checkout costumers

				if (cajaUno <= 0 && clientesEnCola>0) {
					clientesEnCola = clientesEnCola - 1;
					clientesAtendidos = clientesAtendidos + 1;
					cajaUno = (int) (Math.random()*((10-5)+1))+5;

				}

				if (cajaDos <= 0 && clientesEnCola>0) {
					clientesEnCola = clientesEnCola - 1;
					clientesAtendidos = clientesAtendidos + 1;
					cajaDos = (int) (Math.random()*((10-5)+1))+5;
				}

				if (cajaTres <= 0 && clientesEnCola>0) {
					clientesEnCola = clientesEnCola - 1;
					clientesAtendidos = clientesAtendidos + 1;
					cajaTres = (int) (Math.random()*((10-5)+1))+5;
				}

				if (cajaCuatro <= 0 && clientesEnCola>0) {
					clientesEnCola = clientesEnCola - 1;
					clientesAtendidos = clientesAtendidos + 1;
					cajaCuatro = (int) (Math.random()*((10-5)+1))+5;

				}

				if (cajaCinco <= 0 && clientesEnCola>0) {
					clientesEnCola = clientesEnCola - 1;
					clientesAtendidos = clientesAtendidos + 1;
					cajaCinco = (int) (Math.random()*((10-5)+1))+5;
				}

				if (cajaSeis <= 0 && clientesEnCola>0) {
					clientesEnCola = clientesEnCola - 1;
					clientesAtendidos = clientesAtendidos + 1;
					cajaSeis = (int) (Math.random()*((10-5)+1))+5;

				}


			// Checkout items

				if (cajaUno > 0) {
					cajaUno = cajaUno - 1;
					itemsVendidos = itemsVendidos + 1;
				}

				if (cajaDos > 0) {
					cajaDos = cajaDos - 1;
					itemsVendidos = itemsVendidos + 1;
				}

				if (cajaTres > 0) {
					cajaTres = cajaTres - 1;
					itemsVendidos = itemsVendidos + 1;
				}

				if (cajaCuatro > 0) {
					cajaCuatro = cajaCuatro - 1;
					itemsVendidos = itemsVendidos + 1;
				}

				if (cajaCinco > 0) {
					cajaCinco = cajaCinco - 1;
					itemsVendidos = itemsVendidos + 1;
				}

				if (cajaSeis > 0) {
					cajaSeis = cajaSeis - 1;
					itemsVendidos = itemsVendidos + 1;
				}

		}

		// Summary display

		System.out.println("+---------------------------------------------------+");
		System.out.println("|                 Resumen del día                   |");
		System.out.println("|---------------------------------------------------|");
		System.out.println("| minutos sin clientes: " + tiempoSinClientes + "    |");
		System.out.println("| Clientes en cola al cerrar " + clientesEnCola +"    |");
		System.out.println("| Clientes atendidos: " + clientesAtendidos + "    |");
		System.out.println("| Items vendidos en el dia: " + itemsVendidos +"    |");
		System.out.println("+---------------------------------------------------+");



	}
}
