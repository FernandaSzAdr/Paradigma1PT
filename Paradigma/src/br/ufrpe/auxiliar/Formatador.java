package br.ufrpe.auxiliar;

import java.util.ArrayList;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import br.ufrpe.beans.Carta;

public class Formatador {
	private String jogo;
	private ArrayList<Carta> minhasCartas = new ArrayList<>();
	
	public Formatador(String jogo) {
		this.jogo = jogo;
	}
	
	public void pegarCarta(){
		for(char jo : jogo.toCharArray()){
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
				}else if (Character.isDigit(jo)) {
					valor = jo;
				}
				
				Carta aux = new Carta(naipe, valor);
				minhasCartas.add(aux);
			}
		}
	}

	
	public ArrayList<Carta> getMinhasCartas() {
		return minhasCartas;
	}
	
}
