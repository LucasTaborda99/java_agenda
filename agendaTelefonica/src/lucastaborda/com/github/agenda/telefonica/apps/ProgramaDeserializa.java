package lucastaborda.com.github.agenda.telefonica.apps;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.google.gson.Gson;

import lucastaborda.com.github.agenda.telefonica.composicoes.Contato;

public class ProgramaDeserializa {

	public static void main(String[] args) {
		try {				
			Scanner scan = new Scanner(new File("database.json"));
			Gson gson = new Gson();
			while (scan.hasNext()) {
				Contato c1 = gson.fromJson(scan.nextLine(), Contato.class);
				System.out.println(c1.getNome());
				System.out.println(c1.getSobrenomes());
				System.out.println(c1.getCpfs());
				System.out.println(c1.getTelefones());
			}
			scan.close();			
		} catch (IOException e) {		
			e.printStackTrace();
		}

	}

}
