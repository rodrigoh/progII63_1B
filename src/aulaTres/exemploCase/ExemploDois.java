package aulaTres.exemploCase;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExemploDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número entre 1 e 7: ");
		//1 = domingo
		//7 = sábado
		int dia = ler.nextInt();
		switch(dia){
			case 1,7-> System.out.println("É fim de semana");
			case 2,3,4,5,6-> {
				System.out.println("É dia útil");
				System.out.println("Posso ter mais de um comando...");
			}
			default -> System.out.println("Número inválido");
		}
	}
}
