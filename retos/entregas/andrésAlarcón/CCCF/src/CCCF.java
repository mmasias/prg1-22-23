public class CCCF {
	public static void main(String[] args) throws Exception {

		int elapsedTime = 12 * 60, minutesWithoutCostumers = 0, costumersInQueue = 0, attendedCostumers = 0, itemsSold = 0; 
		int checkoutOne = 0, checkoutTwo = 0, checkoutThree = 0, checkoutFour = 0, checkoutExtra = 0;

		double newCostumerProbability;

		String isExtraCheckoutOpen = "Closed";

		boolean checkoutExtraOpen = false;
		

		for (int minute = 1; minute <= elapsedTime; minute = minute + 1) {
			System.out.print("Minute: " + minute + " -");

			// Costumer arrival

			newCostumerProbability = Math.random();

				if (newCostumerProbability < 0.4) {
					System.out.print(" A costumer arrives -");
					costumersInQueue = costumersInQueue + 1;
					if (costumersInQueue > 15 && !checkoutExtraOpen) {
						checkoutExtraOpen = true;
						isExtraCheckoutOpen = "Open";

					} else {
						
					}

					} else {
					System.out.print(" No one arrives -");
					minutesWithoutCostumers = minutesWithoutCostumers + 1;
					}

			// Checkout costumers

				if (checkoutOne <= 0 && costumersInQueue>0) {
					costumersInQueue = costumersInQueue - 1;
					attendedCostumers = attendedCostumers + 1;
					checkoutOne = (int) (Math.random()*((10-5)+1))+5;

				}

				if (checkoutTwo <= 0 && costumersInQueue>0) {
					costumersInQueue = costumersInQueue - 1;
					attendedCostumers = attendedCostumers + 1;
					checkoutTwo = (int) (Math.random()*((10-5)+1))+5;
				}

				if (checkoutThree <= 0 && costumersInQueue>0) {
					costumersInQueue = costumersInQueue - 1;
					attendedCostumers = attendedCostumers + 1;
					checkoutThree = (int) (Math.random()*((10-5)+1))+5;
				}

				if (checkoutFour <= 0 && costumersInQueue>0) {
					costumersInQueue = costumersInQueue - 1;
					attendedCostumers = attendedCostumers + 1;
					checkoutFour = (int) (Math.random()*((10-5)+1))+5;

				}

				if (checkoutExtra <= 0 && checkoutExtraOpen) {
					costumersInQueue = costumersInQueue - 1;
                    attendedCostumers = attendedCostumers + 1;
                    checkoutExtra = (int) (Math.random()*((10-5)+1))+5;
				}

				


			// Checkout items

				if (checkoutOne > 0) {
					checkoutOne = checkoutOne - 1;
					itemsSold = itemsSold + 1;
				}

				if (checkoutTwo > 0) {
					checkoutTwo = checkoutTwo - 1;
					itemsSold = itemsSold + 1;
				}

				if (checkoutThree > 0) {
					checkoutThree = checkoutThree - 1;
					itemsSold = itemsSold + 1;
				}

				if (checkoutFour > 0) {
					checkoutFour = checkoutFour - 1;
					itemsSold = itemsSold + 1;
				}

				if (checkoutExtra > 0) {
					checkoutExtra = checkoutExtra - 1;
                    itemsSold = itemsSold + 1;
				}


			// Checkout Display	

			System.out.println(" In Queue: " + costumersInQueue);
			System.out.print(" Checkout 1 [" + checkoutOne + "] |");
			System.out.print(" Checkout 2 [" + checkoutTwo + "] |");
			System.out.print(" Checkout 3 [" + checkoutThree + "] |");
			System.out.print(" Checkout 4 [" + checkoutFour + "] |");
			System.out.println(" Extra Checkout [" + isExtraCheckoutOpen + "] [" + checkoutExtra + "]");
			System.out.println("..................................................................................................");

		}

		// Summary Display

		System.out.println("════════════════════════════════════════════════════");
		System.out.println("                 Summary of the day                 ");
		System.out.println("════════════════════════════════════════════════════");
		System.out.println(" Minutes with empty queue: " + minutesWithoutCostumers);
		System.out.println(" Costumers in queue at closing: " + costumersInQueue);
		System.out.println(" Served Costumers: " + attendedCostumers);
		System.out.println(" Items sold during the day: " + itemsSold);
		System.out.println("════════════════════════════════════════════════════");


	}
}
