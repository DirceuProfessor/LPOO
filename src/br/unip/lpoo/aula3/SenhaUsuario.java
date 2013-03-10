package br.unip.lpoo.aula3;

public class SenhaUsuario {

	private int id=0;
	private String senhaHasheada=null;
	
	
	
	public SenhaUsuario(int id, String senhaHasheada) {
		super();
		this.id = id;
		this.senhaHasheada = senhaHasheada;
	}



	public SenhaUsuario() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getSenhaHasheada() {
		return senhaHasheada;
	}



	public void setSenhaHasheada(String senhaHasheada) {
		this.senhaHasheada = senhaHasheada;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((senhaHasheada == null) ? 0 : senhaHasheada.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SenhaUsuario other = (SenhaUsuario) obj;
		if (id != other.id)
			return false;
		if (senhaHasheada == null) {
			if (other.senhaHasheada != null)
				return false;
		} else if (!senhaHasheada.equals(other.senhaHasheada))
			return false;
		return true;
	}

	
}
