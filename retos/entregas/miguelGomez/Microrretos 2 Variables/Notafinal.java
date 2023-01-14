import java.util.Scanner;
public class Notafinal {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("- nota que sacaste en el parcial: ");
        int NotaParcial = entrada.nextInt();

        System.out.println("- nota de media en las tareas: ");
        int NotaTareas = entrada.nextInt();

        System.out.println("- nota de actitud: ");
        int NotaActitud = entrada.nextInt();

        System.out.println("- nota que sacaste en el final: ");
        int NotaFinal = entrada.nextInt();

        System.out.println("Has sacado una nota de " + ((NotaParcial * 0.25) + (NotaTareas * 0.2)+(NotaActitud * 0.05) + (NotaFinal * 0.5)) + " puntos.");

        entrada.close();
    }
}