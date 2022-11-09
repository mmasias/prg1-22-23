public class reto17Forif {
    public static void main(String[]args){
        int dimension;
        dimension=21;

        for(int j=1;j<=dimension;j=j+1){
            for(int i=1;i<=dimension;i=i+1){

                if (
                    ( i >= 2 && i <= 20) && ( j >= 2 && j <= 20 )&& !((i>=3 && i<=19)&&(j>=3 && j<=19))
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
