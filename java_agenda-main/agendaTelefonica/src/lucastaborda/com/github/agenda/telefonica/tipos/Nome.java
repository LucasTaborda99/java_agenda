package lucastaborda.com.github.agenda.telefonica.tipos;

public class Nome {

	String nome;
	
	public Nome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do Contato: " + nome);
		return sb.toString();
	}

}
