package aulaSete.matrizes;

import java.util.Random;

public class ExemploTres {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[5][5];
		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[0].length;c++){
				matriz[l][c] = aleatorio.nextInt(1,100);
				System.out.printf("%02d ", matriz[l][c]);
			}
			System.out.println();
		}
		System.out.println("\nDiagonal da matriz");
		for(int l=0;l<matriz.length;l++) {
			for (int c = 0; c < matriz[0].length; c++) {
				if(l==c){
					System.out.print(matriz[l][c]+" ");
				}
			}
		}
		System.out.println("\nDiagonal da matriz op2 ");
		for(int i=0;i<matriz.length;i++){
			System.out.print(matriz[i][i]+" ");
		}
		System.out.println("\nDiagonal secundária:");
		for(int l=0;l<matriz.length;l++) {
			for (int c = 0; c < matriz[0].length; c++) {
				if(l+c == matriz.length-1){
					System.out.print(matriz[l][c]+" ");
				}
			}
		}
	}
}
