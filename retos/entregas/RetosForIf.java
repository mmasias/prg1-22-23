public class RetosForIf {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        System.out.println("EJERCICIO 1");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==2 && j==2
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 2");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==2
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 3");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    j==dimension-1
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 4");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i>=8 && i<15
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 5");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==11 && j==11
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 6");
        
        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    j==11 || i==11
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 7");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    j==i
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 8");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==(22-j)
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 9");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    j==i || i==(22-j)
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 10");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i>=0
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 11");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    j != 11 || i!= 11
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 12");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    j != 11 && i !=11
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 13");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==(j+1) || i==(j-1)
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 14");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==2 || i == 20 || j==2 || j==20
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 15");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    (i>1 && i<6) || (j>1 && j<6)
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 16");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    (i!=1 && j!=1) && (i!=dimension && j!=dimension)
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 17");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    (j==2 || j==20) && (i!=1 && i!=dimension) || (i==2 || i== 20)  && (j!=1 && j!=dimension)
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 18");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i<6 && j<6
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 19");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    (j%2 == 0) && (i%2 == 0) || (j%2 == 1) && (i%2 == 1)
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 20");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    (i==5-j) || (i== 9-j) || (i==13-j) || (i==17-j) || (i==21-j) || (i==25-j) || (i==29-j) || (i==33-j) || (i==37-j) || (i==41-j) || (i==45-j)
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 21");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    (j!=6 || i!=11) && (j!=7 || i!=9 && i!=13) && (j!=7 || i!=10 && i!=12) && (j!=8 || i!=8 && i!=14) && (j!=9 || i!=7 && i!=15) && (j!=9 || i!=7 && i!=15) && (j!=10 || i!=7 && i!=15) && (j!=11 || i!=6 && i!=16) && (j!=12 || i!=7 && i!=15) && (j!=13 || i!=7 && i!=15) && (j!=14 || i!=8 && i!=14) && (j!=15 || i!=9 && i!=13) && (j!=15 || i!=10 && i!=12) && (j!=16 || i!=11)
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