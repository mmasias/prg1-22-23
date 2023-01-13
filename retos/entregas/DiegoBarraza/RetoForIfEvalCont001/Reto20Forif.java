public class reto20Forif {
    public static void main(String[]args){
        int dimension;
        dimension=21;

        for(int j=1;j<=dimension;j=j+1){
            for(int i=1;i<=dimension;i=i+1){

                if (
                    ( i %4 == j - 1 && i %2 == 0 ) || ( j %4 == i - 1 && j %2 == 0 ) ||
                    ( i %4 + 4 == j - 1 && i %2 == 0 ) || ( j %4 + 4 == i - 1 && j %2 == 0 ) ||
                    ( i %4 + 8 == j - 1 && i %2 == 0 ) || ( j %4 + 8 == i - 1 && j %2 == 0 ) ||
                    ( i %4 + 12 == j - 1 && i %2 == 0 ) || ( j %4 + 12 == i - 1 && j %2 == 0 ) ||
                    ( i %4 + 16 == j - 1 && i %2 == 0 ) || ( j %4 + 16 == i - 1 && j %2 == 0 ) ||
                    ( i %4 + 20 == j - 1 && i %2 == 0 ) || ( j %4 + 20 == i - 1 && j %2 == 0 ) 
                ){
                    System.out.print("(*)");
                } else{
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
   }
}
