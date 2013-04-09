package br.unip.erros;

import java.util.ArrayList;
import java.util.List;

import br.unip.lpoo.aula4.beans.Professor;

public class ExemploDeErros {

	public ExemploDeErros() {
//		outOfMemory();
		//stackOverFlow();
	}
	
	//Exemplo de erro de loop infinito
	public boolean stackOverFlow(){
		stackOverFlow();
		return true;
	}
	
	//Exemplo de erro de estouro de mem—ria
	public void outOfMemory() {
		List lista = new ArrayList();
		while(true){
			lista.add(new Professor());
		}
	}
	
	public void acessaConectaBanco() {
		   try{
		      conectaBanco(null);
		   } catch(IllegalArgumentException e) {
		      e.printStackTrace();
		   }
		}

	public void conectaBanco(Object conexao) throws IllegalArgumentException{
		   if(conexao == null){
		      throw new IllegalArgumentException("Conex‹o n‹o pode ser nula");
		   }
		   //l—gica omitida
		}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ExemploDeErros().conectaBanco(null);
	}

}
