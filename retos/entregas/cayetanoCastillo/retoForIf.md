# Reto For e If

[Operadores Logicos]: https://aprenderaprogramar.com/attachments/article/466/CU00634B%20operadores%20logicos%20en%20Java%20igual%20distinto%20and%20or%20not%20menor%20mayor.pdf

public class retoForIf {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // Reto 1
                    i==2 && j==2
                // Reto 2
                    i==2
                // Reto 3
                    j==20
                // Reto 4
                    i>7 & i<15
                // Reto 5
                    i==11 & j==11
                // Reto 6 [||=OR]
                    i==11 || j==11
                // Reto 7 
                    i==j && i==j
                // Reto 8
                    i==22-j
                // Reto 9
                    i==j || i==22-j
                // Reto 10
                    i>=1
                // Reto 11 [Es distinto = !=]
                
                // Reto 12
                
                // Reto 13
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}

 


