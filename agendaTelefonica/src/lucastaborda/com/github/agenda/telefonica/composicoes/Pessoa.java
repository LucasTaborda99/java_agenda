package lucastaborda.com.github.agenda.telefonica.composicoes;

import java.util.ArrayList;
import lucastaborda.com.github.agenda.telefonica.tipos.Nome;
import lucastaborda.com.github.agenda.telefonica.tipos.Sobrenome;
import lucastaborda.com.github.agenda.telefonica.tipos.Cpf;

public class Pessoa {
	
	private Nome nome;
	private Sobrenome sobrenome;
	private Cpf cpf;
	private ArrayList<Contato> contatos;

	public Pessoa(Nome nome, Sobrenome sobrenome, Cpf cpf, ArrayList<Contato> contatos ) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.contatos = contatos;
	}
	
	public void setNome(Nome nome) {
		this.nome = nome;
	}
	
	public Nome getNome() {
		return nome;
	}
	
	public void setSobrenome(Sobrenome sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public Sobrenome getSobrenome() {
		return sobrenome;
	}
	
	public void setCpf(Cpf cpf) {
		this.cpf = cpf;
	}
	
	public Cpf getCpf() {
		return cpf;
	}

	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public ArrayList<Contato> getContatos() {
		return contatos;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome da Pessoa: " + nome + " " + sobrenome + " / " + cpf);
		return sb.toString();
	}
	
	public void mostrarTodosContatosDaPessoa() {
		System.out.println("================== Contatos em Detalhes da pessoa selecionada ================================");
		this.contatos.forEach(contato -> {
			System.out.println(contato);
		});
	}
}
