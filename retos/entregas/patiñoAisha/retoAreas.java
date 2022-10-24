public class retoAreas {
    public static void main(String[] args){

        int base = 5;
        int altura = 6;
        int radio = 3;
        double pi = 3.141592;
        double areaCuadrado= base*base;
        double areaRectangulo = base*altura;
        double areaCirculo = pi*radio*radio;
        
        System.out.println("el area de un cuadrado con la base de " + base + "  es: "+areaCuadrado);
        System.out.println("el area de un rectangulo con la base de " + base + " y altura de "+altura+" es: "+areaRectangulo);
        System.out.println("el area de un circulo con el radio de " + radio+" es: "+areaCirculo);
    }
}
