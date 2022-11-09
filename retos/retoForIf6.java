public class retoForIf6 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                i==11 && j==2 || i==11 && j==3 || i==11 && j==4 || i==11 && j==5 || i==11 && j==6 || i==11 && j==7 || i==11 && j==8 || i==11 && j==9 || i==11 && j==10 || i==11 && j==11 || i==11 && j==12 || i==11 && j==13 || i==11 && j==14 || i==11 && j==15 || i==11 && j==16 || i==11 && j==17 || i==11 && j==18 || i==11 && j==19 || i==11 && j==20 || i==11 && j==21 || i==11 && j==1
                || j==11 && i==2 || j==11 && i==3 || j==11 && i==4 || j==11 && i==5 || j==11 && i==6 || j==11 && i==7 || j==11 && i==8 || j==11 && i==9 || j==11 && i==10 || j==11 && i==11 || j==11 && i==12 || j==11 && i==13 || j==11 && i==14 || j==11 && i==15 || j==11 && i==16 || j==11 && i==17 || j==11 && i==18 || j==11 && i==19 || j==11 && i==20 || j==11 && i==21 || j==11 && i==1
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