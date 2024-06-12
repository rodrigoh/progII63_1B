package aula18.exemploPessoa;

public class Pessoa {
	String nome;
	String sobrenome;
	int idade;
	int altura;

	void correr(){
		System.out.println(nome+" está correndo!");
	}

	void andar(){
		System.out.println(nome+" está andando...");
	}

	void parar(){
		System.out.println(nome+" está parada...");
	}

	String obterDados(){
		return "Nome: "+nome+" "+sobrenome+"\nIdade: "+idade+"\nAltura: "+altura+
						"cm";
	}

}
