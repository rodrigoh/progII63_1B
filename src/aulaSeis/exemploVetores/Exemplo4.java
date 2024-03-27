package aulaSeis.exemploVetores;

import java.util.Scanner;

public class Exemplo4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] lista = new int[10];
		for(int i=0;i<lista.length;i++){
			System.out.print("Digite um valor para lista["+i+"]: ");
			lista[i] = ler.nextInt();
		}
		System.out.println("Dados no vetor...");
		for(int elemento:lista){
			int resultado = 5*elemento;
			System.out.print(resultado+" ");
		}
	}
}
