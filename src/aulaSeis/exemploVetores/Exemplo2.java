package aulaSeis.exemploVetores;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Vetor de 20 números inteiros com índices de 0 - 19
		int[] lista = new int[20];

		System.out.println("O tamanho da lista é "+lista.length);

		for(int i=0;i<lista.length;i++){
			System.out.print("Digite um número para lista["+i+"]: ");
			lista[i] = ler.nextInt();
		}
		System.out.println("Dados no vetor:");
		for(int i=0;i<lista.length;i++){
			System.out.print(lista[i]+" ");
		}
	}
}
