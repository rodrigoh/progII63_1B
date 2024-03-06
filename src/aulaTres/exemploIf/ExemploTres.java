package aulaTres.exemploIf;

import java.util.Scanner;

public class ExemploTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Número: ");
		int numero = ler.nextInt();
		if(numero==0)
			System.out.println("O valor é zero");
		else if(numero<0)
			System.out.println(numero+" é negativo");
		else
			System.out.println(numero+" é positivo");
	}
}
