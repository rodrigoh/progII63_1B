package aulaNove;

import java.util.Random;

public class Exercicio4 {
	static int dado() {
		Random aleatorio = new Random();
		//return aleatorio.nextInt(1, 7);
		return aleatorio.nextInt(6);
	}

	public static void main(String[] args) {
		int[] lancamentos = new int[6];
		int maximo = 1000000;
		for(int i =0; i<maximo; i++){
			lancamentos[dado()]++;
		}
		for(int i=0;i<6;i++){
			float percentual = lancamentos[i]/(float)maximo*100;
			System.out.printf("A face %d do dado foi sorteada %d vezes, o que " +
							"representa %.2f %%\n",(i+1),lancamentos[i],percentual);
		}
	}
}
