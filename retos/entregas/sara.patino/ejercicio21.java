public class ejercicio21 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (Math.pow(4, 2) >=Math.pow(i-11, 2)+ Math.pow(j-11, 2)||(Math.pow(5, 2)<Math.pow(i-11, 2)+ Math.pow(j-11, 2))) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[*]");
                }
            }
            System.out.println();
        }
    }
}
