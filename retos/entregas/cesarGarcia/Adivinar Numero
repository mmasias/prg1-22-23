import java.util.*;

class AdivinaNumero {
	
	//Primero pongo los atributos miembros de la clase ya que podra acceder a ellos desde todas las funciones de la clase
	Scanner sc = new Scanner ( System.in );
	int[] respuestas_tarjetas = new int[7]; //creo un array de 7 elementos para almacenar las 7 respuestas a las 7 preguntas de si est� en la tarjeta
	String numero_pregunta[] = {"1ra", "2da", "3ra", "4ta", "5ta", "6ta", "7ma"};	
	int cont=0;
  public void escribe_si_esta_en_la_tarjeta(int contador) {
  	String numero_pregunta[] = {"1ra", "2da", "3ra", "4ta", "5ta", "6ta", "7ma"};
    System.out.println ( "�Est\u00e1 en la "+numero_pregunta[contador]+" tarjeta?\n" );

  }
  
  // Metodo para invertir una cadena en Java usando `StringBuilder`
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
  
  public AdivinaNumero() {
  	System.out.println ( "Utilice 1 para SI, 0 para NO\n" );
    System.out.println ( "Piense un numero del 1 al 99\n" );
    
    //Scanner in = new Scanner ( System.in ); //en la variable in se guarda lo que haya escrito el usuario que esta ejecutando el programa por pantalla 
    
    
    //Aqui va entrar 7 veces y por cada vez que entre va hacer todo lo que pongo dentro de este do while osea dentro de las llaves de apertura y cierre: { }
    do{
    	escribe_si_esta_en_la_tarjeta(cont);//le paso a la funcion como parametro la variable i que por cada una de las 7 iteraciones va teniendo el valor: 0, 1, 2, 3, 4, 5 y 6
    	while (!sc.hasNextInt()) sc.next(); 
		respuestas_tarjetas[cont] = sc.nextInt(); //por cada una de las 7 iteraciones osea por cada respuesta de las 7 preguntas recojo el valor que ha tecleado el usuario como respuesta a cada pregunta y lo guardo en el array respuestas_tarjetas
    	cont++;
    }while(cont<7);
    
    
    //Muestro las respuestas que han introducido a las 7 preguntas
    for (int i=0; i<respuestas_tarjetas.length; i++) {
    	String numero_pregunta[] = {"1ra", "2da", "3ra", "4ta", "5ta", "6ta", "7ma"};
    	System.out.println ("Respuesta a la "+numero_pregunta[i]+": "+respuestas_tarjetas[i]);
    }
    
	int suma=0;//Creo la variable que va a contener la suma de los valores que el usuario ha ido respondiendo
	if(respuestas_tarjetas[0]==1){//si respondio a la primera pregunta un 1 le sumo 1 a la variable suma
		suma=suma+1;
    }
    if(respuestas_tarjetas[1]==1){//si respondio a la 2 pregunta un 1 le sumo 10 a la variable suma
		suma=suma+10;
    }
    if(respuestas_tarjetas[2]==1){//si respondio a la 3 pregunta un 1 le sumo 100 a la variable suma
		suma=suma+100;
    }
    if(respuestas_tarjetas[3]==1){//si respondio a la 4 pregunta un 1 le sumo 1000 a la variable suma
		suma=suma+1000;
    }
    if(respuestas_tarjetas[4]==1){//si respondio a la 5 pregunta un 1 le sumo 10000 a la variable suma
		suma=suma+10000;
    }
    if(respuestas_tarjetas[5]==1){//si respondio a la 6 pregunta un 1 le sumo 100000 a la variable suma
		suma=suma+100000;
    }
    if(respuestas_tarjetas[6]==1){//si respondio a la 7 pregunta un 1 le sumo 1000000 a la variable suma
		suma=suma+1000000;
    }	
	
	String binaryString=Integer.toString(suma); //Convierto de int a String 
	System.out.println ("El n\u00FAmero  pensado en binario "+reverse(binaryString).toString()); //le doy la vuelta al numero y lo muestro en String pero en binario	
	int sumaendecimal=Integer.parseInt(reverse(binaryString).toString(),2); //primero le doy la vuelta al numero y luego con el parseInt pasandole un 2 de segundo parametro lo Convierto de binario a decimal
  
	System.out.println ("El n\u00FAmero  pensado en decimal es "+sumaendecimal);

  }
  
  public static void main ( String[] args ) {
    new AdivinaNumero(); //Esta linea llama al constructor de la clase Adivina para que se haga lo que hay dentro del constructor. El constructor de una clase es una funcion que tiene el mismo nombre que la clase y se ejecuta siempre que haces un new de la clase.
  }
}
