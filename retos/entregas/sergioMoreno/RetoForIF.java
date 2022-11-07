public class RetoForIF {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        int i;
        int j;

        System.out.println("Ejercicio 1:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i == 2 && j == 2
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 2:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i == 2
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 3:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    j == 20
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 4:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i == 8 || i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 5:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i == 11 && j == 11
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 6:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i == 11 || j == 11
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 7:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i == j
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 8:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i == 22 - j
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 9:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i == 22 - j || i == j || j == i
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 10:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i == i && j == j
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 11:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i != 11 || j != 11
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 12:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i != 11 && j != 11
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 13:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i + 1 == j || i - 1 == j
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 14:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i == 2 || i == 20 || j == 2 || j == 20
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 15:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    ( i >= 2 && i <= 5 ) || ( j >= 2 && j <= 5 )
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 16:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    ( i >= 2 && i <= 20 ) && ( j >= 2 && j <= 20 )
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 17:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    (( i >= 2 && i <= 20 ) && ( j >= 2 && j <= 20 )) && !(( i >= 3 && i <= 19 ) && (j>=3 && j<=19))
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 18:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i <= 5 && j <= 5
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 19:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    (( i %2 == 0 ) && (j %2 == 0 )) || ((i %2 != 0 ) && ( j %2 != 0 ))
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 20:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    ( i %4 == j - 1 && i %2 == 0 ) || ( j %4 == i - 1 && j %2 == 0 ) ||
                    ( i %4 + 4 == j - 1 && i %2 == 0 ) || ( j %4 + 4 == i - 1 && j %2 == 0 ) ||
                    ( i %4 + 8 == j - 1 && i %2 == 0 ) || ( j %4 + 8 == i - 1 && j %2 == 0 ) ||
                    ( i %4 + 12 == j - 1 && i %2 == 0 ) || ( j %4 + 12 == i - 1 && j %2 == 0 ) ||
                    ( i %4 + 16 == j - 1 && i %2 == 0 ) || ( j %4 + 16 == i - 1 && j %2 == 0 ) ||
                    ( i %4 + 20 == j - 1 && i %2 == 0 ) || ( j %4 + 20 == i - 1 && j %2 == 0 ) 
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 21:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    (( j - 11 ) * ( j - 11 ) + ( i - 11 ) * ( i - 11 ) <= 5 * 5 ) && !(( j - 11 ) * ( j - 11 ) + ( i - 11 ) * ( i - 11 ) <= 4 * 4  ) 
                    && ! (( i == 8 && j == 7 ) || ( i == 7 && j == 8 ) || ( i == 14 && j == 7 ) || ( i == 7 && j == 14 ) || ( i == 15 && j == 8 ) || ( i == 8 && j == 15 ) || ( i == 15 && j == 8 ) || ( i == 8 && j == 15 ) || (i==14 && j==15) || (i==15 && j==14))
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

    }
}