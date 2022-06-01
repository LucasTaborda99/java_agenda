package lucastaborda.com.github.agenda.telefonica.base;

import java.util.ArrayList;
import java.util.Scanner;

import lucastaborda.com.github.agenda.telefonica.composicoes.Contato;
import lucastaborda.com.github.agenda.telefonica.composicoes.Pessoa;
import lucastaborda.com.github.agenda.telefonica.tipos.Cpf;
import lucastaborda.com.github.agenda.telefonica.tipos.Nome;
import lucastaborda.com.github.agenda.telefonica.tipos.Sobrenome;
import lucastaborda.com.github.agenda.telefonica.tipos.Telefone;

public class Agenda {

	private ArrayList<Pessoa> pessoas;

	public Agenda(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void inserirNovoContato(ArrayList<Pessoa> pessoas, Scanner scan) {
		
		Integer opcao = 0;
		
		System.out.println("----------------- Adicionando a pessoa -----------------");	
		System.out.println("Digite o nome do pessoa: ");
		Nome nome = null;
		if (scan.hasNext()) {
			nome = new Nome (scan.next());
		} 
		
		System.out.println("Digite o sobrenome da pessoa: ");
		Sobrenome sobrenome = null;
		if (scan.hasNext()) {
			sobrenome = new Sobrenome (scan.next());
		} 
		
		System.out.println("Digite o cpf da pessoa: ");
		Cpf cpf = null;
		if (scan.hasNext()) {
			cpf = new Cpf (scan.next());
		} 
	
		ArrayList<Contato> contatos = new ArrayList<>();
		
		Pessoa novapessoa = new Pessoa(nome, sobrenome, cpf, contatos);
		pessoas.add(novapessoa);
		
		System.out.println("Pessoa cadastrada com sucesso");
		System.out.println("");	
		
		do {
			System.out.println("----------------- Adicionando os contatos para a pessoa -----------------");	
			System.out.println("Digite o nome do contato: ");
			Nome nomeContato = null;
			if (scan.hasNext()) {
				nomeContato = new Nome (scan.next());
			} 
			
			System.out.println("Digite o sobrenome do contato: ");
			Sobrenome sobrenomeContato = null;
			if (scan.hasNext()) {
				sobrenomeContato = new Sobrenome (scan.next());
			} 
			
			System.out.println("Digite o telefone do contato: ");
			Telefone telefoneContato = null;
			if (scan.hasNext()) {
				telefoneContato = new Telefone (scan.next());
			} 
			
			System.out.println("Digite o CPF do contato: ");
			Cpf cpfContato = null;
			if (scan.hasNext()) {
				cpfContato = new Cpf (scan.next());
			} 
			
			Contato novoContato = new Contato(nomeContato, sobrenomeContato, telefoneContato, cpfContato);
			contatos.add(novoContato);
			
			System.out.println("Deseja adicionar mais algum contato para a pessoa? Digite 1 se SIM, 0 se NÃO");
			opcao = scan.nextInt();
			scan.nextLine();
			
		} while (opcao == 1);
		System.out.println("Contato adicionado a pessoa com sucesso");
	}

	public void listarContatos(ArrayList<Contato> contatos) {
		System.out.println("----------------- Listando todos os contatos -----------------");	
		pessoas.forEach(pessoa -> System.out.println(pessoa.getContatos()));
	}
	
	public void editarContato(ArrayList<Contato> contatos, Scanner scan) {
		
	}
	
	public void excluirContato(ArrayList<Contato> contatos, Scanner scan) {
		
	}
	
	public void visualizarContatoDetalhado(ArrayList<Contato> contatos, Scanner scan) {
		
	}
}
