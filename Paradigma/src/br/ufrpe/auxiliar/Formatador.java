package br.ufrpe.auxiliar;

import java.util.ArrayList;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import br.ufrpe.beans.Carta;

public class Formatador {
	private String jogo;
	private String jogadorVencedor;
	private ArrayList<Carta> minhasCartasUm = new ArrayList<>();
	private ArrayList<Carta> minhasCartasDois = new ArrayList<>();
	
	public Formatador() {}
	
	// Recebe a linha do arquivo
	public void setJogo(String jogo){
		this.jogo = jogo;
		// chama a função que vai repartir essa linha
		pegarCarta();
	}
	
	private void pegarCarta(){
		// Pega o jogo do jogador Um
		String cartasJogadorUm = jogo.substring(0, 14);
		// Pega o jogo do jogador Dois
		String cartasJogadorDois = jogo.substring(15, 29);
		// Pega o jogador vencedor
		jogadorVencedor = jogo.substring(30, 32);
		
		for(char jo : cartasJogadorUm.toCharArray()){
			if(!Character.isWhitespace(jo)){
				char naipe = ' ';
				char valor = ' ';
				if(Character.isLetter(jo)){
					switch(jo){
					case 'C':
					case 'O':
					case 'P':
					case 'E':
						naipe = jo;
						break;
					default:
						valor = jo;
					}
				}if (Character.isDigit(jo)) {
					valor = jo;
				}
				
				Carta aux = new Carta(naipe, valor);
				minhasCartasUm.add(aux);
			}
		}
		
		for(char jo : cartasJogadorDois.toCharArray()){
			if(!Character.isWhitespace(jo)){
				char naipe = ' ';
				char valor = ' ';
				if(Character.isLetter(jo)){
					switch(jo){
					case 'C':
					case 'O':
					case 'P':
					case 'E':
						naipe = jo;
						break;
					default:
						valor = jo;
					}
				}if (Character.isDigit(jo)) {
					valor = jo;
				}
				
				Carta aux = new Carta(naipe, valor);
				minhasCartasDois.add(aux);
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
