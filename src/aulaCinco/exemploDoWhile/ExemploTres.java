package aulaCinco.exemploDoWhile;

import java.util.Scanner;

public class ExemploTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nota;
		do{
			System.out.print("Digite uma nota entre 0 e 10: ");
			nota = ler.nextInt();
		}
		while (nota<0 || nota>10);
	}
}
