package aula22.exemploArquivos;

import java.io.*;

public class Lendo {
	public static void main(String[] args) {
		File caminho = new File("C:/Users/rodri/Documents/novaPasta/");
		//Tentando escrever uma pessoa em um arquivo
		Pessoa p1;
		File arquivo = new File(caminho,"dadosPessoa.db");
		try{
			ObjectInputStream objLeitura =
							new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
			p1 = (Pessoa) objLeitura.readObject();
			System.out.println(p1);
		}
		catch (FileNotFoundException e){
			System.out.println("Arquivo não existe");
		}
		catch (IOException e){
			System.out.println("Erro ao ler o arquivo");
		}
		catch (ClassNotFoundException e){
			System.out.println("Classe não encontrada");
		}
	}
}
