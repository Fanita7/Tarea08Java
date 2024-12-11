package Tarea08Java;

import java.util.Scanner;

public class Tarea08Java {

	public static void main(String[] args) {
		/*
		 * Crear un programa en Java que realice lo siguiente:
Debe solicitar al usuario 10 números por consola y almacenarlos en un array.
Debe pasar los números que sean primos a las primeras posiciones, desplazando los demás números al final, de tal forma que no se pierda ningún número.
Debe mostrar por consola el array original, mostrando el índice seguido del valor de la posición.
Debe mostrar por consola el array que contiene los números primos al principio, mostrando el índice seguido del valor de la posición. El orden de los números no importa, siempre y cuando los números primos vayan al principio del array.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
Array original mostrando la posición del array más el valor.
0 - 1
1 - 2
2 - 3
3 - 4
4 - 5
5 - 6
6 - 7
7 - 8
8 - 9
9 - 10
Array con los números primos en las primeras posiciones, mostrando la posición del array más el valor.
0 - 2
1 - 3
2 - 5
3 - 7
4 - 1
5 - 4
6 - 6
7 - 8
8 - 9
9 - 10
		 */		
		
		Scanner s = new Scanner(System.in);
		int[] numeros = new int[10]; 
		
		
	    System.out.println("escribe diez números"); 
	    for (int i=0; i< numeros.length; i++) {
	    	System.out.println("número " + (i +1) + ": ");
	    	numeros[i] =s.nextInt();
	    		    }
	        
	    System.out.println("n\nlista original(posición - valor):");
	    ArrayConIndices(numeros);

        int[] arrayPrimos = orgPrimos(numeros);

        System.out.println("\nnúmeros primos al principio (posición - valor):");
        ArrayConIndices(arrayPrimos);
    }

 
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;}
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;}
        }
        return true; }

  
    public static int[] orgPrimos(int[] numeros) {
        int[] resultado = new int[numeros.length];
        int indicePrimos = 0;
        int indiceNoPrimos = contarPrimos(numeros);

        for (int numero : numeros) {
            if (esPrimo(numero)) {
                resultado[indicePrimos++] = numero;
            } else {
                resultado[indiceNoPrimos++] = numero;}
        }

        return resultado;}
    
    public static int contarPrimos(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                contador++;}
        }
        return contador;
        }

    
    public static void ArrayConIndices(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
	    	     
}
}
