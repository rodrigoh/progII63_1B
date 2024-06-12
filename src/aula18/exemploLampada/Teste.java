package aula18.exemploLampada;

public class Teste {
	public static void main(String[] args) {
		Lampada l1 = new Lampada();

		l1.marca = "Avant";
		l1.tipo = "led";
		l1.localizacao = "sala";
		l1.ligar();

		System.out.println(l1.obterInformacoes()+" está ligada? "+l1.ligada);

		l1.desligar();

		System.out.println(l1.obterInformacoes()+" está ligada? "+l1.ligada);

	}
}
