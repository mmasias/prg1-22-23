public class Caracol {
    public static void main(String[] args) {
        double saliente =Math.random()*10+10, recorridoDia=0, recorridoNoche=0,posicionCaracol = -saliente; 
        int dias=0, suelo=20, aguaEnPozo=-20;
        boolean fin = false, mensaje10=true, mensaje20=true;
        System.out.println("El caracol ha caido a "+(posicionCaracol)+" m de profundidad!");
        while (!fin){
            int retrocesoCoche=0;
            dias++;System.out.println(("- ").repeat(20)+"\n**Día "+dias+":** ");

            if (dias>=10 && dias<20){
                recorridoDia=Math.random()*2+1;
                if (mensaje10==true){System.out.println("El caracol esta cansado"); mensaje10=false;}
            }
            else if(dias>=20 && dias<50){
                recorridoDia=Math.random()+1;
                if (mensaje20==true){System.out.println("El caracol esta muy cansado"); mensaje20=false;}
            }
            else if(dias>=50){System.out.println("El caracol murió de inanición...");break;}
            else{recorridoDia=Math.random()*3+1;}
            recorridoNoche=Math.random()*2;
            posicionCaracol+=(recorridoDia-recorridoNoche);

            double probabilidadCoche = Math.random();
            if (probabilidadCoche<=0.35){System.out.print("Pasa un coche! ");retrocesoCoche=2;}
            posicionCaracol-=retrocesoCoche;

            double probabilidadLluvia = Math.random();
            if (probabilidadLluvia<=0.05){System.out.println("Hay una lluvia fuerte!"); aguaEnPozo+=5;}
            else if (probabilidadLluvia>0.05 && probabilidadLluvia<=0.15){System.out.println("Esta lloviendo!"); aguaEnPozo+=2;}
            else{System.out.println("Hace un buen clima");}
            
            if (posicionCaracol<=aguaEnPozo){System.out.println("El caracol se mueve con la lluvia! ");posicionCaracol=aguaEnPozo+1;}

            System.out.println("El caracol ascendió "+(double)Math.round(recorridoDia*100)/100+" m, resbaló "+(double)Math.round((recorridoNoche+retrocesoCoche)*100)/100+" m y al final del día está a "+(double)Math.round(posicionCaracol*100)/100+ " m de profundidad.\n");
            for (int i=0;i<=suelo+1;i++){
                if (i==0){
                    if (posicionCaracol>=0){System.out.println((" ").repeat(19)+"________ _@)_/’ ______");}
                    if (retrocesoCoche==2){System.out.println("[__]   O-=-O   [__]");}
                    else if (retrocesoCoche==0){System.out.println("[__]"+(" ").repeat(11)+"[__]");}
                }
                if(i==(int)(-posicionCaracol) && posicionCaracol<=0){System.out.println("[]    _@)_/’    [] __-"+i);}
                else if(i>=-aguaEnPozo && i!=21){System.out.println("[]~~~~~~~~~~~~~~[] __-"+i);}
                else if(i==suelo+1){System.out.println("[][][][][][][][][]");}
                else {System.out.println("[]:. :. :. :. :.[] __-"+i);}
            }
            if (posicionCaracol>=0){System.out.println("\nEl caracol ha salido en el dia "+dias+"!!"); fin=true;}
            System.out.println(("- ").repeat(20));
        }
    }
}
