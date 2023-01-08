import java.util.Scanner;

import javax.swing.plaf.ProgressBarUI;
   
public class Monigote {

    static int aciertos = 0;
    static int turno = 1;
    public static void main(String[] args) {

        for (int i = 0 ; i < 15; i++) {
        int mole = mole();
        imprimeJuego(user(), mole, mole2(mole));
        }
       
       
    }

    public static int user(){
        System.out.print("Numero de donde quieres pegar: ");
        Scanner sc = new Scanner(System.in);
        int user = 0;
        user = sc.nextInt();
        return user;
    }

    public static int mole(){
        int mole = 0;
        mole = (int)(Math.random()*16)+1;
        return mole;
    }
    public static int mole2 (int mole1){

        int mole = 0;
        do{
        mole = (int)(Math.random()*16)+1;
        if(mole != mole1){
            break;
        }
        }while(mole == mole1);
       
        
        return mole;
    }

    public static void imprimeBorde(){
        System.out.println("+-------------------+");
    }

    public static void imprimeJuego(int numeroUsuario, int numeroCompu, int numeroCompu2){
        int contador = 0;
        String resultado = "FALLO";
       
        System.out.println("Golpe en: " + numeroUsuario + "/ Monigote en: " + numeroCompu);
        imprimeBorde();
        for(int i = 1 ; i <17; i++){
            if(i==numeroCompu && i != numeroUsuario){
                System.out.print("(‘’)");
                contador++;
            }else if(i==numeroCompu2 && i != numeroUsuario){
                System.out.print("(‘’)");
                contador++;
            }else if(i==numeroCompu && i == numeroUsuario){
                System.out.print("[**]");
                aciertos++;
                contador++;
                resultado = "ACERTADO";
            }else if(i==numeroCompu2 && i == numeroUsuario){
                System.out.print("[**]");
                aciertos++;
                contador++;
                resultado = "ACERTADO";
            }else if(i== numeroUsuario && numeroCompu != numeroUsuario){
                System.out.print("[[]]");
                contador++;
            }else if(i== numeroUsuario && numeroCompu2 != numeroUsuario){
                System.out.print("[[]]");
                contador++;
            }else{
                System.out.print("(  )");
                contador++;
            }
        
            if (contador == 4){
                System.out.println("\n");
                contador= 0;
            }
                
        }
        imprimeBorde();
        System.out.println("Turno: " + turno + "  /  Aciertos: " + aciertos);
        System.out.println(resultado);

        turno++;
    }
}