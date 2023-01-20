import java.util.Random;
import java.util.Scanner;

public class PacMan {

    private static int puntos = 0;
    private static int movimientos = 0;
    private static int duracionFruta = 0;
    private static int movimientosRestantesParaFruta = 80;
    private static int[][] NPCs = {
            { 11, 14 },
            { 13, 14 },
            { 14, 14 },
            { 16, 14 }
    };

    public static void main(String[] args) {

        int[][] elMapa = {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1 },
                { 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 },
                { 1, 4, 1, 0, 0, 1, 2, 1, 0, 0, 0, 1, 2, 1, 1, 2, 1, 0, 0, 0, 1, 2, 1, 0, 0, 1, 4, 1 },
                { 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 },
                { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1 },
                { 1, 2, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2, 1 },
                { 1, 2, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2, 1 },
                { 1, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 1 },
                { 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 2, 1, 1, 0, 1, 1, 1, 7, 7, 1, 1, 1, 0, 1, 1, 2, 1, 0, 0, 0, 0, 0 },
                { 1, 1, 1, 1, 1, 1, 2, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 2, 1, 1, 1, 1, 1, 1 },
                { 1, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 2, 2, 2, 2, 2, 2, 2, 2, 1 },
                { 1, 1, 1, 1, 1, 1, 2, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 2, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 1, 2, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 2, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 0, 0, 0, 0, 0 },
                { 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1 },
                { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1 },
                { 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 },
                { 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 },
                { 1, 4, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 0, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2, 4, 1 },
                { 1, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1 },
                { 1, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1 },
                { 1, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 1 },
                { 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1 },
                { 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1 },
                { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
        };

        int[] elPersonaje = { 13, 23 };

        do {

            imprimeMundo(elMapa, elPersonaje, NPCs);

        } while (procesaMovimiento(elMapa, elPersonaje, NPCs));

    }

    private static boolean hayNPC(int[][] losNPCs, int x, int y) {

        for (int unNPC = 0; unNPC < losNPCs.length; unNPC++) {
            if (losNPCs[unNPC][0] == x && losNPCs[unNPC][1] == y) {
                return true;
            }
        }
        return false;
    }

    private static void imprimeMundo(int[][] elMapa, int[] elPersonaje, int[][] losNPCs) {

        for (int y = 0; y < elMapa.length; y++) {
            for (int x = 0; x < elMapa[y].length; x++) {
                if (x == elPersonaje[0] && y == elPersonaje[1]) {
                    imprimePersonaje();
                } else if (hayNPC(losNPCs, x, y)) {
                    imprimeNPC();
                } else {
                    imprimeTerreno(elMapa[y][x]);
                }
            }
            System.out.println();
        }
        imprimeStatus(elPersonaje);
    }

    static void imprimePersonaje() {

        System.out.print(">0<");
    }

    static void imprimeNPC() {

        System.out.print("^V^");
    }

    private static void imprimeTerreno(int elementosDelMapa) {

        String[] terreno = { "   ", "[#]", " o ", "~ ~", "<0>", "", "oOo", " - " };
        System.out.print(terreno[elementosDelMapa]);
    }

    private static void imprimeStatus(int[] elPersonaje) {

        System.out.println("El personaje está en X:[" + elPersonaje[0] + "] Y:[" + elPersonaje[1] + "] | Tienes [ "
                + puntos + " ] puntos | Haz hecho [ " + movimientos + " ] movimientos");
        if (duracionFruta > 0) {
            System.out.println("Te quedan [ " + duracionFruta + " ] para que desaparezca la fruta");
        } else {
            System.out.println("Te faltan [ " + movimientosRestantesParaFruta + " ] para que aparezca la fruta");
        }

        System.out.println("Para moverte usa las teclas (W/A/S/D)");

    }

    private static boolean procesaMovimiento(int[][] elMapa, int[] elPersonaje, int[][] losNPCs) {

        Scanner entrada = new Scanner(System.in);
        String inputUsuario;
        char laDireccion = ' ';

        inputUsuario = entrada.nextLine();

        switch (inputUsuario) {
            case "w", "W":
                laDireccion = 'N';
                break;
            case "a", "A":
                laDireccion = 'O';
                break;
            case "s", "S":
                laDireccion = 'S';
                break;
            case "d", "D":
                laDireccion = 'E';
                break;
            case "f":
                return false;
            default:
                System.out.println("No has introducido una tecla válida");
                break;
        }

        boolean continuar = mueve(elPersonaje, elMapa, laDireccion, false);
        mueveNPCs(elMapa, losNPCs);

        if (duracionFruta > 0) {
            elMapa[17][13] = 6;
        } else {
            elMapa[17][13] = 0;
        }
        return continuar;
    }

