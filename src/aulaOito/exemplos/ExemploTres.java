package aulaOito.exemplos;

public class ExemploTres {
	static int somaVetor(int[] vetor){
		int soma = 0;
		for(int i=0;i<vetor.length;i++){
			soma+=vetor[i];
		}
		return soma;
	}
	public static void main(String[] args) {
		int[] vetor = {8,9,10,1,2,5};
		int soma = somaVetor(vetor);
		System.out.printf("A soma dos valores no vetor vale %d",soma);
	}
}
