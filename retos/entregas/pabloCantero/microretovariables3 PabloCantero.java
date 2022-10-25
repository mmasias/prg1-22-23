import java.util.Scanner;
public class microretovariables3 {
    public static void main(String[] args) {
        double notainicial, notaparcial, notaevaluacioncontinua, evaluacionprofesor;
        double porcentajeparcial, porcentajeinicial, porcentajecontinua, porcentajeprofesor;
        double notafinaluneat;
        porcentajeparcial = 0.1;
        porcentajeinicial = 0.3;
        porcentajecontinua =0.5;
        porcentajeprofesor = 0.1;
        notainicial= 3;
        notaparcial= 7;
        notaevaluacioncontinua= 8;
        evaluacionprofesor= 5;
        notafinaluneat = notainicial*porcentajeparcial + porcentajeinicial*notaparcial + porcentajecontinua*notaevaluacioncontinua + evaluacionprofesor * porcentajeprofesor;
        System.out.println("Tienes un " + notafinaluneat + "de nota final en uneatlantico");

    }
}
