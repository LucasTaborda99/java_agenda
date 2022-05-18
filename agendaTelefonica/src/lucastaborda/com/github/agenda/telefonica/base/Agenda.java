package lucastaborda.com.github.agenda.telefonica.base;

import java.util.ArrayList;
import lucastaborda.com.github.agenda.telefonica.composicoes.Pessoa;

public class Agenda {

	private ArrayList<Pessoa> pessoas;

	public Agenda(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public void imprimeTodosContatosDaAgenda() {
		this.pessoas.forEach(contato -> {
			System.out.println(contato);
		});
	}

}
