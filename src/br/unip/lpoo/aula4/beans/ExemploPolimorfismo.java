package br.unip.lpoo.aula4.beans;

public class ExemploPolimorfismo {

	public ExemploPolimorfismo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShaLogin log = new ShaLogin();
		log.novoMetodo();
		log.novoMetodo("Novo");
		Login log2 = new ShaLogin();
		log2.novoMetodo();
		Login log3 = log;
		log3.novoMetodo();
	}

}
