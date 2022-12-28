import java.util.Scanner;

public class EjemploClase {
    public static void main(String[] args){

        int opcion = 0;
        boolean[] aula = {false, false, false, false};

        do{
            imprimeMenu();
            opcion = respuesta(opcion);
            if(opcion == 1){
                imprimeAula(aula);
            }else if(opcion == 2 ){

            }else if(opcion == 3){

            }
        }while(opcion == 4);{
            
        }
    }

    static void imprimeMenu() {

        System.out.println("1 - Listar aulas");
        System.out.println("2 - Reservar un aula");
        System.out.println("3 - Liberar un aula");
        System.out.println("4 - Salir del sistema");
    }

    static void imprimeAula(boolean[] aula){

        for(int numero = 0; numero < aula.length; numero++){
            System.out.println(numero +" "+ aula[numero]);
        }
    }

    static int respuesta(int opcion){
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese el numero de la operacion a hacer: ");
        return opcion = entrada.nextInt();
    }
}
