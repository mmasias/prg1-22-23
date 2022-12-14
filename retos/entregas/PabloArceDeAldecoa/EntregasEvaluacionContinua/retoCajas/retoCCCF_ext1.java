public class retoCCCF_ext1{
    public static void main(String[] args) {
        int minutosDia=12*60, persona=0, numeroPaquetes=0,cola=0, contadorMinA0=0, contadorPersonas=0, contadorPaquetes=0,
        paquetesCaja1=0,paquetesCaja2=0,paquetesCaja3=0,paquetesCaja4=0,paquetesCaja5=0;
        double probabilidadPersona;
        for (int i=1; i <= minutosDia; i++){
            probabilidadPersona=Math.random();
            numeroPaquetes=0;
            if (probabilidadPersona<=0.4){persona=1;}
            else{persona=0;}
            if (persona==1){cola++; contadorPersonas++;}//Se añade a alguien a la cola
            ////Cajas

            //Resta 1 paquete por minuto
            if (paquetesCaja1!=0){paquetesCaja1--;}
            if (paquetesCaja2!=0){paquetesCaja2--;}
            if (paquetesCaja3!=0){paquetesCaja3--;}
            if (paquetesCaja4!=0){paquetesCaja4--;}
            if (paquetesCaja5!=0){paquetesCaja5--;}
            //Resta 1 paquete por minuto
            
            //Revisar si estan vacias
            for (int j=1;j<=cola;j++){
                numeroPaquetes=(int)(Math.random()*11+5);//Se le asigna a un paquete al que estaba en la cola
                if (paquetesCaja1 == 0){paquetesCaja1=numeroPaquetes;cola--;contadorPaquetes+=numeroPaquetes;}
                else if (paquetesCaja2 == 0){paquetesCaja2=numeroPaquetes;cola--;contadorPaquetes+=numeroPaquetes;}
                else if (paquetesCaja3 == 0){paquetesCaja3=numeroPaquetes;cola--;contadorPaquetes+=numeroPaquetes;}
                else if (paquetesCaja4 == 0){paquetesCaja4=numeroPaquetes;cola--;contadorPaquetes+=numeroPaquetes;}
                else if (paquetesCaja5 == 0){paquetesCaja5=numeroPaquetes;cola--;contadorPaquetes+=numeroPaquetes;}
            }
            //Revisar si estan vacias

            ////Cajas
            if (cola==0){contadorMinA0++;}

            // Inicio minuto
            for (int j=0; j<=25; j++){System.out.print("- ");}System.out.println("");
            //
            System.out.println("Minuto " + i + ": Ha entrado " + persona + " persona/s");
            System.out.println("Hay "+ cola + " persona/s en la cola");
            System.out.println("Paquetes: Caja1["+paquetesCaja1+"] Caja2["+paquetesCaja2+"] Caja3["+paquetesCaja3+"] Caja4["+paquetesCaja4+"] Caja5["+paquetesCaja5+"]");
            //
            for (int j=0; j<=25; j++){System.out.print("- ");}System.out.println("\n");
            // Fin de minuto
        }
    //Datos
    System.out.println(("* ").repeat(33));
    System.out.println("*   Datos:"+(" ").repeat(54)+"*"+"\n*"+(" ").repeat(63)+"*");
    System.out.println("*   La cola ha estado vacía: "+contadorMinA0+" minutos."+(" ").repeat(23)+"*");
    System.out.println("*   Al final del día, "+cola+" persona/s se han quedado sin comprar.   *");
    System.out.println("*   "+contadorPersonas+" personas han sido atendidas."+(" ").repeat(28)+"*");
    System.out.println("*   "+contadorPaquetes+" items han sido comprados."+(" ").repeat(30)+"*"+"\n*"+(" ").repeat(63)+"*");
    System.out.println(("* ").repeat(33));
    //Datos
    }
}
