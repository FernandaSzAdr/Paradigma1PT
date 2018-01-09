package br.ufrpe;

import java.util.ArrayList;

import br.ufrpe.auxiliar.Formatador;
import br.ufrpe.beans.Carta;

public class ControladorPrincipal {
	// Recebe a linha de jogo
	private String linhaLida;
	private String vencedor;
	private Formatador meuFormatador = new Formatador();
	// Serve para armazenar as cartas que o jogador possui
	private ArrayList<Carta> minhasCartasJogadorUm = new ArrayList<>();
	private ArrayList<Carta> minhasCartasJogadorDois = new ArrayList<>();
	
	public ControladorPrincipal() {
		
	}
	
	public String getLinhaLida() {
		return linhaLida;
	}

	public void setLinhaLida(String linhaLida) {
		this.linhaLida = linhaLida;
	}	
	
	public void Formatador(){
		meuFormatador.setJogo(linhaLida);
		minhasCartasJogadorUm = meuFormatador.getMinhasCartasUm();
		minhasCartasJogadorDois = meuFormatador.getMinhasCartasDois();
		vencedor = meuFormatador.getVencedor();
	}
	
	
}
