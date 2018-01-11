package br.ufrpe.beans;

public class Carta implements Comparable<Carta>{
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
    public int compareTo(Carta compare) {
        int compareValor=((Carta)compare).getValor();
        /* For Ascending order*/
        return this.valor - compareValor;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }
	
	@Override
	public String toString() {
		return "Carta " + valor + naipe + "";
	}
	

	

}
