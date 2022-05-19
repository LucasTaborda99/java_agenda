package lucastaborda.com.github.agenda.telefonica.apps;

import java.util.ArrayList;
import lucastaborda.com.github.agenda.telefonica.base.Agenda;
import lucastaborda.com.github.agenda.telefonica.composicoes.Pessoa;
import lucastaborda.com.github.agenda.telefonica.composicoes.Contato;
import lucastaborda.com.github.agenda.telefonica.tipos.Nome;
import lucastaborda.com.github.agenda.telefonica.tipos.Telefone;

public class Client1 {

		public static void main(String[] args) {
			
			System.out.println("================== Pessoas ========================");
			Pessoa pessoa1 = new Pessoa("João");
			Pessoa pessoa2 = new Pessoa("Maria");
			Pessoa pessoa3 = new Pessoa("Pedro");
			
			ArrayList<Pessoa> pessoas = new ArrayList<>();
			pessoas.add(pessoa1);
			pessoas.add(pessoa2);
			pessoas.add(pessoa3);
			
			Agenda agenda = new Agenda(pessoas);
			agenda.imprimiTodasPessoasDaAgenda();
//			----------------------------------------------------------------------------------------
			
//			Nome nome1 = new Nome("Nome 1");
//			Nome nome2 = new Nome("Nome 2");
//			Nome nome3 = new Nome("Nome 3");
			
//			Telefone telefone1 = new Telefone("Telefone 1");
//			Telefone telefone2 = new Telefone("Telefone 2");
//			Telefone telefone3 = new Telefone("Telefone 3");
			
//			ArrayList<Nome> nome = new ArrayList<>();
//			nome.add(nome1);
//			nome.add(nome2);
//			nome.add(nome3);
//			
//			ArrayList<Telefone> telefone = new ArrayList<>();
//			telefone.add(telefone1);
//			telefone.add(telefone2);
//			telefone.add(telefone3);
			
			System.out.println("================= Detalhes dos contatos =========================");
			ArrayList<Contato> contatos = new ArrayList<>();
			
			Contato contato1 = new Contato("João", "(41)98765-4321");
			Contato contato2 = new Contato("Maria", "(41)91234-5678");
			Contato contato3 = new Contato("Pedro", "(41)99999-9999");

			contatos.add(contato1);
			contatos.add(contato2);
			contatos.add(contato3);
//			contatos.remove(contato1);
//			contatos.remove(contato2);
//			contatos.remove(contato3);
			
			contatos.forEach(contato -> System.out.println(contato));

//			for(Contato contato : contatos){
//			    if ( contato = "João" )
//			        System.out.println(contato);
//			}	
			
//			contato1.imprimiNomeContato();
//			contato1.imprimiTelefoneContato();
		}
		
	}

