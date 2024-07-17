package aula22.exemploExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		boolean valido;
		do{
			try {
				System.out.print("Digite um número: ");
				num = ler.nextInt();
				valido = true;
			}
			catch (InputMismatchException e){
				System.out.println("Digite um número!");
				ler.next();
				valido = false;
			}
		}
		while(!valido);
	}
}
