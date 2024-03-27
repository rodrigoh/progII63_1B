package aulaSeis.exemploVetores;

import java.util.Random;
import java.util.Scanner;

public class Exemplo5Random {
	public static void main(String[] args) {
		Random aleatorio = new Random();

		int n = aleatorio.nextInt();
		System.out.println(n);
		n = aleatorio.nextInt(10);
		System.out.println(n);
		n = aleatorio.nextInt(20,50);
		System.out.println(n);
		float nr = aleatorio.nextFloat();
		System.out.println(nr);
		boolean ba = aleatorio.nextBoolean();
		System.out.println(ba);

		int[] vetor = new int[10];
		for(int i=0;i< vetor.length;i++){
			vetor[i] = aleatorio.nextInt(100);
			System.out.print(vetor[i]+" ");
		}
	}
}
