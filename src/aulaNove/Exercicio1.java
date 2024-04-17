package aulaNove;

import java.util.Scanner;

public class Exercicio1 {
	static float calculaDelta(float a, float b, float c){
		float d = b*b - 4*a*c;
		return d;
	}

	static float calculaX(float a, float b, float d, char opc){
		if(opc=='+'){
			float x = (-b+(float)Math.sqrt(d))/(2*a);
			return x;
		}
		else{
			float x = (-b-(float)Math.sqrt(d))/(2*a);
			return x;
		}
	}
	static float[] calculaX(float a, float b, float d){
		float[] x = new float[2];
		x[0] = (-b+(float)Math.sqrt(d))/(2*a);
		x[1] = (-b-(float)Math.sqrt(d))/(2*a);
		return x;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Dada a equação ax² + bx + c = 0, informe");
		System.out.print("a: ");
		float a = ler.nextFloat();
		System.out.print("b: ");
		float b = ler.nextFloat();
		System.out.print("c: ");
		float c = ler.nextFloat();
		float d = calculaDelta(a,b,c);
		if(d>=0){
			float[] x = calculaX(a,b,d);
			System.out.println("As raízes da equação são:");
			System.out.printf("x': %.2f\n",x[0]);
			System.out.printf("x'': %.2f\n",x[1]);
			//Opção 2:
//			float x1 = calculaX(a,b,d,'+');
//			float x2 = calculaX(a,b,d,'-');
//			System.out.println("As raízes da equação são:");
//			System.out.printf("x': %.2f\n",x1);
//			System.out.printf("x'': %.2f\n",x2);
		}
		else{
			System.out.println("A equação não possui raízes no conjunto dos reais");
		}
	}
}
