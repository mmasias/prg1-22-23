public class CentroComercial{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);	

		int unContadorDeStop, unContadorDeParadas;
		double probabilidadLlegada;
		String inputUsuario;
		unContadorDeStop=0;
		unContadorDeParadas=0;
		
		int laCola;
		laCola=0;
		
		int laCaja1,laCaja2, laCaja3, laCaja4;
		laCaja1=0; 
		laCaja2=0;
		laCaja3=0;
		laCaja4=0;		

		for (int minutos=1;minutos<=720;minutos=minutos+1){
			
			System.out.print("Minuto ["+minutos+"] ");
			
			probabilidadLlegada=Math.random();
			if (probabilidadLlegada<=0.4) {
				System.out.print("Llega persona / ");
				laCola=laCola+1;
			}

			if(laCaja1>0){laCaja1=laCaja1-1;}
			if(laCaja2>0){laCaja2=laCaja2-1;}
			if(laCaja3>0){laCaja3=laCaja3-1;}
			if(laCaja4>0){laCaja4=laCaja4-1;}
			

			if (laCola>0 && laCaja1==0) {
				laCola=laCola-1;
				laCaja1=(int)((Math.random()*10)+5);
				System.out.print("Persona a Caja1 ["+laCaja1+"] / ");
			} 
			
			if (laCola>0 && laCaja2==0) {
				laCola=laCola-1;
				laCaja2=(int)((Math.random()*10)+5);
				System.out.print("Persona a Caja2 ["+laCaja2+"] / ");
			}

			if (laCola>0 && laCaja3==0) {
				laCola=laCola-1;
				laCaja3=(int)((Math.random()*10)+5);
				System.out.print("Persona a Caja3 ["+laCaja3+"] / ");
			}

			if (laCola>0 && laCaja4==0) {
				laCola=laCola-1;
				laCaja4=(int)((Math.random()*10)+5);
				System.out.print("Persona a Caja4 ["+laCaja4+"] / ");
			}

			System.out.println("En cola ["+laCola+"] / ");



			System.out.println("C1["+laCaja1+"] / C2["+laCaja2+"] / C3["+laCaja3+"] / C4["+laCaja4+"]");
			System.out.print("Caja 1: ");
			for(int item=1;item<=laCaja1;item=item+1){System.out.print("[]");}
			System.out.println();

			System.out.print("Caja 2: ");
			for(int item=1;item<=laCaja2;item=item+1){System.out.print("[]");}
			System.out.println();

			System.out.print("Caja 3: ");
			for(int item=1;item<=laCaja3;item=item+1){System.out.print("[]");}
			System.out.println();

			System.out.print("Caja 4: ");
			for(int item=1;item<=laCaja4;item=item+1){System.out.print("[]");}
			System.out.println();

			
			System.out.println("------------------------------------------------------------");

			inputUsuario=entrada.nextLine();
            	unContadorDeStop=unContadorDeStop+1;
			if(unContadorDeStop>=20){
				unContadorDeStop=0;
				unContadorDeParadas=unContadorDeParadas+1;
				System.out.println("> ["+unContadorDeParadas+"]' parada... Pulse enter para continuar.");
				inputUsuario=entrada.nextLine();
			}	
		}
	}
}
