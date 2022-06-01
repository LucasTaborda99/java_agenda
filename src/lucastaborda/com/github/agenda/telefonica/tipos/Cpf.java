package lucastaborda.com.github.agenda.telefonica.tipos;

public class Cpf {
	
	private String cpf;
	
	public Cpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("CPF: " + cpf);
		return sb.toString();
	}
}
