package lucastaborda.com.github.agenda.telefonica.composicoes;

import lucastaborda.com.github.agenda.telefonica.tipos.Nome;
import lucastaborda.com.github.agenda.telefonica.tipos.Sobrenome;
import lucastaborda.com.github.agenda.telefonica.tipos.Telefone;
import lucastaborda.com.github.agenda.telefonica.tipos.Cpf;

public class Contato {
	
	private Nome nomes;
	private Sobrenome sobrenomes;
	private Telefone telefones;
	private Cpf cpfs;

	public Contato (Nome nomes, Sobrenome sobrenomes, Telefone telefones, Cpf cpfs) {
		this.nomes = nomes;
		this.sobrenomes = sobrenomes;
		this.telefones = telefones;
		this.cpfs = cpfs;
	}
	
	@Override
	public String toString() {
		return "Nome do contato: " + nomes + " " + sobrenomes + "\n" 
		+ cpfs + "\n" 
		+ telefones + "\n";
	}
}
