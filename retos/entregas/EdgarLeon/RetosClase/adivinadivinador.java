import java.util.Scanner;

public class adivinadibinador {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escoge un número del 1 - 99");
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        int num7 = 0;

        System.out.println("Tu numero esta aqui??");
        System.out.println("1/7");
        System.out.println("|---------------|");
        System.out.println("| 1 21 41 61 81 |");
        System.out.println("| 3 23 43 63 83 |");
        System.out.println("| 5 25 45 65 85 |");
        System.out.println("| 7 27 47 67 87 |");
        System.out.println("| 9 29 49 69 89 |");
        System.out.println("|11 31 51 71 91 |");
        System.out.println("|13 33 53 73 93 |");
        System.out.println("|15 35 55 75 95 |");
        System.out.println("|17 37 57 77 97 |");
        System.out.println("|19 39 59 79 99 |");
        System.out.println("+---------------+");
        int tarjeta1 = sc.nextInt();
        if (tarjeta1 == 1){
            num1 = 1;
        } else if (tarjeta1 == 0) {
            num1 = 0;
        }

        System.out.println("Esta tu número en la tarjeta 2?");
        System.out.println("2/7");
        System.out.println("|---------------|");
        System.out.println("| 2 22 42 62 82 |");
        System.out.println("| 3 23 43 63 83 |");
        System.out.println("| 6 26 46 66 86 |");
        System.out.println("| 7 27 47 67 87 |");
        System.out.println("|10 30 50 70 90 |");
        System.out.println("|11 31 51 75 91 |");
        System.out.println("|14 35 54 74 94 |");
        System.out.println("|15 35 55 75 95 |");
        System.out.println("|18 38 58 78 98 |");
        System.out.println("|19 39 59 79 99 |");
        System.out.println("+---------------+");
        int tarjeta2 = sc.nextInt();
        if (tarjeta2 == 1){
            num2 = 2;
        } else if (tarjeta2 == 0) {
            num2 = 0;
        }

        System.out.println("Tu numero esta aqui?");
        System.out.println("3/7");
        System.out.println("|---------------|");
        System.out.println("| 4 22 44 62 84 |");
        System.out.println("| 5 23 45 63 85 |");
        System.out.println("| 6 28 46 68 86 |");
        System.out.println("| 7 29 47 69 87 |");
        System.out.println("|12 30 52 70 92 |");
        System.out.println("|13 31 53 71 93 |");
        System.out.println("|14 36 54 76 94 |");
        System.out.println("|15 37 55 77 95 |");
        System.out.println("|20 38 60 78    |");
        System.out.println("|21 39 61 79    |");
        System.out.println("+---------------+");
        int tarjeta3 = sc.nextInt();
        if (tarjeta3 == 1){
            num3 = 4;
        } else if (tarjeta3 == 0) {
            num3 = 0;
        }

        System.out.println("Tu numero esta aqui?");
        System.out.println("4/7");
        System.out.println("+---------------+");
        System.out.println("| 8 26 44 62 88 |");
        System.out.println("| 9 27 45 63 89 |");
        System.out.println("|10 28 46 72 90 |");
        System.out.println("|11 29 47 73 91 |");
        System.out.println("|12 30 56 74 92 |");
        System.out.println("|13 31 57 75 93 |");
        System.out.println("|14 40 58 76 94 |");
        System.out.println("|15 41 59 77 95 |");
        System.out.println("|24 42 60 78    |");
        System.out.println("|25 43 61 79    |");
        System.out.println("+---------------+");
        int tarjeta4 = sc.nextInt();
        if (tarjeta4 == 1){
            num4 = 8;
        } else if (tarjeta4 == 0) {
            num4 = 0;
        }

        System.out.println("Tu número esta aqui?");
        System.out.println("5/7");
       	System.out.println("+-------------------+");
        System.out.println("|16  26  52  62  88 |");
        System.out.println("|17  27  53  63  89 |");
        System.out.println("|18  28  54  80  90 |");
        System.out.println("|19  29  55  81  91 |");
        System.out.println("|20  30  56  82  92 |");
        System.out.println("|21  31  57  83  93 |");
        System.out.println("|22  48  58  84  94 |");
        System.out.println("|23  49  59  85  95 |");
        System.out.println("|24  50  60  86     |");
        System.out.println("|25  51  61  87     |");
        System.out.println("+-------------------+");
	int tarjeta5 = sc.nextInt();
        if (tarjeta5 == 1){
            num5 = 16;
        } else if (tarjeta5 == 0) {
            num5 = 0;
        }

        System.out.println("Tu numero esta aqui??");
        System.out.println("6/7");
        System.out.println("+---------------+");
        System.out.println("|32  42  52  62 |");
        System.out.println("|33  43  53  63 |");
        System.out.println("|34  44  54  99 |");
        System.out.println("|35  45  55     |");
        System.out.println("|36  46  56     |");
        System.out.println("|37  47  57     |");
        System.out.println("|38  48  58     |");
        System.out.println("|39  49  59     |");
        System.out.println("|40  50  60     |");
        System.out.println("|41  51  61     |");
        System.out.println("+---------------+");
        int tarjeta6 = sc.nextInt();
        if (tarjeta6 == 1){
            num6 = 32;
        } else if (tarjeta6 == 0) {
            num6 = 0;
        }

        System.out.println("Tu numero esta aqui?");
        System.out.println("7/7");
	    System.out.println("+---------------+");
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
        int tarjeta7 = sc.nextInt();
        if (tarjeta7 == 1){
            num7 = 64;
        } else if (tarjeta7 == 0) {
            num7 = 0;
        }

      
        int numFinal = (num1 + num2 + num3 + num4 + num5 + num6 + num7);
        System.out.println("Tu Numero es: " + numFinal);
    }
}
