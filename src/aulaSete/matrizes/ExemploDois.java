package aulaSete.matrizes;

public class ExemploDois {
	public static void main(String[] args) {
		int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		System.out.println("A quantidade de linhas da matriz é " + matriz.length);
		System.out.println("A quantidade de colunas da matriz é " + matriz[0].length);
		System.out.println("Dados na matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%02d ", matriz[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nUsando o for simplificado");
//		int[] vetor = {1,2,3,4,5,6};
//		for(int i : vetor){
//			System.out.print(i+" ");
//		}
		//for(destino: origem)
		for (int[] linha : matriz) {
			for (int coluna : linha) {
				System.out.printf("%02d ", coluna);
			}
			System.out.println();
		}
	}
}
