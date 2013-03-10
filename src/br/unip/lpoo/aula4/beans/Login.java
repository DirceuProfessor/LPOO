package br.unip.lpoo.aula4.beans;

import java.security.NoSuchAlgorithmException;

/**
 * Contrato de login, nada mais é do que a definição dos métodos necessários para desenvolvermos
 * o login
 * @author dirceu
 *
 */
public interface Login {

	public boolean login(String usuario, char[] senha);
	
	public byte[] encripta(char[] senha) throws NoSuchAlgorithmException;
}
