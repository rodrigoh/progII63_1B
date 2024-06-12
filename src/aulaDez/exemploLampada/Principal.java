package aulaDez.exemploLampada;

public class Principal {
	public static void main(String[] args) {
		Lampada l1 = new Lampada();
		l1.marca = "elgin";
		l1.modelo = "led";
		l1.cor = "branca";
		Lampada l2 = new Lampada();
		l2.marca = "taschibra";
		l2.modelo = "fluorescente";
		l2.cor = "branca";
		Lampada l3 = new Lampada();
		l3.marca = "philips";
		l3.modelo = "led";
		l3.cor = "amarela";
		Lampada l4 = new Lampada();
		l4.marca = "multilaser";
		l4.modelo = "led";
		l4.cor = "RGB";
		Lampada l5 = new Lampada();
		l5.marca = "taschibra";
		l5.modelo = "halogena";
		l5.cor = "amarela";

		l1.ligar();
		System.out.println("A lâmpada 1 está ligada? "+l1.estaLigada());
		l1.desligar();
		System.out.println("A lâmpada 1 está ligada? "+l1.estaLigada());
	}
}
