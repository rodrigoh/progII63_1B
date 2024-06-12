package aula18.exemploLampada;

public class Lampada {
	String marca;
	String tipo;
	String localizacao;
	boolean ligada;

	void ligar(){
		ligada = true;
	}

	void desligar(){
		ligada = false;
	}

	String obterInformacoes(){
		return "Marca: "+marca+" tipo: "+tipo+" localização: "+localizacao;
	}

}
