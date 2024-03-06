package aulaTres.correcao;

import java.util.Scanner;

/*
Uma equipe de Fórmula 1 deseja calcular o número mínimo de litros que deverá
colocar no tanque de seu carro para que ele possa percorrer um determinado
número de voltas até o primeiro reabastecimento. Escreva um programa que
leia o comprimento da pista (em metros), o número total de voltas a serem
percorridas no grande prêmio, o número de reabastecimentos desejados e o
consumo de combustível do carro (em Km/L). Calcular e escrever o número
mínimo de litros necessários para percorrer até o primeiro reabastecimento.
Observação: Considere que o número de voltas entre os reabastecimentos é o
mesmo.
 */
public class Exercicio15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Comprimento da pista (m): ");
		float comprimento = ler.nextFloat()/1000;
		System.out.print("Número de voltas: ");
		int voltas = ler.nextInt();
		System.out.print("Quantos abastecimentos: ");
		int abastecimentos = ler.nextInt();
		System.out.print("Qual a autonomia do carro (km/l): ");
		float autonomia = ler.nextFloat();
		float distancia = comprimento*voltas;
		float combustivelT = distancia/autonomia;
		float litrosAbastece = combustivelT/abastecimentos;
		System.out.printf("Para percorrer os %.2f km de prova serão necessários " +
						"%.2f litros por abastecimento\n",distancia,litrosAbastece);

	}
}
