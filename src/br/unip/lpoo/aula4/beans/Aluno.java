package br.unip.lpoo.aula4.beans;

import java.util.ArrayList;
import java.util.*;

import br.unip.lpoo.aula2.*;

public class Aluno extends Usuario{

	
	private Curso curso;
	private List<Materia> materias = new ArrayList<Materia>();
//	private Set<Materia> materias = new HashSet<Materia>();
	
	public Aluno() {
		native{
			
		}
		//		materias = new ArrayList<Materia>();
		Set<String> nome = new HashSet<String>();
		nome.add("primeiro");
		nome.add("segundo");
		nome.add("terceiro");
		nome.add("quarto");
		nome.add("primeiro");
		nome.add("quarta");
		Iterator<String> it = nome.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
//		for(int x =0; x<300; x++){
//			
//		}
//	System.out.println(materias.get(400));
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Aluno();
	}

	public int hashCode(){
		
	}
	
	public boolean equals(Object obj) {
		
	}
}
