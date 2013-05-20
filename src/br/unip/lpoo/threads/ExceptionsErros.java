package br.unip.lpoo.threads;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionsErros  {

	private String nome=null;
	
	public ExceptionsErros(String nome) {
		
		if(nome==null || nome.length()==0){
			throw new IllegalArgumentException("Nome n‹o pode ser nulo ou vazio");
		}
		
		//metodoInfinito();
	}

	public static void metodoInfinito() throws MinhaExcecao{
		metodoInfinito();
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		FileReader fr = null;
//		fr.read();
		try{
//			fr = new FileReader(new File("arquivo"));
			ExceptionsErros.metodoInfinito();
		}catch(StackOverflowError e){
			e.printStackTrace();
		}
//			System.out.println("excecao");
//		
//		}finally{
//			if(fr!=null ){
//				fr.close();
//			}
//			System.out.println("sempre passa aqui");
//		}
	}


}
