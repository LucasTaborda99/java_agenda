package lucastaborda.com.github.agenda.telefonica.apps;

import java.util.ArrayList;
import java.util.Scanner;

import lucastaborda.com.github.agenda.telefonica.base.Agenda;
import lucastaborda.com.github.agenda.telefonica.composicoes.Pessoa;
import lucastaborda.com.github.agenda.telefonica.composicoes.Contato;
import lucastaborda.com.github.agenda.telefonica.tipos.Nome;
import lucastaborda.com.github.agenda.telefonica.tipos.Sobrenome;
import lucastaborda.com.github.agenda.telefonica.tipos.Cpf;
import lucastaborda.com.github.agenda.telefonica.tipos.Telefone;

public class Client1 {
//	---------------------------- Menu ----------------------------
	public static void menu() {
		System.out.println("===================================");
		System.out.println("============  AGENDA   ==========");
		System.out.println("===================================");
		System.out.println("Digite 1 para Inserir um novo contato");
		System.out.println("Digite 2 para Listar todos os contatos");
		System.out.println("Digite 3 para Excluir um contato existente");
		System.out.println("Digite 4 para Editar um contato existente");
		System.out.println("Digite 5 para Visualizar um contato detalhado");
		System.out.println("Digite 0 para encerrar");
		System.out.println("===================================");
	}	
//----------------------------------------------------------------------------------------
	public static void main(String args[]) {
		
		 int opcao;
	     Scanner scan = new Scanner(System.in);
	     
	     ArrayList<Contato> contatos = new ArrayList<Contato>();
	     ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	     Agenda agenda = new Agenda(pessoas);
	     
	        do{
	            menu();
	            opcao = scan.nextInt();
	            
	            switch(opcao){
	            case 1:
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

//	    			ArrayList<Contato> contatos = new ArrayList<>();
	    			
	    			Pessoa novapessoa = new Pessoa(nome, sobrenome, cpf, contatos);
	    			pessoas.add(novapessoa);
	    			
	    			System.out.println("Cadastrado com sucesso");

	    			
	    			do {
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
	    			
	    			if (opcao == 0 ) {
	    				menu();
	    			}
	    			System.out.println("Cadastrado com sucesso");
	    			
	    			return;
//	            	break;
	                
	            case 2:
	            	pessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));
	            	contatos.forEach(contato -> System.out.println(contato.getNome()));
	            	pessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));
	            	contatos.forEach(contato -> System.out.println(contato.getNome()));
	                break;
	                
	            case 3:
//	            	System.out.println("Digite o nome do contato: ");
//	    			Nome nome = null;
//	    			
//	    			if (scan.hasNext()) {
//		    			nome = new Nome (scan.next());
//	    			} 
//	    			
//	    			System.out.println("Digite o sobrenome: ");
//	    			Sobrenome sobrenome1 = null;
//	    			
//	    			if (scan.hasNext()) {
//		    			sobrenome = new Sobrenome (scan.next());
//	    			} 
//	    			
//
//	    			System.out.println("Digite o cpf do contato: ");
//	    			Cpf cpf = null;
//	    			
//	    			if (scan.hasNext()) {
//		    			cpf = new Cpf (scan.next());
//	    			} 
//
//	    			ArrayList<Contato> contatos = new ArrayList<>();
//	    			
//	    			Pessoa novapessoa = new Pessoa(nome, sobrenome, cpf, contatos);
//	    			pessoas.remove(novapessoa);
//	                break;
	                
	            case 4:
	            	imprimiTodasPessoasDaAgenda();
	                break;
	                
	            case 5:
	            	
	                break;
	            
	            case 0:
	            	 System.out.println("Aplicação finalizada");
	            	 System.exit(0);
	                break;
	                
	            default:
	            	System.out.println("Opção inválida, digite um número entre 1 e 5");
				}
	   
	        } while(opcao != 0);
	}
//			---------------------------- Instanciando os objetos ----------------------------
		public static void imprimiTodasPessoasDaAgenda() {
			
			Nome nome1 = new Nome("Lucas");
			Sobrenome sobrenome1 = new Sobrenome("Taborda da Rocha");
			Cpf cpf1 = new Cpf("123456789");
			Telefone telefone1 = new Telefone("(41)99999-9999");
//			
			Nome nome2 = new Nome("Vitória");
			Sobrenome sobrenome2 = new Sobrenome("da Derrota");
			Cpf cpf2 = new Cpf("987654321");
			Telefone telefone2 = new Telefone("(41)98888-8888");
//			
			Nome nome3 = new Nome("Edmundo");
			Sobrenome sobrenome3 = new Sobrenome("Dantas de Monte Cristo");
			Cpf cpf3 = new Cpf("1020304");
			Telefone telefone3 = new Telefone("(41)98787-8787");
		
//			----------------------------- Listas de Contatos -------------------------------------------------------
			
			Contato contato1 = new Contato(nome1, sobrenome1, telefone1, cpf1);
			Contato contato2 = new Contato(nome2, sobrenome2, telefone2, cpf2);
			Contato contato3 = new Contato(nome3, sobrenome3, telefone3, cpf3);
//			
			ArrayList<Contato> contatos1 = new ArrayList<>();
//			contatos1.add(contato1);
			contatos1.add(contato2);
			contatos1.add(contato3);
//			contatos1.remove(contato1);
//			contatos1.remove(contato2);
//			contatos1.remove(contato3);
//			
			ArrayList<Contato> contatos2 = new ArrayList<>();
			contatos2.add(contato1);
			contatos2.add(contato2);
			contatos2.add(contato3);
//			contatos2.remove(contato1);
//			contatos2.remove(contato2);
//			contatos2.remove(contato3);
//			
			ArrayList<Contato> contatos3 = new ArrayList<>();
			contatos3.add(contato1);
//			contatos3.add(contato2);
			contatos3.add(contato3);
//			contatos1.remove(contato1);
//			contatos1.remove(contato2);
//			contatos1.remove(contato3);

//			------------------------------- Listas de Pessoas ---------------------------------------------------------

			Pessoa pessoa1 = new Pessoa(nome1, sobrenome1, cpf1, contatos1);
			Pessoa pessoa2 = new Pessoa(nome2, sobrenome2, cpf2, contatos2);
			Pessoa pessoa3 = new Pessoa(nome3, sobrenome3, cpf3, contatos3);
//			
			ArrayList<Pessoa> pessoas = new ArrayList<>();
			pessoas.add(pessoa1);
			pessoas.add(pessoa2);
//			pessoas.add(pessoa3);
//			contatos.remove(pessoa1);
//			contatos.remove(pessoa2);
//			contatos.remove(pessoa3);
//			
			Agenda agenda = new Agenda(pessoas);
			agenda.imprimiTodasPessoasDaAgenda();
//			
			Pessoa contatos = new Pessoa(nome2, sobrenome2, cpf2, contatos2);
			contatos.mostrarTodosContatosDaPessoa();
	}
}
//----------------------------------------------------------------------------------------


