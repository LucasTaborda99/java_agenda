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
	public static Integer menu() {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("");
		System.out.println("=======================================================");
		System.out.println("============  AGENDA DE CONTATOS  ==========");
		System.out.println("Digite 1 para Adicionar uma nova pessoa e seus contatos");
		System.out.println("Digite 2 para Listar todos os contatos");
		System.out.println("Digite 3 para Editar um contato existente");
		System.out.println("Digite 4 para Excluir um contato existente");
		System.out.println("Digite 5 para Visualizar um contato detalhado");
		System.out.println("Digite 0 para Encerrar a aplicação");
		System.out.println("=======================================================");
		
		Integer opcao = scan.nextInt();
		if(opcao == 0) {
			System.out.println("Aplicação Encerrada");
			System.exit(0);
		}
		return opcao;
	}
	
//	---------------------------- Main ----------------------------
	public static void main(String args[]) {
		
		 Integer opcao = 0;
		 
	     Scanner scan = new Scanner(System.in);
	     ArrayList<Contato> contatos = new ArrayList<Contato>();
	     ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	     Agenda agenda = new Agenda(pessoas);
	     
	    do{
	        opcao = menu();
	            
	        switch(opcao){
	        case 1:
	        	agenda.inserirNovoContato(pessoas, scan);
	        break;

	        case 2:
	        	agenda.listarContatos(contatos);	
	        break;
	                
	        case 3:
	        	agenda.editarContato(contatos, scan);
	        break;
	                
	        case 4:
	            agenda.excluirContato(contatos, scan);
	        break;
	                
	        case 5:
	            agenda.visualizarContatoDetalhado(contatos, scan);
	        break;
	            
	        default:
	            System.out.println("Opção inválida, digite um número entre 1 e 5");
			}
	   
	    } while(opcao != 0);
	}
}
//----------------------------------------------------------------------------------------