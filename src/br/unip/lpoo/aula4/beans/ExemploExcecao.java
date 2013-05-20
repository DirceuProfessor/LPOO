package br.unip.lpoo.aula4.beans;

public class ExemploExcecao {

	private int id;
	
	public ExemploExcecao() {
		// TODO Auto-generated constructor stub
	}

	public int adicionaId(int adicionar) throws Exception{
//		try{
		return adicionar + getId();
//		} catch (Exception e){
//			e.printStackTrace();
//			return 0;
//		}
	}
	
	public  int getId() throws Exception{
		throw new Exception("Exceção");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
