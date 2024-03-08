package aulaTres.classeDecimalFormat;

import java.text.DecimalFormat;

public class ExemploUm {
	public static void main(String[] args) {
		double d = 1.456434;
		/**
		 * 0 – imprime um dígito se existir, 0 caso contrário
		 * # – imprime um dígito se existir, nada de outra forma
		 * . – indica onde colocar o separador decimal
		 * , – indica onde colocar o separador de agrupamento
		 */
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		System.out.println(df.format(d));
		double numero = 12345.546;
		System.out.println(df.format(numero));
		df = new DecimalFormat("#,###0.000");
		System.out.println(df.format(numero));
		//Alternativas
		System.out.printf("R$ %.2f\n",numero);
		System.out.println(String.format("R$ %.2f", numero));
		System.out.println(String.format("%.3f", numero));
	}
}
