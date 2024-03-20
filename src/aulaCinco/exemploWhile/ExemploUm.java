package aulaCinco.exemploWhile;

public class ExemploUm {
	public static void main(String[] args) {
		int cont = 0;
		while(cont<10){
			System.out.print(cont+" ");
			cont++;
		}
		System.out.println("\n");
		cont = 0;
		while(cont<10)
			System.out.print((cont++)+" ");
	}
}
