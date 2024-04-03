package aulaSete.matrizes;

import java.util.Scanner;

public class ExemploUm {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//tipo[][] nome = new tipo[nLinhas][nColuna]
		int[][] matriz = new int[2][3];
		for(int l=0;l<2;l++){
			for(int c=0;c<3;c++){
				System.out.print("matriz["+l+"]["+c+"]: ");
				matriz[l][c] = ler.nextInt();
			}
		}
		//Mostrar a matriz na tela
		for(int l=0;l<2;l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
	}
}
