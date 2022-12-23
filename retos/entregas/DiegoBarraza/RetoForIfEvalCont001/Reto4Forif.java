public class reto4Forif {
    public static void main(String[]args){
        int dimension;
        dimension=21;

        for(int j=1;j<=dimension;j=j+1){
            for(int i=1;i<=dimension;i=i+1){

                if (
                    i == 8 || i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14
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
