package br.unip.lpoo.aula4.beans;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ShaLogin implements Login{

	public ShaLogin() {
		// TODO Auto-generated constructor stub
	}

	public void novoMetodo(){
		
	}
	
	public void novoMetodo(String novoMetodo){
		
	}
	
	public void novoMetodo(String s, String outra){
		
	}

	public static void main(String[] args) {
		try {
			byte[] senha = new ShaLogin().encripta(new char[]{'a','b','c'});
			System.out.println(new String(senha));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean login(String nome, char[] senha) {
		try {
			byte[] senhaEncriptada = encripta(senha);
			//Seta nulo no objeto da senha
			senha =null;
			byte[] senhaUsuario = new byte[2]; //metodo que busca a senha do usuario no banco
			return senhaUsuario == senhaEncriptada;

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public byte[] encripta(char[] senha) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		digest.reset();
		return digest.digest(senha.toString().getBytes());
	}

}
