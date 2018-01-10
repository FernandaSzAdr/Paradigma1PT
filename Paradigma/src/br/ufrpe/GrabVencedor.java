package br.ufrpe;
import java.io.*;
import br.ufrpe.auxiliar.*;
public class GrabVencedor {
	public static void main(String[] args) {
		int divergencias = 0;
		
		try{
	         BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\raiss\\git\\Paradigma1PT\\Paradigma\\pokerK.txt"));
	         while(br.ready()){
	            String linha = br.readLine();
	           // System.out.println(linha);
	           Formatador jogo = new Formatador(linha);
	         }
	         br.close();
	      }catch(IOException ioe){
	         ioe.printStackTrace();
	      }
	   }
}
