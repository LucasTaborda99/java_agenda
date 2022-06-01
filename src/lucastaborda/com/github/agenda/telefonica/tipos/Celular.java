package lucastaborda.com.github.agenda.telefonica.tipos;

public class Celular {

private String celular;
	
	public Celular(String celular) {
		this.celular = celular;
	}
	
	public void setNome(String celular) {
		this.celular = celular;
	}
	
	public String getNome() {
		return celular;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Celular: " + celular);
		return sb.toString();
	}
}
