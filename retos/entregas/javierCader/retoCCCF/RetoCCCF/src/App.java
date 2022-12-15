import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("CCCF Challenge");

        // Variable declaration
        Random dice = new Random();
        Scanner scanner = new Scanner(System.in);

        int enableSuperAdmin;
        int adminAction;
        int checkoutToClose;
        int checkoutToOpen;

        int workTime = 12 * 60;
        int newCustomerItems;
        int customersWaiting = 0;
        int checkoutOne = 0;
        int checkoutTwo = 0;
        int checkoutThree = 0;
        int checkoutFour = 0;
        int checkoutFive = 0;
        int checkoutSix = 0;
        int emergencyCheckout = 0;
        int customersAttendedByEmergencyCheckout = 0;
        int minutesWithoutNewCustomer = 0;
        int customersAttended = 0;
        int itemsSold = 0;

        double newCustomerProbability = 0.4;
        double newCustomerDice;

        boolean isSuperAdminOn = false;
        boolean isOnSuperAdminSettings;
        boolean isCheckoutOneOpen = true;
        boolean isCheckoutTwoOpen = true;
        boolean isCheckoutThreeOpen = true;
        boolean isCheckoutFourOpen = true;
        boolean isCheckoutFiveOpen = false;
        boolean isCheckoutSixOpen = false;
        boolean isEmergencyCheckoutOpen = false;
        boolean wasEmergencyCheckoutOpened = false;

        // Code logic

        System.out.println("Do you want to enable the role of Super Admin? (1 = Yes, 0 = No)");
        enableSuperAdmin = scanner.nextInt();
        if (enableSuperAdmin == 1) {
            System.out.println("Super Admin role enabled");
            isSuperAdminOn = true;
        } else {
            System.out.println("Continue without Super Admin");
            scanner.nextLine();
        }

        System.out.println("Start the shift:");
        scanner.nextLine();

        for (int minutes = 0; minutes <= workTime; minutes++) {
            System.out.println("- Minute: " + minutes);

            // Super Admin Logic

            if (isSuperAdminOn) {
                isOnSuperAdminSettings = true;
                while (isOnSuperAdminSettings) {
                    System.out.println(
                            "Which action would you like to perform? (1: Close, 2: Open, 3: Skip, 4: End Super Admin)");
                    adminAction = scanner.nextInt();
                    if (adminAction == 1) {
                        System.out.println("Select which checkout you would like to close");
                        checkoutToClose = scanner.nextInt();
                        if (checkoutToClose == 1) {
                            if (!isCheckoutOneOpen) {
                                System.out.println("This checkout is already closed");
                                isOnSuperAdminSettings = false;
                            } else {
                                isCheckoutOneOpen = false;
                                isOnSuperAdminSettings = false;
                            }
                        } else if (checkoutToClose == 2) {
                            if (!isCheckoutTwoOpen) {
                                System.out.println("This checkout is already closed");
                                isOnSuperAdminSettings = false;
                            } else {
                                isCheckoutTwoOpen = false;
                                isOnSuperAdminSettings = false;
                            }
                        } else if (checkoutToClose == 3) {
                            if (!isCheckoutThreeOpen) {
                                System.out.println("This checkout is already closed");
                                isOnSuperAdminSettings = false;
                            } else {
                                isCheckoutThreeOpen = false;
                                isOnSuperAdminSettings = false;
                            }
                        } else if (checkoutToClose == 4) {
                            if (!isCheckoutFourOpen) {
                                System.out.println("This checkout is already closed");
                                isOnSuperAdminSettings = false;
                            } else {
                                isCheckoutFourOpen = false;
                                isOnSuperAdminSettings = false;
                            }
                        } else if (checkoutToClose == 5) {
                            if (!isCheckoutFiveOpen) {
                                System.out.println("This checkout is already closed");
                                isOnSuperAdminSettings = false;
                            } else {
                                isCheckoutFiveOpen = false;
                                isOnSuperAdminSettings = false;
                            }
                        } else if (checkoutToClose == 6) {
                            if (!isCheckoutSixOpen) {
                                System.out.println("This checkout is already closed");
                                isOnSuperAdminSettings = false;
                            } else {
                                isCheckoutSixOpen = false;
                                isOnSuperAdminSettings = false;
                            }
                        } else {
                            System.out.println("That's not a valid checkout");
                            isOnSuperAdminSettings = false;
                        }

                        if (checkoutToClose >= 1 && checkoutToClose <= 6) {
                            System.out.println(">Speaker: Checkout: " + checkoutToClose + " has been closed!");
                        }

                    } else if (adminAction == 2) {
                        System.out.println("Select which checkout you would like to open");
                        checkoutToOpen = scanner.nextInt();
                        if (checkoutToOpen == 1) {
                            if (isCheckoutOneOpen) {
                                System.out.println("This checkout is already open");
                                isOnSuperAdminSettings = false;
                            } else {
                                isCheckoutOneOpen = true;
                                isOnSuperAdminSettings = false;
                            }
                        } else if (checkoutToOpen == 2) {
                            if (isCheckoutTwoOpen) {
                                System.out.println("This checkout is already open");
                                isOnSuperAdminSettings = false;
                            } else {
                                isCheckoutTwoOpen = true;
                                isOnSuperAdminSettings = false;
                            }
                        } else if (checkoutToOpen == 3) {
                            if (isCheckoutThreeOpen) {
                                System.out.println("This checkout is already open");
                                isOnSuperAdminSettings = false;
                            } else {
                                isCheckoutThreeOpen = true;
                                isOnSuperAdminSettings = false;
                            }
                        } else if (checkoutToOpen == 4) {
                            if (isCheckoutFourOpen) {
                                System.out.println("This checkout is already open");
                                isOnSuperAdminSettings = false;
                            } else {
                                isCheckoutFourOpen = true;
                                isOnSuperAdminSettings = false;
                            }
                        } else if (checkoutToOpen == 5) {
                            if (isCheckoutFiveOpen) {
                                System.out.println("This checkout is already open");
                                isOnSuperAdminSettings = false;
                            } else {
                                isCheckoutFiveOpen = true;
                                isOnSuperAdminSettings = false;
                            }
                        } else if (checkoutToOpen == 6) {
                            if (isCheckoutSixOpen) {
                                System.out.println("This checkout is already open");
                                isOnSuperAdminSettings = false;
                            } else {
                                isCheckoutSixOpen = true;
                                isOnSuperAdminSettings = false;
                            }
                        } else {
                            System.out.println("That's not a valid checkout");
                            isOnSuperAdminSettings = false;
                        }

                        if (checkoutToOpen >= 1 && checkoutToOpen <= 6) {
                            System.out.println(">Speaker: Checkout: " + checkoutToOpen + " has been opened");
                        }

                    } else if (adminAction == 3) {
                        isOnSuperAdminSettings = false;
                    } else if (adminAction == 4) {
                        isSuperAdminOn = false;
                        isOnSuperAdminSettings = false;
                    } else {
                        System.out.println("Please input a valid admin action");
                    }
                }
            }

            newCustomerDice = dice.nextDouble();

            // New Customer Arrival

            if (newCustomerDice < newCustomerProbability) {
                System.out.println("> A new customer has arrived!");
                customersWaiting += 1;
                if (customersWaiting > 15 && !isEmergencyCheckoutOpen) {
                    System.out.println(">Speaker: Due to the influx of customers, a new checkout has been opened");
                    isEmergencyCheckoutOpen = true;
                    if (!wasEmergencyCheckoutOpened) {
                        wasEmergencyCheckoutOpened = true;
                    }
                }
            } else {
                minutesWithoutNewCustomer += 1;
            }

            System.out.println("> Customers Waiting: " + customersWaiting);

            // Checkout Arrival Logic

            if ((!(checkoutOne > 0) && customersWaiting > 0) && isCheckoutOneOpen) {
                customersWaiting -= 1;
                customersAttended += 1;
                newCustomerItems = dice.nextInt(15) + 1;
                checkoutOne = newCustomerItems;
                System.out.println("> A Customer has passed to Checkout 1 carrying: " + newCustomerItems + " items");
            }

            if ((!(checkoutTwo > 0) && customersWaiting > 0) && isCheckoutTwoOpen) {
                customersWaiting -= 1;
                customersAttended += 1;
                newCustomerItems = dice.nextInt(15) + 1;
                checkoutTwo = newCustomerItems;
                System.out.println("> A Customer has passed to Checkout 2 carrying: " + newCustomerItems + " items");
            }

            if ((!(checkoutThree > 0) && customersWaiting > 0) && isCheckoutThreeOpen) {
                customersWaiting -= 1;
                customersAttended += 1;
                newCustomerItems = dice.nextInt(15) + 1;
                checkoutThree = newCustomerItems;
                System.out.println("> A Customer has passed to Checkout 3 carrying: " + newCustomerItems + " items");
            }

            if ((!(checkoutFour > 0) && customersWaiting > 0) && isCheckoutFourOpen) {
                customersWaiting -= 1;
                customersAttended += 1;
                newCustomerItems = dice.nextInt(15) + 1;
                checkoutFour = newCustomerItems;
                System.out.println("> A Customer has passed to Checkout 4 carrying: " + newCustomerItems + " items");
            }

            if ((!(checkoutFive > 0) && customersWaiting > 0) && isCheckoutFiveOpen) {
                customersWaiting -= 1;
                customersAttended += 1;
                newCustomerItems = dice.nextInt(15) + 1;
                checkoutFive = newCustomerItems;
                System.out.println("> A Customer has passed to Checkout 5 carrying: " + newCustomerItems + " items");
            }

            if ((!(checkoutSix > 0) && customersWaiting > 0) && isCheckoutSixOpen) {
                customersWaiting -= 1;
                customersAttended += 1;
                newCustomerItems = dice.nextInt(15) + 1;
                checkoutSix = newCustomerItems;
                System.out.println("> A Customer has passed to Checkout 5 carrying: " + newCustomerItems + " items");
            }

            if ((customersWaiting < 15 && customersAttendedByEmergencyCheckout > 5) && isEmergencyCheckoutOpen) {
                System.out.println(">Speaker: Emergency checkout has been closed");
                customersAttendedByEmergencyCheckout = 0;
                isEmergencyCheckoutOpen = false;
            }

            if (!(emergencyCheckout > 0) && isEmergencyCheckoutOpen) {
                customersWaiting -= 1;
                customersAttended += 1;
                customersAttendedByEmergencyCheckout += 1;
                newCustomerItems = dice.nextInt(15) + 1;
                emergencyCheckout = newCustomerItems;
                System.out.println(
                        "> A Customer has passed to Emergency Checkout carrying: " + newCustomerItems + " items");
            }

            // Checkout Item Handling Logic

            if (checkoutOne > 0) {
                checkoutOne -= 1;
                itemsSold += 1;
                System.out.println("> Checkout 1 has attended one item, " + checkoutOne + " items remaining");
            }

            if (checkoutTwo > 0) {
                checkoutTwo -= 1;
                itemsSold += 1;
                System.out.println("> Checkout 2 has attended one item, " + checkoutTwo + " items remaining");
            }

            if (checkoutThree > 0) {
                checkoutThree -= 1;
                itemsSold += 1;
                System.out.println("> Checkout 3 has attended one item, " + checkoutThree + " items remaining");
            }

            if (checkoutFour > 0) {
                checkoutFour -= 1;
                itemsSold += 1;
                System.out.println("> Checkout 4 has attended one item, " + checkoutFour + " items remaining");
            }

            if (checkoutFive > 0) {
                checkoutFive -= 1;
                itemsSold += 1;
                System.out.println("> Checkout 5 has attended one item, " + checkoutFive + " items remaining");
            }

            if (checkoutSix > 0) {
                checkoutSix -= 1;
                itemsSold += 1;
                System.out.println("> Checkout 6 has attended one item, " + checkoutSix + " items remaining");
            }

            if (emergencyCheckout > 0) {
                emergencyCheckout -= 1;
                itemsSold += 1;
                System.out.println(
                        "> Emergency Checkout has attended one item, " + emergencyCheckout + " items remaining");
            }

            // Checkout display logic
            System.out.println("/ Checkout 1 [" + checkoutOne + "]");
            System.out.println("/ Checkout 2 [" + checkoutTwo + "]");
            System.out.println("/ Checkout 3 [" + checkoutThree + "]");
            System.out.println("/ Checkout 4 [" + checkoutFour + "]");
            System.out.println("/ Checkout 5 [" + checkoutFive + "]");
            System.out.println("/ Checkout 6 [" + checkoutSix + "]");
            System.out.println("/ Emergency Checkout [" + emergencyCheckout + "]");

        }

        // Summary display logic
        System.out.println("-End of work shift!");
        System.out.println("See shift summary");
        scanner.nextLine();
        System.out.println("-Minutes without new customers arriving: " + minutesWithoutNewCustomer);
        System.out.println("-Number of people still in line when the shift ended: " + customersWaiting);
        System.out.println("-Number of customers attended throughout the shift: " + customersAttended);
        System.out.println("-Number of items sold: " + itemsSold);
        System.out.println("-Was the emergency checkout opened? " + wasEmergencyCheckoutOpened);

        scanner.close();
    }
}
