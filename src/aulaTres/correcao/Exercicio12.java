package aulaTres.correcao;
//Crie uma classe java que leia dois números inteiros e que depois mostre:
//				O primeiro valor elevado ao segundo valor use Math.pow(número, expoente)
//				O primeiro valor vezes o segundo valor
//				O número inverso do primeiro valor (1/número)
//				A soma do segundo número com a metade do primeiro número
//				A diferença do primeiro número com o segundo
//				O número oposto ao primeiro valor (número *(-1))

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Valor para n1: ");
		float n1 = ler.nextFloat();
		System.out.print("Valor para n2: ");
		float n2 = ler.nextFloat();
		float potencia = (float) Math.pow(n1, n2);
		float mult = n1*n2;
		float inv = 1/n1;
		float soma = n2+n1/2;
		float dif = n1-n2;
		float op = n1*-1;
		System.out.printf("%.2f^%.2f = %.2f\n",n1,n2,potencia);
		System.out.printf("%.2f * %.2f = %.2f\n",n1,n2,mult);
		System.out.printf("O inverso de %.2f = %.2f\n",n1,inv);
		System.out.printf("%.2f + %.2f = %.2f\n",n1,n2,soma);
		System.out.printf("%.2f - %.2f = %.2f\n",n1,n2,dif);
		System.out.printf("O oposto de %.2f = %.2f\n",n1,op);
	}
}
