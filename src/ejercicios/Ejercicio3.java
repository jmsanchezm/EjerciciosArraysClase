package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		boolean result;
		int array1 []= new int [10];
		int array2 [] = new int [10];
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca 20 números, de los cuales 10 se almacenarán en un array y otros 10 en otro: ");
		for (int i = 0 ; i < array1.length; i++) {
			array1[i]= read.nextInt();
		}
		for (int i = 0 ; i < array2.length;i++) {
			array2[i]= read.nextInt();
		}
		result= Arrays.equals(array1, array2);
		
		if(result= true)
			System.out.println("Los arrays son iguales");
		else
			System.out.println("Los arrays son distintos");
	}

}
