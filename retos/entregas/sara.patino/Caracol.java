import java.util.Scanner;
public class reflexionesCaracol{
    public static void main(String[] args){

        
        Scanner entrada = new Scanner(System.in); 
        
        
        String pasarDia    = "";
        String elCoche     = "[__]     O[|||]O    [__]";
        String laVictoria  = "[__]     _@)_/      [__]";
        String laTapa      = "[__]                [__]";
        String laPared     = "  []:.  :.  :.  :. :[]";
        String elAgua      = "  []~~~~~~~~~~~~~~~~[]";
        String elCaracol   = "  []:    _@)_/     :[]";
        String elFondo     = "  [][][][][][][][][][]";
        

        int profundidadPozo = 20, dia = 0, profundidadAgua = 0;
        double alturaCaracol= (int)(Math.random()*(11)), subida = 0.0, caida = 0.0, coche = 0.0, clima = 0.0;
        
        
        
        do{

            dia = dia+1;
            if(dia <= 10 && dia >= 1){

                subida = (int)(Math.random()*(4)+1);
            }
            else if(dia > 10 && dia <= 20){
                
                subida = (int)(Math.random()*(3)+1);
            }
            else if(dia > 20){
                
                subida = (int)(Math.random()*(2)+1);
            }
            
            coche = Math.random();
            if(coche <= 0.35){
                alturaCaracol = alturaCaracol-2;
            }

            clima = Math.random();
            if(clima <= 0.05){
                
                profundidadAgua = profundidadAgua + 5;
            }
            else if(clima > 0.05 && clima <= 0.15){

                profundidadAgua = profundidadAgua + 2;
            }
                
    
            
        
            caida = (int)(Math.random()*(5));
    
            alturaCaracol = alturaCaracol + caida - subida ;
            
            
            
            
            if(alturaCaracol < profundidadAgua){
                
                alturaCaracol = profundidadAgua+1;
            }
            String c = "";
            if(coche<0.35){c = "SI";}else{c = "NO";}
            String cl = "";
            if(clima<=0.05){cl = "Lluvia fuerte";}else if(clima > 0.05 && clima <= 0.15){cl = "Lluvia";}else{cl="Soleado";}
            System.out.println("dia: ["+dia+"] / Sube: ["+subida+"] / Baja: ["+caida+"] / Altura: ["+alturaCaracol+"] / Coche: [" + c + "] / Clima: ["+cl+"]");
            System.out.println(" ");
            System.out.println(" ");
            if(alturaCaracol >= 20 && coche < 0.35){
                System.out.println(laVictoria);
            }
            else if(coche < 0.35){
        
                System.out.println(elCoche);
            }
            else if(alturaCaracol < 20){
                
                System.out.println(laTapa);
            }
            else{
                
                System.out.println(laVictoria);
            }
            
        
            for (int i=0;i<=profundidadPozo;i=i+1){
                if (profundidadPozo-i==alturaCaracol && alturaCaracol < 20) {
                    System.out.println(elCaracol + " -->" + i);
                } else {
                    if (profundidadPozo-i<profundidadAgua) {
                        System.out.println(elAgua + " -->" + i);
                    } else {
                        System.out.println(laPared + " -->" + i);   
                    }
                }
            }
            System.out.println(elFondo);
            System.out.println(" ");
            System.out.println(" ");
            
            pasarDia = entrada.nextLine();
            
            
        }while(alturaCaracol < 20 && dia < 50);
        if(dia >= 50 && alturaCaracol < 20){
            System.out.println("RIP nuestro amigo el caracol se murio :( ");
        }
        else if(alturaCaracol >= 20){
            System.out.println("EL CARACOL SALIO DEL POZO DESPUES DE "+dia+" DIAS");
            
        }
        
        

    }

}
