package br.unip.telas;

import br.unip.db.AdministradorDeEntidades;
import br.unip.lpoo.aula4.beans.Professor;

public class CadastroProfessor extends TelaPadrao implements ITela{

	
	public CadastroProfessor(AdministradorDeEntidades dbAdmin){
		super("Professor", dbAdmin);	
	}
	
	@Override
	public void show() {
		
		
		
	}

	@Override
	public void telaRemocao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void telaAtualizacao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void telaCriacao() {
		leitorDados.nextLine();
		Professor prof = new Professor();
		System.out.println(" Tela de Cadastro de Profesor");
		
		System.out.println("Digite o nome do Professor:");
		prof.setNome(leitorDados.nextLine());
		System.out.println("Digite o sobrenome do Professor:");
		prof.setSobreNome(leitorDados.nextLine());
		System.out.println("Este Professor esta ativo (s/n):");
		Character c = leitorDados.nextLine().toLowerCase().charAt(0);
		if(c.equals('s'))
		prof.setAtivo(true);
		else if(c.equals('n'))
			prof.setAtivo(false);
	
	System.out.println(prof);
		if(dbAdmin.insere(prof)) System.out.println(" Professor Inserido com sucesso");
		else System.out.println(" Falha ao inserir Professor, tente novamente");
		System.out.println(" Pressione qualquer tecla para continuar.");
		leitorDados.next();
		leitorDados.reset();
	}

}