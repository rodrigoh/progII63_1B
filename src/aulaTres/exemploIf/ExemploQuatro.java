package aulaTres.exemploIf;

import java.util.Scanner;

public class ExemploQuatro {
	public static void main(String[] args){
		String usuario;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o usuário: ");
		usuario = ler.next();

		if(usuario.equals("admin")){
			System.out.println("O usuário está correto");
		}
		else{
			System.out.println("O usuário está incorreto");
		}

	}
}
