package br.com.alansep.batalhanaval.core.domain;

public class Posicao {
	
	private boolean temNavio;
	private boolean foiAtingida;
	
	public void atingirPosicao() {
		this.foiAtingida = true;
	}

}
