public class microretoif1 {
    public static void main(String[] args) {
        int moneda;
        System.out.println("Se va a lanzar la moneda");
        moneda = (int) (Math.random() * 2 + 1);
        if (moneda==1) {
            System.out.println("La moneda ha salido por la parte de la cara");
        }
        else {
            System.out.println("La moneda ha slido por la parte de la cruz ");

        }
    }

}
