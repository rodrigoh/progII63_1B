package aulaTres.exemploIf;

import java.util.Scanner;

public class ExemploUm {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Número: ");
		int numero = ler.nextInt();
		//Testar se o número está entre 0 e 10;
		// && ||
		if(numero>0 && numero<10){
			System.out.println("O número é válido");
		}
		else{
			System.out.println("O número não é válido");
		}
	}
}
