package lucastaborda.com.github.agenda.telefonica.tipos;

public class Telefone {
	
	String telefone;
	
	public Telefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Telefone do Contato: " + telefone);
		return sb.toString();
	}
	
}
