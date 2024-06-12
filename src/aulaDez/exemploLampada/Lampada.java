package aulaDez.exemploLampada;

public class Lampada {
	String marca;
	String modelo;
	String cor;
	boolean estaLigada;

	void ligar(){
		estaLigada = true;
	}

	void desligar(){
		estaLigada = false;
	}

	String estaLigada(){
		if(estaLigada){
			return "sim";
		}
		return "não";
	}
}
