package lucastaborda.com.github.agenda.telefonica.tipos;

public class Telefone {
	
	private String telefone;
	
	public Telefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setNome(String telefone) {
		this.telefone = telefone;
	}
	
	public String getNome() {
		return telefone;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Telefone do Contato: " + telefone);
		return sb.toString();
	}
}
