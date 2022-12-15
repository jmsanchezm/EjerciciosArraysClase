package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n;
		int m;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduzca un número n para la dimensión del array:");
		n= read.nextInt();
		System.out.println("Introduzca el valor que tomará cada posición del array: ");
		m= read.nextInt();
		int nm [] = new int [n];
		
		for (int i= 0; i<nm.length;i++) {
			nm[i]= m;
		}
		System.out.println(Arrays.toString(nm));
	}

}
