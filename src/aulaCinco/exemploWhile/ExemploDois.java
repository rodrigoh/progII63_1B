package aulaCinco.exemploWhile;

import java.util.Scanner;

public class ExemploDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma nota entre 0 e 10: ");
		int nota = ler.nextInt();
		while(nota<0 || nota>10){
			System.out.print("Nota inválida, digite outra: ");
			nota = ler.nextInt();
		}
	}
}
