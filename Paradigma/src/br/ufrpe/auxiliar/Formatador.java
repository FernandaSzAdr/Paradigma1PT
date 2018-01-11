package br.ufrpe.auxiliar;

import java.util.ArrayList;
import java.util.Collection;

//import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;
import br.ufrpe.beans.Carta;
import java.util.Collections;

public class Formatador {
	private String jogo;
	private String jogadorVencedor;
	private ArrayList<Carta> minhasCartasUm = new ArrayList<>();
	private ArrayList<Carta> minhasCartasDois = new ArrayList<>();
	
	public Formatador() {}
	
	//Inicializa
	public Formatador(String jogo) {
		setJogo(jogo);
		orderMao(this.minhasCartasUm);
		orderMao(this.minhasCartasDois);
	}
	// Recebe a linha do arquivo
	public void setJogo(String jogo){
		this.jogo = jogo;
		// chama a fun��o que vai repartir essa linha
		pegarCarta();
		
	}
	//Ordena a Mão de cartas pelo valor das cartas
	public void orderMao(ArrayList<Carta> mao) {
		Collections.sort(mao);
	}
	
	private void pegarCarta(){
		// Pega o jogo do jogador Um
		String cartasJogadorUm = jogo.substring(0, 14);
		// Pega o jogo do jogador Dois
		String cartasJogadorDois = jogo.substring(15, 29);
		// Pega o jogador vencedor
		jogadorVencedor = jogo.substring(30, 32);
		
		//char[] cartas = new char[15];
	//	cartas = cartasJogadorUm.toCharArray();
		//char jo = cartas[0];
		int state = 0;
		char valor = ' ';
		for(char jo: cartasJogadorUm.toCharArray()){
			char naipe = ' ';
			if(!Character.isWhitespace(jo)){
				
				 if(state == 1) {
					
					naipe = jo;
					state = 0;
					
					Carta aux = new Carta(naipe, valor);
					minhasCartasUm.add(aux);
				}
				
				else if(state == 0) {
					
					valor = jo;
					state = 1;
				}
				
			}
		}
		
		state = 0;
		 valor = ' ';
		for(char jo: cartasJogadorDois.toCharArray()){
			char naipe = ' ';
			if(!Character.isWhitespace(jo)){
				
				 if(state == 1) {
					
					naipe = jo;
					state = 0;
	
					Carta aux = new Carta(naipe, valor);
					minhasCartasDois.add(aux);
				}
				
				else if(state == 0) {
					
					valor = jo;
					state = 1;
				}
				
			}
		}
	}

	
	public ArrayList<Carta> getMinhasCartasUm() {
		return minhasCartasUm;
	}
	
	public ArrayList<Carta> getMinhasCartasDois() {
		return minhasCartasDois;
	}
	
	public String getVencedor(){
		return jogadorVencedor;
	}
}
