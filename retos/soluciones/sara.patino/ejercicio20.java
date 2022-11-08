public class class20{
    public static void main(String[] args){
        int x=5;
    for (int i=1; i<=21;i= i+1){
        for (int j=1;j<=21;j=j+1){
            
            if (j==x-1){
                System.out.print("[*]");
                x= x+4;
                
            } else {
                System.out.print("[ ]");
                
            }
        }
         System.out.println();
         x=x-21;
    }

}
}