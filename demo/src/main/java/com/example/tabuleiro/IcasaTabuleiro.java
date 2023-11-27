package com.example.tabuleiro;

import com.example.jogador.JogadorUm;

public interface IcasaTabuleiro {
    public void adicionarJogadoresNaListaDaCasa(JogadorUm player);
	public void removerJogadoresDaListaDaCasa(JogadorUm player);
}
