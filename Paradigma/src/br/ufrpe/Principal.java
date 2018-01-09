package br.ufrpe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
	public static void main (String[] args){
		//Instancia o controller que terá todas as subfunções:
		ControladorPrincipal controller = new ControladorPrincipal();
		String nome_arq = "teste.txt";
	 
	    System.out.printf("\nConteúdo do arquivo texto:\n");
	    try {
	    	  //Iniciando leitura do arquivo.
		      FileReader arq = new FileReader(nome_arq);
		      BufferedReader lerArq = new BufferedReader(arq);
		      
		      String linha;
		      
		      do {
		    	// Pega a linha do arquivo
				linha = lerArq.readLine();
				// Passa a linha para o controller
				controller.setLinhaLida(linha);
				System.out.printf("%s\n", linha);
		      } while (linha != null);
		 
			  arq.close();
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }
	 
	}
}
