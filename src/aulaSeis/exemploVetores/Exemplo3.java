package aulaSeis.exemploVetores;

public class Exemplo3 {
	public static void main(String[] args) {
		//Assume como tamanho do vetor a quantidade de elementos...
		int[] vetor = {1, 2, 3, 5, 12, 9, 2};
		//Lista de nomes com 4 posições e índices de 0 a 3
		String[] nomes = {"Ana", "Pedro", "Jonas", "Rodrigo"};
		System.out.println("Tamanho da lista "+vetor.length);
		//Posso alterar qualquer posição do vetor
		vetor[3] = 30;
		System.out.println("Dados no vetor...");
		for(int i=0;i<vetor.length;i++){
			System.out.print(vetor[i]+" ");
		}
		System.out.println("\nLista de nomes: ");
		for(int i=0;i<nomes.length;i++){
			System.out.print(nomes[i]+" ");
		}



	}
}
