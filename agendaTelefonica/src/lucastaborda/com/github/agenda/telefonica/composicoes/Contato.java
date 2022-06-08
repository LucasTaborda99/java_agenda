package lucastaborda.com.github.agenda.telefonica.composicoes;

import com.google.gson.Gson;

import lucastaborda.com.github.agenda.telefonica.tipos.Cpf;
import lucastaborda.com.github.agenda.telefonica.tipos.Nome;
import lucastaborda.com.github.agenda.telefonica.tipos.Sobrenome;
import lucastaborda.com.github.agenda.telefonica.tipos.Telefone;

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
	
	public void setNome(Nome nomes) {
		this.nomes = nomes;
	}
	
	public Nome getNome() {
		return nomes;
	}

	@Override
	public String toString() {
		return nomes + "\n" + sobrenomes + "\n" 
		+ cpfs + "\n" 
		+ telefones + "\n";
	}
	
	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}

	public Sobrenome getSobrenomes() {
		return sobrenomes;
	}

	public void setSobrenomes(Sobrenome sobrenomes) {
		this.sobrenomes = sobrenomes;
	}

	public Telefone getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone telefones) {
		this.telefones = telefones;
	}

	public Cpf getCpfs() {
		return cpfs;
	}

	public void setCpfs(Cpf cpfs) {
		this.cpfs = cpfs;
	}

	
}
