public class ejercicio7{
    public static void main(String[] args){

        for(int i=1; i<=21; i=i+1){
            for(int j=1;j<=21;j=j+1){
                if(i==j){
                System.out.print("[*]");
                }else {
                    System.out.print("[ ]");
                
                }
            }
            System.out.println();
        }


    }

}