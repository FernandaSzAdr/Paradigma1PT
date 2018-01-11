package br.ufrpe.beans;

import java.util.ArrayList;

public class AnalisadorMao {
	char cartaAlta;
	boolean hasRoyalFlush;
	boolean hasStraightFlush;
	boolean hasFlush;
	boolean hasQuadra;
	boolean hasFullHouse;
	boolean hasTrinca;
	boolean hasDoisPares;
	boolean hasPar;
	
	
	public AnalisadorMao(ArrayList<Carta> mao) {
		
	}
	
	//TODO: Quebrar o laço ao encontrar o primeiro FALSE
	// 10, J, Q, K, A same naipe
	public boolean hasRoyalFlush(ArrayList<Carta> mao) {
		boolean check = false;
		if(hasFlush(mao)) {
			check = true;
			int value = 10;
			//Rodando mesmo achando false '-'
			for(int i = 0; i< mao.size(); i++) {
				if(mao.get(i).getValor() != value) {
					check = false;
				}
				value++;
			}
			
		}
		this.hasRoyalFlush = check;
		return check;
	}
	//Mesmo naipe em sequencia
	public boolean hasStraightFlush(ArrayList<Carta> mao) {
		boolean check = false;
		if(hasStraight(mao)) {
			if(this.hasFlush) {
				check = true;
			}
		}
		return check;
	}
	//Em sequencia
	public boolean hasStraight(ArrayList<Carta> mao) {
		boolean check = true;
		int value = mao.get(0).getValor();
		for(int i = 1;i < mao.size(); i++) {
			if(value !=( mao.get(i).getValor()-1)){
				check = false;
			}
			value =  mao.get(i).getValor();
		
	}
		this.hasStraightFlush = check;
		return check;
	}
	//All mesmo naipe
	public boolean hasFlush(ArrayList<Carta> mao) {
	  boolean check = true;
	  char naipe = mao.get(0).getNaipe();
	  for(Carta carta: mao ) {
		  if(carta.getNaipe() != naipe) {
			  check = false;
		  }
		  
	  }
	  	this.hasFlush = check;
		return check;
	}
	
	
}
