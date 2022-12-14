import java.util.Scanner;
public class whackAMole {
    	public static void main(String[] args){
		Scanner entrada=new Scanner(System.in);
		int aparicionMonigote1=0;
		int darGolpeUsuario=0;
		int contadorAciertos=0;
		boolean casillasVacias;
		for (int contadorDeTurnos=1;contadorDeTurnos<=15;contadorDeTurnos=contadorDeTurnos+1) {
		aparicionMonigote1=(int)(Math.random()*16+1);
		casillasVacias=true;
		System.out.println("Turno ["+contadorDeTurnos+"]");
		System.out.println("Elija que agujero golpear (entre 1 y 16) ");
		darGolpeUsuario=entrada.nextInt();
		System.out.println("Golpe en ["+darGolpeUsuario+"] / Monigote en ["+aparicionMonigote1+"]");
		System.out.print("=====================================");
		System.out.println(" ");
		for (int i=0;i<1;i=i+1) {
			System.out.print(" ");
			for (int j=0;j<1;j=j+1) {if (darGolpeUsuario!=1 && aparicionMonigote1!=1 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==1 && aparicionMonigote1==1) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==1) {System.out.print("([ ])");}
		else if (aparicionMonigote1==1) {System.out.print("(`´)");} 
		}
		}
			
		for (int i=1;i<2;i=i+1) {
			System.out.print(" ");
			for (int j=1;j<2;j=j+1) {if (darGolpeUsuario!=2 && aparicionMonigote1!=2 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==2 && aparicionMonigote1==2) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==2) {System.out.print("([ ])");}
		else if (aparicionMonigote1==2) {System.out.print("(` ´)");} 
		}}
		for (int i=2;i<3;i=i+1) {
			System.out.print(" ");
			for (int j=2;j<3;j=j+1) {if (darGolpeUsuario!=3 && aparicionMonigote1!=3 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==3 && aparicionMonigote1==3) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==3) {System.out.print("([ ])");}
		else if (aparicionMonigote1==3) {System.out.print("(` ´)");} 
		}}
		for (int i=3;i<4;i=i+1) {
			System.out.print(" ");
			for (int j=3;j<4;j=j+1) {if (darGolpeUsuario!=4 && aparicionMonigote1!=4 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==4 && aparicionMonigote1==4) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==4) {System.out.print("([ ])");}
		else if (aparicionMonigote1==4) {System.out.print("(` ´)");} 
		}}
		System.out.println(" ");
		for (int i=0;i<1;i=i+1) {
			System.out.print(" ");
			for (int j=0;j<1;j=j+1) {if (darGolpeUsuario!=5 && aparicionMonigote1!=5 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==5 && aparicionMonigote1==5) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==5) {System.out.print("([ ])");}
		else if (aparicionMonigote1==5) {System.out.print("(` ´)");} 
		}}
		for (int i=1;i<2;i=i+1) {
			System.out.print(" ");
			for (int j=1;j<2;j=j+1) {if (darGolpeUsuario!=6 && aparicionMonigote1!=6 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==6 && aparicionMonigote1==6) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==6) {System.out.print("([ ])");}
		else if (aparicionMonigote1==6) {System.out.print("(` ´)");} 
		}}
		for (int i=2;i<3;i=i+1) {
			System.out.print(" ");
			for (int j=2;j<3;j=j+1) {if (darGolpeUsuario!=7 && aparicionMonigote1!=7 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==7 && aparicionMonigote1==7) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==7) {System.out.print("([ ])");}
		else if (aparicionMonigote1==7) {System.out.print("(` ´)");} 
		}}
		for (int i=3;i<4;i=i+1) {
			System.out.print(" ");
			for (int j=3;j<4;j=j+1) {if (darGolpeUsuario!=8 && aparicionMonigote1!=8 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==8 && aparicionMonigote1==8) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==8) {System.out.print("([ ])");}
		else if (aparicionMonigote1==8) {System.out.print("(` ´)");} 
		}}
		System.out.println(" ");
		for (int i=0;i<1;i=i+1) {
			System.out.print(" ");
			for (int j=0;j<1;j=j+1) {if (darGolpeUsuario!=9 && aparicionMonigote1!=9 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==9 && aparicionMonigote1==9) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==9) {System.out.print("([ ])");}
		else if (aparicionMonigote1==9) {System.out.print("(` ´)");} 
		}}
		for (int i=1;i<2;i=i+1) {
			System.out.print(" ");
			for (int j=1;j<2;j=j+1) {if (darGolpeUsuario!=10 && aparicionMonigote1!=10 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==10 && aparicionMonigote1==10) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==10) {System.out.print("([ ])");}
		else if (aparicionMonigote1==10) {System.out.print("(` ´)");} 
		}}
		for (int i=2;i<3;i=i+1) {
			System.out.print(" ");
			for (int j=2;j<3;j=j+1) {if (darGolpeUsuario!=11 && aparicionMonigote1!=11 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==11 && aparicionMonigote1==11) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==11) {System.out.print("([ ])");}
		else if (aparicionMonigote1==11) {System.out.print("(` ´)");} 
		}}
		for (int i=3;i<4;i=i+1) {
			System.out.print(" ");
			for (int j=3;j<4;j=j+1) {if (darGolpeUsuario!=12 && aparicionMonigote1!=12 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==12 && aparicionMonigote1==12) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==12) {System.out.print("([ ])");}
		else if (aparicionMonigote1==12) {System.out.print("(` ´)");} 
		}}
		System.out.println(" ");
		for (int i=0;i<1;i=i+1) {
			System.out.print(" ");
			for (int j=0;j<1;j=j+1) {if (darGolpeUsuario!=13 && aparicionMonigote1!=13 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==13 && aparicionMonigote1==13) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==13) {System.out.print("([ ])");}
		else if (aparicionMonigote1==13) {System.out.print("(` ´)");} 
		}}
		for (int i=1;i<2;i=i+1) {
			System.out.print(" ");
			for (int j=1;j<2;j=j+1) {if (darGolpeUsuario!=14 && aparicionMonigote1!=14 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==14 && aparicionMonigote1==14) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==14) {System.out.print("([ ])");}
		else if (aparicionMonigote1==14) {System.out.print("(` ´)");} 
		}}
		for (int i=2;i<3;i=i+1) {
			System.out.print(" ");
			for (int j=2;j<3;j=j+1) {if (darGolpeUsuario!=15 && aparicionMonigote1!=15 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==15 && aparicionMonigote1==15) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==15) {System.out.print("([ ])");}
		else if (aparicionMonigote1==15) {System.out.print("(` ´)");} 
		}}
		for (int i=3;i<4;i=i+1) {
			System.out.print(" ");
			for (int j=3;j<4;j=j+1) {if (darGolpeUsuario!=16 && aparicionMonigote1!=16 && casillasVacias==true) {System.out.print("(   )");}
		else if (darGolpeUsuario==16 && aparicionMonigote1==16) {System.out.print("[* *]");}
		else if (darGolpeUsuario ==16) {System.out.print("([ ])");}
		else if (aparicionMonigote1==16) {System.out.print("(` ´)");} 
		}}
		if 	(darGolpeUsuario==aparicionMonigote1) {contadorAciertos=contadorAciertos+1;}
		
		System.out.println(" ");
		System.out.println("=====================================");
		
		System.out.println("Aciertos ["+contadorAciertos+"]");
		
		
		}
		
		
		}
    
}
