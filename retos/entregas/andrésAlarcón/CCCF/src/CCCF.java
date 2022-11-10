public class CCCF {
	public static void main(String[] args) throws Exception {

		int elapsedTime = 1 * 60, inLine = 0, checkoutServiceOne = 0;

		double arriveProbability;

		for (int minute = 1; minute <= elapsedTime; minute = minute + 1) {

			System.out.println("Minute " + minute );

			arriveProbability = Math.random();

            	if (arriveProbability < 0.4) {
				    System.out.println("- A costumer arrived");
					inLine = inLine + 1;
				} else {
					System.out.println("");
				
				}

				System.out.println("Costumers in queue " + inLine);

				if (checkoutServiceOne <= 0 && inLine>0) {
					inLine = inLine - 1;
					checkoutServiceOne = (int) (Math.random()*((10-5)+1))+5;
					System.out.println("- A costumer goes to the checkoutServiceOne with [" + checkoutServiceOne + "] items" );

				}

				if (checkoutServiceOne>0){
					checkoutServiceOne = checkoutServiceOne - 1;
					System.out.println("- The checkoutServiceOne process an item");
				}

		}

		System.out.println("Summary of the day");
		System.out.println("══════════════════════════");
		System.out.println("Minutes with empty queue: ");
		System.out.println("Costumers in queue at closing: " + inLine);
		System.out.println("Served Costumers: ");
		System.out.println("Items sold during the day: ");


	}
}


/* manuel@manuel-OptiPlex-7020:~/Documentos/miJava$ java testParcial
MINUTO 1 - Llega 1 persona - En Cola: 0
Caja1:[13] | Caja2:[0] | Caja3:[0] | Caja4:[0]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 2 - No llega nadie  - En Cola: 0
Caja1:[12] | Caja2:[0] | Caja3:[0] | Caja4:[0]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 3 - Llega 1 persona - En Cola: 0
Caja1:[11] | Caja2:[6] | Caja3:[0] | Caja4:[0]

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 4 - Llega 1 persona - En Cola: 0
Caja1:[10] | Caja2:[5] | Caja3:[4] | Caja4:[0]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 5 - No llega nadie  - En Cola: 0
Caja1:[9] | Caja2:[4] | Caja3:[3] | Caja4:[0]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 6 - Llega 1 persona - En Cola: 0
Caja1:[8] | Caja2:[3] | Caja3:[2] | Caja4:[4]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 7 - Llega 1 persona - En Cola: 1
Caja1:[7] | Caja2:[2] | Caja3:[1] | Caja4:[3]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 8 - No llega nadie  - En Cola: 1
Caja1:[6] | Caja2:[1] | Caja3:[0] | Caja4:[2]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 9 - Llega 1 persona - En Cola: 1
Caja1:[5] | Caja2:[0] | Caja3:[7] | Caja4:[1]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 10 - No llega nadie  - En Cola: 0
Caja1:[4] | Caja2:[6] | Caja3:[6] | Caja4:[0]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 11 - Llega 1 persona - En Cola: 0
Caja1:[3] | Caja2:[5] | Caja3:[5] | Caja4:[4]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 12 - Llega 1 persona - En Cola: 1
Caja1:[2] | Caja2:[4] | Caja3:[4] | Caja4:[3]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 720 - No llega nadie  - En Cola: 7
Caja1:[1] | Caja2:[4] | Caja3:[4] | Caja4:[2]
- - - - - - - - - - - - - - - - - - - - - - - - - - - -
RESUMEN
============================================================
Minutos con cola en cero  	: 216
Personas en la cola al cierre : 7
Personas atendidas en el dia  : 295
Articulos vendidos en el dia  : 2684
============================================================ */