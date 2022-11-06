# Reto For e If

[Operadores Logicos](https://aprenderaprogramar.com/attachments/article/466/CU00634B%20operadores%20logicos%20en%20Java%20igual%20distinto%20and%20or%20not%20menor%20mayor.pdf)

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
                    i!=11 || j!=11
                // Reto 12
                    i!=11 && j!=11
                // Reto 13 [Igual al reto 7 pero sumando 1]
                    i==j+1 || j==i+1
                // Reto 14
                    i==2 || i==20 || j==2 || j==20
                // Reto 15
                    i<=5 && i!=1 || j<=5 && j!=1
                // Reto 16
                    i!=1 && j!=1 && i!=21 && j!=21
                // Reto 17
                    i!=1 && j!=1 && i!=21 && j!=21 && !((i>=3 && j<=19) && (i<=19 && j>=3))
                // Reto 18
                    i<=5 && j<=5
                // Reto 19 [Operador de resto = %]
                    i%2==0 && j%2==0 || i%2==1 && j%2==1
                // Reto 20 [Falta rotar 45º hacia la derecha]
                    i==j+3 || i==j+7 || i==j+11 || i==j+15 || i==j+19 ||
                    j==i+1 ||j==i+5 ||j==i+9 ||j==i+13 ||j==i+17 ||j==i+21
                // Reto 21
                   (i!=6 || j!=11) && (i!=11 || j!=6) && (i!=16 || j!=11) &&
                   (i!=11 || j!=16) && (i!=7 || (j!=9 && j!=10)) && (j!=7 || (i!=9 && i!=10)) &&
                   (i!=8 || j!=8) && (i!=15 || (j!=9 && j!=10)) && (j!=7 || (i!=12 && i!=13)) &&
                   (i!=14 || j!=8) && (i!=7 || (j!=12 && j!=13)) && (j!=15 || (i!=9 && i!=10)) &&
                   (i!=8 || j!=14) && (i!=15 || (j!=12 && j!=13)) && (j!=15 || (i!=12 && i!=13)) &&
                   (i!=14 || j!=14)
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

 