    private static boolean mueve(int[] unPersonaje, int[][] unMapa, char unaDireccion, boolean esNPC) {
        int elPersonajeX, elPersonajeY;
        elPersonajeX = unPersonaje[0];
        elPersonajeY = unPersonaje[1];

        boolean seMueve = false;

        if (unaDireccion == 'O') {
            if (elPersonajeX == 0) {
                elPersonajeX = unMapa[0].length - 1;
                seMueve = true;
            } else if (unMapa[elPersonajeY][elPersonajeX - 1] % 2 == 0) {
                elPersonajeX = elPersonajeX - 1;
                seMueve = true;
            }
        } else if (unaDireccion == 'N') {
            if (elPersonajeY == 0) {
                elPersonajeY = unMapa.length - 1;
                seMueve = true;
            } else if (unMapa[elPersonajeY - 1][elPersonajeX] % 2 == 0) {
                elPersonajeY = elPersonajeY - 1;
                seMueve = true;
            }
        } else if (unaDireccion == 'E') {
            if (elPersonajeX == unMapa[0].length - 1) {
                elPersonajeX = 0;
                seMueve = true;
            } else if (unMapa[elPersonajeY][elPersonajeX + 1] % 2 == 0) {
                elPersonajeX = elPersonajeX + 1;
                seMueve = true;
            }
        } else if (unaDireccion == 'S') {
            if (elPersonajeY == unMapa.length - 1) {
                elPersonajeY = 0;
                seMueve = true;
            } else if (unMapa[elPersonajeY + 1][elPersonajeX] % 2 == 0) {
                elPersonajeY = elPersonajeY + 1;
                seMueve = true;
            }
        }

        unPersonaje[0] = elPersonajeX;
        unPersonaje[1] = elPersonajeY;

        if (!esNPC) {
            registraMovimiento(seMueve);
            return registraPuntos(unPersonaje, unMapa);
        } else {
            return true;
        }
    }

    private static void mueveNPCs(int[][] elMapa, int[][] losNPCs) {

        char[] laDireccion = { 'N', 'S', 'E', 'O' };
        char unaDireccion = ' ';

        for (int unNPC = 0; unNPC < losNPCs.length; unNPC++) {
            Random random = new Random();
            unaDireccion = laDireccion[random.nextInt(3)];
            mueve(losNPCs[unNPC], elMapa, unaDireccion, true);
        }
    }

    private static boolean registraPuntos(int[] personaje, int[][] unMapa) {
        if (unMapa[personaje[1]][personaje[0]] == 2) {
            unMapa[personaje[1]][personaje[0]] = 0;
            puntos++;
        } else if (unMapa[personaje[1]][personaje[0]] == 4) {
            unMapa[personaje[1]][personaje[0]] = 0;
            puntos += 5;
        } else if (unMapa[personaje[1]][personaje[0]] == 6) {
            unMapa[personaje[1]][personaje[0]] = 0;
            duracionFruta = 0;
            movimientosRestantesParaFruta = 80;
            puntos += 10;
        }

        boolean hayPastillas = false;
        for (int y = 0; y < unMapa.length; y++) {
            for (int x = 0; x < unMapa[y].length; x++) {
                if (unMapa[y][x] == 2 || unMapa[y][x] == 4) {
                    hayPastillas = true;
                }
            }
        }
        if (!hayPastillas) {
            imprimeMundo(unMapa, personaje, NPCs);
            System.out.println(" Haz ganado el juego con [ " + puntos + " ] puntos | Haciendo [ " + movimientos
                    + " ] movimientos");
        }
        return hayPastillas; 
    }

    private static void registraMovimiento(boolean seMueve) {
        if (seMueve) {
            movimientos++;
            checkFruta();
        }
    }

    private static void checkFruta() {
        if (duracionFruta > 0) {
            duracionFruta--;
            if (duracionFruta == 0) {
                movimientosRestantesParaFruta = 50;
            }
        } else {
            movimientosRestantesParaFruta--;
            if (movimientosRestantesParaFruta < 1) {
                duracionFruta = 20;
            }
        }
    }

}