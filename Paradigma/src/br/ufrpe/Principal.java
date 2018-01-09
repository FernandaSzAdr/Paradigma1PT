package br.ufrpe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
	public static void main (String[] args){
		ControladorPrincipal controller = new ControladorPrincipal();
		String nome_arq = "teste.txt";
	 
	    System.out.printf("\nConte�do do arquivo texto:\n");
	    try {
	      FileReader arq = new FileReader(nome_arq);
	      BufferedReader lerArq = new BufferedReader(arq);
	      
	      String linha;
	      
	      do {

			linha = lerArq.readLine(); 
		
			System.out.printf("%s\n", linha);
	      } while (linha != null);
	 
		  arq.close();
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }
	 
	}
}
