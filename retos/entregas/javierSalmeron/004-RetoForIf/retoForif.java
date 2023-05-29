// Javier Salmeron
// Sol of https://docs.google.com/spreadsheets/d/1r7Sn8z3HDpUO8PPNc_eL3pTRCEHZ1gl8ybdL6D6aSLw/


public class retoForif {

    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) { 
            for (int i = 1; i <= dimension; i = i + 1) { 

                if (
                // El código desde aqui

                // 01
                // i==2 && j==2

                // 02
                // i==2

                // 03
                // j==20

                // 04
                // i>=8 && i<=14

                // 05
                // i== 11 && j == 11

                // 06
                // i==11 || j==11

                // 07
                // i==j || j==i

                // 08
                // i==22-j

                // 09
                // i==22-j || i==j || j==i

                // 10
                // true

                // 11
                // i!=11 || j!=11

                // 12
                // i!=11 && j!=11

                // 13
                // i+1==j || i-1==j
                // (i - j)*(i) + (j - i)*(j) == 1*1 // Otra forma de resolver mediante ecuacion

                // 14
                // i==2 || i==20 || j==2 || j==20

                // 15
                // (i>=2 && i<=5) || (j>=2 && j<=5)

                // 16
                // (i>=2 && i<=20) && (j>=2 && j<=20)

                // 17
                // ((i>=2 && i<=20) && (j>=2 && j<=20)) && !((i>=3 && i<=19) && (j>=3 && j<=19))

                // 18
                // i<=5 && j<=5

                // 19
                // ((i%2==0) && (j%2==0)) || ((i%2!=0) && (j%2!=0))

                // 20
                /*
                (i%4==j-1 && i%2==0) || (j%4==i-1 && j%2==0) ||
                (i%4+4==j-1 && i%2==0) || (j%4+4==i-1 && j%2==0) ||
                (i%4+8==j-1 && i%2==0) || (j%4+8==i-1 && j%2==0) ||
                (i%4+12==j-1 && i%2==0) || (j%4+12==i-1 && j%2==0) ||
                (i%4+16==j-1 && i%2==0) || (j%4+16==i-1 && j%2==0) ||
                (i%4+20==j-1 && i%2==0) || (j%4+20==i-1 && j%2==0)
                */

                // 21
                ((j-11)*(j-11)+(i-11)*(i-11) <= 5*5) && !((j-11)*(j-11)+(i-11)*(i-11) <= 4*4) // Calculate the points of the circle, then inverse the inside of the circle with a smaller circle
                && !((i==8 && j==7) || (i==7 && j==8) || (i==14 && j==7) || (i==7 && j==14) || (i==15 && j==8) || (i==8 && j==15) || (i==15 && j==8) || (i==8 && j==15) || (i==14 && j==15) || (i==15 && j==14))

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


//21 tests
//x^2+y^2=r^2
//(x−x1)^2+(y−y1)^2=r^2
//i==Math.round((Math.pow(j+11,2)-10*j+100-16)/(i-10)) || j==Math.round((Math.pow(i,2)-10*i+100-16)/(j-10))
//j == Math.round(Math.sqrt(Math.pow(r,2)-(2*j*mo)+Math.pow(mo,2)+Math.pow(mo,2)-(2*i*mo)+Math.pow(mo,2))) || i == Math.round(Math.sqrt(Math.pow(r,2)-(2*j*mo)+Math.pow(mo,2)+Math.pow(mo,2)-(2*i*mo)+Math.pow(mo,2)))
//j == Math.round(mo+4*Math.cos(1*Math.PI)) || i == Math.round(mo+4*Math.sin(1*Math.PI))
//j<=Math.sqrt(Math.pow(j-mo,2)+Math.pow(i-mo,2)) || i<=Math.sqrt(Math.pow(j-mo,2)+Math.pow(i-mo,2))
