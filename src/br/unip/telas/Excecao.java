package br.unip.telas;

import java.io.IOException;

public class Excecao {

	public void disparaIOException() throws IOException {
		throw new IOException();
	}

	public void disparaNullPointer() throws IOException {
		disparaIOException();
	}

	public void disparaNumberFormat() throws IOException  { 
//		try {
			disparaNullPointer();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	public void disparaIllegalArgument() throws IllegalArgumentException, IOException{
		disparaNumberFormat();
	}
	/**
	 * @param args
	 * @throws IOException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws IllegalArgumentException, IOException {
		Excecao ex = new Excecao();
		ex.disparaIllegalArgument();
		System.out.println("finaliza");
	}

}
