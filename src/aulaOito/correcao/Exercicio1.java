package aulaOito.correcao;

import java.util.Scanner;

/*
Ler 6 números inteiros para preencher uma matriz D 2x3,
ou seja, com 2 linhas e 3 colunas (considere que não serão
informados valores duplicados). A seguir, ler um número
inteiro X e escrever uma mensagem indicando se o valor de
X existe ou não na matriz D
 */
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] matrizD = new int[2][3];
		for(int l=0;l<2;l++){
			for(int c=0;c<3;c++){
				System.out.printf("matriz[%d][%d]: ",l,c);
				matrizD[l][c] = ler.nextInt();
			}
		}
		System.out.printf("Qual número devo procurar na matriz: ");
		int busca = ler.nextInt();
		boolean achei = false;
		int linha=0;
		int coluna=0;
		for(int l=0;l< matrizD.length;l++){
			for(int c=0;c<matrizD[l].length;c++){
				if(matrizD[l][c]==busca){
					achei = true;
					linha = l;
					coluna = c;
				}
			}
		}
		if(achei){
			System.out.printf("%d está na matriz na linha %d e coluna %d\n",busca,
							linha,coluna);
		}
		else{
			System.out.printf("%d não está na matriz\n",busca);
		}
	}
}
