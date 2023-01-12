public class Moneda{
    public static void main(String args[]){
        double suerte = Math.random();
        if (suerte < 0.5){
            System.out.println("el resultado es cara");
        } else{
            System.out.println("el resultado es sello");
        }
       
    }
}
