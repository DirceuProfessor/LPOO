package br.unip.lpoo.aula2;

public class Usuario  
{

	public int id=0;
	
	protected String nome=null;
	protected String sobreNome = null;
	protected Boolean ativo = false;

	public Usuario(String nome, String sobreNome, Boolean ativo) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.ativo = ativo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Usuario() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(args.length==0) {
			System.out.println("Argumentos inv�lidos!");
			System.out.println("Voc� deve colocar os seguintes argumentos:");
			System.out.println("-n <nome>");
			System.out.println("-sn <sobrenome>");
			System.out.println("-a <true|false>");
		}else {
			Usuario us = new Usuario();
			for(int indice =0; indice<args.length; indice++){
				if(args[indice].equals("-n")){
					us.nome = args[indice+1];
					indice++;
				}else if(args[indice].equals("-sn")){
					us.sobreNome = args[indice+1];
					indice++;
				}else if(args[indice].equals("-a")){
					if(args[indice++].equals("true")){
						us.ativo = true;

					}else if(args[indice++].equals("false")){
						us.ativo=false;
					}
					indice++;
				}	
			}
			System.out.println(us);
		}
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ativo == null) ? 0 : ativo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((sobreNome == null) ? 0 : sobreNome.hashCode());
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
		Usuario other = (Usuario) obj;
		if (ativo == null) {
			if (other.ativo != null)
				return false;
		} else if (!ativo.equals(other.ativo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobreNome == null) {
			if (other.sobreNome != null)
				return false;
		} else if (!sobreNome.equals(other.sobreNome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", sobreNome=" + sobreNome
				+ ", ativo=" + ativo + "]";
	}



}
