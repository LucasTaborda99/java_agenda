package lucastaborda.com.github.agenda.telefonica.apps;

import java.util.ArrayList;
import lucastaborda.com.github.agenda.telefonica.base.Agenda;
import lucastaborda.com.github.agenda.telefonica.composicoes.Pessoa;
import lucastaborda.com.github.agenda.telefonica.composicoes.Contato;
import lucastaborda.com.github.agenda.telefonica.tipos.Nome;

public class Client1 {

		public static void main(String[] args) {
			
			Pessoa pessoa1 = new Pessoa("Contato 1");
			Pessoa pessoa2 = new Pessoa("Contato 2");
			Pessoa pessoa3 = new Pessoa("Contato 3");
			
			ArrayList<Pessoa> pessoas = new ArrayList<>();
			pessoas.add(pessoa1);
			pessoas.add(pessoa2);
			pessoas.add(pessoa3);
			
			Agenda agenda = new Agenda(pessoas);
			agenda.imprimeTodosContatosDaAgenda();
			
//			----------------------------------------------------------------------------
			
			Nome nome1 = new Nome("Nome 1");
			
			ArrayList<Nome> nome = new ArrayList<>();
			nome.add(nome1);

			Contato contato = new Contato(nome);
			contato.imprimeNomeContato();
		}

	}

