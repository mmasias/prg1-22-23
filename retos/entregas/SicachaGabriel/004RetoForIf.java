public class RetoForIf {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                //01 i==2 && j==2
                //02 i==2
                //03 j==20
                //04 i>7 && i<14
                //05 i==11 && j==11
                //06 i==11 || j==11
                //07 i==j
                //08 j== dimension -i +1
                //09 i==j || j== dimension -i +1 
                //10 i>0
                //11 i!=11 || j!=11
                //12 i!=11 && j!=11
                //13 i==j+1 || i==j-1
                //14 i==2 || i==20 || j==2 || j==20
                //15 i>1 && i<6 || j>1 && j<6
                //16 i>1 && i<21 && j>1 && j<21
                //17 ((i==2 || i==20) && j!=1 && j!=21) || ((j==2 || j==20) && i!=1 && i!=21)
                //18 i<6 && j<6
                //19 (i%2 == 0 && j%2 !=0) || (i%2 != 0 && j%2 ==0)
                //20 (i + j) % 4 == 1
                (j!=6 || i!=11) && (j!=7 || i!=9) && (j!=7 || i!=10) && (j!=7 || i!=12) && (j!=7 || i!=13) && (j!=8 || i!=8) && 
                (j!=8 || i!=14) && (j!=9 || i!=7) && (j!=10 || i!=7) && (j!=9 || i!=15) && (j!=10 || i!=15) && (j!=11 || i!=6) &&
                (j!=11 || i!=16) && (j!=12 || i!=7) && (j!=13 || i!=7) && (j!=12 || i!=15) && (j!=13 || i!=15) && (j!=14 || i!=8) && 
                (j!=14 || i!=14) && (j!=15 || i!=9) && (j!=15 || i!=10) && (j!=15 || i!=12) && (j!=15 || i!=13) && (j!=16 || i!=11)
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
