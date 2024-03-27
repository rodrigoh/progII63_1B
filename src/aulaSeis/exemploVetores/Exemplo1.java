package aulaSeis.exemploVetores;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Vetor de 10 números inteiros com índices de 0 - 9
		int[] lista = new int[10];
//		lista[0] = 10;
//		lista[4] = 5;
//		System.out.print("Digite um número para lista[0]: ");
//		lista[0] = ler.nextInt();
//		System.out.print("Digite um número para lista[1]: ");
//		lista[1] = ler.nextInt();
//		System.out.print("Digite um número para lista2]: ");
//		lista[2] = ler.nextInt();
		for(int i=0;i<10;i++){
			System.out.print("Digite um número para lista["+i+"]: ");
			lista[i] = ler.nextInt();
		}
		//System.out.println(lista);
		System.out.println("Dados no vetor:");
//		System.out.print(lista[0]+" ");
//		System.out.print(lista[1]+" ");
//		System.out.print(lista[2]+" ");
		for(int i=0;i<10;i++){
			System.out.print(lista[i]+" ");
		}
	}
}
