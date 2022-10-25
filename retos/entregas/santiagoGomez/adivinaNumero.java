import java.util.Scanner;

public class adivinaNumero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escoge un número del 1 - 99");
         
        int numTar1 = 0;
        int numTar2 = 0;
        int numTar3 = 0;
        int numTar4 = 0;
        int numTar5 = 0;
        int numTar6 = 0;
        int numTar7 = 0;

        // tarjetas
        System.out.println("+---------------+ +---------------+ +---------------+");
        System.out.println("|  Tarjeta #1   | |  Tarjeta #2   | |  Tarjeta #3   |");
        System.out.println("|---------------| |---------------| |---------------|");
        System.out.println("| 1 21 41 61 81 | | 2 22 42 62 82 | | 4 22 44 62 84 |");
        System.out.println("| 3 23 43 63 83 | | 3 23 43 63 83 | | 5 23 45 63 85 |");
        System.out.println("| 5 25 45 65 85 | | 6 26 46 66 86 | | 6 28 46 68 86 |");
        System.out.println("| 7 27 47 67 87 | | 7 27 47 67 87 | | 7 29 47 69 87 |");
        System.out.println("| 9 29 49 69 89 | |10 30 50 70 90 | |12 30 52 70 92 |");
        System.out.println("|11 31 51 71 91 | |11 31 51 75 91 | |13 31 53 71 93 |");
        System.out.println("|13 33 53 73 93 | |14 35 54 74 94 | |14 36 54 76 94 |");
        System.out.println("|15 35 55 75 95 | |15 35 55 75 95 | |15 37 55 77 95 |");
        System.out.println("|17 37 57 77 97 | |18 38 58 78 98 | |20 38 60 78    |");
        System.out.println("|19 39 59 79 99 | |19 39 59 79 99 | |21 39 61 79    |");
        System.out.println("+---------------+ +---------------+ +---------------+");
        System.out.println("+---------------+ +---------------+ +---------------+");
        System.out.println("|  Tarjeta #4   | |  Tarjeta #5   | |  Tarjeta #6   |");
        System.out.println("|---------------| |---------------| |---------------|");
        System.out.println("| 8 26 44 62 88 | |16 26 52 62 88 | |32  42  52  62 |");
        System.out.println("| 9 27 45 63 89 | |17 27 53 63 89 | |33  43  53  63 |");
        System.out.println("|10 28 46 72 90 | |18 28 54 80 90 | |34  44  54  99 |");
        System.out.println("|11 29 47 73 91 | |19 29 55 81 91 | |35  45  55     |");
        System.out.println("|12 30 56 74 92 | |20 30 56 82 92 | |36  46  56     |");
        System.out.println("|13 31 57 75 93 | |21 31 57 83 93 | |37  47  57     |");
        System.out.println("|14 40 58 76 94 | |22 48 58 84 94 | |38  48  58     |");
        System.out.println("|15 41 59 77 95 | |23 49 59 85 95 | |39  49  59     |");
        System.out.println("|24 42 60 78    | |24 50 60 86    | |40  50  60     |");
        System.out.println("|25 43 61 79    | |25 51 61 87    | |41  51  61     |");
        System.out.println("+---------------+ +---------------+ +---------------+");
        System.out.println("+---------------+");
        System.out.println("|  Tarjeta #7   |");
        System.out.println("|---------------|");
        System.out.println("|64  74  84  94 |");
        System.out.println("|65  75  85  95 |");
        System.out.println("|66  76  86  96 |");
        System.out.println("|67  77  87  97 |");
        System.out.println("|68  78  88  98 |");
        System.out.println("|69  79  89  99 |");
        System.out.println("|70  80  90     |");
        System.out.println("|71  81  91     |");
        System.out.println("|72  82  92     |");
        System.out.println("|73  83  93     |");
        System.out.println("+---------------+");

        //inicio
        System.out.println("#############################");
        System.out.println("Utiliza 1 para SI y 0 para NO");
        System.out.println("#############################");

        // solicitar número
        System.out.println("Esta tu número en la tarjeta 1?");
        int tarjeta1 = sc.nextInt();
        if (tarjeta1 == 1){
            numTar1 = 1;
        } else if (tarjeta1 == 0) {
            numTar1 = 0;
        }

        System.out.println("Esta tu número en la tarjeta 2?");
        int tarjeta2 = sc.nextInt();
        if (tarjeta2 == 1){
            numTar2 = 2;
        } else if (tarjeta2 == 0) {
            numTar2 = 0;
        }

        System.out.println("Esta tu número en la tarjeta 3?");
        int tarjeta3 = sc.nextInt();
        if (tarjeta3 == 1){
            numTar3 = 4;
        } else if (tarjeta3 == 0) {
            numTar3 = 0;
        }

        System.out.println("Esta tu número en la tarjeta 4?");
        int tarjeta4 = sc.nextInt();
        if (tarjeta4 == 1){
            numTar4 = 8;
        } else if (tarjeta4 == 0) {
            numTar4 = 0;
        }

        System.out.println("Esta tu número en la tarjeta 5?");
        int tarjeta5 = sc.nextInt();
        if (tarjeta5 == 1){
            numTar5 = 16;
        } else if (tarjeta5 == 0) {
            numTar5 = 0;
        }

        System.out.println("Esta tu número en la tarjeta 6?");
        int tarjeta6 = sc.nextInt();
        if (tarjeta6 == 1){
            numTar6 = 32;
        } else if (tarjeta6 == 0) {
            numTar6 = 0;
        }

        System.out.println("Esta tu número en la tarjeta 7?");
        int tarjeta7 = sc.nextInt();
        if (tarjeta7 == 1){
            numTar7 = 64;
        } else if (tarjeta7 == 0) {
            numTar7 = 0;
        }

      
        int numFinal = (numTar1 + numTar2 + numTar3 + numTar4 + numTar5 + numTar6 + numTar7);
        System.out.println("El numero que pensaste es: " + numFinal);
    }
}
