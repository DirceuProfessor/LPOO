package br.unip.lpoo.aula4.beans;

import java.util.HashMap;
import java.util.Map;

public class Programador {

	private int id;
	private String nome;
	private int anosDeExperiencia;


	public Programador(int id, String nome, int anosDeExperiencia) {
		this.id=id;
		this.nome = nome;
		this.anosDeExperiencia=anosDeExperiencia;
	}

	public boolean equals(Object obj) {
		if(this==obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if(this.getClass()!= obj.getClass()){
			return false;
		}
		Programador outro = (Programador)obj;
		if(this.id !=outro.id){
			return false;
		}
		if(this.nome==null && outro.nome!=null){
			return false;
		}
		if(this.nome!=null && this.nome!= outro.nome){
			return false;
		}
		if(this.anosDeExperiencia != outro.anosDeExperiencia){
			return false;
		}

		return true;	

	}

	public int hashCode(){
		int primo = 7;
		int result =primo;
		if(id!=0){
			result *= id * primo;
		}
		if(this.nome!=null){
			result *= primo*nome.hashCode(); 
		}
		if(anosDeExperiencia!=0){
			result *= primo * anosDeExperiencia;
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" ".hashCode());
		Programador p = new Programador(1,"Nome",10);
		Programador p2 = new Programador(1,"Outro Nome",30);
		System.out.println(p.equals(p2));
		Map<String,String> map = new HashMap<String,String>();
		map.put("chave1", "Nome");
		map.put("chave2", "String");
		System.out.println(map.get(2));

	}

}
