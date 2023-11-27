package com.example.jogador;

import com.example.sections.Sections;

public interface Ijogador {
    public void comprar(Sections v);
	public void pagarTaxa(float taxa);
	public void receberTaxa(float taxa);
	public void adicionarCasas();
	public int getQuantidadeCasas();
}
