package aulaOito.correcao;

import java.util.Random;

/*
- Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão na diagonal principal.

9 - Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão acima da diagonal principal.
Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão abaixo da diagonal principal.

 */
public class Exercicio8_9 {
	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		Random aleatorio = new Random();
		int somaD = 0;
		int somaAcimaD = 0;
		int somaAbaixoD = 0;
		for(int l=0;l<5;l++){
			for(int c=0;c<5;c++){
				matriz[l][c] = aleatorio.nextInt(1,30);
				System.out.printf("%02d ",matriz[l][c]);
				if(l==c){
					somaD+=matriz[l][c];
				}
				else if(l<c){
					somaAcimaD+=matriz[l][c];
				}
				else if(l>c){
					somaAbaixoD+=matriz[l][c];
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("A soma dos valores \n");
		System.out.printf("Acima da diagonal vale %d\n",somaAcimaD);
		System.out.printf("Abaixo da diagonal vale %d\n",somaAbaixoD);
		System.out.printf("Na diagonal vale %d\n",somaD);

	}
}
