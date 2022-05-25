package lucastaborda.com.github.agenda.telefonica.tipos;

public class Aniversario {

private String aniversario;
	
	public Aniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	
	public void setNome(String aniversario) {
		this.aniversario = aniversario;
	}
	
	public String getNome() {
		return aniversario;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(aniversario);
		return sb.toString();
	}
}
