import java.util.Scanner;
class WhacAMole {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        final int NUMERO_TURNOS = 15;
        final String MONIGOTE = "('v')";
        final String CASILLA = "(   )";
        String mazo;
        int puntos=0;

        for (int turno=0; turno<NUMERO_TURNOS; turno++){
            
            int numeroUsuario, numeroMonigote;
            numeroMonigote = (int)(Math.random()*16+1);
            System.out.println("Donde da el golpe?");
            numeroUsuario=entrada.nextInt();

            mazo = "[---]";
            if (numeroMonigote==numeroUsuario) {
                mazo = "[*~*]";
                puntos++;
            }

            for(int posicion=1;posicion<=16;posicion++){
                if(posicion==numeroUsuario) {
                    System.out.print (mazo);
                } else if(posicion==numeroMonigote) {
                    System.out.print (MONIGOTE);
                } else {
                    System.out.print (CASILLA);
                }
                if (posicion%4==0) {
                    System.out.println();
                }
            }
        }
        System.out.println("Acerto " + puntos + " veces");
    }
}
