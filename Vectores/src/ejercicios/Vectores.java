package ejercicios;

import java.util.Scanner;

public class Vectores {

	public static void pedir_vector(int vector []) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduce el elemento "+i);
			vector[i] = teclado.nextInt();
		}
	}
	
	public static void mostrar_vector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void ordenarBurbuja(int v[]) {
		int aux;
		for(int i=0;i<v.length; i++) {
			for (int j=0; j<v.length-1-i; j++) {
				if (v[j]>v[j+1]) {
					aux=v[j];
					v[j]=v[j+1];
					v[j+1]=aux;
				}
			}
		}
	}
	public static void ordenarBurbujaOptimizado(int v[]) {
		int aux;
		boolean hayCambios=true;
		for(int i=0;i<v.length && hayCambios; i++) {
			hayCambios=false;
			for (int j=0; j<v.length-1-i; j++) {
				if (v[j]>v[j+1]) {
					aux=v[j];
					v[j]=v[j+1];
					v[j+1]=aux;
					hayCambios=true;
				}
			}
		}
	}
	
	public static void ordenarSeleccion(int vector[]) {
		int menor;
		int posMenor;
		for (int i=0; i<vector.length-1;i++) {
			menor=vector[i];
			posMenor=i;
			for (int j=i+1;j<vector.length;j++) {
				if (vector[j]<menor) {
					menor = vector[j];
					posMenor=j;
				}
			}
			vector[posMenor]=vector[i];
			vector[i]=menor;
		}
	}
	
	
	
	
}
