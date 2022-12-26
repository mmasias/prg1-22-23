import java.util.Scanner;

public class List {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        boolean sistemaEncendido = true;

        int list[] = { 1, 2, 3, 4, 5, 6 };
        String estadoClases[] = { "Libre", "Libre", "Libre", "Libre", "Libre", "Libre" };

        while (sistemaEncendido) {
            System.out.println("=========================================");
            System.out.println("Bienvenido al sistema de reservas de aulas");
            System.out.println("---------------------------------");
            System.out.println("Elige una opción");
            System.out.println("1. Listar aulas");
            System.out.println("2. Reservar un aula");
            System.out.println("3. Liberar un aula");
            System.out.println("4. Salir del sistema");
            System.out.println("=========================================");
            int opción = sc.nextInt();

            if (opción == 1) {
                System.out.println("Listado de aulas");
                for (int i = 0; i < list.length; i++) {
                    System.out.println("Aula " + list[i] + " " + estadoClases[i]);
                }
            } else if (opción == 2) {
                System.out.println("Reservar un aula");
                System.out.println("¿Qué aula quieres reservar?");
                int aula = sc.nextInt();
                if (estadoClases[aula - 1].equals("Libre")) {
                    estadoClases[aula - 1] = "Reservado";
                    System.out.println("Aula " + aula + " reservada");
                } else {
                    System.out.println("Aula " + aula + " no disponible");
                }
            } else if (opción == 3) {
                System.out.println("Liberar un aula");
                System.out.println("¿Qué aula quieres liberar?");
                int aulaLiberar = sc.nextInt();
                if (estadoClases[aulaLiberar - 1].equals("Reservado")) {
                    estadoClases[aulaLiberar - 1] = "Libre";
                    System.out.println("Aula " + aulaLiberar + " liberada");
                } else {
                    System.out.println("Aula " + aulaLiberar + " no disponible");
                }
            } else if (opción == 4) {
                System.out.println("Saliendo del sistema");
                sistemaEncendido = false;
            } else {
                System.out.println("Opción no válida");

            }

        }

        sc.close();

    }
}
