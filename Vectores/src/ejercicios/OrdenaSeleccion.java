package ejercicios;

import java.util.Scanner;
import java.util.Vector;

public class OrdenaSeleccion {

	public static void main(String[] args) {
		/*
		 * Programa que pide un vector por t3eclado y lo ordena
		 *
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el numero de elementos");
		int tam = teclado.nextInt();
		
		int numeros[] = new int[tam];
		System.out.println("Introduce el vector");
		Vectores.pedir_vector(numeros);
		
		System.out.println("Tu vector es ");
		Vectores.mostrar_vector(numeros);
		
		Vectores.ordenarSeleccion(numeros);
		
		System.out.println("Tu vector ordenado es ");
		Vectores.mostrar_vector(numeros);
		
		
		
		

	}

}
