package aulaTres.correcao;

import java.util.Scanner;

/*
Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
Sabendo-se que o preço do combustível é de R$ 4,15, escreva um programa para
ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final
do dia, o número de litros de combustível gasto e o valor total (R$) recebido
dos passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro
(líquido) do dia.
 */
public class Exercicio14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual a km no inicio do dia: ");
		int kmInicial = ler.nextInt();
		System.out.print("Qual a km no final do dia: ");
		int kmFinal = ler.nextInt();
		System.out.print("Quantos litros de combustível: ");
		float litros = ler.nextFloat();
		System.out.print("Qual o valor bruto recebido: ");
		float valor = ler.nextFloat();
		float kmRodado = kmFinal-kmInicial;
		float autonomia = kmRodado/litros;
		float lucro = valor-litros*(float)4.15;
		System.out.printf("Seu veículo roda %.2fkm/l\n",autonomia);
		System.out.printf("O lucro do dia é R$%.2f\n",lucro);
	}
}
