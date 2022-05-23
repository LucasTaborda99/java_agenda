package lucastaborda.com.github.agenda.telefonica.composicoes;

public class Pessoa {
	
	String nome;
	String sobrenome;
	Integer cpf;

	public Pessoa(String nome, String sobrenome, Integer cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome Completo: " + nome + " " + sobrenome + " / " + "CPF: " + cpf);
		return sb.toString();
	}
}
