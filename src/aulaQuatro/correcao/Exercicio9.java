package aulaQuatro.correcao;

import java.util.Scanner;

/*
Receba três valores fornecidos pelo usuário que representarão os
lados de um triângulo.
Classifique esse triângulo como:
a) Equilátero: três lados iguais.
b) Isósceles: dois lados iguais.
c) Escaleno: três lados diferentes.
Lembre-se de que, para formar
um triângulo, nenhum dos lados pode ser igual a zero, um lado não
pode ser maior do que a soma dos outros dois.
| b - c | < a < b + c
| a - c | < b < a + c
| a - b | < c < a + b
 */
public class Exercicio9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Do triângulo informe as medidas: ");
		System.out.print("a: ");
		int a = ler.nextInt();
		System.out.print("b: ");
		int b = ler.nextInt();
		System.out.print("c: ");
		int c = ler.nextInt();
		//Validar se forma triângulo
		//Lembre-se de que, para formar
		//um triângulo, nenhum dos lados pode ser igual a zero, um lado não
		//pode ser maior do que a soma dos outros dois.
		if(a>0 && b>0 && c>0 && a<=b+c && b<=a+c && c<=a+b){
			System.out.print("Forma triângulo ");
			//Classificar
			//a) Equilátero: três lados iguais.
			//b) Isósceles: dois lados iguais.
			//c) Escaleno: três lados diferentes.
			if(a==b && b ==c){
				System.out.println("e ele é equilátero.");
			}
			else if(a==b || a==c || b==c){
				System.out.println("e ele é isósceles.");
			}
			else{
				System.out.println("e ele é escaleno.");
			}


		}
		else{
			System.out.println("As medidas não formam um triângulo");
		}
	}
}
