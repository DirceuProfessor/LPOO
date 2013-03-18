package br.unip.db;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.unip.lpoo.aula4.beans.Entidade;
import br.unip.lpoo.aula4.beans.Professor;

public class FileAdministradorDeEntidadesProfessor implements AdministradorDeEntidades{

	private File db;
	private File idDb;
	
	public FileAdministradorDeEntidadesProfessor(String localizacaoArquivo){
		this.db = new File(localizacaoArquivo+"Professor.db");
		this.idDb = new File(localizacaoArquivo+"ProfessorId.db");
		if(!idDb.exists()){
			updateIndex(1);
		}
	}
	
	private void updateIndex(int i){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(idDb));
			bw.write(String.valueOf(i));
			bw.close();
			}catch (IOException e){
				
			}
	}
	
	private String toDbLine(Professor prof){
		return String.valueOf(prof.id)+separador+prof.getNome()+separador+prof.getSobreNome()+separador+prof.getAtivo()+"\n";
	}
	
	@Override
	public boolean insere(Entidade entidade) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(this.idDb));
			BufferedWriter bw = new BufferedWriter(new FileWriter(this.db,true));
			Professor prof = (Professor)entidade;
			prof.setId(1+Integer.valueOf(br.readLine()));
			br.close();
			updateIndex(prof.getId());
			bw.append(toDbLine(prof));
			bw.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean atualiza(Entidade entidade) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Entidade entidade) {
		// TODO Auto-generated method stub
		return false;
	}

}
