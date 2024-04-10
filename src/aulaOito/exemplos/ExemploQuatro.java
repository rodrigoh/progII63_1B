package aulaOito.exemplos;

import java.util.Random;

public class ExemploQuatro {
	static void geraVetor(int[] vetor){
		Random aleatorio = new Random();
		for(int i=0;i<vetor.length;i++){
			vetor[i] = aleatorio.nextInt(50);
		}
	}
	public static void main(String[] args) {
		int[] lista = new int[10];
		geraVetor(lista);
		for(int i : lista){
			System.out.printf("%d ",i);
		}
	}
}
