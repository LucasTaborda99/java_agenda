package lucastaborda.com.github.agenda.telefonica.tipos;

public class Endereco {
	
	private String endereco;
	
	public Endereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setNome(String endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return endereco;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(endereco);
		return sb.toString();
	}
}
