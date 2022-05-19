package lucastaborda.com.github.agenda.telefonica.composicoes;

//import java.util.ArrayList;
//import lucastaborda.com.github.agenda.telefonica.tipos.Nome;
//import lucastaborda.com.github.agenda.telefonica.tipos.Telefone;

public class Contato {
	
	private String nomes;
	private String telefones;
//	private ArrayList<Nome> nomes;
//	private ArrayList<Telefone> telefones;
	
	public Contato(String nomes, String telefones) {
		this.nomes = nomes;
		this.telefones = telefones;
//		this.nomes = nomes;
//		this.telefones = telefones;
	}
	
	public String getNomes() {
		return nomes;
	}

	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	
	public String getTelefones() {
		return telefones;
	}

	public void setTelefones(String telefones) {
		this.telefones = telefones;
	}
	
	@Override
	public String toString() {
		return "Contato: " + nomes + " / " + "Telefone: " + telefones;
	}
	
//	public void imprimiNomeContato() {
//		this.nomes.forEach(nome -> System.out.println(nome));
//	}
//	
//	public void imprimiTelefoneContato() {
//		this.telefones.forEach(telefone -> System.out.println(telefone));
//	}
	
}
