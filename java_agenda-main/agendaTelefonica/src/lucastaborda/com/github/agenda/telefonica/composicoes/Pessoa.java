package lucastaborda.com.github.agenda.telefonica.composicoes;

public class Pessoa {
	
	String pessoa;

	public Pessoa(String contato) {
		this.pessoa = contato;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pessoa: " + pessoa);
		return sb.toString();
	}
}
