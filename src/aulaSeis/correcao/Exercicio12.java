package aulaSeis.correcao;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		long n = ler.nextLong();
		int contDiv = 0;
		for(long i=1;i<=n;i++){
			if(n%i==0)
				contDiv++;
		}
		if(contDiv==2)
			System.out.println(n+" é primo");
		else
			System.out.println(n+" não é primo");
	}
}
