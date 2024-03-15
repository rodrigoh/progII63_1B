package aulaQuatro.correcao;

import java.util.Scanner;

/*
A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que
trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora
regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas
trabalhadas em um mês, o salário por hora e escreva o salário total do
funcionário, que deverá ser acrescido das horas extras, caso tenham sido
trabalhadas (considere que o mês possua 4 semanas exatas).
 */
public class Exercicio14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantas horas foram trabalhadas: ");
		float nHoras = ler.nextFloat();
		System.out.print("Qual o valor da hora R$");
		float valorHora = ler.nextFloat();
		float salarioBase = valorHora*160;
		if(nHoras>160){
			float salarioExtra = (nHoras-160)*(valorHora*(float)1.5);
			float salario = salarioBase+salarioExtra;
			System.out.printf("Trabalhando %.2f horas seu salário será:\n",nHoras);
			System.out.printf("Salário base R$%.2f\n",salarioBase);
			System.out.printf("Salário extra R$%.2f\n",salarioExtra);
			System.out.printf("Salário total R$%.2f\n",salario);
		}
		else{
			System.out.printf("Trabalhando %.2f horas seu salário será:\n",nHoras);
			System.out.printf("Salário total R$%.2f\n",salarioBase);
		}
	}
}
