/*
En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
*/

// If
public class Main
{
	public static void main(String[] args) {
	    int numeroIf = -1;
		if (numeroIf == 0){
		    System.out.println("El número es 0");
		} else if(numeroIf > 0) {
		    System.out.println("El número es mayor a 0");
		} else {
		    System.out.println("El número es menor a 0");
		}
	}
}

// While
public class Main
{
	public static void main(String[] args) {
	    int numeroWhile = -3;
        while(numeroWhile <= 10){
         System.out.println(numeroWhile);
            numeroWhile++;   
        }
	}
}

// dowhile
public class Main
{
	public static void main(String[] args) {
	    int numeroWhile = -3;
	    do{
         System.out.println(numeroWhile);
            numeroWhile++;   
     	} 	while(numeroWhile <= 10);
     }
 }

// For
public class Main
{
	public static void main(String[] args) {
	    for (int numeroFor = 0;numeroFor <=3 ;numeroFor++) { 	
	    System.out.println(numeroFor);
	    }
     }
 }

 // Switch
ppublic class Main{
	public static void main(String[] args) {
		String estacion = "Otono";
		 switch (estacion){
            case "Verano":
                System.out.println("Usted eligio el verano");
                break;
            case "Invierno":
                System.out.println("Usted eligio el invierno");
                break;
            case "Primavera":
                System.out.println("Usted eligio la primavera");
                break;
            case "Otono":
            System.out.println("Usted eligio el otono");
            break;
            default: System.out.println("Opcion incorrecta");
      	}
	}
}
