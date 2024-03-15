package aulaQuatro.correcao;

import java.util.Scanner;

/**
 * Crie um algoritmo que pergunte ao usuário se ele deseja converter
 * uma temperatura de graus Celsius em graus Fahrenheit ou Fahrenheit em
 * Celsius. Em seguida mostre na tela o valor final correspondente à opção
 * escolhida pelo usuário. F = 1.8 * C + 32 | C = (F – 32) / 1.8;
 */

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha:");
		System.out.println("f -> para converter uma temperatura de °F para °C");
		System.out.println("c -> para converter uma temperatura de °C para °F");
		//next() devolve uma String,
		// toLowerCase() devolve uma String e
		// charAt() devolver uma letra da String
		char opc = ler.next().toLowerCase().charAt(0);
		switch (opc){
			case 'f'->{
				System.out.print("Digite uma temperatura em °F: ");
				float tempF = ler.nextFloat();
				float tempC = (tempF - 32) / (float)1.8;
				System.out.printf("%.2f°F equivale(m) a %.2f°C\n",tempF,tempC);
				System.out.println(String.format("%.2f°F", tempF)+" equivale(m) a "+String.format("%.2f°C", tempC));
			}
			case 'c'->{
				System.out.print("Digite uma temperatura em °C: ");
				float tempC = ler.nextFloat();
				float tempF = (float)1.8 * tempC + 32;
				System.out.printf("%.2f°FC equivale(m) a %.2f°F\n",tempC,tempF);
			}
			default -> System.out.println("Opção inválida");
		}

	}
}
