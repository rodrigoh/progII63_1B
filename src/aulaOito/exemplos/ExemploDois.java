package aulaOito.exemplos;

import com.sun.source.tree.BreakTree;

import java.util.Random;

public class ExemploDois {
	static String imprimeMatriz(int[][] matriz){
		String retorno = "";
		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				retorno=retorno + String.format("%02d ",matriz[l][c]);
			}
			retorno=retorno + "\n";
		}
		return retorno;
	}

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[5][3];
		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				matriz[l][c] = aleatorio.nextInt(100);
			}
		}
		System.out.println(imprimeMatriz(matriz));
	}

}
