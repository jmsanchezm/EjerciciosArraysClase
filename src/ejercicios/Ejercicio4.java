package ejercicios;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numAleatorios []= new int [30];
		for (int i = 0 ; i < numAleatorios.length;i++){
			numAleatorios[i]=(int)(Math.random()*10);
		}
		Arrays.sort (numAleatorios);
		System.out.println(Arrays.toString(numAleatorios));
	}

}
