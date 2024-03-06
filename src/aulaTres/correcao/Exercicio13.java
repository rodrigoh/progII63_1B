package aulaTres.correcao;
//Escreva um programa para ler as dimensões de uma cozinha retangular
//				(comprimento, largura e altura), calcular e escrever a quantidade
//				de caixas de azulejos para se colocar em todas as suas paredes.
//				Também deve ser lido um valor equivalente a área das Janelas e
//				portas para descontar da área total. Cada caixa de azulejos
//				possui 1,5 m2.

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Em relação a cozinha, quais as medidas: ");
		System.out.print("Largura: ");
		float largura = ler.nextFloat();
		System.out.print("Comprimento: ");
		float comprimento = ler.nextFloat();
		System.out.print("Altura: ");
		float altura = ler.nextFloat();
		System.out.print("Qual a área ocupada por aberturas: ");
		float areaAbertura = ler.nextFloat();
		float areaTotal = (largura*altura+comprimento*altura)*2;
		areaTotal-=areaAbertura;
		float quantCaixas = areaTotal/(float)1.5;
		//ceil arredonda para cima
		//floor arredonda para baixo
		quantCaixas = (float) Math.ceil(quantCaixas);
		System.out.printf("Serão necessárias %.2f caixas de azulejos para " +
						"cobrir uma área de %.2f m²\n",quantCaixas,areaTotal);
	}
}
