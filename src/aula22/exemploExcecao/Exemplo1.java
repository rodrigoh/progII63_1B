package aula22.exemploExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {

	public static int leInteiro(){
		Scanner ler = new Scanner(System.in);
		int num=0;
		boolean valido;
		do{
			try {
				System.out.print("Digite um número: ");
				num = ler.nextInt();
				valido = true;
			}
			catch (InputMismatchException e){
				System.out.println("O valor precisa ser um número!");
				ler.next();
				valido = false;
			}
		}
		while(!valido);
		return num;
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		try {
			int n1 = leInteiro();
			int n2 = leInteiro();
			int resposta = n1 / n2;
			System.out.println(resposta);
		}
		catch (ArithmeticException erro){
			System.out.println("Não é possível dividir por zero");
		}
		finally {
			System.out.println("Sempre sou executado!");
		}
	}
}
