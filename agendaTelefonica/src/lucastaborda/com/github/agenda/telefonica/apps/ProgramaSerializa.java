package lucastaborda.com.github.agenda.telefonica.apps;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import lucastaborda.com.github.agenda.telefonica.composicoes.Contato;
import lucastaborda.com.github.agenda.telefonica.composicoes.Pessoa;
import lucastaborda.com.github.agenda.telefonica.tipos.Cpf;
import lucastaborda.com.github.agenda.telefonica.tipos.Nome;
import lucastaborda.com.github.agenda.telefonica.tipos.Sobrenome;
import lucastaborda.com.github.agenda.telefonica.tipos.Telefone;

public class ProgramaSerializa {

	public static void main(String[] args) {
		Nome nome1 = new Nome("Lucas");
		Sobrenome sobrenome1 = new Sobrenome("Taborda");
		Telefone telefone1 = new Telefone("419999999");
		Cpf cpf1 = new Cpf("123456789");
		
		Contato c1 = new Contato (nome1, sobrenome1, telefone1, cpf1);


		try {
			Writer writer = new FileWriter(new File("database.json"), true);
			writer.write(c1.toJson());
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
