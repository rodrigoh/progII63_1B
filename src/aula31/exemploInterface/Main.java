package aula31.exemploInterface;

public class Main {
	public static void main(String[] args) {
		Vetor v1 = new Vetor(10);

		v1.adiciona("Elemento 1");
		v1.adiciona("Elemento 2");
		v1.adiciona("Elemento 3");
		v1.adiciona("Elemento 4");
		System.out.println("Qual o tamanho da lista "+v1.tamanho());
		System.out.println(v1);
		System.out.println("Removendo o elemento "+v1.remove());
		System.out.println(v1);
		//Para criar uma instância de uma interface, preciso usar o construtor de
		// uma classe que a implemente. Desta forma estarão disponíveis na
		// instância criada apenas os métodos comuns a interface e a classe, com
		// o comportamento implementado na classe.
		Lista l1 = new Vetor(5);
		l1.adiciona("Teste");
		l1.adiciona("Teste 2");
		l1.remove();
		//Neste caso o método tamanho não vai estar disponível na instância l1
		//l1.tamanho();
	}
}