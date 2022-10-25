public class MicroRetosVariable{
    

    public static void main(String[]args){

        // promedio de 2 numeros
        double y, z,  promedio; 

        y = 7.5;
        z = 6.5;
        promedio = (y+z)/2;
        System.out.println("La media de estos dos numeros es " + promedio);
       
        // area de un rectangulo
        double h, l, area;

        h = 3.2;
        l = 8.5;
        area= (h*l);
        System.out.println("El area de este rectangulo es " + area);

        //area de un circulo
        double pi, r, areacirculo;
       
        pi = 3.141592;
        r = 2;
        areacirculo=(pi*r*r);
        
        System.out.println("El area de este circulo es " + areacirculo);

        // nota final 
        double parcial, global, evaluacioncontinua, evaluacionprofesor, notafinal;
        
        parcial = 7.5;
        global = 8.5;
        evaluacioncontinua = 6.3; 
        evaluacionprofesor = 7.4; 
        notafinal= (parcial+global+ evaluacioncontinua+evaluacionprofesor);
        System.out.println("La nota final del alumno es " + notafinal);






    }

  
    






}