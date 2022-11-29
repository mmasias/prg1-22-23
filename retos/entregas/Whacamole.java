import java.util.Scanner;
public class Whacamole {
    public static void main(String[] args) {
        boolean continueJuego= true;
        int numeroElegido;
        int intentos = 0;
        int numeroAleatorio;
        int aciertos = 0;
        int fallos =0;

        System.out.println("+-------------------------+");
        System.out.println("| (  )  (  )  (  )  (  )  |");
        System.out.println("| (  )  (  )  (  )  (  )  |");
        System.out.println("| (  )  (  )  (  )  (  )  |");
        System.out.println("| (  )  (  )  (  )  (  )  |");
        System.out.println("+-------------------------+");
        System.out.println("");

        while (continueJuego== true){
            intentos= intentos + 1;
            numeroAleatorio= (int)(Math.random()*16) + 1;
            Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el agujero al que quieras dar ");
        numeroElegido = entrada.nextInt();

        System.out.println("Golpe en [ " + numeroElegido + "] " + "/ " + "Monigote en [ "  + numeroAleatorio + "]");
        System.out.println("+-------------------------+");
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==1){
                System.out.print("[**]");
            } else if (numeroAleatorio==1){
                System.out.print("(``)");
            } else if (numeroElegido ==1){
                System.out.print("[[]]");
            } else if (intentos > -1){
                System.out.print("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==2){
                System.out.print("[**]");
            } else if (numeroAleatorio==2){
                System.out.print("(``)");
            } else if (numeroElegido ==2){
                System.out.print("[[]]");
            } else if (intentos > -1){
                System.out.print("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==3){
                System.out.print("[**]");
            } else if (numeroAleatorio==3){
                System.out.print("(``)");
            } else if (numeroElegido ==3){
                System.out.print("[[]]");
            } else if (intentos > -1){
                System.out.print("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==4){
                System.out.println("[**]");
            } else if (numeroAleatorio==4){
                System.out.println("(``)");
            } else if (numeroElegido ==4){
                System.out.println("[[]]");
            } else if (intentos > -1){
                System.out.println("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==5){
                System.out.print("[**]");
            } else if (numeroAleatorio==5){
                System.out.print("(``)");
            } else if (numeroElegido ==5){
                System.out.print("[[]]");
            } else if (intentos > -1){
                System.out.print("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==6){
                System.out.print("[**]");
            } else if (numeroAleatorio==6){
                System.out.print("(``)");
            } else if (numeroElegido ==6){
                System.out.print("[[]]");
            } else if (intentos > -1){
                System.out.print("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==7){
                System.out.print("[**]");
            } else if (numeroAleatorio==7){
                System.out.print("(``)");
            } else if (numeroElegido ==7){
                System.out.print("[[]]");
            } else if (intentos > -1){
                System.out.print("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==8){
                System.out.println("[**]");
            } else if (numeroAleatorio==8){
                System.out.println("(``)");
            } else if (numeroElegido ==8){
                System.out.println("[[]]");
            } else if (intentos > -1){
                System.out.println("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==9){
                System.out.print("[**]");
            } else if (numeroAleatorio==9){
                System.out.print("(``)");
            } else if (numeroElegido ==9){
                System.out.print("[[]]");
            } else if (intentos > -1){
                System.out.print("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==10){
                System.out.print("[**]");
            } else if (numeroAleatorio==10){
                System.out.print("(``)");
            } else if (numeroElegido ==10){
                System.out.print("[[]]");
            } else if (intentos > -1){
                System.out.print("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==11){
                System.out.print("[**]");
            } else if (numeroAleatorio==11){
                System.out.print("(``)");
            } else if (numeroElegido ==11){
                System.out.print("[[]]");
            } else if (intentos > -1){
                System.out.print("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==12){
                System.out.println("[**]");
            } else if (numeroAleatorio==12){
                System.out.println("(``)");
            } else if (numeroElegido ==12){
                System.out.println("[[]]");
            } else if (intentos > -1){
                System.out.println("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==13){
                System.out.print("[**]");
            } else if (numeroAleatorio==13){
                System.out.print("(``)");
            } else if (numeroElegido ==13){
                System.out.print("[[]]");
            } else if (intentos > -1){
                System.out.print("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==14){
                System.out.print("[**]");
            } else if (numeroAleatorio==14){
                System.out.print("(``)");
            } else if (numeroElegido ==14){
                System.out.print("[[]]");
            } else if (intentos > -1){
                System.out.print("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==15){
                System.out.print("[**]");
            } else if (numeroAleatorio==15){
                System.out.print("(``)");
            } else if (numeroElegido ==15){
                System.out.print("[[]]");
            } else if (intentos > -1){
                System.out.print("(  )");
            }
            }
            for (int i=0; i<1; i= i+1){
            if (numeroAleatorio== numeroElegido && numeroAleatorio==16){
                System.out.println("[**]");
            } else if (numeroAleatorio==16){
                System.out.println("(``)");
            } else if (numeroElegido ==16){
                System.out.println("[[]]");
            } else if (intentos > -1){
                System.out.println("(  )");
            }
            }
            if (numeroAleatorio== numeroElegido){
                aciertos = aciertos + 1;
            } else {
                fallos = fallos + 1;
            }
            System.out.println("Turno: [ " + intentos + "] / Aciertos: [ " + aciertos + " ]");
            if (numeroAleatorio== numeroElegido){
                System.out.println("[ACIERTO]");
            } else {
                System.out.println("[FALSO]");
            }
            System.out.println("========================");

            if (intentos>15){
                continueJuego= false;
            }

        }
        System.out.println("Se acabaron los turnos.");
    }
}
