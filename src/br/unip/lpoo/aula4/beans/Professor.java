package br.unip.lpoo.aula4.beans;

import java.util.ArrayList;
import java.util.List;

import br.unip.lpoo.aula2.Usuario;

public class Professor extends Usuario{

	public Professor() {
		// TODO Auto-generated constructor stub
	}

	private List<Curso> cursos = new ArrayList<Curso>();
	private List<Materia> materias = new ArrayList<Materia>();
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	public List<Materia> getMaterias() {
		return materias;
	}
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	@Override
	public String toString() {
		return "Professor [cursos=" + cursos + ", materias=" + materias + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cursos == null) ? 0 : cursos.hashCode());
		result = prime * result
				+ ((materias == null) ? 0 : materias.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (cursos == null) {
			if (other.cursos != null)
				return false;
		} else if (!cursos.equals(other.cursos))
			return false;
		if (materias == null) {
			if (other.materias != null)
				return false;
		} else if (!materias.equals(other.materias))
			return false;
		return true;
	}

}
