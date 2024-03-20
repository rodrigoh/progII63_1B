package aulaCinco.exemploFor;

import java.util.Scanner;

public class ExemploUm {
	public static void main(String[] args) {
		for(int i =0;i<10;i++){
			System.out.print(i+" ");
		}
		System.out.println("\nExemplo dois");
		for(int i =0,j=9;i<10 && j>=0;i++,j--){
			System.out.println("i = "+i+", j = "+j);
		}
		System.out.println("\nExemplo três");
		System.out.print("Digite um valor inicial para t: ");
		int t = new Scanner(System.in).nextInt();
		int f = t+10;
		//for(inicialização;teste;passo)
		for(;t<f;t+=2){
			System.out.print(t+" ");
		}
		System.out.println("\nExemplo quatro");
		for(int i=0;i<10;){
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\nExemplo quatro\n");
		System.out.println("Calcular a média de 4 notas\n");
		float nota;
		float media = 0;
		for(int i=1;i<5;){
			System.out.print("Digite a nota "+i+": ");
			nota = new Scanner(System.in).nextFloat();
			if(nota>=0 && nota<=10){
				//media = media+nota;
				media+=nota;
				i++;
			}
		}
		media/=4;
		System.out.println("A média é "+media);
	}
}
