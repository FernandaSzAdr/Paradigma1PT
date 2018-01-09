package br.ufrpe.beans;

public enum OrdemJogo {
	CARTA_ALTA(1), UM_PAR(2), DOIS_PARES(3), TRINCA(4), STRAIGHT(5), FLUSH(6), FULL_HOUSE(7),
	QUADRA(8), STRAIGHT_FLUSH(9), ROYAL_FLASH(10);
	
	public int valorJogo;
	
	OrdemJogo(int valor){
		valorJogo = valor;
	}
	
	public int getValor(){
		return valorJogo;
	}
}
