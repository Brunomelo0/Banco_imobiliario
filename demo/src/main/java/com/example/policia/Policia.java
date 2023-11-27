package com.example.policia;

import com.example.jogador.JogadorUm;
import com.example.sections.Prisao;

public class Policia implements IObserver {
    Prisao prisao = new Prisao();

    @Override
    public void update(JogadorUm player) {
        prisao.ativaEfeito(player);
        
    }
    public void presos(){
        prisao.presos();
    }
}
