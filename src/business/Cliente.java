package business;

public class Cliente {
	
	private String Nome, CPF;
	private int Idade;
	private char Genero, Socio;
	
	public Cliente(String Nome, String CPF, char Genero, int Idade,char Socio) {
		if(Nome!=null && Nome != "") {
			this.setNome(Nome);
		}
		if(CPF.length()==11) {
			this.setCPF(CPF);
		}
		if(Genero == 'M' || Genero =='F') {
			this.setGenero(Genero);
		}
		if(Idade>0) {
			this.setIdade(Idade);
		}
		if(Socio == 'S' || Socio =='N') {
			this.setSocio(Socio);
		}
		
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public char getGenero() {
		return Genero;
	}

	public void setGenero(char genero) {
		Genero = genero;
	}

	public char getSocio() {
		return Socio;
	}

	public void setSocio(char socio) {
		Socio = socio;
	}
	
	

}
