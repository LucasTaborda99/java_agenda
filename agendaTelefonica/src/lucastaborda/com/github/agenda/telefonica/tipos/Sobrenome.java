package lucastaborda.com.github.agenda.telefonica.tipos;

public class Sobrenome {
	
	private String sobrenome;
	
	public Sobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setNome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return sobrenome;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(sobrenome);
		return sb.toString();
	}
}
