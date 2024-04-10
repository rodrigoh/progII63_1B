package aulaOito.correcao;

import java.util.Random;

/*
Faça um programa para gerar automaticamente números entre 1 e 99
de uma cartela de bingo. Sabendo que cada cartela deverá conter
5 linhas de 5 números, gere estes dados de modo a não ter
números repetidos dentro das cartelas. O programa deve exibir
na tela a cartela gerada.
 */
public class Exercicio12 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] cartela = new int[5][5];
		int[] vetor = new int[25];
		int cont=0;
		for(int l=0;l<5;l++){
			for(int c=0;c<5;){
				int num = aleatorio.nextInt(1,100);
				//Pesquisando no vetor...
				boolean novoNumero = true;
				for(int i=0;i<cont;i++){
					if(num==vetor[i])
						novoNumero = false;
				}
				//Verificando se o número é novo
				if(novoNumero){
					vetor[cont] = num;
					cartela[l][c] = num;
					System.out.printf("%02d ",cartela[l][c]);
					c++;
					cont++;
				}
			}
			System.out.printf("\n");
		}
	}
}
