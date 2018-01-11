package br.ufrpe.beans;

public class Carta {
	private char naipe;
	private int valor;
	
	public Carta(char naipe, char valor) {
		this.naipe = naipe;
		giveValue(valor);
		this.valor = (int)valor;
	}

	public char getNaipe() {
		return naipe;
	}

	public int getValor() {
		return valor;
	}
	public int giveValue(char valor) {
		int value;
		if(Character.isAlphabetic(this.valor)) {
			if(this.valor == 'D') {
				value = 10;
			}
			else if(this.valor == 'J') {
				value = 11;
			}
			else if(this.valor == 'Q') {
				value = 12;
			}
			else if(this.valor == 'K'){
				value = 13;
			}
			else {
				value = 14;
			}
			
		}
		else {
			value = (int)valor;
		}
		return value;
	}
	
	
	@Override
	public String toString() {
		return "Carta " + valor + naipe + "";
	}
}
