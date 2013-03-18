package br.unip.telas;

import java.io.IOException;
import java.util.Scanner;

import br.unip.db.AdministradorDeEntidades;

public abstract class TelaPadrao implements ITelaCadastro{

	private String entidade;
	protected Scanner leitorDados=null;
	protected AdministradorDeEntidades dbAdmin;
	public TelaPadrao(String entidade,AdministradorDeEntidades dbAdmin){
		this.entidade = entidade;
		this.dbAdmin = dbAdmin;
		 leitorDados = new Scanner(System.in);
		 inicializa();
	}
	
	public void inicializa(){
		try {
		Runtime.getRuntime().exec("clear");	
		cabecalho();
		System.out.println("Escolha a opcao desejada:");
		System.out.println("1 Cadastrar um novo "+entidade);
		System.out.println("2 Editar um "+entidade);
		System.out.println("3 Remover um " +entidade);
		System.out.println("4 Voltar");
		int resposta = leitorDados.nextInt();
		switch (resposta) {
		case 1 :{
			telaCriacao();
			inicializa();
			break;
		}
		case 2 : {
			telaAtualizacao();
			break;
		}
		case 3: {
			telaRemocao();
			break;
		
		}
		case 4: {
				Runtime.getRuntime().exec("clear");
			
			break;
		}
		default : {
			System.out.println(" Opcao invalida!");
				Runtime.getRuntime().exec("clear");
			//No windows aqui deve ser cls
			inicializa();
			break;
		}
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void mostra(){
		cabecalho();
		show();
	
	}
	
	public void cabecalho(){
		System.out.println(" Bem vindo ao cadastro de "+entidade);
		
	}

	
}
