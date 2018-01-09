package br.ufrpe.beans;

public class Carta {
	private char naipe;
	private char valor;
	
	public Carta(char naipe, char valor) {
		this.naipe = naipe;
		this.valor = valor;
	}

	public char getNaipe() {
		return naipe;
	}

	public char getValor() {
		return valor;
	}
}
