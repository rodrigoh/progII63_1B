package aulaTres.exemploIf;

import java.util.Scanner;

public class ExemploDois {
	public static void main(String[] args) {
		System.out.print("Qual a idade do contratante: ");
		int idade = new Scanner(System.in).nextInt();
		//
		if(idade < 0){
			System.out.println("idade inválida.");
		}
		else if(idade < 5){
			System.out.println("categoria infantil A");
		}
		else if(idade < 12){
			System.out.println("categoria infantil B");
		}
		else if(idade < 25){
			System.out.println("categoria juvenil");
		}
		else if(idade < 40){
			System.out.println("categoria adulto A");
		}
		else if(idade <65){
			System.out.println("categoria adulto B");
		}
		else{
			System.out.println("categoria terceira idade");
		}
	}
}
