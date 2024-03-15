package aulaQuatro.correcao;
/*
Usando o comando de seleção condicional simples “IF”, faça um programa que
leia uma senha de 8 caracteres inteiros e verifique se a senha informada
equivale a senha predefinida no programa. Se for válida informe na tela
"Acesso Autorizado. Caso a senha não estiver correta informe "Acesso negado".
 */

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String senhaValida = "12345678";

		System.out.print("Digite sua senha: ");
		String senha = ler.next();
		if(senha.equals(senhaValida)){
			System.out.println("Bem vindo");
		}
		else{
			System.out.println("Acesso negado");
		}
	}
}
