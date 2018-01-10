package br.ufrpe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
	public static void main (String[] args){
		//Instancia o controller que ter� todas as subfun��es:
		ControladorPrincipal controller = new ControladorPrincipal();
		String nome_arq = "pokerK.txt";
	 
	    System.out.printf("\nConte�do do arquivo texto:\n");
	    try {
	    	  //Iniciando leitura do arquivo.
		      FileReader arq = new FileReader(nome_arq);
		      BufferedReader lerArq = new BufferedReader(arq);
		      
		      String linha;
		      
		      do {
		    	// Pega a linha do arquivo
				linha = lerArq.readLine();
				//System.out.printf("%s\n", linha);
				// Passa a linha para o controller
				controller.setLinhaLida(linha);
				controller.Formatador();
				//System.out.printf("%s\n", controller.getVencedor());
				//System.out.printf("%s\n", controller.getMinhasCartasJogadorUm());
				//System.out.printf("%s\n", controller.getMinhasCartasJogadorDois());
		      } while (linha != null);
		 
			  arq.close();
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }
	 
	}
}
