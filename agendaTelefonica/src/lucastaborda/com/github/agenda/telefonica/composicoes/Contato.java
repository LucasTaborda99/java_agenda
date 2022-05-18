package lucastaborda.com.github.agenda.telefonica.composicoes;

import java.util.ArrayList;
import lucastaborda.com.github.agenda.telefonica.tipos.Nome;

public class Contato {
	
	private ArrayList<Nome> nomes;
	
	public Contato(ArrayList<Nome> nomes) {
		this.nomes = nomes;
	}
	
	public ArrayList<Nome> getPessoas() {
		return nomes;
	}

	public void setPessoas(ArrayList<Nome> nomes) {
		this.nomes = nomes;
	}
	
	public void imprimeNomeContato() {
		this.nomes.forEach(nome -> {
			System.out.println(nome);
		});
	}
	
}
