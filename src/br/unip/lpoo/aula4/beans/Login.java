package br.unip.lpoo.aula4.beans;

import java.security.NoSuchAlgorithmException;

/**
 * Contrato de login, nada mais � do que a defini��o dos m�todos necess�rios para desenvolvermos
 * o login
 * @author dirceu
 *
 */
public interface Login {

	public boolean login(String usuario, char[] senha);
	
	public byte[] encripta(char[] senha) throws NoSuchAlgorithmException;
}
