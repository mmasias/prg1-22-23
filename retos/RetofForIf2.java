public class RetofForIf2 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==2 && j==2 || i==2 && j==3 || i==2 && j==4 || i==2 && j==5 || i==2 && j==6 || i==2 && j==7 || i==2 && j==8 || i==2 && j==9 || i==2 && j==10 || i==2 && j==11 || i==2 && j==12 || i==2 && j==13 || i==2 && j==14 || i==2 && j==15 || i==2 && j==16 || i==2 && j==17 || i==2 && j==18 || i==2 && j==19 || i==2 && j==20 || i==2 && j==21 || i==2 && j==1
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
