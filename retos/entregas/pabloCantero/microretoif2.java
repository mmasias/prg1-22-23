import java.util.Scanner;
public class microretoif2 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);  
    double numero1;
    double numero2;
    double respuestafinal;
    int respuestausuario;
    System.out.println("En este programa me diras dos número y les dividire, salvo que quieras dividirlo entre 0");
    System.out.println("Dime el primer número");
    numero1 = entrada.nextInt();
    System.out.println("Dime el segundo número");
    numero2 = entrada.nextInt();
    System.out.println("¿Quieres dividirlos entre 0?");
    System.out.println(" 0-Si    1-No");
    respuestausuario = entrada.nextInt();
    if (respuestausuario==0) {
        respuestafinal= numero1/0;
        System.out.println("La respuesta final es " + respuestafinal);
    } else {
        respuestafinal = numero1/numero2;
        System.out.println("La respuesta final es " + respuestafinal);
    }

    } 
}
