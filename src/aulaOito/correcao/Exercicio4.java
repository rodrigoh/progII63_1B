package aulaOito.correcao;

import java.util.Random;

/*
Ler uma matriz G 3x3 e criar 2 vetores, SL e SC, de 3 elementos
cada, contendo respectivamente as somas das linhas e das colunas
de G. Escrever os vetores criados.
 */
public class Exercicio4 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matrizG = new int[3][3];
		int[] sl = new int[3];
		int[] sc = new int[3];
		for(int l=0;l<3;l++){
			for(int c=0;c<3;c++){
				matrizG[l][c] = aleatorio.nextInt(1,20);
				System.out.printf("%02d ",matrizG[l][c]);
			}
			System.out.printf("\n");
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				sl[i] = sl[i]+matrizG[i][j];
				sc[i] = sc[i]+matrizG[j][i];
			}
		}
		System.out.printf("\nDados no vetor soma linha\n");
		for(int valor : sl){
			System.out.printf("%d ",valor);
		}
		System.out.printf("\nDados no vetor soma coluna\n");
		for(int valor : sc){
			System.out.printf("%d ",valor);
		}
	}
}
