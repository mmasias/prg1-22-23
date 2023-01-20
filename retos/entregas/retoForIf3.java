public class retoForIf3 {
    public static void main(String[] args) throws Exception {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1 ) {
            for(int i = 1; i <= dimension; i = i + 1){
                if(
                    //El codigo desde aqui
                    i == 1 && j == 20 || i == 2 && j == 20 || i == 3 && j == 20 || i == 4 && j == 20 || i == 5 && j == 20 || i == 6 && j == 20 || i == 7 && j == 20 ||
                    i == 8 && j == 20 || i == 9 && j == 20 || i == 10 && j == 20 || i == 11 && j == 20 || i == 12 && j == 20 || i == 13 && j == 20 || i == 14 && j == 20 ||
                    i == 15 && j == 20 || i == 16 && j == 20 || i == 17 && j == 20 || i == 18 && j == 20 || i == 19 && j == 20 || i == 20 && j == 20 || i == 21 && j == 20  
                    //El codigo hasta aquí
                ){
                    System.out.print("(*)");
                }else{
                    System.out.print(" . ");
                }
            }
            System.out.println();
            
        }
    }
} 