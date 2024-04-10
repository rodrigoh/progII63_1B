package aulaOito.exemplos;

import java.util.Scanner;

public class ExemploUm {

	static int soma(int v1, int v2){
		int resp = v1+v2;
		return resp;
	}
	static int soma(int v1, int v2, int v3){
		return v1+v2+v3;
	}
	static String soma(String s1, String s2){
		return s1+" "+s2;
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.printf("Digite um número: ");
		int n1 = ler.nextInt();
		System.out.printf("Digite outro número: ");
		int n2 = ler.nextInt();
		//v1 = n1, v2 = n2
		int soma = soma(n1,n2);
		System.out.printf("%d + %d = %d\n",n1,n2,soma);
		String nome = "Ana";
		String sobrenome = "Silva";
		String nomeCompleto = soma(nome, sobrenome);
		System.out.printf("%s \n",nomeCompleto);
	}
}
