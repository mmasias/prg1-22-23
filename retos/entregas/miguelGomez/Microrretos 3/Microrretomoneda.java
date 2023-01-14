public class Microrretomoneda{
    public static void main (String Args[] ) {
        System.out.println("Se tira una moneda:");
        int sale = (int) (Math.random()*2);
        if (sale == 0){
            System.out.println("Ha salido Cara");
        }
        else {System.out.println("Ha salido Cruz");}

    }
}
