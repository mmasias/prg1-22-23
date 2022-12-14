import java.util.Scanner;

public class WhacAMole{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String casillaMol3     = " ('') ";
        String casillaNada     = " (  ) ";
        String casillaWhacMole = " [**] ";
        String casillaWhacNada = " [[]] "; 
        int Aciertos = 0;
        int PosicionMoleAnterior = 0;
        int PosicionMole2Anterior = 0;
        for(int Turno = 1 ; Turno < 16 ; Turno++){
        int PosicionMole = (int) (Math.random() * (16-1));
        int PosicionMole2 = (int) (Math.random() * (16-1));
        while(PosicionMole == PosicionMole2){
            PosicionMole = (int) (Math.random() * (16-1)+1);
            PosicionMole2 = (int) (Math.random() * (16-1)+1);
        }
        
        while(PosicionMoleAnterior == PosicionMole){
            PosicionMole = (int) (Math.random() * (16-1)+1);
        }
        while(PosicionMole2Anterior == PosicionMole2){
            PosicionMole2 = (int) (Math.random() * (16-1)+1);
        }
        System.out.println("¿En que casilla golpearás? (1 a 16) ");
        int PosicionWhac = entrada.nextInt();
        System.out.println("Golpe en [" + PosicionWhac + "]  /  Topo en [" + PosicionMole + "]  /  2º Topo en [" + PosicionMole2 + "]");
        System.out.println("+----------------------------+");
        for(int fila = 1 ; fila <= 4 ; fila++){
            System.out.print("|  ");
            for(int casilla = 1; casilla <= 4 ; casilla++ ){
            if((((fila-1)* 4) + casilla == PosicionMole || ((fila-1)* 4) + casilla == PosicionMole2 ) && ((fila-1)* 4) + casilla == PosicionWhac){
                System.out.print(casillaWhacMole);
            }
            else{
                if(((fila-1) * 4) + casilla == PosicionMole ||((fila-1) * 4) + casilla == PosicionMole2 ){
                    System.out.print(casillaMol3);
                }
                else{
                    if(((fila-1) * 4) + casilla == PosicionWhac ){
                        System.out.print(casillaWhacNada);
                    }
                    else{
                        System.out.print(casillaNada);
                    }
                }
            }
            }
            System.out.println("  |");
        
            PosicionMoleAnterior = PosicionMole;
            PosicionMole2Anterior = PosicionMole2;
        }
        System.out.println("+----------------------------+");
        System.out.println("Turno:["+Turno+"]  /  Aciertos ["+Aciertos+"]");
        if(PosicionWhac == PosicionMole || PosicionWhac == PosicionMole2 ){
            System.out.println("[ACIERTO]");
            Aciertos = Aciertos + 1;
        }
        else{
           System.out.println("[FALLO]");     
        }
        System.out.println("==============================");
    }
    System.out.println("Has acertado " + Aciertos + " veces");
        entrada.close();
        
    }
}