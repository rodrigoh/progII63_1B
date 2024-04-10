package aulaOito.correcao;

import java.util.Random;

/*
Ler duas matrizes, A 4x6 e B 4x6, e criar:
a) uma matriz S que seja a soma de A e B (A+B)
b) uma matriz D que seja a diferença de A e B (A-B)
 Escrever as matrizes S e D.

 */
public class Exercicio5 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] ma = new int[4][6];
		int[][] mb = new int[4][6];
		int[][] ms = new int[4][6];
		int[][] md = new int[4][6];
		System.out.printf("\nDados na matriz A\n");
		for(int l=0;l<ma.length;l++){
			for(int c=0;c<ma[l].length;c++){
				ma[l][c] = aleatorio.nextInt(100);
				System.out.printf("%02d ",ma[l][c]);
			}
			System.out.printf("\n");
		}
		System.out.printf("\nDados na matriz B\n");
		for(int l=0;l<mb.length;l++){
			for(int c=0;c<mb[l].length;c++){
				mb[l][c] = aleatorio.nextInt(100);
				System.out.printf("%02d ",mb[l][c]);
			}
			System.out.printf("\n");
		}
		System.out.printf("\nDados na matriz S\n");
		for(int l=0;l<ms.length;l++){
			for(int c=0;c<ms[l].length;c++){
				ms[l][c] = ma[l][c]+mb[l][c];
				System.out.printf("%03d ",ms[l][c]);
			}
			System.out.printf("\n");
		}
		System.out.printf("\nDados na matriz D\n");
		for(int l=0;l<md.length;l++){
			for(int c=0;c<md[l].length;c++){
				md[l][c] = ma[l][c]-mb[l][c];
				System.out.printf("%03d ",md[l][c]);
			}
			System.out.printf("\n");
		}
	}
}
