package aulaDez;

public class Teste {
	public static void main(String[] args) {
		Pessoa pessoaUm = new Pessoa();
		pessoaUm.nome = "Jonas";
		pessoaUm.sobrenome = "Silva";
		pessoaUm.altura = 170;
		pessoaUm.corOlhos= "verdes";
		pessoaUm.dataNascimento = "15/10/2000";
		pessoaUm.andar();
		pessoaUm.correr();

		Pessoa pessoaDois = new Pessoa();
		pessoaDois.nome = "Ana";
		pessoaDois.sobrenome = "Silva";
		pessoaDois.altura = 170;
		pessoaDois.corOlhos = "azuis";
		pessoaDois.dataNascimento = "10/05/1999";
		pessoaDois.andar();
		pessoaDois.comer();
		System.out.println("A pessoa dois chama "+pessoaDois.nome+" "+pessoaDois.sobrenome);
	}
}
