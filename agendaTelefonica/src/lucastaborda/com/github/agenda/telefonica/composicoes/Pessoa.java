package lucastaborda.com.github.agenda.telefonica.composicoes;

public class Pessoa {
	
	String contato;

	public Pessoa(String contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Contato: " + contato);
		return sb.toString();
	}
}
