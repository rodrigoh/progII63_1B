package aulaSete.correcao;

import java.util.Random;
import java.util.Scanner;

/*
Ler um vetor de 10 elementos inteiros. Após isto, imprimir na
tela os 10 valores lidos e o usuário poderá escolher um destes
valores para ser excluído do vetor. Ler o valor escolhido e
eliminá-lo do vetor. No momento da exclusão todos os valores
posteriores ao valor escolhido deverão ser reorganizados
(movidos uma posição para esquerda) a fim de que o vetor
resultante não fique com um espaço em branco. Imprimir o
novo vetor.
 */
public class Exercicio11 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[10];
		for(int i=0;i<vetor.length;i++){
			vetor[i] = aleatorio.nextInt(1,100);
			System.out.print(vetor[i]+" ");
		}
		int tamanho = vetor.length;
		int posicao = -1;
		System.out.print("\nDos números acima qual deseja remover: ");
		int remove = ler.nextInt();
		//Descobrir a posição do número na lista
		for(int i=0;i<tamanho && posicao==-1;i++){
			if(vetor[i] == remove){
				posicao = i;
			}
		}
		//Remover ele da lista
		if(posicao!=-1){
			for(int i=posicao;i<tamanho-1;i++){
				vetor[i] = vetor[i+1];
			}
			tamanho--;
			System.out.println("\nDados no vetor:");
			for(int i=0;i<tamanho;i++){
				System.out.print(vetor[i]+" ");
			}
		}
		else{
			System.out.println(remove+" não está na lista");
		}
	}
}
