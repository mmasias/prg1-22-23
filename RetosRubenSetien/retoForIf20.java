public class retoForIf1 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j+ 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (i == 21-j || i == 17-j || i == 14-j || i == 11-j || i == 8-j || i == 5-j ||
                        i == 2-j ||  i == 24-j ||  i == 27-j ||  i == 30-j ||  i == 33-j || i == 36-j ||
                        i == 39-j || i == 42-j || i == 45-j || i == 48-j



                )
                {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }

            }
            System.out.println();
        }
    }
}