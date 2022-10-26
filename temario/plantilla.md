# Plantillas de código

## Plantilla base

```
public class NombreClase {
    public static void main(String[] args){
        
        // El código aquí

    }
}
```

## Plantilla con clase Scanner

```
import java.util.Scanner;

public class NombreClase{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // El código aquí

    }
 }
```


# Generación de aleatorios
```
import java.util.Scanner;

public class EscaladoAleatorios {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroAleatorio;
		final int NUMERO_MAXIMO = 10;
		final int NUMERO_MINIMO = 5;
		
		numeroAleatorio = (int)(Math.random() * (NUMERO_MAXIMO-NUMERO_MINIMO+1))+NUMERO_MINIMO;
		
		System.out.println("El número es: " + numeroAleatorio);

    }
 }

```
