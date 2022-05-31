package lucastaborda.com.github.agenda.telefonica.tipos;

public class Nome {

	private String nome;
	
	public Nome(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		return sb.toString();
	}
}
