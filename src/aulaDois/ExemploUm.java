package aulaDois;

import java.util.Scanner;

public class ExemploUm {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = ler.next();
		System.out.print("Qual seu sobrenome: ");
		String sobrenome = ler.next();
		System.out.println("Bem vindo "+nome+" "+sobrenome);
	}
}
