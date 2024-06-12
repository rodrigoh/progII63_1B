package aula18.exemploAluno;

import java.util.Random;
import java.util.Scanner;

public class Teste {

	public static Aluno cadastraAluno(){
		Scanner ler = new Scanner(System.in);
		Aluno a1 = new Aluno();
		System.out.print("Informe o nome do aluno: ");
		String nome = ler.next();
		System.out.print("Informe o sobrenome do aluno: ");
		String sobrenome = ler.next();
		System.out.print("Informe o e-mail do aluno: ");
		String eMail = ler.next();
		int codigo = new Random().nextInt(1000,100000);
		a1.nome = nome;
		a1.sobrenome = sobrenome;
		a1.codigo = codigo;
		a1.eMail = eMail;

		return a1;
	}
	public static void mostraAluno(Aluno a1){
		System.out.println("Nome "+a1.nome+" "+a1.sobrenome);
		System.out.println("Código: "+a1.codigo);
		System.out.println("Média: "+a1.obterMedia());
		System.out.println("Está "+a1.obterStatus());
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno[] turma = new Aluno[10];
		int contAluno = 0;
		char resp;
		do{
			System.out.println("c - cadastro de aluno ");
			System.out.println("l - listar os alunos ");
			System.out.println("p - pesquisar um aluno");
			System.out.println("s - sair");
			System.out.print(": ");
			resp = ler.next().toLowerCase().charAt(0);
			if(resp=='c'){
				if(contAluno<turma.length) {
					turma[contAluno] = cadastraAluno();
					System.out.println("Aluno "+turma[contAluno].nome+" "+turma[contAluno].sobrenome+" " +
									"cadastrado " +
									"obteve " +
									"o código "+turma[contAluno].codigo);
					System.out.println("Qual a primeira nota do "+turma[contAluno].nome+": ");
					turma[contAluno].notaUm = ler.nextFloat();
					System.out.println("Qual a segunda nota do "+turma[contAluno].nome+": ");
					turma[contAluno].notaDois = ler.nextFloat();
					contAluno++;
				}
			}
			else if(resp=='l'){
				for(int i=0;i<contAluno;i++){
					mostraAluno(turma[i]);
					System.out.println("---------------------------------------");
				}
			}
			else if(resp=='p'){
				System.out.print("Qual o código de matrícula:");
				int matricula = ler.nextInt();
				boolean achei = false;
				for(int i=0;i<contAluno;i++) {
					if(turma[i].codigo == matricula){
						achei =true;
						mostraAluno(turma[i]);
					}
					if(!achei)
						System.out.println("Aluno "+matricula+" não encontrado");
				}
			}
		}
		while(resp!='s');

	}
}
