public class retoForIf19 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j+ 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (i == 22-j || i == 20-j || i == 18-j || i == 16-j || i == 14-j || i == 12-j ||
                        i == 10-j ||  i == 8-j ||  i == 6-j ||  i == 4-j ||  i == 2-j || i == 26-j ||
                i == 24-j || i == 28-j || i == 30-j || i == 32-j || i == 34-j || i == 36-j ||
                        i == 38-j ||  i == 40-j ||  i == 42-j ||  i == 44-j ||  i == 46-j



                )
                {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }

            }
            System.out.println();