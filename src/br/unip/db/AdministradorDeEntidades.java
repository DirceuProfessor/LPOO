package br.unip.db;

import br.unip.lpoo.aula4.beans.Entidade;

/**
 * Interface responsavel pela definicao dos metodos
 * necessarios para inserir, alterar e apagar as entidades
 * do banco de dados
 * @author dirceu
 *
 */
public interface AdministradorDeEntidades {

	public final static String separador=",";
	
	public boolean insere(Entidade entidade);
	
	public boolean atualiza(Entidade entidade);
	
	public boolean remove(Entidade entidade);
}
